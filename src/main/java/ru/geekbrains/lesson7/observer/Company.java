package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {
    private static Random random = new Random();
    private String companyName;
    private double maxSalary;
    private Publisher jobAgency;

    public Company(String companyName, double maxSalary, Publisher jobAgency) {
        this.companyName = companyName;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType type) {
        double salary = random.nextDouble(3000, maxSalary);
        Vacancy vacancy = new Vacancy(companyName, salary, type);
        jobAgency.sendVacancy(vacancy);
    }
}