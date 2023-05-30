public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
            sum = sum + element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Task 2");

        int[] wastes = generateRandomArray();
        int maxWastes = -1;
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] > maxWastes) {
                maxWastes = wastes[i];
            }
        }
        int minWastes = 200000;
        for (int i = 0; i < wastes.length; i++) {
            if (wastes[i] < minWastes) {
                minWastes = wastes[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей. Максимальная сумма" +
                " трат за день составила " + maxWastes + " рублей");
    }
}