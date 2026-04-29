public class JavaArrays {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First Element: " + numbers[0]);
        System.out.println("Second Element: " + numbers[1]);

        System.out.println("All Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}