package com.kodilla.mod1;

public class App6 {
    public static void main(String[] args) {
        SampleObject obj = new SampleObject();
        int result = obj.hashCode();
        System.out.println(result);
        SampleClassOne objOne = new SampleClassOne();
        objOne.showMeOne();
    }
}
