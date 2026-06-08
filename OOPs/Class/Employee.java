package OOPs.Class;

public class Employee {
    String domain = "CS";
    public int noOfEmployees = 1500;
    private int noOfUsers = 20000;
    public void info(String name, String id, int salary){
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}
