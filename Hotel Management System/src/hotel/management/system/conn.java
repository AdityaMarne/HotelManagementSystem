package hotel.management.system;
import java.sql.*;  //This pacakage contains connection and statemaent fun.

public class conn {
    Connection c;
    Statement s;
     
    public conn(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hms","root","");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
