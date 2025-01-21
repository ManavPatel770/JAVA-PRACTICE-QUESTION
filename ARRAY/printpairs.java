public class printpairs {
    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        int tp = 0;
        // pairs: nessted loops;
        /*
         * (2,4),(2,6),(2,8),(2,10) = 4
         * (4,6),(4,8),(4,10) = 3
         * (6,8),(6,10) = 2
         * (8,10) = 1
         * 
         * formula = sum of n-1 numbers = (n(n-1))/2; for numbers of total pairs
         */

        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ") ");
                tp++;

            }
            System.out.println();
        }

        System.out.println("total pairs = " + tp);

    }

}
