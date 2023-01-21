package GUI;
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class SeatSystem {
    // Global Variables
    JFrame frame = new JFrame(); // Creates JFrame
    JLabel title;
    JButton l[][], m[][], r[][]; // Names grid of JButtons
    JPanel panel1, panel2, panel3;

    // Constructor
    public SeatSystem(){

            this.title = new JLabel("Bus Seats");
            this.title.setFont(new Font("Helvetica", Font.BOLD, 30));
            this.title.setLocation(12,5);
            this.title.setSize(600, 60);

            this.frame.setLayout(null); // Setting Grid Layout
            // panel1.setLayout(new GridLayout(seat,row));
            this.l = new JButton[4][4]; // Allocating Size of Grid
            this.panel1 = new JPanel(new GridLayout(4,2));
            this.panel1.setBackground(Color.black);
            this.panel1.setBounds(120, 200, 300, 500);
            for(int y = 0; y < 2 ; y++){
                    for(int x = 0; x < 4; x++){
                        this.l[x][y] = new JButton("L" + y + x); // Creates New JButton
                        // l[x][y].addActionListener(this);
                        this.panel1.add(this.l[x][y]); //adds button to grid
                    }
            }

         
            this.r = new JButton[4][4]; // Allocating Size of Grid
            this.panel3 = new JPanel(new GridLayout(4,2));
            this.panel3.setBackground(Color.blue);
            this.panel3.setBounds(500, 200, 300, 500);
            for(int y = 0; y <2 ; y++){
                    for(int x = 0; x < 4; x++){
                        this.r[x][y] = new JButton("seat" + y + x); // Creates New JButton
                        this.panel3.add(this.r[x][y]); //adds button to grid
                    }
            }

            this.frame.add(this.title);
            this.frame.add(this.panel1);
            //this.frame.add(this.panel2);
            this.frame.add(this.panel3);
            this.frame.setPreferredSize(new Dimension(680, 280));
            this.frame.setTitle("Seat Booking");
            this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.frame.pack(); //sets appropriate size for frame
            this.frame.setVisible(true); //makes frame visible
    }

    // Main Class
    public static void main(String[] args) {
            new SeatSystem(); //makes new ButtonGrid with 2 parameters
    }

    public void pack() {
    }

    public void setVisible(boolean b) {
    }
}
