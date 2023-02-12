
package GUI;
// import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.*;

import javax.swing.JButton;
// import java.text.DateFormat;
// import java.text.SimpleDateFormat;
// import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JPanel;
// import javax.swing.Timer;
// import javax.swing.JScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class GetStudentList extends javax.swing.JFrame {
        
    
     JFrame f;
     public GetStudentList() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
  
    private void initComponents() {
        int rows=0;

        // lblNow = new javax.swing.JLabel();
        JButton btnBack = new JButton();
        JPanel panelStatus = new JPanel();
        dp = new javax.swing.JDesktopPane();
        JScrollPane s = new JScrollPane(f);
        getContentPane().add(s);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1900,990));
        setResizable(true);
        getContentPane().setLayout(null);
        
        //sql
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT COUNT(*) FROM student");
            rs.next();
            rows = rs.getInt(1);
            String data[][] = new String[rows][];  

            ResultSet rs1=stmt.executeQuery("SELECT * FROM student");
            int j=0;
            while(rs1.next()){
                String entry[]= new String[5];
                for(int i =0; i<5; i++){
                    entry[i] = rs1.getString(i+1);
                }
                data[j]=entry;
                j++;
            }  
            String column[]={"Student Name","Adress","Contact No.","Bus No.","ID"};
            JTable studentDetails = new JTable(data,column);
            JScrollPane sp=new JScrollPane(studentDetails);
            sp.setBounds(180,180,1500,500);
            getContentPane().add(sp);
            setVisible(true);
            con.close();  
        }catch(Exception e){System.out.println(e);}  


        //back button
        setVisible(true);
        btnBack.setBackground(new Color(112, 161, 180));
        btnBack.setForeground(Color.WHITE);
        btnBack.setUI(new StyledButtonUI());
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBack.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBack.setBackground(new Color(112, 161, 180));
            }
        });
        btnBack.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
            
        });
        btnBack.setBackground(new Color(112,148,156));
        btnBack.setForeground(Color.white);
        getContentPane().add(btnBack);
        btnBack.setBounds(10, 10, 90, 32);


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
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        
        AdminForm lf = new AdminForm();
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
            java.util.logging.Logger.getLogger(GetStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetStudentList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetStudentList().setVisible(true);
            }
        });
        
    }

    // Variables declaration
    // private javax.swing.JLabel lblNow;
    private javax.swing.JDesktopPane dp;
    // End of variables declaration//GEN-END:variables
}





