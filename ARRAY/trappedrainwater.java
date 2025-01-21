public class trappedrainwater {
    public static int trappedWater(int height[]) {

        // calculate left Max boundary using auxillary or helper array:

        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);

        }
        // make by loop a helper arry rleftMax[]={4,4,4,6,6,6,6};

        //calculate right Max boundary using auxillary or helper array:

        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];

        for(int i=height.length-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);

        }
        // make by loop a helper arry rightMax[]={6,6,6,6,5,5,5};

        int trappedwater = 0;

        //loop

        for(int i=0;i<height.length;i++){
            
            //waterLevel = min(leftMax bound , rightMax bound);
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trappedwater = waterLevel - height[i];

            trappedwater += waterLevel - height[i];

        }
        return trappedwater;

    }

    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};

        System.out.println("Trapped water = " + trappedWater(height));

    }
}
