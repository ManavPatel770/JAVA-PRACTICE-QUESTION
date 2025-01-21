public class maxsubarrysum {
    public static void maxSubarrysum(int numbers[]) {
        int maxsum = Integer.MIN_VALUE; // -infinity
        int currentsum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = start; k <= end; k++) {
                   //subarry sum;
                   currentsum = currentsum + numbers[k];
                     
                }
                System.out.print(currentsum);
                if(maxsum < currentsum){
                    maxsum = currentsum;
                }

                System.out.println();
            }
            System.out.println();

        }
        System.out.println("max sum of subarry is = " + maxsum);
    }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 }; //example = {1,-2,6,-1,3};
        maxSubarrysum(numbers);
    }

}
