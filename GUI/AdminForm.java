package GUI;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.text.DateFormat;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import javax.swing.JFrame;
//import javax.swing.Timer;
import java.awt.Color;

import Classes.*;

public class AdminForm extends javax.swing.JFrame {
        
    //  Creates new form StudentNew

   
     public static SystemManager manager ;
    
   /*   public AdminForm() {
         initComponents();
         
         construct();
         
          manager = new SystemManager("businfo.txt");
     }
     
     public AdminForm(String file) {
         initComponents();
         
         construct();
         
         manager = new SystemManager(file);
     }*/
     public AdminForm() {
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
        btnStudent = new javax.swing.JButton();
        btnAnnouncements = new javax.swing.JButton();
        btnFee = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(707, 569));
        setResizable(false);
        getContentPane().setLayout(null);

         jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel1.setText("Check Student Details ");
        jLabel1.setForeground(Color.white);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 150, 200, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel2.setText("Update Fee details");
        jLabel2.setForeground(Color.white);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(300, 240, 150, 20);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel3.setText("Check Announcements");
        jLabel3.setForeground(Color.white);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(294, 330, 170, 19);

        
        btnStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnStudent.setText("View details");
        btnStudent.setBackground(new Color(112,148,156));
        btnStudent.setForeground(Color.white);
        btnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent);
        btnStudent.setBounds(290, 170, 150, 32);


        btnFee.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnFee.setText("View Fee");
        btnFee.setBackground(new Color(112,148,156));
        btnFee.setForeground(Color.white);

        
        btnFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnFee);
        btnFee.setBounds(290, 260, 150, 32);
      
        btnAnnouncements.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnAnnouncements.setText("Click to see Announcements");
        btnAnnouncements.setBackground(new Color(112,148,156));
        btnAnnouncements.setForeground(Color.white);
        btnAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAttendanceActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnnouncements);
        btnAnnouncements.setBounds(270, 350, 200, 32);
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
    private void btnDetailsActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void btnAttendanceActionPerformed(java.awt.event.ActionEvent evt) {        
    }

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
 
     public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JLabel lblNow;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnFee;
    private javax.swing.JButton btnAnnouncements;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}