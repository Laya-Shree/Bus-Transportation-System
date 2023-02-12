package GUI;
import java.sql.*;  

public class sqlConnect {

    public static void main(String args[]){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/bus_transportation","root","*Laya2003*");  
            Statement stmt=con.createStatement();  
            
            ResultSet rs=stmt.executeQuery("SELECT * FROM student");
            String data[][] = new String[500][];  
            int j=0;
            while(rs.next()){
                String entry[]= new String[5];
                for(int i =0; i<5; i++){
                    entry[i] = rs.getString(i+1);
                }
                data[j]=entry;
            }  
            con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }  
}  

