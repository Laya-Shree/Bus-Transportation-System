package GUI;

import java.sql.*;

public class Student {
    public static String UserName;
    public static String Name;
    public static String Address;
    public static String contactNo;
    public static int BusNo;

    void setStudent(String id){
        UserName = id;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*"); 
            PreparedStatement countrow = con.prepareStatement("SELECT Name, Address, ContactNo, BusNo FROM student WHERE ID =?");
            countrow.setString(1,UserName);
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
