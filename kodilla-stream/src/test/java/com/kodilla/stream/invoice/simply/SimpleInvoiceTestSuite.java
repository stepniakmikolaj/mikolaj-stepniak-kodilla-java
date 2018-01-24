package com.kodilla.stream.invoice.simply;

import com.kodilla.stream.invoice.simple.SimpleInvoice;
import com.kodilla.stream.invoice.simple.SimpleItem;
import com.kodilla.stream.invoice.simple.SimpleProduct;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleInvoiceTestSuite {
    @Test
    public void testGetValueToPay(){
        //Given
        SimpleInvoice invoice = new SimpleInvoice();
        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.99),2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99),5.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 5.49), 3.5));
        //Then
        assertEquals(115.14, invoice.getValueToPay(), 0.01);
    }
}
