public class Main {
    public static void main(String[] args) {
        int[] array = {5000, 2000, 3000, 1000, 5000};
        int[] array2 = {111, 222, 333, 444, 555};
        int[] array3 = {1111, 2222, 3333, 4444, 5555};
        //task 1
        int total = 0;
        for (int j : array) {
            total += j;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        System.out.println(" ");

        //task 2
        int maxNum = 0;
        int minNum = 10000000;
        for (int i : array2) {
            if (maxNum < i) {
                maxNum = i;
            }
            if (minNum > i) {
                minNum = i;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minNum + " рублей. Максимальная сумма трат за неделю составила " + maxNum + " рублей");

        //task 3
        float total2 = 0f;
        for (int j : array3) {
            total2 += j;
        }
        System.out.println("Средняя сумма трат за месяц составила " + (total2 / array3.length) + " рублей");


        //task 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
