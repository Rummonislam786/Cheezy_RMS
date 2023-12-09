/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author islam
 */
public class ReservationModel {
    public int ReservationID;
    public LocalDateTime ResDate_Time;
    public int No_of_Attendees;
    public int Customer_ID;
    public int Table_ID;

    public ReservationModel(int ReservationID, LocalDateTime ResDate_Time, int No_of_Attendees, int Customer_ID, int Table_ID) {
        this.ReservationID = ReservationID;
        this.ResDate_Time = ResDate_Time;
        this.No_of_Attendees = No_of_Attendees;
        this.Customer_ID = Customer_ID;
        this.Table_ID = Table_ID;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public int getNo_of_Attendees() {
        return No_of_Attendees;
    }

    public LocalDateTime getResDate_Time() {
        return ResDate_Time;
    }

    public int getReservationID() {
        return ReservationID;
    }

    public int getTable_ID() {
        return Table_ID;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setNo_of_Attendees(int No_of_Attendees) {
        this.No_of_Attendees = No_of_Attendees;
    }

    public void setResDate_Time(LocalDateTime ResDate_Time) {
        this.ResDate_Time = ResDate_Time;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public void setTable_ID(int Table_ID) {
        this.Table_ID = Table_ID;
    }
    
}