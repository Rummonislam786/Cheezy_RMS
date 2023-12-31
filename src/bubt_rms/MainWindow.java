/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bubt_rms;

import bubt_rms.Panels.Customer;
import bubt_rms.Panels.Dashboard;
import bubt_rms.Panels.Inventory1;
import bubt_rms.Panels.MenuItemDes;
import bubt_rms.Panels.OrderItems;
import bubt_rms.Panels.Payment;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author islam
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    
    
    public MainWindow() {
        
        initComponents();
        
        setSize(screenSize);
        
        setExtendedState(MainWindow.MAXIMIZED_BOTH);
        
        panel_selection("Dash");
        
        
        
    }
   
    public Customer cust = new Customer();
    public Inventory1 Inv1 = new Inventory1();
    public MenuItemDes menuitem1 = new MenuItemDes();
    public OrderItems ordritms = new OrderItems();
    public Payment payment = new Payment();
    
    public Dashboard dashboard1 = new Dashboard(Inv1,menuitem1,ordritms,cust,payment);
    
    private void panel_selection(String panels){
        
        dashboard1.setVisible(("Dash".equals(panels)));
        Inv1.setVisible(("invn".equals(panels)));
        menuitem1.setVisible(("mnui".equals(panels)));
        ordritms.setVisible(("ordr".equals(panels)));
        cust.setVisible(("cust".equals(panels)));
        payment.setVisible(("paym".equals(panels)));
//        Staff_management.setVisible(("staf".equals(panels)));
//        Reservation_maangement.setVisible(("resv".equals(panels)));
//        User_Configuration.setVisible(("conf".equals(panels)));
//        Payment_management.setVisible(("paym".equals(panels)));
//        Order_management.setVisible(("ordr".equals(panels)));
//        Menuitems_management.setVisible(("mnui".equals(panels)));
//        Customer_information.setVisible(("cust".equals(panels)));
        
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
        notifyBtn = new javax.swing.JLabel();
        titlebar = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dshbrdPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        InvPnl = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        MnuItmPnl = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        PaymPnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ResrvPnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        CustInfPnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        OrderPnl = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        StafPnl = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        UsrConfPnl = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(101, 49, 14));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(1450, 800));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(174, 16, 16));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1450, 80));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        notifyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell2.png"))); // NOI18N
        jPanel1.add(notifyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 20, 30, -1));

        titlebar.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        titlebar.setForeground(new java.awt.Color(255, 215, 0));
        titlebar.setText("Welcome Back, Rummon");
        jPanel1.add(titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 60));

        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell2.png"))); // NOI18N
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 30, -1));

        jLayeredPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, -1));

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

        MnuItmPnl.setBackground(new java.awt.Color(35, 35, 35));
        MnuItmPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MnuItmPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MnuItmPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MnuItmPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MnuItmPnlMouseExited(evt);
            }
        });
        MnuItmPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 215, 0));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-restaurant-menu-40.png"))); // NOI18N
        jLabel7.setText("MENU ITEMS");
        MnuItmPnl.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(MnuItmPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 60));

        PaymPnl.setBackground(new java.awt.Color(35, 35, 35));
        PaymPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PaymPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PaymPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PaymPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PaymPnlMouseExited(evt);
            }
        });
        PaymPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 215, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-payment-40.png"))); // NOI18N
        jLabel8.setText("PAYMENTS");
        PaymPnl.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(PaymPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 310, 60));

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

        jPanel2.add(ResrvPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 310, 60));

        CustInfPnl.setBackground(new java.awt.Color(35, 35, 35));
        CustInfPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CustInfPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustInfPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustInfPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustInfPnlMouseExited(evt);
            }
        });
        CustInfPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 215, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-staff-40.png"))); // NOI18N
        jLabel10.setText("Customer's Info");
        CustInfPnl.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(CustInfPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 310, 60));

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

        StafPnl.setBackground(new java.awt.Color(35, 35, 35));
        StafPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        StafPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StafPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StafPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StafPnlMouseExited(evt);
            }
        });
        StafPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 215, 0));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-staff-40.png"))); // NOI18N
        jLabel12.setText("Staffs");
        StafPnl.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(StafPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 310, 60));

        UsrConfPnl.setBackground(new java.awt.Color(35, 35, 35));
        UsrConfPnl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UsrConfPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsrConfPnlMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UsrConfPnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UsrConfPnlMouseExited(evt);
            }
        });
        UsrConfPnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Summer Dream Sans Demo", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 215, 0));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-configuration-40.png"))); // NOI18N
        jLabel13.setText("User Configuration");
        UsrConfPnl.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, -1));

        jPanel2.add(UsrConfPnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 310, 60));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 310, 1020));

        jPanel13.setBackground(new java.awt.Color(255, 102, 0));
        jPanel13.setLayout(new javax.swing.OverlayLayout(jPanel13));
        jLayeredPane1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 1630, 1020));
        jPanel13.add(dashboard1);
        jPanel13.add(Inv1);
        jPanel13.add(menuitem1);
        jPanel13.add(ordritms);
        jPanel13.add(cust);
        jPanel13.add(payment);

        getContentPane().add(jLayeredPane1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1754, 1107));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dshbrdPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dshbrdPnlMouseClicked
        // TODO add your handling code here:
        
        
        panel_selection("Dash");


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

    private void PaymPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("paym");
    }//GEN-LAST:event_PaymPnlMouseClicked

    private void PaymPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymPnlMouseEntered
        // TODO add your handling code here:
        PaymPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_PaymPnlMouseEntered

    private void PaymPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PaymPnlMouseExited
        // TODO add your handling code here:
        PaymPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_PaymPnlMouseExited

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

    private void CustInfPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustInfPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("cust");
    }//GEN-LAST:event_CustInfPnlMouseClicked
 
    private void CustInfPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustInfPnlMouseEntered
        // TODO add your handling code here:
        CustInfPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_CustInfPnlMouseEntered

    private void CustInfPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustInfPnlMouseExited
        // TODO add your handling code here:
        CustInfPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_CustInfPnlMouseExited

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

    private void StafPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("staf");
    }//GEN-LAST:event_StafPnlMouseClicked

    private void StafPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafPnlMouseEntered
        // TODO add your handling code here:
        StafPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_StafPnlMouseEntered

    private void StafPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StafPnlMouseExited
        // TODO add your handling code here:
        StafPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_StafPnlMouseExited

    private void UsrConfPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsrConfPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("conf");
    }//GEN-LAST:event_UsrConfPnlMouseClicked

    private void UsrConfPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsrConfPnlMouseEntered
        // TODO add your handling code here:
        UsrConfPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_UsrConfPnlMouseEntered

    private void UsrConfPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsrConfPnlMouseExited
        // TODO add your handling code here:
        UsrConfPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_UsrConfPnlMouseExited

    private void MnuItmPnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuItmPnlMouseExited
        // TODO add your handling code here:
        MnuItmPnl.setBackground(new java.awt.Color(35, 35, 35));
    }//GEN-LAST:event_MnuItmPnlMouseExited

    private void MnuItmPnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuItmPnlMouseEntered
        // TODO add your handling code here:
        MnuItmPnl.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_MnuItmPnlMouseEntered

    private void MnuItmPnlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MnuItmPnlMouseClicked
        // TODO add your handling code here:
        panel_selection("mnui");
    }//GEN-LAST:event_MnuItmPnlMouseClicked

   
    
   
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CustInfPnl;
    private javax.swing.JPanel InvPnl;
    private javax.swing.JPanel MnuItmPnl;
    private javax.swing.JPanel OrderPnl;
    private javax.swing.JPanel PaymPnl;
    private javax.swing.JPanel ResrvPnl;
    private javax.swing.JPanel StafPnl;
    private javax.swing.JPanel UsrConfPnl;
    private javax.swing.JPanel dshbrdPnl;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoutBtn;
    private javax.swing.JLabel notifyBtn;
    private javax.swing.JLabel titlebar;
    // End of variables declaration//GEN-END:variables
}
