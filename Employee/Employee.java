// create a class
public class Employee {

    // create instance variables
    private String name;
    private String classification;
    private String id;
    private String gender;
    private double baseSalary;

    // default constructor and parameterized constructor
    public Employee() {
    }
    public Employee(String name, String classification, String id, String gender, double baseSalary) {
        this.name = name;
        this.classification = classification;
        this.id = id;
        this.gender = gender;
        this.baseSalary = baseSalary;
    }

    // set and get methods
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }
    public String getClassification() {
        return classification;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    } 

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

} // end class