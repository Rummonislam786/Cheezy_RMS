/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package bubt_rms.Panels;
import bubt_rms.Panels.*;
import Models.InventoryModel;
import bubt_rms.SqlConn;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author islam
 */
public class Inventory_user extends javax.swing.JPanel {

    /**
     * Creates new form Inventory
     */
    public Inventory_user() {
        initComponents();
        AddItem_txt.setVisible(false);
//        Additem_Btn.setVisible(false);
        GetInvList();
        setTable();
        setCombobox();
    }
    
    public Inventory_user(String A){
        super();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    List<InventoryModel> InvList = new ArrayList<InventoryModel>();
    SqlConn sql = new SqlConn();
    @SuppressWarnings("unchecked")
    private void setTable(){
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        for (InventoryModel item : InvList) {
            model.addRow(new Object[]{item.getInv_name(),item.getInv_Quantity(),item.getInv_unit(),item.getExpiry_date()});
        }
        model.fireTableDataChanged();
    }
    private void setCombobox(){
        try
        {
            Item_box.removeAllItems();
            for(InventoryModel item : InvList){
            Item_box.addItem(item.getInvID() + " - "+item.getInv_name());
            }
            Item_box.setSelectedIndex(0);
            
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    private void GetInvList(){
        try{
            InvList.clear();
            Class.forName("java.sql.Driver");
            Connection conn = DriverManager.getConnection(sql.sqlConnection,sql.sqlUser,sql.sqlPass);
            Statement stmt = conn.createStatement();
            String qrry = "select * from inventory";
            ResultSet rs = stmt.executeQuery(qrry);
            while(rs.next()){
               int ID = Integer.parseInt(rs.getString("Inv_ID"));
               String Name = rs.getString("Inv_Name");
               double Quantity = Double.parseDouble(rs.getString("Inv_Quantity"));
               String Unit = rs.getString("Inv_Unit");
               LocalDate Expiry_date = LocalDate.parse(rs.getString("Expiry_date"));
               InvList.add(new InventoryModel(ID, Name, Quantity, Unit, Expiry_date));
            }
        }catch(ClassNotFoundException| DateTimeException | NumberFormatException|SQLException ex){
            JOptionPane.showMessageDialog(new JRootPane(),"Error in Fetching Data In Inventory");
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Item_box = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Quan_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Unit_Txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddItem_txt = new javax.swing.JTextField();
        ExpiryDtePck = new com.toedter.calendar.JDateChooser();

        setBackground(new java.awt.Color(255, 102, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Quantity");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        Item_box.setBackground(new java.awt.Color(255, 102, 0));
        Item_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_boxActionPerformed(evt);
            }
        });
        add(Item_box, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 400, 30));

        jLabel2.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Name of Item :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Quan_txt.setBackground(new java.awt.Color(255, 102, 0));
        Quan_txt.setEnabled(false);
        add(Quan_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 400, 30));

        jLabel3.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Unit");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        Unit_Txt.setBackground(new java.awt.Color(255, 102, 0));
        Unit_Txt.setEnabled(false);
        add(Unit_Txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 400, 30));

        jLabel4.setFont(new java.awt.Font("Cafe Francoise", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Expiry Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

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
        add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 160, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        jTable1.setBackground(new java.awt.Color(255, 102, 0));
        jTable1.setFont(new java.awt.Font("Cafe Francoise", 0, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Item", "Quantity", "Unit", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 0, 51));
        jTable1.setSelectionBackground(new java.awt.Color(255, 51, 0));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 470, 450));

        AddItem_txt.setBackground(new java.awt.Color(255, 102, 0));
        add(AddItem_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 400, 30));

        ExpiryDtePck.setBackground(new java.awt.Color(255, 102, 0));
        add(ExpiryDtePck, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 400, 30));
    }// </editor-fold>//GEN-END:initComponents
    
    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        clearData();
        Item_box.setSelectedIndex(0);
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void Item_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_boxActionPerformed
        try{
        if(Item_box.getSelectedItem() == null)
            return;
        int InvID = Integer.parseInt(Item_box.getSelectedItem().toString().split(" - ")[0]);
        for (InventoryModel item : InvList) {
            if(InvID == item.getInvID()){
                Quan_txt.setText(Double.toString(item.getInv_Quantity()));
                Unit_Txt.setText(item.Inv_unit);
                ExpiryDtePck.setDate(Date.from(item.getExpiry_date().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            }
        }
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(new JRootPane(),ex);
        }
    }//GEN-LAST:event_Item_boxActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try{ 
            if (evt.getClickCount() == 2 && evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            
                javax.swing.JTable target = (javax.swing.JTable)evt.getSource();
                int row = target.getSelectedRow();            
                String invName = (String) target.getValueAt(row, 0); // Assuming Inv_name is in the second column
                ComboBoxModel<String> model = Item_box.getModel();
                for (int i = 0; i < model.getSize(); i++) {
                    String item = model.getElementAt(i).split("-")[1].trim();
                    if(item.equals(invName)){
                        System.out.println("Trye");
                        Item_box.setSelectedIndex(i);
                    }
                }
            
            
            
            
            }
        }
        catch(Exception e){
                System.out.println("\n"+e);
                JOptionPane.showMessageDialog(new JRootPane(),e);
        }
        
    }//GEN-LAST:event_jTable1MouseClicked
    private void clearData(){
        LocalDate dateNow = LocalDate.now();
        AddItem_txt.setText("");
        Quan_txt.setText("");
        Unit_Txt.setText("");
        ExpiryDtePck.setDate(Date.from(dateNow.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddItem_txt;
    private javax.swing.JButton ClearBtn;
    private com.toedter.calendar.JDateChooser ExpiryDtePck;
    private javax.swing.JComboBox<String> Item_box;
    private javax.swing.JTextField Quan_txt;
    private javax.swing.JTextField Unit_Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}