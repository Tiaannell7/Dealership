
package dealership;

/**
 *
 * @author nellt
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form Welcome
     */
    public Welcome() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Image = new javax.swing.JLabel();
        Volkswagen_label = new javax.swing.JLabel();
        Sentence1_Label = new javax.swing.JLabel();
        Sentence2_Label = new javax.swing.JLabel();
        Sentence3_Label = new javax.swing.JLabel();
        Sentence4_Label = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        File_Menu = new javax.swing.JMenu();
        Exit_MenuItem = new javax.swing.JMenuItem();
        View_Menu = new javax.swing.JMenu();
        Buy_Menu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Welcome"); // NOI18N

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dealership/full-special-offers.jpg"))); // NOI18N

        Volkswagen_label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Volkswagen_label.setText("Volkswagen Special Offers");

        Sentence1_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sentence1_Label.setText("Join the biggest family in South Africa with these finely tuned finance plans. Volkswagen   ");

        Sentence2_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sentence2_Label.setText("Special Offers have been designed to ensure that joining South Africa's biggest ");

        Sentence3_Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sentence3_Label.setText("family is now more affordable than ever before.");

        Sentence4_Label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sentence4_Label.setText("For these and other great offers, contact your nearest dealer.");

        File_Menu.setText("File");

        Exit_MenuItem.setText("Exit");
        Exit_MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_MenuItemActionPerformed(evt);
            }
        });
        File_Menu.add(Exit_MenuItem);

        MenuBar.add(File_Menu);

        View_Menu.setText("View Cars");
        View_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                View_MenuMouseClicked(evt);
            }
        });
        MenuBar.add(View_Menu);

        Buy_Menu.setText("Buy a Car");
        Buy_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Buy_MenuMouseClicked(evt);
            }
        });
        MenuBar.add(Buy_Menu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(Volkswagen_label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(Image))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(Sentence3_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(Sentence2_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(Sentence1_Label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(Sentence4_Label)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Image, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Volkswagen_label)
                .addGap(18, 18, 18)
                .addComponent(Sentence1_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Sentence2_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sentence3_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Sentence4_Label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void View_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_View_MenuMouseClicked
        this.dispose();
        ViewCars F2 = new ViewCars();
        F2.setVisible(true);
    }//GEN-LAST:event_View_MenuMouseClicked

    private void Buy_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Buy_MenuMouseClicked
        this.dispose();
        Finance F3 = new Finance();
        F3.setVisible(true);
    }//GEN-LAST:event_Buy_MenuMouseClicked

    // Closes application (File - Exit)
    private void Exit_MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_MenuItemActionPerformed
        this.dispose();
    }//GEN-LAST:event_Exit_MenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Buy_Menu;
    private javax.swing.JMenuItem Exit_MenuItem;
    private javax.swing.JMenu File_Menu;
    private javax.swing.JLabel Image;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel Sentence1_Label;
    private javax.swing.JLabel Sentence2_Label;
    private javax.swing.JLabel Sentence3_Label;
    private javax.swing.JLabel Sentence4_Label;
    private javax.swing.JMenu View_Menu;
    private javax.swing.JLabel Volkswagen_label;
    // End of variables declaration//GEN-END:variables
}
