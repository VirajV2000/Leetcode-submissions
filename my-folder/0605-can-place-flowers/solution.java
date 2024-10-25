class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int count0=0,count1=0;
        // for(int i:flowerbed){
        //     if(i==0) count0++;
        //     else count1++;
        // }
        // // System.out.println(count1+" "+count0);
        // System.out.println(Math.ceil(flowerbed.length/2));
        // if(n+count1 <=flowerbed.length/2+(flowerbed.length%2)){
        //     return true;
        // }
        //  return false; 
        if(flowerbed.length ==1 && flowerbed[0]==0) return true;
        else
        for(int i=0;i<flowerbed.length;i++){
            if(i==0 && flowerbed[i]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                n--;
            }
            if(i==flowerbed.length-1 && flowerbed[i]==0 &&  flowerbed[i-1]!=1) {
                flowerbed[i]=1;
                n--;
            }else 
            if(i>0 && flowerbed[i]==0 &&  flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                flowerbed[i]=1;
                n--;
            }
            
            if(n==0 || n<0){return true;}
        }
        
            return false;
    }
}
