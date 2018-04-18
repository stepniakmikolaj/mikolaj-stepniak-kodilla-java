package com.kodilla.patterns2.decorator.taxiportal;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        //W
        BigDecimal calculatedCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //W
        BigDecimal calculatedCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(40), calculatedCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by Taxi Network", description);
    }

    @Test
    public void testUberNetworkGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        //W
        BigDecimal calculatedCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testUberNetworkGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by Uber Network", description);
    }

    @Test
    public void testMyTaxiNetworkGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        //W
        BigDecimal calculatedCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(35), calculatedCost);
    }

    @Test
    public void testMyTaxiNetworkGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by MyTaxi Network", description);
    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //W
        BigDecimal theCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(37), theCost);
    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by MyTaxi Network + child seat", description);
    }

    @Test
    public void testUberWithTwoChildSeatsGetCost(){
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //W
        BigDecimal theCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(29), theCost);
    }

    @Test
    public void testUberWithTwoChildSeatsGetDescription(){
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new UberNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by Uber Network + child seat + child seat", description);

    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        System.out.println(theOrder.getCost());
        //W
        BigDecimal theCost = theOrder.getCost();
        //T
        assertEquals(new BigDecimal(57), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //G
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //W
        String description = theOrder.getDescription();
        //T
        assertEquals("Drive a course by Taxi Network variant VIP + child seat express service", description);
    }
}