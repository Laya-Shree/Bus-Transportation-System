package GUI;

import java.sql.*;

public class Professor {
    public static String UserName;
    public static String Name;
    public static String Address;
    public static String contactNo;
    public static int BusNo;

    void setProfessor(String id){
        UserName = id;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_system","root","Lovely@4567"); 
            PreparedStatement countrow = con.prepareStatement("SELECT Name, Address, ContactNo, BusNo FROM Passenger WHERE ID like '%P'");
            //countrow.setString(1,UserName);
            ResultSet rs=countrow.executeQuery();
            rs.next();
            Name = rs.getString(1);
            Address = rs.getString(2);
            contactNo = rs.getString(3);
            BusNo = rs.getInt(4);
            con.close();  
        }catch(Exception e){System.out.println(e);} 

    }
    public String getID(){
        return UserName;
    }
    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }
    public String getContactNo(){
        return contactNo;
    }
    public int getBusNo(){
        return BusNo;
    }
}
