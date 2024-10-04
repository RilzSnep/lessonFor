public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++)
            System.out.println(i);
        System.out.println(" ");


        for (int i = 10; i >= 0; i -= 1)
            System.out.println(i);
        System.out.println(" ");


        for (int i = 2; i < 17; i += 2)
            System.out.println(i);
        System.out.println(" ");

        for (int i = 10; i >= -10; i -= 1)
            System.out.println(i);
        System.out.println(" ");


        for (int i = 1904; i <= 2096; i += 4)
            System.out.println(i + " год является високосным");
        System.out.println(" ");


        for (int i = 7; i <= 100; i += 7)
            System.out.println(i);
        System.out.println(" ");


        for (int i = 1; i <= 600; i *= 2)
            System.out.println(i);
        System.out.println(" ");


        int mounthCount = 12;
        for (int i = 1; i <= mounthCount; i++)
            System.out.println("Месяц " + i + " Сумма накоплений равна " + (i * 29000 * 1.01) + " рублей");
        System.out.println(" ");


        for (int i = 1; i <= 10; i++)
            System.out.println("2*" + i + "=" + 2 * i);
        System.out.println(" ");
    }
}