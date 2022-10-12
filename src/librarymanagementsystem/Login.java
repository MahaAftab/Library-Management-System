
package librarymanagementsystem;

public class Login extends javax.swing.JFrame {
     static final String username="admin";
    static final String pswd="1234";
    public Login() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        adminimg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        usrname = new javax.swing.JTextField();
        psswrd = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        adminlbl = new javax.swing.JLabel();
        LMS1 = new javax.swing.JLabel();
        LMS2 = new javax.swing.JLabel();
        LMS3 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setMinimumSize(new java.awt.Dimension(800, 533));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setPreferredSize(new java.awt.Dimension(800, 533));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adminimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/admin.png"))); // NOI18N
        background.add(adminimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 100, 110, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0, 110));

        user.setFont(new java.awt.Font("Adobe Fangsong Std R", 1, 14)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("Username:");

        password.setFont(new java.awt.Font("Adobe Fangsong Std R", 1, 15)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Password:");

        usrname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usrname.setBorder(null);

        psswrd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        psswrd.setBorder(null);
        psswrd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        loginbtn.setBackground(new java.awt.Color(255, 0, 0));
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Login");
        loginbtn.setBorder(null);
        loginbtn.setBorderPainted(false);
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        adminlbl.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        adminlbl.setForeground(new java.awt.Color(255, 255, 255));
        adminlbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminlbl.setText("ADMIN LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(adminlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(user)
                            .addComponent(password))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(psswrd, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(usrname, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(loginbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(adminlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(psswrd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(18, 18, 18)
                .addComponent(loginbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 300, 310));

        LMS1.setFont(new java.awt.Font("Chaparral Pro Light", 1, 48)); // NOI18N
        LMS1.setForeground(new java.awt.Color(255, 255, 255));
        LMS1.setText("MANAGEMENT");
        background.add(LMS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 320, 40));

        LMS2.setFont(new java.awt.Font("Chaparral Pro Light", 1, 48)); // NOI18N
        LMS2.setForeground(new java.awt.Color(255, 255, 255));
        LMS2.setText("SYSTEM");
        background.add(LMS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 220, 40));

        LMS3.setFont(new java.awt.Font("Chaparral Pro Light", 1, 48)); // NOI18N
        LMS3.setForeground(new java.awt.Color(255, 255, 255));
        LMS3.setText("LIBRARY");
        background.add(LMS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 220, 40));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/background2.jpg"))); // NOI18N
        background.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 533));

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 533));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
                String pw,un,n;
                un=usrname.getText();
                pw=psswrd.getText();
       
      
        
          if(un.equals(username) &&  pw.equals(pswd)){
              
              setVisible(false);
                Menu m= new Menu();
                m.setVisible(true);
             
          }
          else {
       Error s= new  Error("Invalid Username or Password!");
        s.setVisible(true);
        usrname.setText(null);
        psswrd.setText(null);
          }
             
       
    }//GEN-LAST:event_loginbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LMS1;
    private javax.swing.JLabel LMS2;
    private javax.swing.JLabel LMS3;
    private javax.swing.JLabel adminimg;
    private javax.swing.JLabel adminlbl;
    private javax.swing.JLabel back;
    private javax.swing.JPanel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField psswrd;
    private javax.swing.JLabel user;
    private javax.swing.JTextField usrname;
    // End of variables declaration//GEN-END:variables
}
