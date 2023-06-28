package ru.geekbrains.lesson7.observer;

public class Applicant implements Observer {
    private String name;
    private double desiredSalary;

    public Applicant(String name, double desiredSalary) {
        this.name = name;
        this.desiredSalary = desiredSalary;
    }

    @Override
    public void receiveOffer(String companyName, double salary) {
        if (desiredSalary <= salary) {
            System.out.printf("Соискатель %s >>> Я готов принять предложение! [%s - %f]\n",
                    name, companyName, salary);
            desiredSalary = salary;
        } else {
            System.out.printf("Соискатель %s >>> Я найду работу с бОльшей зарплатой (%f)! [%s - %f]\n",
                    name, desiredSalary, companyName, salary);
        }
    }

    @Override
    public void receiveVacancy(Vacancy vacancy) {
        System.out.printf("Соискатель %s >>> Получил новую вакансию: [%s - %s - %f]\n",
                name, vacancy.getCompanyName(), vacancy.getType(), vacancy.getSalary());
    }
}