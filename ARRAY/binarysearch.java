public class binarysearch {
    public static int binarySearch(int numbers[],int key){
         int  start = 0;
         int end = numbers.length-1;

         while(start<=end){
            int mid = (start + end)/2;
            
            //comparision;
            if(key == numbers[mid]){
                return mid;  // mid return karavo to Index print thase
            }                // and numbers[mid] print karavo to key print thase


            if(key>numbers[mid]){   //right side start update
                start = mid + 1;
            }
            else{     //left side end update
                end = mid - 1;
            }
         }

         return -1;
        
    }

    public static void main(String args[]){
        int numbers[]={1,5,3,7,9,10,24,78};
        int key = 10;

        System.out.println(" index of key is : " + binarySearch(numbers, key));

    }
}


