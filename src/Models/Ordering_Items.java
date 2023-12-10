/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author islam
 */
public class Ordering_Items {
    public int Item_ID;
    public String Item_Name;
    public double Item_Price;
    public int Item_Quantity;

    public Ordering_Items(int OrdItem_ID, String OrdItem_Name, double OrdItem_Price, int OrdItem_Quantity) {
        this.Item_ID = OrdItem_ID;
        this.Item_Name = OrdItem_Name;
        this.Item_Price = OrdItem_Price;
        this.Item_Quantity = OrdItem_Quantity;
    }
    
    public int getItem_ID() {
        return Item_ID;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public double getItem_Price() {
        return Item_Price;
    }

    public int getItem_Quantity() {
        return Item_Quantity;
    }

    public void setItem_ID(int OrdItem_ID) {
        this.Item_ID = OrdItem_ID;
    }

    public void setItem_Name(String OrdItem_Name) {
        this.Item_Name = OrdItem_Name;
    }

    public void setItem_Price(double OrdItem_Price) {
        this.Item_Price = OrdItem_Price;
    }

    public void setItem_Quantity(int OrdItem_Quantity) {
        this.Item_Quantity = OrdItem_Quantity;
    }
}
