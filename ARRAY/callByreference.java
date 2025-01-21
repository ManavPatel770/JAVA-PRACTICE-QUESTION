public class callByreference {
    public static void callbyvalue(int mark[]){

        for(int i=0;i<mark.length;i++){
            mark[i] = mark[i] + 1;
        }
    }
    public static void main(String args[]){
        int mark[] = {97,98,99};
        callbyvalue(mark);

        //print our marks;
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i] + " ");

        }
        System.out.println();
        

    
    }
}
