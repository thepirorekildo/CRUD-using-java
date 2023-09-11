
import java.sql.SQLException;
import java.util.*;


public class App {
      public static void main(String[] args) throws SQLException{
            while(true){

                  System.out.println("Enter Your Choice");
                  System.out.println("1.Create \n2.Read \n3.Update \n4.Delete");
                  Scanner sc = new Scanner(System.in);
                  int choice = sc.nextInt();

                  if(choice < 1 || choice > 4) break; //to break from while loop

                  switch(choice){
                        case 1: //create
                              System.out.println("id, name, email, password");
                              int id = sc.nextInt();
                              sc.nextLine();
                              String name = sc.nextLine();
                              String email = sc.nextLine();
                              String password = sc.nextLine();
                              Employee emp = new Employee(id, name, email, password);
                              EmployeeDao.CreateEmployee(emp);
                              break;

                        case 2: //read
                              ArrayList<Employee> list = EmployeeDao.readAllEmployee();
                              for(Employee e : list){
                                    System.out.println(e);
                              }
                              break;

                        case 3://update
                              System.out.println("Enter id & name. id to search and name to modify name");
                              id = sc.nextInt();
                              sc.nextLine();
                              name = sc.nextLine();
                              EmployeeDao.updateEmployee(id,name);
                              break;

                        case 4://delete
                              System.out.println("Enter id you want to delete");
                              id = sc.nextInt();
                              EmployeeDao.deleteEmployee(id);
                  }
            }//while loop
      }
}
