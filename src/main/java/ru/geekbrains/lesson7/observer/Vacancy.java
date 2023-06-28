package ru.geekbrains.lesson7.observer;

public class Vacancy {
    private String companyName;
    private double salary;
    private VacancyType type;

    public Vacancy(String companyName, double salary, VacancyType type) {
        this.companyName = companyName;
        this.salary = salary;
        this.type = type;
    }

    public String getCompanyName() {
        return companyName;
    }

    public double getSalary() {
        return salary;
    }

    public VacancyType getType() {
        return type;
    }
}