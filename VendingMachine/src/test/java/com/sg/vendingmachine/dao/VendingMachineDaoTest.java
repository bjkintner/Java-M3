/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Item;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author bryantkintner
 */
public class VendingMachineDaoTest {
    
    VendingMachineDao dao = new VendingMachineDaoFileImpl("TESTreceipt.txt");
    File file = new File("TESTreceipt.txt");
    Item item = new Item("1");
    
    public VendingMachineDaoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws UnsupportedEncodingException, IOException {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream("TESTreceipt.txt"), "utf-8"))) {
            writer.write("1::Cream Soda::1.50::10"
                    + "\n2::Root Beer::1.25::10"
                    + "\n3::Dr. Pepper::1.00::10"
                    + "\n4::Water::0.50::20");
        }
        
        item.setItemName("Cream Soda");
        item.setItemPrice(new BigDecimal ("1.50"));
        item.setItemQuantity(10);
    }
    
    @AfterEach
    public void tearDown() {
            
    file.delete();
    
    if(file.exists())
    {
        System.out.println("Failed to delete the file");
    }
    else
    {

        System.out.println("File deleted successfully");
    }

    }

    /**
     * Test of getAllItems method, of class VendingMachineDao.
     */
    /**
     * Test of getAllItems method, of class VendingMachineDao.
     * @throws java.lang.Exception
     */
    @Test
    public void testListAllItems() throws Exception {
        List<Item> allItems = dao.getAllItems();
        assertEquals(4, allItems.size());
    }

    /**
     * Test of getItem method, of class VendingMachineDao.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetItem() throws Exception {
        
        assertEquals(item, dao.getItem("1"));
    }

    /**
     * Test of purchaseItem method, of class VendingMachineDao.
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseItem() throws Exception {
        dao.purchaseItem("1");
        assertEquals(10, dao.getItem("1").getItemQuantity());
    }
     
}
