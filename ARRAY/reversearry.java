public class reversearry {
    public static void reverseArry(int numbers[]) {
        int first = 0, last = numbers.length - 1;

        while (first < last) {
            // swap numbers;
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };

        reverseArry(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
