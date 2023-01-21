/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
//import java.awt.Graphics;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.image.BufferedImage;
import java.awt.Color;
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
/**
 *
 * @author Senarathna
 */
public class StudentForm extends javax.swing.JFrame {
        
    /**
     * Creates new form StudentNew
     */
   
     public static SystemManager manager ;
    
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
     public StudentForm() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        btnDetails = new javax.swing.JButton();
        btnAttendance = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

         jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel1.setText("Book Your Seats Here ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 150, 180, 20);
        jLabel1.setForeground(Color.white);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel2.setText("Check Bus Details Here");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 240, 180, 20);
        jLabel2.setForeground(Color.white);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel3.setText("Attendance");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(304, 330, 150, 19);
        jLabel3.setForeground(Color.white);

        btnBook.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnBook.setText("Book Seat");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnBook);
        btnBook.setBounds(290, 170, 90, 32);
        btnBook.setBackground(new Color(112,148,156));
        btnBook.setForeground(Color.white);

        btnDetails.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnDetails.setText("Bus Details");
        btnDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetails);
        btnDetails.setBounds(270, 260, 150, 32);
        btnDetails.setBackground(new Color(112,148,156));
        btnDetails.setForeground(Color.white);
        
        btnAttendance.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnAttendance.setText("Mark Attendance");
        btnAttendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAttendance);
        btnAttendance.setBounds(270, 350, 150, 32);
        getContentPane().setBackground(new Color(23,12,74));
        btnAttendance.setBackground(new Color(112,148,156));
        btnAttendance.setForeground(Color.white);
        
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
        SeatSystem ss = new SeatSystem();
        ss.setVisible(true);
        ss.pack();
        this.dispose();
        
    }
    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {
        checkBusDetails cb = new checkBusDetails();
        cb.setVisible(true);
        cb.pack();
        this.dispose();   
    }
    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {
        GetStudentList sl = new GetStudentList();
        sl.setVisible(true);
        sl.pack();
        this.dispose();

        
    }//GEN-LAST:event_btnCancelActionPerformed

/* 	try(PrintWriter write = new PrintWriter(new FileOutputStream("newAccount.txt"))){
	
		boolean end = false;
        //Student s = new Student(FirstN,LastN,Id,street,city,PhoneNo);
        write.println(FirstNameText.getText()+","+LastNameText.getText()+","+IdText.getText()+","+StreetAddressText.getText()+","+CityAddressText.getText()+","+PhoneNoText.getText());
	}
	catch(FileNotFoundException ex){
		 JOptionPane.showMessageDialog(null,"File Not Found");
	}
	catch(Exception ex){
		 JOptionPane.showMessageDialog(null,ex.getMessage());
	}
         
      
    }*/

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JLabel lblNow;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnDetails;
    private javax.swing.JButton btnAttendance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}