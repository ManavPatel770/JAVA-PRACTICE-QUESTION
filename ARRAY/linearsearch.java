

public class linearsearch{

    public static int searchElement(int numbers[],int key){

        for(int i=0 ;i<numbers.length; i++){
            if(numbers[i]== key){
                return i;
            }
            else {
                return -1;
            }
        }
    }

    public static void main(String args[]){
        int numbers []= {2,3,6,8,10,12,14,16};
        int key = 10;
        
        int index = searchElement(numbers, key);
        if(index == -1){
            System.out.println("not found:");

        }
        else {
            System.out.println("key is at index : " + index);

        }
    }
}