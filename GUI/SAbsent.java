
package GUI;
import java.awt.Color;


public class SAbsent extends javax.swing.JFrame {

    //  Creates new form Login
    
    public SAbsent() {
        initComponents();
        
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        btnAbsent = new javax.swing.JButton();
        dp = new javax.swing.JDesktopPane();
        panelStatus = new javax.swing.JPanel();

        btnAbsent.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnAbsent.setText("Absent");
        btnAbsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsentActionPerformed(evt);
            }
        });
        getContentPane().add(btnAbsent);
        btnAbsent.setBounds(200, 200, 90, 32);

        //Admin Button
        btnBack.setFont(new java.awt.Font("SansSerif", 0, 12)); 
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        getContentPane().add(btnBack);
        btnBack.setBounds(350, 200, 90, 32);

        btnBack.setBackground(new Color(112,148,156));
        btnBack.setForeground(Color.white);
        btnAbsent.setBackground(new Color(112,148,156));
        btnAbsent.setForeground(Color.white);
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student | Ride With Us");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(700, 570));
        setResizable(false);
        getContentPane().setLayout(null);

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


        
        /*jLabel1.setFont(new java.awt.Font("Freestyle Script", 0, 48)); 
        //jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ride With Us");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 300, 50); */

        pack();
    }

    

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {
        DriverLogin dLogin = new DriverLogin();
        dLogin.pack();
        dLogin.setVisible(true);
        this.dispose();
                     
	}

    private void btnAbsentActionPerformed(java.awt.event.ActionEvent evt) {
        AdminLogin aLogin = new AdminLogin();
        aLogin.pack();
        aLogin.setVisible(true);
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
            java.util.logging.Logger.getLogger(SAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SAbsent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SAbsent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnAbsent;
    private javax.swing.JDesktopPane dp;
    private javax.swing.JPanel panelStatus;

    
    // End of variables declaration//GEN-END:variables
}

