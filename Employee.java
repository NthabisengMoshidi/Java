class Employee {
    private String name;
    private int yearOfJoining;
    private String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return name + "\t" + yearOfJoining  + "\t" + address;
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
           new Employee("Robert", 2021, "161 church square Pretoria 0001"),
           new Employee("Sam", 2024, "132 alsand street Midrand 3254"),
           new Employee("John", 2011, "103 bree street Joburg 2142")
        };

        System.out.println("Name\tYear of joining\tAddress");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}