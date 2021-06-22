package se.lexicon.simon;

import java.time.LocalDate;

public abstract class Employee {
    private int idSequencer = 0;

    protected static int baseSalary = 25_000;

    private int id;
    private int salary;
    private String name;
    private LocalDate dateHired;

    public Employee(String name, LocalDate dateHired) {
        this.id = ++idSequencer;
        this.name = name;
        this.salary = baseSalary;
        this.dateHired = dateHired;
    }

    public abstract void calculateSalary();

    public int getSalary() {
        return salary;
    }

    protected void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

}
