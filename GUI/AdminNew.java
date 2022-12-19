/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
import java.awt.Color;
import Classes.*;
/**
 *
 * @author Senarathna
 */
public class AdminNew extends javax.swing.JFrame {

    /**
     * Creates new form AdminNew
     */
    Name Name;
    String FirstN ="";
    String LastN = "";
    String PhoneNo = "";
    String passWord = "";
    
    public AdminNew() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FirstNameText = new javax.swing.JTextField();
        LastNameText = new javax.swing.JTextField();
        passwordText = new javax.swing.JPasswordField();
        PhoneNoText = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnCreateAccount = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
panelStatus = new javax.swing.JPanel();
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin CreateAccount | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("First Name:");
        jLabel1.setForeground(Color.white);
        getContentPane().add(jLabel1);
        
        jLabel1.setBounds(170, 100, 150, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Last Name:");
        jLabel2.setForeground(Color.white);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 130, 100, 20);


        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Phone Number:");
        jLabel3.setForeground(Color.white);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(170, 160, 120, 19);


        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 15)); // NOI18N
        jLabel4.setText("Password:");
        jLabel4.setForeground(Color.white);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 190, 100, 19);

        FirstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });
        getContentPane().add(FirstNameText);
        FirstNameText.setBounds(280, 100, 140, 28);

        LastNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });
        getContentPane().add(LastNameText);
        LastNameText.setBounds(280, 130, 140, 28);


        PhoneNoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhoneNoTextActionPerformed(evt);
            }
        });
        getContentPane().add(PhoneNoText);
        PhoneNoText.setBounds(280, 160, 140, 28);

        passwordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextActionPerformed(evt);
            }
        });
        getContentPane().add(passwordText);
        passwordText.setBounds(280, 190, 140, 28);

        btnCancel.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(400, 400, 90, 32);

        /*jLabel3.setFont(new java.awt.Font("Freestyle Script", 0, 48)); // NOI18N
        //jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ride With Us");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(250, 25, 200, 50); */

        btnCreateAccount.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCreateAccount.setText("CreateAccount");
        btnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreateAccount);
        btnCreateAccount.setBounds(200, 400, 150, 32);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(dp)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        /*jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/bus.gif"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 650); */

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        AdminLogin sl = new AdminLogin();
        sl.setVisible(true);
        sl.pack();
        this.dispose();

        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void passwordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextActionPerformed
        passWord = passwordText.getText();
    }//GEN-LAST:event_passwordTextActionPerformed

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        FirstN = FirstNameText.getText();
        LastN = LastNameText.getText();
        Name = new Name(FirstN,LastN);
        
    }//GEN-LAST:event_usernameTextActionPerformed

    private void PhoneNoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        PhoneNo = PhoneNoText.getText();
    }//GEN-LAST:event_usernameTextActionPerformed


    private void btnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccountActionPerformed
       /*  Name = Name.getText();
        Id = Id.getText();
        String[] loginDetails = new String[4];
      String Name = "";
      String Id = "";*/
	try(PrintWriter write = new PrintWriter(new FileOutputStream("newAccountA.txt"))){
	
		boolean end = false;
        Admin s = new Admin(Name,PhoneNo);
        write.println(FirstNameText.getText()+","+LastNameText.getText()+","+PhoneNoText.getText());
        JOptionPane.showMessageDialog(null, "New User created"); 
    }
	catch(FileNotFoundException ex){
		 JOptionPane.showMessageDialog(null,"File Not Found");
	}
	catch(Exception ex){
		 JOptionPane.showMessageDialog(null,ex.getMessage());
	}
         
      
    }

/*try(Scanner read = new Scanner(new FileInputStream("loginDetails.txt"))){
	
    boolean end = false;
    
    while(read.hasNextLine()&& !end){

        loginDetails = read.nextLine().split(",");
        userName = loginDetails[0];
        password = loginDetails[1];
                    
                    if(userName.compareTo(username)==0 && password.compareTo(passWord)==0){
                        LoadFile1 lf = new LoadFile1();
                        lf.setVisible(true);
                        lf.pack();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "Invalid login credentials. Please try again.");
                    }
    }
}
catch(FileNotFoundException ex){
     JOptionPane.showMessageDialog(null,"File Not Found");
}
catch(Exception ex){
     JOptionPane.showMessageDialog(null,ex.getMessage());
}
    
  
  
}*/           
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JTextField FirstNameText;
    private javax.swing.JTextField LastNameText;
    private javax.swing.JTextField PhoneNoText;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables

}