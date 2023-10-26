package com.assignment01_02;
public class EmployeeSearch {
    static class Employee {
        int empid;
        String name;
        double salary;

        public Employee(int empid, String name, double salary) {
            this.empid = empid;
            this.name = name;
            this.salary = salary;
        }
    }

    public static Employee searchByEmpid(Employee[] employees, int empid) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].empid == empid) {
                return employees[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(1, "Alice", 50000),
            new Employee(2, "Bob", 60000),
            new Employee(3, "Charlie", 55000)
            // Add more employees as needed
        };

        int empidToSearch = 2;
        Employee result = searchByEmpid(employees, empidToSearch);
        if (result != null) {
            System.out.println("Employee found by empid: " + result.name);
        } else {
            System.out.println("Employee not found by empid: " + empidToSearch);
        }
    }
    
 // Inside the EmployeeSearch class

    public static Employee searchByName(Employee[] employees, String name) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].name.equalsIgnoreCase(name)) {
                return employees[i];
            }
        }
        return null;
    }
    
 // Inside the EmployeeSearch class

    public static Employee searchBySalary(Employee[] employees, double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].salary == salary) {
                return employees[i];
            }
        }
        return null;
    }

    
    
}
