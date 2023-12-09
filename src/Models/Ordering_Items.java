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
    public int OrdItem_ID;
    public String OrdItem_Name;
    public double OrdItem_Price;
    public int OrdItem_Quantity;

    public Ordering_Items(int OrdItem_ID, String OrdItem_Name, double OrdItem_Price, int OrdItem_Quantity) {
        this.OrdItem_ID = OrdItem_ID;
        this.OrdItem_Name = OrdItem_Name;
        this.OrdItem_Price = OrdItem_Price;
        this.OrdItem_Quantity = OrdItem_Quantity;
    }
    
    public int getOrdItem_ID() {
        return OrdItem_ID;
    }

    public String getOrdItem_Name() {
        return OrdItem_Name;
    }

    public double getOrdItem_Price() {
        return OrdItem_Price;
    }

    public int getOrdItem_Quantity() {
        return OrdItem_Quantity;
    }

    public void setOrdItem_ID(int OrdItem_ID) {
        this.OrdItem_ID = OrdItem_ID;
    }

    public void setOrdItem_Name(String OrdItem_Name) {
        this.OrdItem_Name = OrdItem_Name;
    }

    public void setOrdItem_Price(double OrdItem_Price) {
        this.OrdItem_Price = OrdItem_Price;
    }

    public void setOrdItem_Quantity(int OrdItem_Quantity) {
        this.OrdItem_Quantity = OrdItem_Quantity;
    }
}
