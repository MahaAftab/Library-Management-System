
package librarymanagementsystem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Issue_book extends javax.swing.JFrame {
     
    String path="IssueRecord.csv";
     String fp ="books.csv" ;
     String path1 = "Student info.csv";
    
     public Issue_book() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerimg = new javax.swing.JLabel();
        stdname = new javax.swing.JLabel();
        course = new javax.swing.JLabel();
        bknme = new javax.swing.JTextField();
        stuname = new javax.swing.JTextField();
        cors = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        head = new javax.swing.JLabel();
        datel = new javax.swing.JLabel();
        issuebtn1 = new javax.swing.JButton();
        bookname1 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ISSUE BOOK");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51,190));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 533));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 533));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/library500x500.png"))); // NOI18N
        jPanel1.add(headerimg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        stdname.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        stdname.setText("STUDENT NAME:");
        jPanel1.add(stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 395, -1, -1));

        course.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        course.setText("COURSE:");
        jPanel1.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));
        jPanel1.add(bknme, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 235, 31));
        jPanel1.add(stuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 383, 235, 31));
        jPanel1.add(cors, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 235, 31));

        backbtn.setBackground(new java.awt.Color(255, 0, 0));
        backbtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(255, 255, 255));
        backbtn.setText("BACK");
        backbtn.setBorder(null);
        backbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        jPanel1.add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 101, 36));

        head.setFont(new java.awt.Font("Felix Titling", 1, 24)); // NOI18N
        head.setForeground(new java.awt.Color(255, 0, 0));
        head.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        head.setText("ADD ISSUE DETAILS:");
        jPanel1.add(head, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 290, 30));

        datel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        datel.setText("BOOK NAME:");
        jPanel1.add(datel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 335, -1, -1));

        issuebtn1.setBackground(new java.awt.Color(255, 0, 0));
        issuebtn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        issuebtn1.setForeground(new java.awt.Color(255, 255, 255));
        issuebtn1.setText("ISSUE");
        issuebtn1.setBorder(null);
        issuebtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        issuebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(issuebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 101, 36));

        bookname1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        bookname1.setText("DATE:");
        jPanel1.add(bookname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 285, -1, -1));

        date.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        setVisible(false);
        Menu m= new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_backbtnActionPerformed

    private void issuebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtn1ActionPerformed
     
        String d = ((JTextField)date.getDateEditor().getUiComponent()).getText();
           try {
                FileWriter f = new FileWriter(path,true); 
                BufferedWriter bw = new BufferedWriter(f);
                PrintWriter p = new PrintWriter(bw);
                    String b,studentname,corse;
                    b=bknme.getText();
                    studentname=stuname.getText();
                    corse=cors.getText();
                    boolean bk=searchbook(b);
                    boolean stu=searchStudent(studentname,corse);
                     if("".equals(d) || "".equals(b) || "".equals(studentname) || "".equals(corse)) {
                    Error e= new  Error("FIELDS SHOULD NOT BE EMPTY!");
                    e.setVisible(true);
                    } 
                    if(bk==false){
                        Error e= new Error("Book Not Found!");
                        e.setVisible(true);
                        bknme.setText(null);
                    }
                    else if(stu==false){
                        Error e= new Error("Student Not Found!");
                        e.setVisible(true);
                        stuname.setText(null);
                        cors.setText(null);
                    }
                    else {
                        p.println(d+","+b+","+studentname+","+corse);
                        p.flush();
                        Success s= new  Success("Book Issued!");
                        s.setVisible(true);
                        bknme.setText(null);
                        stuname.setText(null);
                        cors.setText(null);
                        date.setCalendar(null);
                    }
               p.close();
                }
            
       
           
       catch (IOException e) {
            JOptionPane.showMessageDialog(rootPane, "File not open!");
        }
       
    }//GEN-LAST:event_issuebtn1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue_book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Issue_book().setVisible(true);
            }
        });
    }
    
    
    public  Boolean searchStudent(String studentname,String cor){
     
      boolean found=false;
         String line = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(path1));

            while ((line = br.readLine()) != null) {
                String[] l = line.split(",");

                if (studentname.equalsIgnoreCase(l[0]) && cor.equalsIgnoreCase(l[1]) ) {
                    found = true;
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "File not open!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid!");
        }

        return found;
   }
    
    
    public boolean searchbook(String bname) {
        boolean found=false;
        String line = "";

        try {

            BufferedReader br = new BufferedReader(new FileReader(fp));

            while ((line = br.readLine()) != null) {
                String[] l = line.split(",");

                if (bname.equalsIgnoreCase(l[0])) {
                    found = true;
                    break;
                }
            }

        } catch (FileNotFoundException ex) {
           JOptionPane.showMessageDialog(rootPane, "File not open!");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Invalid!");
        }

        return found;

    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField bknme;
    private javax.swing.JLabel bookname1;
    private javax.swing.JTextField cors;
    private javax.swing.JLabel course;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel datel;
    private javax.swing.JLabel head;
    private javax.swing.JLabel headerimg;
    private javax.swing.JButton issuebtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel stdname;
    private javax.swing.JTextField stuname;
    // End of variables declaration//GEN-END:variables
}
