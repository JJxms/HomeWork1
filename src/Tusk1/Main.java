package Tusk1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Tusk 1
        String Month = null;
        String Day = null;
        String Year = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите своё Имя Фамилию и Отчество: "); //Просим ввести ФИО
        String username = scanner.nextLine();
        System.out.println("Вас зовут: " + username);
        System.out.println("Введите свою дату рождения. ");//Просим ввести Дату рождения
        System.out.print("День: ");//Просим ввести День
        int day = scanner.nextInt(); // Проверяем введенное значение, чтобы пользователь ввел все корректно
        if (day < 0) {
            System.out.println(" Ошибка");
            System.exit(1);
            return;}
            if (day > 31) {
                System.out.println(" Ошибка");
                System.exit(1);
                return;
            } else if (day < 10) {
                Day = ("0" + day);
            } else Day = String.valueOf((day));

        System.out.print("Месяц: ");//Просим ввести Месяц
        int month = scanner.nextInt();
        if (month < 0) {
            System.out.println(" Ошибка");
            System.exit(1);
            return;}
        if (month > 12) {
            System.out.println(" Ошибка");
            System.exit(1);
            return;
        } else if (month < 10) {
            Month = ("0" + month);
        } else Month = String.valueOf((month));

            System.out.print("Год: "); //Просим ввести Год
            int year = scanner.nextInt();
            if (year < 0) { // Проверяем введенное значение, чтобы пользователь ввел все корректно
                System.out.println(" Ошибка");
                System.exit(1);
                return;}
            if (year < 2023) {
                Year = String.valueOf((year));
            }
            String dateOfBirth = (Day + "." + Month + "." + Year + ".");
            System.out.println("Ваша дата рождения: " + dateOfBirth);
        //Tusk 3
        int NumberOfFullyears;
        int NumberOfFullMonth;
        int NumberOfFullDays;
        System.out.println("Введите сегодняшнее число: ");
            int today = scanner.nextInt();
        System.out.println("Введите нынешний месяц: ");
            int Tmonth = scanner.nextInt();
        if (month < Tmonth){
            NumberOfFullyears = (2023 - year);
        } else NumberOfFullyears = (2023 - year - 1 );
            System.out.println("Ваше количество лет: " + NumberOfFullyears);
            if (month < Tmonth){
                NumberOfFullMonth = (NumberOfFullyears * 12 + Tmonth - month);
            } else NumberOfFullMonth = ((NumberOfFullyears + 1) * 12 + Tmonth  - month);
                    System.out.println("Ваше количество полных прожитых месяцев: " + NumberOfFullMonth);
        if (month < Tmonth){
            NumberOfFullDays = (NumberOfFullyears * 365 + (Tmonth - month) * 31 + today - day);
        } else NumberOfFullDays = ((NumberOfFullyears + 1) * 365 - (month - Tmonth) * 31 + today - day );
        System.out.println("Ваше количество полных прожитых дней: " + NumberOfFullDays);
        }

    }
// P.S Очень сильно ивиняюсь. Я валенок и не успел выполнить все дз. В следующий раз обещаю более ответственно отнестись к домашке