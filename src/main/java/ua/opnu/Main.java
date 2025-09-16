package ua.opnu;

public class Main {
    public static void main(String[] args) {
        // Створюємо студента
        Student student = new Student("Олександр", 3);

        // Додаємо дисципліни
        student.addCourse("Математика");
        student.addCourse("Програмування");
        student.addCourse("Фізика");

        // Виводимо кількість дисциплін
        System.out.println(student.getName() + ": кількість вивчаємих дисциплін - " + student.getCourseCount());

        // Виводимо рік навчання
        System.out.println(student.getName() + ": рік навчання - " + student.getYear());

        // Виводимо скільки заплатив за навчання
        System.out.println(student.getName() + ": заплатив за навчання - " + student.getTuition());
    }
}
