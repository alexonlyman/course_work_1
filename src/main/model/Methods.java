package main.model;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Methods {
    Employee[] employees = new Employee[10];
    Department[] departments = new Department[4];

    /**
     * Get a list of all employees with all the data available on them
     */
    public static void getAllEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    /**
     * Calculate the amount of salary costs per month.
     */
    public static void calculateSalarybyMonth(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        System.out.println("month salary" + sum);

    }

    /**
     * Find an employee with the minimum salary
     */
    public static void calculateMinSalary(Employee[] employees) {
        Employee search = employees[0];
        Integer min = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < min) {
                min = employee.getSalary();
            }
        }
        System.out.println("min salary is " + min);
    }

    /**
     * Find an employee with the maximum salary.
     */
    public static void calculateMaxSalary(Employee[] employees) {
        int max = 0;
        for (Employee employee : employees) {
            if (employee.getSalary() > max) {
                max = employee.getSalary();
            }
        }
        System.out.println("max salary is " + max);
    }

    /**
     * Calculate the average salary (you can use the method for this
     */
    public static void calculateAverage(Employee[] employees) {
        int sum = 0;
        int avr = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
            avr = sum / employees.length;

        }
        System.out.println("average salary is " + avr);

    }

    /*
    Get the full names of all employees (output to the console).
     */
    public static void getAllNames(Employee[] employees) {
        for (Employee employee : employees) {
            String name = employee.getFirstName();
            String lastName = employee.getLastName();
            System.out.println("firstname is " + name + ", lastname is " + lastName);
        }

    }

    /*
    employee salary indexation with param
     */
    public static void indexSallary(Employee[] employees, double index) {
        double total = 0;
        index = index/100;
        for (Employee employee : employees) {
            total = employee.getSalary() * index;
            total = total + employee.getSalary();
            System.out.println("indexing of "+ index*100+ " % " + Math.round(total));

        }

    }

    /*
     Receive the department number (1–5) as a parameter and find (5 methods in total):

    /*
            1. An employee with a minimum wage.

     */
    public static void findMinSalaryInDepartment(Employee[] employees, Integer id) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (!employee.getDepartment().getId().equals(id)) {
                continue;
            }
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }

        }
        System.out.println("min salary in department " + result);
    }
/*
        2. Employee with the maximum salary.

 */
    public static void findMaxSalaryInDepartment(Employee[] employees, Integer id) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (!employee.getDepartment().getId().equals(id)) {
                continue;
            }
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        System.out.println("max salary in department "+ result);
    }
    /*
            3. The amount of salary costs for the department.

     */

    public static void findAmoundOfSalary(Employee[] employees, Integer id) {
        Integer sum = 0;
        for (Employee employee : employees) {
            if (!employee.getDepartment().getId().equals(id)) {
                continue;
            }
            sum += employee.getSalary();

        }
        System.out.println("Amound of salary of department is " + sum);
    }

    /*
    4. Average salary for the department
     */
    public static void findAverageSalaryOfDepartment(Employee[] employees, Integer id) {
        Integer sum = 0;
        Integer average = 0;
        for (Employee employee : employees) {
            if (!employee.getDepartment().getId().equals(id)) {
                continue;
            }
            sum+= employee.getSalary();
            average = sum / employees.length;
        }
        System.out.println("average salary in department is "+ average);
    }

    /*
            5. Index the salaries of all department employees by the percentage that comes as a parameter.

     */

    public static void indexingOfSalaryInDepartment(Employee[] employees, Integer id, Double index) {
        double total = 0;
        index = index/100;
        for (Employee employee : employees) {
            if (!employee.getDepartment().getId().equals(id)) {
                continue;
            }
            total = employee.getSalary() * index;
            total = employee.getSalary() + total;
        }
        System.out.println("indexing salary on "+ index*100 + "% is "+ Math.round(total) );

    }

}
