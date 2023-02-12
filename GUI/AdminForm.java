package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;

import javax.swing.JScrollPane;
import javax.swing.JTable;

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
    
   
     public AdminForm() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
  
    private void initComponents() {

        //lblNow = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnStudent = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAnnouncements = new javax.swing.JButton();
        btnbus = new javax.swing.JButton();
        btnbusedit = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1900,990));
        setResizable(true);
        getContentPane().setLayout(null);

        try{ 
            int rows=0;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT COUNT(*) FROM announcement");
            rs.next();
            rows = rs.getInt(1);
            String data[][] = new String[rows][];  

            ResultSet rs1=stmt.executeQuery("SELECT * FROM announcement");
            int j=0;
            while(rs1.next()){
                String entry[]= new String[3];
                for(int i =0; i<3; i++){
                    entry[i] = rs1.getString(i+1);
                }
                data[j]=entry;
                j++;
            }  
            String column[]={"Date","Time","Announcement"};
            JTable studentDetails = new JTable(data,column);
            studentDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            studentDetails.getColumnModel().getColumn(0).setPreferredWidth(90);
            studentDetails.getColumnModel().getColumn(1).setPreferredWidth(90);
            studentDetails.getColumnModel().getColumn(2).setPreferredWidth(620);
            
            JScrollPane sp=new JScrollPane(studentDetails);
            sp.setBounds(1000,180,800,600);
            getContentPane().add(sp);
            setVisible(true);
            con.close();  
        }catch(Exception e){System.out.println(e);}  

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel1.setText("Check Student Details ");
        jLabel1.setForeground(Color.white);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 330, 200, 20);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel2.setText("Update Bus details");
        jLabel2.setForeground(Color.white);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 420, 150, 20);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel3.setText("Announcements");
        jLabel3.setForeground(Color.white);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 510, 170, 19);

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        jLabel4.setText("Update student Bus No.");
        jLabel4.setForeground(Color.white);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 600, 170, 19);

        //Back Button
        btnBack.setBackground(new Color(112, 161, 180));
        btnBack.setForeground(Color.WHITE);
        btnBack.setUI(new StyledButtonUI());
        btnBack.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnBack.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnBack.setBackground(new Color(112, 161, 180));
            }
        });
        btnBack.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnBack.setText("Back");
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(50, 260, 100, 32);

        //Student Details Button
        btnStudent.setBackground(new Color(112, 161, 180));
        btnStudent.setForeground(Color.WHITE);
        btnStudent.setUI(new StyledButtonUI());
        btnStudent.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnStudent.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnStudent.setBackground(new Color(112, 161, 180));
            }
        });
        btnStudent.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnStudent.setText("View details");
        btnStudent.setForeground(Color.white);
        btnStudent.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnStudentActionPerformed(evt);
            }
        });
        getContentPane().add(btnStudent);
        btnStudent.setBounds(50, 350, 100, 32);

        //Update Bus Details Button
        btnbus.setBackground(new Color(112, 161, 180));
        btnbus.setForeground(Color.WHITE);
        btnbus.setUI(new StyledButtonUI());
        btnbus.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnbus.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnbus.setBackground(new Color(112, 161, 180));
            }
        });
        btnbus.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnbus.setText("Bus Details");
        btnbus.setForeground(Color.white);

        
        btnbus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnDetailsActionPerformed(evt);
            }
        });
        getContentPane().add(btnbus);
        btnbus.setBounds(50, 440, 100, 32);

        //Announcement Button
        btnAnnouncements.setBackground(new Color(112, 161, 180));
        btnAnnouncements.setForeground(Color.WHITE);
        btnAnnouncements.setUI(new StyledButtonUI());
        btnAnnouncements.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnAnnouncements.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnAnnouncements.setBackground(new Color(112, 161, 180));
            }
        });
        btnAnnouncements.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnAnnouncements.setText("Announce");
        btnAnnouncements.setForeground(Color.white);
        btnAnnouncements.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnAnnouncementActionPerformed(evt);
            }
        });
        getContentPane().add(btnAnnouncements);
        btnAnnouncements.setBounds(50, 530, 100, 32);

        //Bus Edit Button
        btnbusedit.setBackground(new Color(112, 161, 180));
        btnbusedit.setForeground(Color.WHITE);
        btnbusedit.setUI(new StyledButtonUI());
        btnbusedit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnbusedit.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnbusedit.setBackground(new Color(112, 161, 180));
            }
        });
        btnbusedit.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnbusedit.setText("Edit Bus");
        btnbusedit.setForeground(Color.white);
        btnbusedit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBusEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnbusedit);
        btnbusedit.setBounds(50, 620, 100, 32);


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

    private void btnBackActionPerformed(ActionEvent evt) {
        AdminLogin ss = new AdminLogin();
        ss.setVisible(true);
        ss.pack();
        this.dispose();
    }
    private void btnStudentActionPerformed(ActionEvent evt) {
        GetStudentList s = new GetStudentList();
        s.setVisible(true);
        s.pack();
        this.dispose();
    }
    private void btnDetailsActionPerformed(ActionEvent evt) {
        UpdateBus s = new UpdateBus();
        s.setVisible(true);
        s.pack();
        this.dispose();
    }
    private void btnAnnouncementActionPerformed(ActionEvent evt) {
        Announcement s = new Announcement();
        s.setVisible(true);
        s.pack();
        this.dispose();
    }

    private void btnBusEditActionPerformed(ActionEvent evt) {
        BusNo s = new BusNo();
        s.setVisible(true);
        s.pack();
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
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnbus;
    private javax.swing.JButton btnbusedit;
    private javax.swing.JButton btnAnnouncements;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}