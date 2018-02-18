package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class BigMac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<String> ingredients;

    public static class BigMacBuilder{
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder roll(String roll){
            this.roll = roll;
            return this;
        }

        public BigMacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigMacBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

        public BigMacBuilder ingedient(String ingredient){
            ingredients.add(ingredient);
            return this;
        }

        public BigMac build() {
            return new BigMac(roll, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String roll, final int burgers, final String sauce, final List<String> ingredients){
        this.roll = roll;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getRoll() {
        return roll;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "BigMac :\n" +
                "   roll ='" + roll + '\'' +
                "\n   burgers =" + burgers +
                "\n   sauce ='" + sauce + '\'' +
                "\n   ingredients =" + ingredients +
                ';';
    }
}
