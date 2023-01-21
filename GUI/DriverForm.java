package GUI;
import java.awt.Color;
// import java.awt.Graphics;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.image.BufferedImage;
// import java.net.URL;
// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import javax.imageio.ImageIO;
// import javax.swing.JFrame;
// import javax.swing.JInternalFrame;
// import javax.swing.JOptionPane;
// import javax.swing.Timer;
// import java.io.*;
// import javax.swing.JOptionPane;

import Classes.*;

public class DriverForm extends javax.swing.JFrame {
        
    // Creates new form DriverNew
   
     public static SystemManager manager ;
    
   /*   public DriverForm1() {
         initComponents();
         
         construct();
         
          manager = new SystemManager("businfo.txt");
     }
     
     public DriverForm1(String file) {
         initComponents();
         
         construct();
         
         manager = new SystemManager(file);
     }*/
     public DriverForm() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    //  private void construct()
    //  {
    //      //DD::: setup the footer notification area with live date and time along with setting the window to maximized state
         
    //      this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
         
    //       //Start Timer
    //      final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    //      int interval = 1000; // 1000 ms
    //      new Timer(interval, new ActionListener() {
    //          @Override
    //          public void actionPerformed(ActionEvent e) {
    //              Calendar now = Calendar.getInstance();
    //              lblNow.setText(dateFormat.format(now.getTime()));
    //          }
    //      }).start();
    //  }
    
    private void initComponents() {

        //lblNow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
      
        btnAttendance = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Driver Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

         jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel1.setText("View Student Attendance ");
        jLabel1.setForeground(Color.white);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 150, 250, 20);

        
        btnAttendance.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnAttendance.setText("Click to view");
        btnAttendance.setBackground(new Color(112,148,156));
        btnAttendance.setForeground(Color.white);
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttendance);
        btnAttendance.setBounds(290, 170, 140, 32);


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

        pack();
    }
    
    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {

        
    }
    // private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        
    // }
    // private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {
        
    // }


     public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DriverForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DriverForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JLabel lblNow;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}