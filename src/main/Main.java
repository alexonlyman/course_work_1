package main;

import main.model.Department;
import main.model.Employee;
import main.model.Methods;

public class Main {
    public static void main(String[] args) {
        Department[] departments = new Department[5];
        departments[0] = new Department("construction department");
        departments[1] = new Department("church department");
        departments[2] = new Department("bank department");
        departments[3] = new Department("security department");
        departments[4] = new Department("family department");
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Alex", "Mexi", 10000, departments[0]);
        employees[1] = new Employee("Messi", "Mexiv", 110000, departments[2]);
        employees[2] = new Employee("Crush", "Jias", 10123000, departments[3]);
        employees[3] = new Employee("Holly", "Meags", 1003400, departments[1]);
        employees[4] = new Employee("Max", "Asdkd", 1043000, departments[2]);
        employees[5] = new Employee("Taly", "Cola", 10345000, departments[2]);
        employees[6] = new Employee("Jody", "Fengr", 10345000, departments[1]);
        employees[7] = new Employee("Tom", "Pandop", 10123000, departments[4]);
        employees[8] = new Employee("Bob", "Plaie", 10345000, departments[4]);
        employees[9] = new Employee("Panst", "Joly", 1001200, departments[1]);

        Methods.getAllEmployee(employees);
        Methods.calculateSalarybyMonth(employees);
        Methods.calculateMinSalary(employees);
        Methods.calculateMaxSalary(employees);
        Methods.calculateAverage(employees);
        Methods.getAllNames(employees);
        Methods.indexSallary(employees,20);
        Methods.findMaxSalaryInDepartment(employees,2);
        Methods.findAmoundOfSalary(employees,1);
        Methods.findAverageSalaryOfDepartment(employees, 0);
        Methods.indexingOfSalaryInDepartment(employees,2, 3.0);
    }

}
