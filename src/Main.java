public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = firstName + " Ivanovich";
        String lastName = middleName + " Ivanov";
        String fullName = lastName;
        System.out.println("ФИО сотрудника " + " — " + fullName);


    }

    public static void task2() {
        String firstName = "Ivan";
        firstName = firstName.replace("Ivan", "IVAN");
        String middleName = firstName + " Ivanovich";
        middleName = middleName.replace("Ivanovich", "IVANOVICH");
        String lastName = middleName + " Ivanov";
        lastName = lastName.replace("Ivanov", "IVANOV");
        String fullName = lastName;
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + lastName);
    }

    public static void task3() {
        String firstName = "Семён";
        firstName = firstName.replace("Семён", "Семен");
        String middleName = firstName + " Семёнович";
        middleName = middleName.replace("Семёнович", "Семенович");
        String lastName = middleName + " Иванов";
        lastName = lastName.replace("Иванов", "Иванов");
        String fullName = lastName;
        System.out.println("Данные ФИО сотрудника  — " + lastName);
    }
}