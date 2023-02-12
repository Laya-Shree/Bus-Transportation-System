package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


import Classes.*;

public class BusNo extends javax.swing.JFrame {
        
    // Creates new form DriverNew
   
     public static SystemManager manager ;
    
     public BusNo() {
        initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
   
    
    private void initComponents() {

        JButton btnEdit = new JButton();
        textfbusno = new javax.swing.JTextField();
        textfid = new javax.swing.JTextField();
        buslabel = new javax.swing.JLabel();
        idlabel = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Page | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1900,990));
        setResizable(true);
        getContentPane().setLayout(null);

       

        textfbusno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //textField1ActionPerformed(evt);
            }
        });

        getContentPane().add(textfbusno);
        textfbusno.setBounds(450, 290, 180, 30);

        textfid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                //textField1ActionPerformed(evt);
            }
        });

        getContentPane().add(textfid);
        textfid.setBounds(450, 380, 180, 30);


        try{ 
            int rows=0;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT COUNT(*) FROM student");
            rs.next();
            rows = rs.getInt(1);
            String data[][] = new String[rows][];  

            ResultSet rs1=stmt.executeQuery("SELECT * FROM student");
            // DefaultTableModel table = (DefaultTableModel) studentdetails.getModel();
            
            int j=0;
            while(rs1.next()){
                String entry[]= new String[5];
                for(int i =0; i<5; i++){
                    entry[i] = rs1.getString(i+1);
                }
                data[j]=entry;
                j++;
            }  
            String column[]={"Student Name","Address","Contact No.","Bus Number","ID"};
            studentdetails = new JTable(data,column);
            JScrollPane sp=new JScrollPane(studentdetails);
            sp.setBounds(800,180,1000,600);
            getContentPane().add(sp);
            setVisible(false);
            con.close();  
        }catch(Exception e){System.out.println(e);} 
        

        buslabel.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        buslabel.setText("Bus Number:");
        buslabel.setForeground(Color.white);
        getContentPane().add(buslabel);
        buslabel.setBounds(200, 290, 250, 20);

        idlabel.setFont(new java.awt.Font("SansSerif", 0, 14)); 
        idlabel.setText("Student ID:");
        idlabel.setForeground(Color.white);
        getContentPane().add(idlabel);
        idlabel.setBounds(200, 380, 250, 20);

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
        btnBack.setBounds(10, 10, 90, 32);

        //Edit Button
        btnEdit.setBackground(new Color(112, 161, 180));
        btnEdit.setForeground(Color.WHITE);
        btnEdit.setUI(new StyledButtonUI());
        btnEdit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                btnEdit.setBackground(new Color(92, 132, 147));
            }
            public void mouseExited(MouseEvent evt) {
                btnEdit.setBackground(new Color(112, 161, 180));
            }
        });
        btnEdit.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnEdit.setText("Edit");
        btnEdit.setForeground(Color.white);
        btnEdit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit);
        btnEdit.setBounds(380, 450, 70, 32);


       

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
        AdminForm ss = new AdminForm();
        ss.setVisible(true);
        ss.pack();
        this.dispose();
        
    }
    

    private void btnEditActionPerformed(ActionEvent evt) {
        int busno = Integer.parseInt(textfbusno.getText());
        String id= textfid.getText();
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*");  
             
            PreparedStatement insert = con.prepareStatement("UPDATE student set BusNo = ? WHERE ID = ?;");
            insert.setString(2,id);
            insert.setInt(1,busno);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(null,"Record Updated!");
            con.close();  
        }catch(Exception e){System.out.println(e);}
        BusNo bs = new BusNo();
        bs.setVisible(true);
        bs.pack();
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
            java.util.logging.Logger.getLogger(BusNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusNo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusNo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    //private javax.swing.JLabel lblNow;
    //private javax.swing.JButton btnAttendance;
    private javax.swing.JButton btnBack;
    private javax.swing.JTable studentdetails;
    private javax.swing.JLabel buslabel;
    private javax.swing.JLabel idlabel;
    private javax.swing.JTextField textfbusno;
    private javax.swing.JTextField textfid;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;
    // End of variables declaration//GEN-END:variables
}
