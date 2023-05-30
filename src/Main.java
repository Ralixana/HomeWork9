public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] wastes = new int[30];
        for (int i = 0; i < wastes.length; i++) {
            wastes[i] = random.nextInt(100_000) + 100_000;
        }
        return wastes;
    }

    public static void task1() {
        System.out.println("Task 1");

        int[] wastes = generateRandomArray();
        int sum = 0;
        for (int element : wastes) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Task 2");

        int[] wastes = generateRandomArray();
        int maxWastes = -1;
        int minWastes = 200000;

        for (int waste : wastes) {
            if (waste > maxWastes) {
                maxWastes = waste;
            }
            if (waste < minWastes) {
                minWastes = waste;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей. Максимальная сумма" +
                " трат за день составила " + maxWastes + " рублей");
    }

    public static void task3() {
        System.out.println("Task 3");

        int[] wastes = generateRandomArray();
        double average = 0;
        for (int element : wastes) {
            average += (double) element / wastes.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }
    public static void task4() {
        System.out.println("Task 4");

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}