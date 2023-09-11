
import java.sql.*;

public class DB {
      
      public static Connection connect(){
            Connection conn = null;
            try{
                  Class.forName("com.mysql.cj.jdbc.Driver");
                  String url = "jdbc:mysql://localhost:3306/codingrekildo";
                  String user = "root";
                  String pass = "rekildo3012";
                  conn = DriverManager.getConnection(url, user, pass);
            }catch(Exception e){
                  System.out.println(e);
            }
            return conn;
      }
}
