
import java.sql.*;
import java.util.*;

public class EmployeeDao {

      public static void CreateEmployee(Employee emp) throws SQLException{
            Connection conn = DB.connect();
            String query = Query.insert;
            PreparedStatement s = conn.prepareStatement(query);
            s.setInt(1,emp.getId());
            s.setString(2,emp.getName());
            s.setString(3,emp.getEmail());
            s.setString(4,emp.getPassword());
            s.executeUpdate();
            System.out.println("Data Inserted Succesfully");
            s.close();

      }

      static public ArrayList<Employee> readAllEmployee() throws SQLException{
            ArrayList<Employee> arr = new ArrayList<>();
            Connection conn = DB.connect();
            PreparedStatement s = conn.prepareStatement(Query.read);
            ResultSet res = s.executeQuery(); 

            while(res.next()){
                  Employee emp = new Employee(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
                  arr.add(emp);
            }
            System.out.println("Your Data is as Follow : --------------- ");
            conn.close();
            return arr;
      }

      public static void updateEmployee(int id, String name) throws SQLException{
            Connection conn = DB.connect();
            PreparedStatement s = conn.prepareStatement(Query.update);
            
            s.setString(1,name);
            s.setInt(2, id);

            s.executeUpdate();
            System.out.println("Updatiion Done Successfully");
            conn.close();
      }

      public static void deleteEmployee(int id) throws SQLException{
            Connection conn = DB.connect();
            PreparedStatement s = conn.prepareStatement(Query.delete);
            
            s.setInt(1,id);
            
            s.execute();

            System.out.println("Delection Done Successfully");
            conn.close();
      }
}
