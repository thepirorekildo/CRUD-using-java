
public class Employee {
      //data members of employee
      private int id;
      private String name, email, password;

      public Employee(int id, String name, String email, String password){
            this.id = id;
            this.name = name;
            this.email = email;
            this.password = password;
      }

      public int getId(){ return id; }
      public String getName (){ return name; }
      public String getEmail(){ return email; }
      public String getPassword(){ return password;}


      public String toString(){
            return "Employee [ id : " + id + ", Name : " + name + ", Email : " + email + ", Password : " + password + " ]";
      }
}
