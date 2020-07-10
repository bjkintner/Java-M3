/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author bryantkintner
 */
public class VendingMachineView {

   private UserIO io;
   private Change change;

    public VendingMachineView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Purchase Item");
        io.print("2. List Item");
        io.print("3. Exit");

        return io.readInt("Please select from the above choices.", 1, 3);
    }

    public void displayItemList(List<Item> itemList) {
        for (Item currentItem : itemList) {
            io.print(currentItem.getItemNumber() + ": "
                    + currentItem.getItemName() + " "
                    + currentItem.getItemPrice() + " "
                    + currentItem.getItemQuantity());
        }
        io.readString("Press enter to continue.");
    }
    
    public void displayItem(Item item) {
	    if (item != null) {
	        io.print(item.getItemNumber());
	        io.print(item.getItemName());
	        io.printBigDecimal(item.getItemPrice());
                io.printInt(item.getItemQuantity());
	        io.print("");
	    } else {
	        io.print("No such Item.");
	    }
	    io.readString("Press enter to continue.");
	}

    public void displayItemBanner() {
        io.print("=== Item ===");
    }
    
    public void displayItemPurchaseBanner() {
        io.print("=== Purchase Item ===");
    }
    
    public String getItemNumberChoice() {
        int choice = io.readInt("Please enter the Item Number.", 1, 4);
        String stringChoice = String.valueOf(choice);
        return stringChoice; 
    }

    public String displayThankYouPurchase() {
        return io.readString("Thank you for your purchase.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== All Items ===");
    }

    public void displayExitBanner() {
        io.print("Goodbye!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!");
    }
    
    public BigDecimal displayRequestDeposit(){
        Double cash = io.readDouble("Please deposit money.");
        BigDecimal bd = new BigDecimal(cash);
        
        return bd; 
    }
    
    public void displayDepositSuccessful(){
        io.print("Deposit successful.");
    }
    
    public void displayErrorMessage(String errorMsg) {
	    io.print("=== ERROR ===");
	    io.print(errorMsg);
	}
   
    public void displayChange(String change) {
        io.print("Your change is " + change);
    }

} 