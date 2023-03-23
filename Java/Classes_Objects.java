import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// File: Employee.java
abstract class Employee {
    private int salary;
    private String grade;
    
    public abstract void setSalary(int salary);
    public abstract int getSalary();
    public abstract void setGrade(String grade);
    public abstract String getGrade();
    public void label() {
        System.out.println("Employee's data:");
    }    
}

// File: Engineer.java
class Engineer extends Employee {
    private int salary;
    private String grade;
    
    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getSalary() {
        return this.salary;
    }
    
    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    @Override
    public String getGrade() {
        return this.grade;
    }
}

// File: Manager.java
class Manager extends Employee {
    private int salary;
    private String grade;
    
    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public int getSalary() {
        return this.salary;
    }
    
    @Override
    public void setGrade(String grade) {
        this.grade = grade;
    }
    
    @Override
    public String getGrade() {
        return this.grade;
    }
}

// File: Main.java
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            String typeOfEmployee = scanner.next();
            String grade = scanner.next();
            int salary = scanner.nextInt();
            
            if (typeOfEmployee.equals("Engineer")) {
                Engineer engineer = new Engineer();
                engineer.setGrade(grade);
                engineer.setSalary(salary);
                engineer.label();
                System.out.println("Grade: "+ engineer.getGrade());
                System.out.println("Salary: "+ engineer.getSalary());
            } else if (typeOfEmployee.equals("Manager")) {
                Manager manager = new Manager();
                manager.setGrade(grade);
                manager.setSalary(salary);
                manager.label();
                System.out.println("Grade: "+ manager.getGrade());
                System.out.println("Salary: "+manager.getSalary());
            }
        }
    }
}