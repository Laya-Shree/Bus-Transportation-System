package GUI;

import java.sql.*;

public class Professor {
    public static String UserName;
    public static String Name;
    public static String City;
    public static String Street;
    public static int Contact_No;
    public static String Bldg;

    void setProfessor(String id){
        UserName = id;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_system","root","*Laya2003*"); 
            PreparedStatement countrow = con.prepareStatement("SELECT Name,Contact_No, City, Street, Bldg FROM Passenger WHERE ID like '%P'");
            //countrow.setString(1,UserName);
            ResultSet rs=countrow.executeQuery();
            rs.next();
            Name = rs.getString(2);
            Contact_No = rs.getInt(3);
            City= rs.getString(4);
            Street = rs.getString(5);
            Bldg = rs.getString(6);
            con.close();  
        }catch(Exception e){System.out.println(e);} 

    }
    public String getID(){
        return UserName;
    }
    public String getName(){
        return Name;
    }
    public String getCity(){
        return City;
    }
    
    public String getStreet(){
        return Street;
    }
    
    public String getBldg(){
        return Bldg;
    }
    public int getContactNo(){
        return Contact_No;
    }
   
}
