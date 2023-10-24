import java.util.*;

public class Interface {
   public static void main(String[] args) {
      
      Student student = new Student();
      
      String first_name, middle_name, last_name, suffix;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter First name: ");
      student.setfirstname(scan.nextLine());
      System.out.print("Enter Middle name: ");
      student.setmiddlename(scan.nextLine());
      System.out.print("Enter Last name: ");
      student.setlastname(scan.nextLine());
      System.out.print("Enter Suffix: ");
      student.setsuffix(scan.nextLine());
      
      System.out.println("First name: " + student.getfirstname());
      System.out.println("Middle name: " + student.getmiddlename());
      System.out.println("Last name: " + student.getlastname());
      System.out.println("Suffix: " + student.getsuffix());
      System.out.println("Fullname: " + student.getFullName());
      
      
            
   }
}

class Student {
      private String first_name, middle_name, last_name, suffix;
     
      
      Student () {
      
      }
      
      //setter
      
      public void setfirstname (String first_name) {
         this.first_name = first_name;
      }
      
      public void setmiddlename (String middle_name) {
         this.middle_name = middle_name;
      }
      
      public void setlastname (String last_name) {
         this.last_name = last_name;
      }
      
      public void setsuffix (String suffix) {
         this.suffix = suffix;
      }
      
      //getter
      
      public String getfirstname () {
         return first_name;
      }
      
      public String getmiddlename () {
         return middle_name;
      }
      
      public String getlastname () {
         return last_name;
      }
      
      public String getsuffix () {
       return suffix;
      }
      
      //display
      public String getFullName() {
         return getfirstname() + " " + getmiddlename() + " " + getlastname() + " " + getsuffix();
      }

}