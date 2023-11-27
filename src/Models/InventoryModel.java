/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author islam
 */
public class InventoryModel {
    public int invID;
    public String Inv_name;
    public double Inv_Quantity;
    public String Inv_unit;
    public LocalDate Expiry_date;  

    public InventoryModel(int invID, String Inv_name, double Inv_Quantity, String Inv_unit, LocalDate Expiry_date) {
        this.invID = invID;
        this.Inv_name = Inv_name;
        this.Inv_Quantity = Inv_Quantity;
        this.Inv_unit = Inv_unit;
        this.Expiry_date = Expiry_date;
    }
    
}
