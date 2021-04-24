package by.jrr.learn.lecture7Methods.model;

import java.util.Objects;

public class Staff {

    private String name;

    private Double salary;

    public Staff () {
    }

    public Staff(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Staff(Double salary, String name) {
        if (name == null) {
            throw new NullPointerException();
        }
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(name, staff.name) &&
                Objects.equals(salary, staff.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
