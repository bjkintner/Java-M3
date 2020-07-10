/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineAuditDao;
import com.sg.vendingmachine.dao.VendingMachineAuditDaoFileImpl;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
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
public class VendingMachineServiceLayerTest {
        
    VendingMachineDao dao = new VendingMachineDaoFileImpl("TESTreceipt.txt");
    File file = new File("TESTreceipt.txt");
    
    VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();
    Change change = new Change();
    VendingMachineServiceLayer service 
            = new VendingMachineServiceLayerImpl(dao, auditDao, change);
    Item item = new Item("1");
    
    
    public VendingMachineServiceLayerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws UnsupportedEncodingException, FileNotFoundException, IOException {
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
    
        if(file.delete())
        {
            System.out.println("File deleted successfully");
        }
        else
        {
            System.out.println("Failed to delete the file");
        }
    }

    /**
     * Test of getAllItems method, of class VendingMachineServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetAllItems() throws Exception {
        List<Item> allItems = service.getAllItems();
        assertEquals(4, allItems.size());
    }

    /**
     * Test of getItem method, of class VendingMachineServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetItem() throws Exception {
          assertEquals(item, service.getItem("1"));
    }

    /**
     * Test of purchaseItem method, of class VendingMachineServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testPurchaseItem() throws Exception {
      String purchaseItem = service.purchaseItem("1", new BigDecimal("2.00"));
       assertEquals( "You're receiving 0 Dollars "
               + "\nYou're receiving 2 Quarters "
               + "\nYou're receiving 0 Dimes "
               + "\nYou're receiving 0 Nickels "
               + "\nYou're receiving 0 Pennies", purchaseItem);
    }
    
    @Test 
    public void testPurchaseItemInsufficientFundsExp() throws Exception {
        try{
          service.purchaseItem("1", new BigDecimal(".25"));
        }catch (InsufficientFundsException e) {
        }
    }
    
    @Test
    public void testNoInventoryExp() throws Exception {
       try{
       service.purchaseItem("3", new BigDecimal("5.00"));
       } catch (NoItemInventoryException e){
           
       }
    }
    
}
