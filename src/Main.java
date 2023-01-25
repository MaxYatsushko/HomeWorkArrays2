public class Main {
    public static void main(String[] args) {

        task1();
        task2_3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arrCosts = generateRandomArray();
        int totalCost = 0;
        for (int elem : arrCosts){
            totalCost += elem;
        }
        System.out.println("Сумма трат за месяц составила " + totalCost + " рублей");
    }

    public static void task2_3() {
        int[] arrCosts = generateRandomArray();
        int minCost = arrCosts[0], maxCost = arrCosts[0];
        double totalCost = 0.0;

        for (int elem : arrCosts){
            if(minCost > elem){
                minCost = elem;
            }
            if(maxCost < elem){
                maxCost = elem;
            }

            totalCost += elem;
        }
        System.out.println("Минимальная сумма трат за день составила " + minCost + " рублей. Максимальная сумма трат за день составила " + maxCost + " рублей");
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", totalCost/arrCosts.length);
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int lengthArray = reverseFullName.length;

        System.out.println();
        for (int i = (lengthArray - 1);  i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }

    }
}