
package GUI;
// import java.awt.Graphics;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.image.BufferedImage;
// import java.awt.Color;
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
// import javax.swing.*;

import javax.swing.JFrame;

// import Classes.*;
/**
 *
 * @author Senarathna
 */
public class checkBusDetails extends javax.swing.JFrame {
        
    /**
     * Creates new form StudentNew
     */
   
     //public static SystemManager manager ;
    
   /*   public StudentForm1() {
         initComponents();
         
         construct();
         
          manager = new SystemManager("businfo.txt");
     }
     
     public StudentForm1(String file) {
         initComponents();
         
         construct();
         
         manager = new SystemManager(file);
     }*/
     JFrame f;
     public checkBusDetails() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
    
    private void initComponents() {


        // lblNow = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

        String data[][]={{"Bus 5","24 feb 2021","al nahda","5:20"},{"Bus 6","24 feb 2021","al nahda","5:20",""},
        {"Bus 2","24 feb 2021","al nahda","5:20"},{"Bus 1","24 feb 2021","al nahda","5:20"}};
        String column[]={"Bus No","Date","Location","Travel Time"};
        busDetails=new javax.swing.JTable(data,column);
        //busDetails.setBounds(30,40,200,300);

       // JScrollPane sp=new JScrollPane(busDetails);
        getContentPane().add(busDetails);
        busDetails.setBounds(180,180,300,90);
        //getContentPane().setSize(300,400);
        
        setVisible(true);
        

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
        btnBack.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(450, 100, 90, 32);
        
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        StudentForm lf = new StudentForm();
        lf.setVisible(true);
        lf.pack();
        this.dispose();
   
    }
 
     public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(checkBusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkBusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkBusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkBusDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkBusDetails().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // private javax.swing.JLabel lblNow;
    private javax.swing.JTable busDetails;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    private javax.swing.JButton btnBack;
    // End of variables declaration//GEN-END:variables
}