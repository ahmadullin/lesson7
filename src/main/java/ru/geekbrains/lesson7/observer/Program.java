package ru.geekbrains.lesson7.observer;



    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer,
     *  добавить свой собственный тип/типы соискателя.
     *  2**. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  3**. Предусмотреть тип вакансии (enum)
     * @param
     */
    public class Program {
        public static void main(String[] args) {
            JobAgency jobAgency = new JobAgency();
            Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
            Company google = new Company("Google", 100000, jobAgency);
            Company yandex = new Company("Yandex", 120000, jobAgency);

            Master ivanov = new Master("Ivanov");
            Master petrov = new Master("Petrov");
            Student sidorov = new Student("Sidorov");
            Applicant smith = new Applicant("Smith", 80000);

            jobAgency.registerObserver(ivanov);
            jobAgency.registerObserver(petrov);
            jobAgency.registerObserver(sidorov);
            jobAgency.registerObserver(smith);

            for (int i = 0; i < 5; i++) {
                geekBrains.needEmployee(VacancyType.FULL_TIME);
                google.needEmployee(VacancyType.PART_TIME);
                yandex.needEmployee(VacancyType.PROJECT_BASED);
            }
        }
    }
