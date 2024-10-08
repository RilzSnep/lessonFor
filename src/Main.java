public class Main {
    public static void main(String[] args) {

        int totalSavings = 0;
        int monthlySavings = 15_000;
        int month = 0;

        while (totalSavings < 2_459_000) {
            totalSavings += monthlySavings;
            month += 1;
            if (totalSavings >= 2_459_000) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей.");
            }
        }


        //task 2
        int i = 0;
        while (i < 10) {
            i += 1;
            System.out.print(i + " ");

        }
        System.out.println(" ");

        for (int f = 10; f > 0; ) {
            System.out.print(f + " ");
            f = f - 1;
        }
        System.out.println(" ");


        //task 3
        int years = 0;
        int peoples = 12_000_000;
        int birthToDeathRatePearYear = 17 - 8;
        while (years < 10) {
            years += 1;
            System.out.println("Год " + years + ", численность населения составляет " + (peoples + (peoples / 1000 * birthToDeathRatePearYear * years)));
        }

        //task 4,5
        int amountOfSaving = 15000;
        month = 0;
        while (amountOfSaving < 12_000_000) {
            amountOfSaving *= 1.07;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений: " + amountOfSaving);
            }
        }
        System.out.println(" ");

        //task 6
        int month2 = 12 * 9;
        int cash = 15000;
        for (int e = 1; e <= month2; e++) {
            cash *= 1.07;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + " сумма накоплений " + cash);
            }
        }
        //task 7
        int firstFriday = 3; // Номер первой пятницы месяца (от 1 до 7)
        int currentDay = firstFriday; // Текущий день недели

        for (int day = 1; day <= 31; day++) {
            if (currentDay == 5) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
            }
            currentDay = (currentDay + 1) % 7; // Переход к следующему дню недели
        }

        //task 8
        int currentYear = 2023; // Текущий год
        int cometCycle = 79; // Период появления кометы

        int startYear = currentYear - 200; // Год, который был 200 лет назад
        int endYear = currentYear + 100; // Год, который будет через 100 лет

        for (int year = startYear; year <= endYear; year++) {
            if (year % cometCycle == 0) {
                System.out.println(year);
            }
        }
    }
}
