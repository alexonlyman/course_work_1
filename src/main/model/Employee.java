package main.model;

import java.util.Objects;

public class Employee {
    private Integer id = 0;
    private String firstName;
    private String lastName;
    public static Integer counter = 0;

    private Integer salary;

    private Department department;

    public Employee(String firstName, String lastName, Integer salary, Department department) {
        this.salary = salary;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        id += counter;
        counter++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;

        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;

        }
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        if (department != null) {
            this.department = department;

        }
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        if (salary != null) {
            this.salary = salary;

        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department=" + department +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(id, employee.id) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(counter, employee.counter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, counter);
    }


}
