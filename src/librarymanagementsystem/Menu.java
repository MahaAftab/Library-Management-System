
package librarymanagementsystem;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        signoutbtn = new javax.swing.JButton();
        headerimg = new javax.swing.JLabel();
        viewbook = new javax.swing.JButton();
        Addbook = new javax.swing.JButton();
        issuerec = new javax.swing.JButton();
        returnbook = new javax.swing.JButton();
        returnrec = new javax.swing.JButton();
        issuebook = new javax.swing.JButton();
        add = new javax.swing.JLabel();
        view = new javax.swing.JLabel();
        issue = new javax.swing.JLabel();
        irecords = new javax.swing.JLabel();
        returnbk = new javax.swing.JLabel();
        rtrnrecrds = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setResizable(false);

        mainpanel.setBackground(new java.awt.Color(255, 153, 51,190));
        mainpanel.setPreferredSize(new java.awt.Dimension(800, 533));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("BankGothic Lt BT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO LMS");
        mainpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 550, 60));

        signoutbtn.setBackground(new java.awt.Color(0, 0, 0,20));
        signoutbtn.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        signoutbtn.setForeground(new java.awt.Color(255, 255, 255));
        signoutbtn.setText("Sign out");
        signoutbtn.setBorder(null);
        signoutbtn.setBorderPainted(false);
        signoutbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signoutbtn.setFocusPainted(false);
        signoutbtn.setFocusable(false);
        signoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutbtnActionPerformed(evt);
            }
        });
        mainpanel.add(signoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 130, 130, 40));

        headerimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/library500x500.png"))); // NOI18N
        mainpanel.add(headerimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        viewbook.setBackground(new java.awt.Color(255, 255, 255,0));
        viewbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/624468_book_256x256.png"))); // NOI18N
        viewbook.setBorder(null);
        viewbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbookActionPerformed(evt);
            }
        });
        mainpanel.add(viewbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 260, -1, -1));

        Addbook.setBackground(new java.awt.Color(255, 255, 255,0));
        Addbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/book.png"))); // NOI18N
        Addbook.setBorder(null);
        Addbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Addbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbookActionPerformed(evt);
            }
        });
        mainpanel.add(Addbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 260, -1, -1));

        issuerec.setBackground(new java.awt.Color(255, 255, 255,0));
        issuerec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/detail.png"))); // NOI18N
        issuerec.setBorder(null);
        issuerec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuerec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuerecActionPerformed(evt);
            }
        });
        mainpanel.add(issuerec, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 390, -1, -1));

        returnbook.setBackground(new java.awt.Color(255, 255, 255,0));
        returnbook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/return 2.png"))); // NOI18N
        returnbook.setBorder(null);
        returnbook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbookActionPerformed(evt);
            }
        });
        mainpanel.add(returnbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 390, -1, 86));

        returnrec.setBackground(new java.awt.Color(255, 255, 255,0));
        returnrec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/detail1.png"))); // NOI18N
        returnrec.setBorder(null);
        returnrec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnrec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnrecActionPerformed(evt);
            }
        });
        mainpanel.add(returnrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 390, -1, -1));

        issuebook.setBackground(new java.awt.Color(255, 255, 255,0));
        issuebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/624985_pencil_256x256.png"))); // NOI18N
        issuebook.setBorder(null);
        issuebook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebookActionPerformed(evt);
            }
        });
        mainpanel.add(issuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 260, -1, -1));

        add.setText("ADD BOOK");
        mainpanel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 356, -1, -1));

        view.setText("VIEW BOOK");
        mainpanel.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 356, -1, -1));

        issue.setText("ISSUE BOOK");
        mainpanel.add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 356, -1, 20));

        irecords.setText("ISSUE BOOK RECORDS");
        mainpanel.add(irecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 483, -1, -1));

        returnbk.setText("RETURN BOOK");
        mainpanel.add(returnbk, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 483, -1, -1));

        rtrnrecrds.setText("RETURN BOOK RECORDS");
        mainpanel.add(rtrnrecrds, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 483, -1, -1));

        jLabel2.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HOME PAGE");
        mainpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 290, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbookActionPerformed
        setVisible(false);
        Add_Book b= new Add_Book();
        b.setVisible(true);
    }//GEN-LAST:event_AddbookActionPerformed

    private void issuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebookActionPerformed
        setVisible(false);
        Issue_book b= new Issue_book();
        b.setVisible(true);
    }//GEN-LAST:event_issuebookActionPerformed

    private void viewbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbookActionPerformed
        setVisible(false);
        View_Book r = new View_Book();
        r.setVisible(true);
    }//GEN-LAST:event_viewbookActionPerformed

    private void returnbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbookActionPerformed
       setVisible(false);
        Return_book b= new Return_book();
        b.setVisible(true);
    }//GEN-LAST:event_returnbookActionPerformed

    private void issuerecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuerecActionPerformed
        setVisible(false);
        ISSUEREC r = new ISSUEREC();
        r.setVisible(true);
        
    }//GEN-LAST:event_issuerecActionPerformed

    private void returnrecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnrecActionPerformed
       setVisible(false);
       RETRNREC r = new RETRNREC();
       r.setVisible(true);
    }//GEN-LAST:event_returnrecActionPerformed

    private void signoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutbtnActionPerformed
        setVisible(false);
        Login l= new Login();
        l.setVisible(true);
    }//GEN-LAST:event_signoutbtnActionPerformed

  
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
    private javax.swing.JButton Addbook;
    private javax.swing.JLabel add;
    private javax.swing.JLabel headerimg;
    private javax.swing.JLabel irecords;
    private javax.swing.JLabel issue;
    private javax.swing.JButton issuebook;
    private javax.swing.JButton issuerec;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel returnbk;
    private javax.swing.JButton returnbook;
    private javax.swing.JButton returnrec;
    private javax.swing.JLabel rtrnrecrds;
    private javax.swing.JButton signoutbtn;
    private javax.swing.JLabel view;
    private javax.swing.JButton viewbook;
    // End of variables declaration//GEN-END:variables
}
