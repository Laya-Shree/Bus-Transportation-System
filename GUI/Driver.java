
package GUI;

import java.sql.*;

public class Driver {
    public static String UserName;
    public static int BusNo;

    void setDriver(String id){
        UserName = id;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*"); 
            PreparedStatement countrow = con.prepareStatement("SELECT Bus_No FROM bus WHERE Driver_Name =?");
            countrow.setString(1,UserName);
            ResultSet rs=countrow.executeQuery();
            rs.next();
        
            BusNo = rs.getInt(1);
            con.close();  
        }catch(Exception e){System.out.println(e);} 

    }
    public String getID(){
        return UserName;
    }
    
    public int getBusNo(){
        return BusNo;
    }
}

