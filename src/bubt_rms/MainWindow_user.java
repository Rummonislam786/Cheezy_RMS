/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bubt_rms;

import bubt_rms.Panels.Dashboard;
import bubt_rms.Panels.Inventory_user;
import bubt_rms.Panels.MenuItemDes_user;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author islam
 */
public class MainWindow_user extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    public MainWindow_user() {
        initComponents();
        
        setSize(screenSize);
        
        setExtendedState(MainWindow_user.MAXIMIZED_BOTH);
        
        
        
    }
    
    
    
    private void panel_selection(String panels){
        
        Dashboard.setVisible(("dshb".equals(panels)));
        Inventory_management.setVisible(("invn".equals(panels)));
        Staff_management.setVisible(("staf".equals(panels)));
        Reservation_maangement.setVisible(("resv".equals(panels)));
        User_Configuration.setVisible(("conf".equals(panels)));
        Payment_management.setVisible(("paym".equals(panels)));
        Order_management.setVisible(("ordr".equals(panels)));
        Menuitems_management.setVisible(("mnui".equals(panels)));
        Customer_information.setVisible(("cust".equals(panels)));
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dshbrdPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        InvPnl = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        ResrvPnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        OrderPnl = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        User_Configuration = new javax.swing.JPanel();
        Staff_management = new javax.swing.JPanel();
        Order_management = new javax.swing.JPanel();
        Customer_information = new javax.swing.JPanel();
        Reservation_maangement = new javax.swing.JPanel();
        Inventory_management = new javax.swing.JPanel();
        Menuitems_management = new javax.swing.JPanel();
        Payment_management = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(101, 49, 14));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1450, 800));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 16, 16));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1450, 80));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Summer Dream Sans Demo", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(38, 0, 0));
        jLabel2.setText("|");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 20, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-menu-48.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, 30, -1));

        jLabel4.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 215, 0));
        jLabel4.setText("Welcome Back, Rummon");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 470, 60));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(35, 35, 35));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dshbrdPnl.setBackground(new java.awt.Color(35, 35, 35));
        dshbrdPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dshbrdPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dshbrdPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dshbrdPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dshbrdPnlMouseExited(evt);
            }
        });
        dshbrdPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 215, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-dashboard-40.png"))); // NOI18N
        jLabel6.setText("DASHBOARD");
        dshbrdPnl.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(dshbrdPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 310, 60));

        InvPnl.setBackground(new java.awt.Color(35, 35, 35));
        InvPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        InvPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InvPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InvPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InvPnlMouseExited(evt);
            }
        });
        InvPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 215, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-inventory-40.png"))); // NOI18N
        jLabel14.setText("Inventory");
        InvPnl.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(InvPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 60));

        ResrvPnl.setBackground(new java.awt.Color(35, 35, 35));
        ResrvPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ResrvPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResrvPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResrvPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResrvPnlMouseExited(evt);
            }
        });
        ResrvPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 215, 0));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-reservation-40.png"))); // NOI18N
        jLabel9.setText("RESERVATIONS");
        ResrvPnl.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(ResrvPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 60));

        OrderPnl.setBackground(new java.awt.Color(35, 35, 35));
        OrderPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        OrderPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OrderPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OrderPnlMouseExited(evt);
            }
        });
        OrderPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 215, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-order-40.png"))); // NOI18N
        jLabel11.setText("OrderS");
        OrderPnl.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(OrderPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 310, 60));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 720));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new javax.swing.OverlayLayout(jPanel13));

        Dashboard.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Dashboard);

        User_Configuration.setBackground(new java.awt.Color(0, 255, 255));
        User_Configuration.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout User_ConfigurationLayout = new javax.swing.GroupLayout(User_Configuration);
        User_Configuration.setLayout(User_ConfigurationLayout);
        User_ConfigurationLayout.setHorizontalGroup(
            User_ConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        User_ConfigurationLayout.setVerticalGroup(
            User_ConfigurationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(User_Configuration);

        Staff_management.setBackground(new java.awt.Color(0, 102, 102));
        Staff_management.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Staff_managementLayout = new javax.swing.GroupLayout(Staff_management);
        Staff_management.setLayout(Staff_managementLayout);
        Staff_managementLayout.setHorizontalGroup(
            Staff_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Staff_managementLayout.setVerticalGroup(
            Staff_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Staff_management);

        Order_management.setBackground(new java.awt.Color(153, 255, 255));
        Order_management.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Order_managementLayout = new javax.swing.GroupLayout(Order_management);
        Order_management.setLayout(Order_managementLayout);
        Order_managementLayout.setHorizontalGroup(
            Order_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Order_managementLayout.setVerticalGroup(
            Order_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Order_management);

        Customer_information.setBackground(new java.awt.Color(0, 51, 51));
        Customer_information.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Customer_informationLayout = new javax.swing.GroupLayout(Customer_information);
        Customer_information.setLayout(Customer_informationLayout);
        Customer_informationLayout.setHorizontalGroup(
            Customer_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Customer_informationLayout.setVerticalGroup(
            Customer_informationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Customer_information);

        Reservation_maangement.setBackground(new java.awt.Color(102, 204, 0));
        Reservation_maangement.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Reservation_maangementLayout = new javax.swing.GroupLayout(Reservation_maangement);
        Reservation_maangement.setLayout(Reservation_maangementLayout);
        Reservation_maangementLayout.setHorizontalGroup(
            Reservation_maangementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Reservation_maangementLayout.setVerticalGroup(
            Reservation_maangementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Reservation_maangement);

        Inventory_management.setBackground(new java.awt.Color(255, 204, 204));
        Inventory_management.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Inventory_managementLayout = new javax.swing.GroupLayout(Inventory_management);
        Inventory_management.setLayout(Inventory_managementLayout);
        Inventory_managementLayout.setHorizontalGroup(
            Inventory_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Inventory_managementLayout.setVerticalGroup(
            Inventory_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Inventory_management);

        Menuitems_management.setBackground(new java.awt.Color(153, 255, 51));
        Menuitems_management.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Menuitems_managementLayout = new javax.swing.GroupLayout(Menuitems_management);
        Menuitems_management.setLayout(Menuitems_managementLayout);
        Menuitems_managementLayout.setHorizontalGroup(
            Menuitems_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Menuitems_managementLayout.setVerticalGroup(
            Menuitems_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Menuitems_management);

        Payment_management.setBackground(new java.awt.Color(204, 204, 0));
        Payment_management.setPreferredSize(new java.awt.Dimension(1140, 720));

        javax.swing.GroupLayout Payment_managementLayout = new javax.swing.GroupLayout(Payment_management);
        Payment_management.setLayout(Payment_managementLayout);
        Payment_managementLayout.setHorizontalGroup(
            Payment_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1140, Short.MAX_VALUE)
        );
        Payment_managementLayout.setVerticalGroup(
            Payment_managementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel13.add(Payment_management);

        jLayeredPane1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1140, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1466, 808));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dshbrdPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dshbrdPnlMouseClicked
        // TODO add your handling code here:
        
        
        panel_selection("dshb");


    }//GEN-LAST:event_dshbrdPnlMouseClicked

    private void dshbrdPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dshbrdPnlMouseEntered
        // TODO add your handling code here:
        dshbrdPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_dshbrdPnlMouseEntered

    private void dshbrdPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dshbrdPnlMouseExited
        // TODO add your handling code here:
       
        dshbrdPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_dshbrdPnlMouseExited

    private void InvPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("invn");
    }//GEN-LAST:event_InvPnlMouseClicked

    private void InvPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvPnlMouseEntered
        // TODO add your handling code here:
        InvPnl.setBackground(new java.awt.Color(0, 0, 0));

    }//GEN-LAST:event_InvPnlMouseEntered

    private void InvPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InvPnlMouseExited
        // TODO add your handling code here:
        InvPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_InvPnlMouseExited

    private void ResrvPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrvPnlMouseEntered
        // TODO add your handling code here:
        ResrvPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_ResrvPnlMouseEntered

    private void ResrvPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrvPnlMouseExited
        // TODO add your handling code here:
        ResrvPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_ResrvPnlMouseExited

    private void ResrvPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrvPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("resv");
    }//GEN-LAST:event_ResrvPnlMouseClicked

    private void OrderPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("ordr");
    }//GEN-LAST:event_OrderPnlMouseClicked

    private void OrderPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderPnlMouseEntered
        // TODO add your handling code here:
        OrderPnl.setBackground(new java.awt.Color(0, 0, 0));
        
    }//GEN-LAST:event_OrderPnlMouseEntered

    private void OrderPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderPnlMouseExited
        // TODO add your handling code here:
        OrderPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_OrderPnlMouseExited

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Customer_information;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JPanel InvPnl;
    private javax.swing.JPanel Inventory_management;
    private javax.swing.JPanel Menuitems_management;
    private javax.swing.JPanel OrderPnl;
    private javax.swing.JPanel Order_management;
    private javax.swing.JPanel Payment_management;
    private javax.swing.JPanel Reservation_maangement;
    private javax.swing.JPanel ResrvPnl;
    private javax.swing.JPanel Staff_management;
    private javax.swing.JPanel User_Configuration;
    private javax.swing.JPanel dshbrdPnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
