package cz.uhk.ppro.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Driver {

    @NotEmpty(message = "Personal ID is required")
    private int personalId;

    @NotEmpty(message = "Name is required")
    private String name;

    @Size(min = 18, max = 90)
    private int age;

    @Size(min = 10000, max = 80000)
    private int salary;

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
