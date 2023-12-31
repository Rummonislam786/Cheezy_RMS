/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bubt_rms.Panels;
import Models.InventoryModel;
import Models.MenuItem_Model;
import Models.OrderItemsModel;
import Models.Ordering_Items;
import Models.ReservationModel;
import Models.staffModel;
import bubt_rms.SqlConn;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;



import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author islam
 */
public class UserConfig extends javax.swing.JPanel {

    /**
     * Creates new form Inventory
     */
    public UserConfig()  {
        initComponents();
//        AddItem_txt.setVisible(false);
        Additem_Btn.setVisible(false);
        try {
            GetInvList();
        } catch (JSONException ex) {
            Logger.getLogger(UserConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        GetStaffList();
        GetReserveList();
        GetMenuItemList();
        setTable();
        setCombobox();
        
        
    }
    
    public UserConfig(String A){
        super();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    List<MenuItem_Model> MenuItemList = new ArrayList<MenuItem_Model>();
    List<OrderItemsModel> OrderList = new ArrayList<OrderItemsModel>();    
    List<ReservationModel> reserveList = new ArrayList<ReservationModel>();
    List<staffModel> staffList = new ArrayList<staffModel>();
    
    SqlConn sql = new SqlConn();
    @SuppressWarnings("unchecked")
    private void setTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        for (OrderItemsModel item : OrderList) {
            model.addRow(new Object[]{item.getStatus(),item.getTotal_price(),item.getReservationID(),item.getOrder_item_ID()});
        }
        model.fireTableDataChanged();
    }
    private void GetMenuItemList(){
        try{
            MenuItemList.clear();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String qrry = "select * from menu_item";
            ResultSet rs = stmt.executeQuery(qrry);
            while(rs.next()){
               int ID = Integer.parseInt(rs.getString("Item_ID"));
               String Name = rs.getString("Item_Name");
               double Price = Double.parseDouble(rs.getString("Item_Price"));
               String Category = rs.getString("Category");
               String Description = rs.getString("Description");
               byte[] Imaged = rs.getBytes("Item_Img");
               
               MenuItemList.add(new MenuItem_Model(ID, Name, Price, Category, Description,Imaged));
            }
        }catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),"Error in Fetching Data In Inventory");
        }
    }
    
    public static String convertObjectToJson(List<Ordering_Items> menuItem) {
        JSONObject jsonObject = new JSONObject(menuItem);
        return jsonObject.toString();
    }
    
    public static List<Ordering_Items> convertJTableToOrderingItems(DefaultTableModel tableModel) {
        List<Ordering_Items> result = new ArrayList<>();
      
        
        
        for (int row = 0; row < tableModel.getRowCount(); row++) {
             Ordering_Items item = new Ordering_Items(Integer.parseInt(tableModel.getValueAt(row, 0).toString()) , (String) tableModel.getValueAt(row, 1), 
                  Double.parseDouble(tableModel.getValueAt(row, 2).toString()),  Integer.parseInt(tableModel.getValueAt(row, 3).toString()));
            

            result.add(item);
        }
        
        
        return result;
    }
   
    
    private void setCombobox(){
        try
        {
            Order_cbx.removeAllItems();
//            Reserve_cbx.removeAllItems();
//            staff_cbx1.removeAllItems();
//            Item_cbx.removeAllItems();
            for(OrderItemsModel item : OrderList){
            Order_cbx.addItem(item.getOrder_item_ID()+ " - "+item.getStatus());
            }
            Order_cbx.setSelectedIndex(0);
            for(ReservationModel item : reserveList){
             
            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm");
            LocalDateTime Expirydate = item.getResDate_Time();     
            String ExpiryDateConverted = df.format(Expirydate);
//                Reserve_cbx.addItem(item.getReservationID()+"-" +item.getResDate_Time());
            }
//            Reserve_cbx.setSelectedIndex(0);
//            for (staffModel item : staffList) {
//                staff_cbx1.addItem(item.getStaff_ID()+ "-"+"("+item.getStaff_name()+")");
//            }
//            staff_cbx1.setSelectedIndex(0);
//            for (MenuItem_Model mnu : MenuItemList) {
//                Item_cbx.addItem(mnu.getItem_ID()+"-"+mnu.getItem_Name()+"-"+mnu.getItem_Price());
//            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void GetReserveList(){
        try{
            reserveList.clear();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String qrry = "select * from reservation";
            ResultSet rs = stmt.executeQuery(qrry);
            while(rs.next()){
//               int ID = Integer.parseInt(rs.getString("Inv_ID"));
//               String Name = rs.getString("Inv_Name");
//               double Quantity = Double.parseDouble(rs.getString("Inv_Quantity"));
//               String Unit = rs.getString("Inv_Unit");
//               LocalDate Expiry_date = LocalDate.parse(rs.getString("Expiry_date"));
               
               int reserve_ID = Integer.parseInt(rs.getString("Reservation_ID"));
               String something = rs.getString("Date_Time");
               DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
               LocalDateTime Date = LocalDateTime.parse(something,formatter);
               
               int NoofAttendees = Integer.parseInt(rs.getString("No_of_Attendees"));               
               int CustomerID = Integer.parseInt(rs.getString("Customer_ID"));
               int TableID =  Integer.parseInt(rs.getString("Table_ID"));
               reserveList.add(new ReservationModel(reserve_ID, Date, NoofAttendees, reserve_ID, TableID));
            }
        }
        catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),"Error in Fetching Data In reservation");
            System.out.println(ex);
        }
    }
     private void GetStaffList(){
        try{
            reserveList.clear();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String qrry = "select * from staff";
            ResultSet rs = stmt.executeQuery(qrry);
            while(rs.next()){
//               int ID = Integer.parseInt(rs.getString("Inv_ID"));
//               String Name = rs.getString("Inv_Name");
//               double Quantity = Double.parseDouble(rs.getString("Inv_Quantity"));
//               String Unit = rs.getString("Inv_Unit");
//               LocalDate Expiry_date = LocalDate.parse(rs.getString("Expiry_date"));
               
               int Staff_ID = Integer.parseInt(rs.getString("Staff_ID"));
               String StaffName = rs.getString("Staff_Name");
               String StaffGender = rs.getString("Gender");
               String StaffEmail = rs.getString("Email");
               String StaffPhone = rs.getString("Phone");
               String StaffAddress = rs.getString("Address");
               String StaffDesignation = rs.getString("Designation");
               
               
               
               staffList.add(new staffModel(Staff_ID, StaffName, StaffGender, StaffEmail, StaffPhone, StaffAddress, StaffDesignation));
            }
        }
        catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),"Error in Fetching Data In staff");
        }
    }
    
    private void GetInvList() throws JSONException {
        try{
            OrderList.clear();
            
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String qrry = "select * from orders";
            ResultSet rs = stmt.executeQuery(qrry);
            while(rs.next()){
//               int ID = Integer.parseInt(rs.getString("Inv_ID"));
//               String Name = rs.getString("Inv_Name");
//               double Quantity = Double.parseDouble(rs.getString("Inv_Quantity"));
//               String Unit = rs.getString("Inv_Unit");
//               LocalDate Expiry_date = LocalDate.parse(rs.getString("Expiry_date"));
               int ID = Integer.parseInt(rs.getString("Order_ID"));
               String Status = rs.getString("Status");
               double totalPrice = Double.parseDouble(rs.getString("Total_Price"));
               String jsonData = rs.getString("Items");
               List<Ordering_Items> menuitems = new ArrayList<Ordering_Items>();
               JSONArray jsonArray = new JSONArray(jsonData);
               for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject item = jsonArray.getJSONObject(i);
                int itemId = Integer.parseInt(item.getString("Item_ID"));
                String itemName = item.getString("Item_Name");
                double itemPrice = item.getDouble("Item_Price");
                int itemQuantity = item.getInt("Item_Quantity");
                menuitems.add(new Ordering_Items(itemId, itemName, itemPrice, itemQuantity));
            // Use the data as needed, e.g., display in Swing components
                System.out.println("Item ID: " + itemId);
                System.out.println("Item Name: " + itemName);
                System.out.println("Item Price: " + itemPrice);
                System.out.println("Item Quantity: " + itemQuantity);
                }
               
                
               int reserve_ID = Integer.parseInt(rs.getString("reservation_ID"));
               int staffID = Integer.parseInt(rs.getString("staff_ID"));
               OrderList.add(new OrderItemsModel(ID, totalPrice, menuitems, Status, reserve_ID, staffID));
            }
        }catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),"Error in Fetching Data In Inventory");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Update_btn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        Add_Btn = new javax.swing.JButton();
        Delete_btn = new javax.swing.JButton();
        Additem_Btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        Order_cbx = new javax.swing.JComboBox<>();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 102, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Update_btn.setBackground(new java.awt.Color(102, 0, 0));
        Update_btn.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        Update_btn.setForeground(new java.awt.Color(255, 204, 0));
        Update_btn.setText("Update");
        Update_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_btnActionPerformed(evt);
            }
        });
        add(Update_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 170, -1));

        ClearBtn.setBackground(new java.awt.Color(102, 0, 0));
        ClearBtn.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        ClearBtn.setForeground(new java.awt.Color(255, 204, 0));
        ClearBtn.setText("Clear");
        ClearBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });
        add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 170, -1));

        Add_Btn.setBackground(new java.awt.Color(102, 0, 0));
        Add_Btn.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        Add_Btn.setForeground(new java.awt.Color(255, 204, 0));
        Add_Btn.setText("Add Order");
        Add_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_BtnActionPerformed(evt);
            }
        });
        add(Add_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 470, 40));

        Delete_btn.setBackground(new java.awt.Color(102, 0, 0));
        Delete_btn.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        Delete_btn.setForeground(new java.awt.Color(255, 204, 0));
        Delete_btn.setText("Delete");
        Delete_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });
        add(Delete_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 170, -1));

        Additem_Btn.setBackground(new java.awt.Color(102, 0, 0));
        Additem_Btn.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        Additem_Btn.setForeground(new java.awt.Color(255, 204, 0));
        Additem_Btn.setText("ADD");
        Additem_Btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Additem_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Additem_BtnActionPerformed(evt);
            }
        });
        add(Additem_Btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 170, -1));

        jTable2.setBackground(new java.awt.Color(255, 102, 0));
        jTable2.setFont(new java.awt.Font("Cafe Francoise", 0, 12)); // NOI18N
        jTable2.setForeground(new java.awt.Color(255, 255, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Customer",  new Boolean(true)},
                {"2", "Reservation",  new Boolean(true)},
                {"3", "Inventory",  new Boolean(true)},
                {"4", "MenuItem",  new Boolean(true)},
                {"5", "Orders",  new Boolean(true)},
                {"6", "Table",  new Boolean(true)},
                {"7", "Payment",  new Boolean(true)},
                {"8", "Staff",  new Boolean(true)}
            },
            new String [] {
                "Panel ID", "Panel Name", "Permitted"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 530, 190));

        jLabel5.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 80, -1));

        jTable1.setBackground(new java.awt.Color(255, 102, 0));
        jTable1.setFont(new java.awt.Font("Cafe Francoise", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Status", "Total Price", "Reservation No.", "Managed By"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(255, 0, 51));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, 520));

        jLabel10.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("User");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, -1));

        Order_cbx.setBackground(new java.awt.Color(255, 102, 0));
        Order_cbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Order_cbxActionPerformed(evt);
            }
        });
        add(Order_cbx, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 410, 30));

        jPasswordField1.setText("jPasswordField1");
        add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 410, 30));

        jLabel6.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("IS Admin");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 70, -1));

        jCheckBox1.setText("jCheckBox1");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    private void Update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_btnActionPerformed
        // TODO add your handling code here:
        try{
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
        Statement stmt = conn.createStatement();
        int OrderID = Integer.parseInt(Order_cbx.getSelectedItem().toString().split(" - ")[0]);
//        String Status = status_cbx.getSelectedItem().toString();
//        int ReserveID = Integer.parseInt(Reserve_cbx.getSelectedItem().toString().split("-")[0]);
//        int StaffID = Integer.parseInt(staff_cbx1.getSelectedItem().toString().split("-")[0]);
        
        DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
        List<Ordering_Items> result = convertJTableToOrderingItems(tableModel);
        String jsonData = convertObjectToJson(result);
//        double TotalPrice = Double.parseDouble(totalLabel.getText());
//        String Unit = Unit_Txt.getText();
        String qrry = "UPDATE orders SET "
                 + "Status = ? ,"
                 + "Total_Price = ?,"
                + "Items = ?,"
                + "reservation_ID = ?,"
                + "staff_ID = ?"
                + " WHERE Order_ID = ?";
        
        PreparedStatement pstmt = conn.prepareStatement(qrry);
//            pstmt.setString(1, Status);
//            pstmt.setDouble(2, TotalPrice);
            pstmt.setString(3, jsonData);
//            pstmt.setInt(4, ReserveID);
//            pstmt.setInt(5, StaffID);
            pstmt.setInt(5, OrderID);
        JOptionPane.showMessageDialog(new JRootPane(), "Data Updated Succesfully");
        GetInvList();
        setTable();
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException ex){
            Logger.getLogger(UserConfig.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(UserConfig.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_Update_btnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        clearData();
//        Item_cbx.setSelectedIndex(0);
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void Add_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_BtnActionPerformed
        // TODO add your handling code here:
        Add_Btn.setEnabled(false);
//        AddItem_txt.setVisible(true);
        Additem_Btn.setVisible(true);
        Update_btn.setVisible(false);
//        Item_cbx.setVisible(false);
        clearData();
        
    }//GEN-LAST:event_Add_BtnActionPerformed

    private void Additem_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Additem_BtnActionPerformed
        // TODO add your handling code here:
        Add_Btn.setEnabled(true);
//        AddItem_txt.setVisible(false);
        Additem_Btn.setVisible(false);
        Update_btn.setVisible(true);
//        Item_cbx.setVisible(true);
        
        try {
            
//          if("".equals(AddItem_txt.getText()))
//                return;
            
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String pattern = "yyyy-MM-dd";

            DateFormat df = new SimpleDateFormat(pattern);

//            Date Expirydate = ExpiryDtePck.getDate();     
            
//            String ExpiryDateConverted = df.format(Expirydate);
            
//            String Name = AddItem_txt.getText();
//            double Quantity = Double.parseDouble(Quan_txt.getText());
//            String Unit = Unit_Txt.getText();
            
//            String Name1 = AddItem_txt.getText();
            
//            String qrry = "Insert into inventory(Inv_Name,Inv_Quantity,Inv_Unit,Expiry_date) values("
//                    +"'" + Name + "',"
//                    +"'" + Quantity + "',"
//                    +"'" + Unit + "',"
//                    +"'" + ExpiryDateConverted + "'"
//                    + ")";
//                 
//            stmt.executeUpdate(qrry);
            JOptionPane.showMessageDialog(new JRootPane(), "Data Added Succesfully");
            clearData();
            GetInvList();
            setTable();
            setCombobox();
             }catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
                JOptionPane.showMessageDialog(new JRootPane(),ex);
                System.out.println(ex);
        } catch (JSONException ex) {
            Logger.getLogger(UserConfig.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_Additem_BtnActionPerformed

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        // TODO add your handling code here:
        int dialogResult = JOptionPane.showConfirmDialog(new JRootPane(),
                "Are you sure you want to delete the data?",
                "Delete Confirmation",JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.NO_OPTION)
            return;
        try{
        Class.forName("java.sql.Driver");
        Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
        Statement stmt = conn.createStatement();
//        int InvID = Integer.parseInt(Item_cbx.getSelectedItem().toString().split(" - ")[0]);
        //DELETE FROM inventory WHERE `inventory`.`Inv_ID` = 25
//        String qrry = "UPDATE inventory SET "
//                 + "Inv_Quantity = " + Quantity +","
//                 + "Inv_Unit = \"" +Unit +"\","
//                 + "Expiry_date = '" + ExpiryDateConverted +"' WHERE Inv_ID = "+InvID;
//        String qrry = "DELETE FROM inventory WHERE `inventory`.`Inv_ID` = "+InvID ;
//        stmt.executeUpdate(qrry);
        JOptionPane.showMessageDialog(new JRootPane(), "Data Deleted Succesfully");
            try {
                GetInvList();
            } catch (JSONException ex) {
                Logger.getLogger(UserConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
        setTable();
        setCombobox();
        }
        catch(HeadlessException | ClassNotFoundException | NumberFormatException | SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),ex);
        } 
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{
            if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {

                javax.swing.JTable target = (javax.swing.JTable)evt.getSource();
                int row = target.getSelectedRow();
                String invName = (String) target.getValueAt(row, 0); // Assuming Inv_name is in the second column
                
                

            }
        }
        catch(Exception e){
            System.out.println("\n"+e);
            JOptionPane.showMessageDialog(new JRootPane(),e);
        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void Order_cbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Order_cbxActionPerformed
        // TODO add your handling code here:
        double totprc = 0;
        int OrderID = Integer.parseInt(Order_cbx.getSelectedItem().toString().split(" - ")[0]);
        for (OrderItemsModel item : OrderList) {
            if(OrderID == item.getOrder_item_ID()){
            DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
            model.setRowCount(0);
            for (Ordering_Items ite : item.items) {
                if(ite.getItem_Quantity()!=0)
                    totprc = totprc + (ite.getItem_Quantity() * ite.getItem_Price());
                    model.addRow(new Object[]{ite.getItem_ID(),ite.getItem_Name(),ite.getItem_Price(),ite.getItem_Quantity()});
            }
            model.fireTableDataChanged();
            
            }
        }
    }//GEN-LAST:event_Order_cbxActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    private void clearData(){
        LocalDate dateNow = LocalDate.now();
//        AddItem_txt.setText("");
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Btn;
    private javax.swing.JButton Additem_Btn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton Delete_btn;
    private javax.swing.JComboBox<String> Order_cbx;
    private javax.swing.JButton Update_btn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
