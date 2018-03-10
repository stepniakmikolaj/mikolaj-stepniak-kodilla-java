package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //G
        Product product1 = new Product("Computer");
        Product product2 = new Product("Keyboard");
        Product product3 = new Product("Mouse");
        Item item1 = new Item(product1, new BigDecimal(3999), 1, new BigDecimal(3999));
        Item item2 = new Item(product2, new BigDecimal(299), 1, new BigDecimal(299));
        Item item3 = new Item(product3, new BigDecimal(199), 1, new BigDecimal(199));
        Invoice invoice = new Invoice("001-03/03/2018");
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //W
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();

        //T
        assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.deleteAll();
    }
}