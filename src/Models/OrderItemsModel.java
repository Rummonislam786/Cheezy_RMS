/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.List;

/**
 *
 * @author islam
 */
public class OrderItemsModel {
    public int Order_item_ID;
    public double total_price;
    public List<Ordering_Items> items = null;
    public String Status;
    public int reservationID;
    public int staffID;

    public OrderItemsModel(int Order_item_ID, double total_price, List<Ordering_Items> items, String Status, int reservationID, int staffID) {
        this.Order_item_ID = Order_item_ID;
        this.total_price = total_price;
        this.items = items;
        this.Status = Status;
        this.reservationID = reservationID;
        this.staffID = staffID;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
   
    public int getOrder_item_ID() {
        return Order_item_ID;
    }

    public double getTotal_price() {
        return total_price;
    }

    public List<Ordering_Items> getItems() {
        return items;
    }

    public int getStaffID() {
        return staffID;
    }

    public int getReservationID() {
        return reservationID;
    }

    public void setReservationID(int reservationID) {
        this.reservationID = reservationID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
    public void setItems(List<Ordering_Items> items) {
        this.items = items;
    }

    public void setOrder_item_ID(int Order_item_ID) {
        this.Order_item_ID = Order_item_ID;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    
    
}
