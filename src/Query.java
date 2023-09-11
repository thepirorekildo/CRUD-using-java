
public class Query {
      static String insert = "insert into students (id, name, email, password) values (?,?,?,?)";
      static String read = "select * from students";
      static String update = "update students set name = ? where id = ?";
      static String delete = "delete from students where id = ?";
}
