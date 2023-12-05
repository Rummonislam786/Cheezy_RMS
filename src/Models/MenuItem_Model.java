/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author islam
 */
public class MenuItem_Model {
    public int Item_ID;
    public String Item_Name;
    public double Item_Price;
    public String Item_Category;
    public String Item_Description;
    public byte[] item_img;
    

    public MenuItem_Model(int Item_ID, String Item_Name, double Item_Price,String Item_Category, String Item_Description, byte[] item_img) {
        this.Item_ID = Item_ID;
        this.Item_Name = Item_Name;
        this.Item_Price = Item_Price;
        this.Item_Description = Item_Description;
        this.item_img = item_img;
        this.Item_Category = Item_Category;
    }
    public String getItem_Description() {
        return Item_Description;
    }

    public String getItem_Name() {
        return Item_Name;
    }

    public int getItem_ID() {
        return Item_ID;
    }

    public double getItem_Price() {
        return Item_Price;
    }

    public byte[] getItem_img() {
        return item_img;
    } 

    public String getItem_Category() {
        return Item_Category;
    }
}
