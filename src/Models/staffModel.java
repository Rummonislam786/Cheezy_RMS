/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author islam
 */
public class staffModel {
    public int Staff_ID;
    public String Staff_name;
    public String Staff_Gender;
    public String Staff_Email;
    public String Staff_phone;
    public String Staff_Address;
    public String Staff_Designation;

    public staffModel(int Staff_ID, String Staff_name, String Staff_Gender, String Staff_Email, String Staff_phone, String Staff_Address, String Staff_Designation) {
        this.Staff_ID = Staff_ID;
        this.Staff_name = Staff_name;
        this.Staff_Gender = Staff_Gender;
        this.Staff_Email = Staff_Email;
        this.Staff_phone = Staff_phone;
        this.Staff_Address = Staff_Address;
        this.Staff_Designation = Staff_Designation;
    }

    public String getStaff_Address() {
        return Staff_Address;
    }

    public String getStaff_Designation() {
        return Staff_Designation;
    }

    public String getStaff_Email() {
        return Staff_Email;
    }

    public String getStaff_Gender() {
        return Staff_Gender;
    }

    public int getStaff_ID() {
        return Staff_ID;
    }

    public String getStaff_name() {
        return Staff_name;
    }

    public String getStaff_phone() {
        return Staff_phone;
    }

    public void setStaff_Address(String Staff_Address) {
        this.Staff_Address = Staff_Address;
    }

    public void setStaff_Designation(String Staff_Designation) {
        this.Staff_Designation = Staff_Designation;
    }

    public void setStaff_Email(String Staff_Email) {
        this.Staff_Email = Staff_Email;
    }

    public void setStaff_Gender(String Staff_Gender) {
        this.Staff_Gender = Staff_Gender;
    }

    public void setStaff_ID(int Staff_ID) {
        this.Staff_ID = Staff_ID;
    }

    public void setStaff_name(String Staff_name) {
        this.Staff_name = Staff_name;
    }

    public void setStaff_phone(String Staff_phone) {
        this.Staff_phone = Staff_phone;
    }
            
}
