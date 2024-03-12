package myfirstproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    private DrawerController drawer;

    public Menu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        

        drawer = Drawer.newDrawer(this)
                .space(3)
                .header(new JLabel("WELCOME TO BEE-FIT! USER"))
                .addChild(createDrawerItem("HOME", new javax.swing.ImageIcon(getClass().getResource("/myfirstproject/img/home.png")), new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Add action for HOME item click
                        // For example, navigate to HOME page
                        System.out.println("Clicked HOME");
                         jScrollPane1.setViewportView(new GoToHome());
                        drawer.hide();
                    }
                }))
                .addChild(createDrawerItem("PROFILE",new javax.swing.ImageIcon(getClass().getResource("/myfirstproject/img/prof.png")), new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Add action for PROFILE item click
                        // For example, navigate to PROFILE page
                        System.out.println("Clicked PROFILE");
                        jScrollPane1.setViewportView(new GoToProfile());
                          drawer.hide();
                    }
                }))
                .addChild(createDrawerItem("NOTIFICATION", new javax.swing.ImageIcon(getClass().getResource("/myfirstproject/img/notif.png")),new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Add action for NOTIFICATION item click
                        // For example, show notifications
                        System.out.println("Clicked NOTIFICATION");
                          drawer.hide();
                    }
                }))
                .addChild(createDrawerItem("View Workout", new javax.swing.ImageIcon(getClass().getResource("/myfirstproject/img/set.png")),new ActionListener() {

                    public void actionPerformed(ActionEvent e) {
                        // Add action for SETTING item click
                        // For example, open settings page
                        System.out.println("Clicked SETTING");
                          drawer.hide();
                    }
                }))
                .addFooter(createDrawerItem("SIGN OUT", new javax.swing.ImageIcon(getClass().getResource("/myfirstproject/img/SignOut.png")), new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Add action for SIGN OUT item click
                        // For example, show login screen        
                        JOptionPane.showMessageDialog(null, "Sign out successfully!");
                        dispose(); // Close the current window
                        new LoginForm(null, true).setVisible(true);
                    }
                }))
                .build();
        
    }

    private DrawerItem createDrawerItem(String text, ImageIcon icon, ActionListener actionListener) {
        DrawerItem drawerItem = new DrawerItem(text);
        drawerItem.addActionListener(actionListener);
        drawerItem.setIcon(icon); // NOI18N
        return drawerItem;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSlide = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnSlide.setText("|||");
        btnSlide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSlideMouseClicked(evt);
            }
        });
        btnSlide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSlideActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HI USERNAME");

        jLabel2.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LET'S BE FIT!");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 442, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                        .addGap(52, 52, 52)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSlide, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSlideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSlideMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSlideMouseClicked

    private void btnSlideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSlideActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_btnSlideActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSlide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
