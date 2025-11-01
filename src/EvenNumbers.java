public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Четные числа из массива");

        // Цикл для прохода по всем элеиентам массива
        for (int i = 0; i < numbers.length; i++) {
            // Проверяем, является ли число четным (остаток деления)
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}