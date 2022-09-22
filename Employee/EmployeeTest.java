/*
    Nick McLarnan
    Assignment 3.1
    Classes and constructors
    09/22/2022
 */

// import Scanner for input
import java.util.Scanner;

// create a class
public class EmployeeTest {
    
    // create a main method
    public static void main(String[] args) {

        // create a new scanner object
        Scanner in = new Scanner(System.in);
        
        // input from user for employee information
        System.out.print("Please enter your name: ");
        String name = in.nextLine();

        System.out.print("\nPlease enter your classification " +
            "\n(Faculty, Adjuct, Professional, Career, etc): ");
        String classification = in.nextLine();

        System.out.print("\nPlease enter your id: ");
        String id = in.nextLine();

        System.out.print("\nPlease enter your gender: ");
        String gender = in.nextLine();

        System.out.print("\nPlease enter your base salary: ");
        double baseSalary = in.nextDouble();

        // create objects using employee class. 
        // first one is entered through input
        Employee emp1 = new Employee(name, classification, id, gender, baseSalary);

        // these I enter base info for other employees
        Employee emp2 = new Employee("John Locke", "Faculty", "414691", "Male", 45000.00);
        Employee emp3 = new Employee("Miranda Fugs", "Professional", "418091", "Female", 75000.00);
        Employee emp4 = new Employee("Landon Falls", "Career", "670325", "Male", 60000.00);
        
        //another I use set methods with default constructor
        Employee emp5 = new Employee();
        emp5.setName("Ashley Wilford");
        emp5.setClassification("Adjuct");
        emp5.setId("564681");
        emp5.setGender("Female");
        emp5.setBaseSalary(38000.00);

        
        // print out final displays
        // employee 1
        System.out.println("\n     --Employee 1--");
        System.out.println("Name:              " + emp1.getName());
        System.out.println("Classification:    " + emp1.getClassification());
        System.out.println("Id:                " + emp1.getId());
        System.out.println("Gender:            " + emp1.getGender());
        System.out.printf("Base Salary:       $%.2f%n", emp1.getBaseSalary());
        
        // employee 2
        System.out.println("\n     --Employee 2--");
        System.out.println("Name:              " + emp2.getName());
        System.out.println("Classification:    " + emp2.getClassification());
        System.out.println("Id:                " + emp2.getId());
        System.out.println("Gender:            " + emp2.getGender());
        System.out.printf("Base Salary:       $%.2f%n", emp2.getBaseSalary());

        // employee 3
        System.out.println("\n     --Employee 3--");
        System.out.println("Name:              " + emp3.getName());
        System.out.println("Classification:    " + emp3.getClassification());
        System.out.println("Id:                " + emp3.getId());
        System.out.println("Gender:            " + emp3.getGender());
        System.out.printf("Base Salary:       $%.2f%n", emp3.getBaseSalary());

        // employee 4
        System.out.println("\n     --Employee 4--");
        System.out.println("Name:              " + emp4.getName());
        System.out.println("Classification:    " + emp4.getClassification());
        System.out.println("Id:                " + emp4.getId());
        System.out.println("Gender:            " + emp4.getGender());
        System.out.printf("Base Salary:       $%.2f%n", emp4.getBaseSalary());

        // employee 5
        System.out.println("\n     --Employee 5--");
        System.out.println("Name:              " + emp5.getName());
        System.out.println("Classification:    " + emp5.getClassification());
        System.out.println("Id:                " + emp5.getId());
        System.out.println("Gender:            " + emp5.getGender());
        System.out.printf("Base Salary:       $%.2f%n", emp5.getBaseSalary());
        System.out.println();
    } // end main method
} // end class

// END PROGRAM