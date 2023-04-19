package GUI;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.sql.*;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import Classes.*;
class getBusNo extends DriverLogin{
    public int getBus(){
        return this.d.getBusNo();
    }
}

public class RouteDetails extends javax.swing.JFrame {
        
    // Creates new form DriverNew
     public static SystemManager manager ;
    
     public RouteDetails() {
        this.initComponents();
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
   
    
    private void initComponents() {

        this.dp = new javax.swing.JDesktopPane();
        this.panelStatus = new javax.swing.JPanel();
        try{ 
            int rows=0;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_system","root","angel1234");  
            Statement stmt=con.createStatement();  
            ResultSet rs1=stmt.executeQuery("select * from Route");
            int j=0;
            String data[][] = new String[rows][];  
            while(rs1.next()){
                String entry[]= new String[5];
                for(int i =0; i<5; i++){
                    entry[i] = rs1.getString(i+1);
                }
                data[j]=entry;
                j++;
            }  
            String column[]={"BusNo","Name","ID","Capacity","Plate_No"};
            JTable RouteDetails = new JTable(data,column);
            RouteDetails.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            RouteDetails.getColumnModel().getColumn(0).setPreferredWidth(90);
            RouteDetails.getColumnModel().getColumn(1).setPreferredWidth(400);
            RouteDetails.getColumnModel().getColumn(2).setPreferredWidth(90);
            RouteDetails.getColumnModel().getColumn(3).setPreferredWidth(90);
            RouteDetails.getColumnModel().getColumn(4).setPreferredWidth(300);
            
            
            JScrollPane sp=new JScrollPane(RouteDetails);
            sp.setBounds(1000,180,1000,600);
            this.getContentPane().add(sp);
            this.setVisible(true);
            con.close();  
        }catch(Exception e){System.out.println(e+"Here");}  

            /*String column[]={"BusNo","Name","ID","Capacity","Plate_No"};
            JTable bus = new JTable(data,column);
            bus.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            bus.getColumnModel().getColumn(0).setPreferredWidth(90);
            bus.getColumnModel().getColumn(1).setPreferredWidth(90);
            bus.getColumnModel().getColumn(2).setPreferredWidth(620);
            bus.getColumnModel().getColumn(2).setPreferredWidth(620);
            bus.getColumnModel().getColumn(2).setPreferredWidth(620);
            JScrollPane sp=new JScrollPane(bus);
            sp.setBounds(1000,180,800,600);
            this.getContentPane().add(sp);
            this.setVisible(true);
            con.close(); */ 

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Route_Details | Ride With Us");
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        this.setMinimumSize(new java.awt.Dimension(1900,990));
        this.setResizable(true);
        this.getContentPane().setLayout(null);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this.getContentPane());
    this.getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(this.panelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(this.dp)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(this.dp)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(this.panelStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

        this.pack();
    }
    

    private void btnbusActionPerformed(ActionEvent evt) {
        DriverForm ss = new DriverForm();
        ss.setVisible(true);
        ss.pack();
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
            java.util.logging.Logger.getLogger(RouteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouteDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouteDetails().setVisible(true);
            }
        });
    }
        private javax.swing.JTable RouteDetails;
        private javax.swing.JDesktopPane dp;
        private javax.swing.JPanel panelStatus;
}
    

    
