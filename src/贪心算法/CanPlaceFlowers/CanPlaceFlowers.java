package 贪心算法.CanPlaceFlowers;

public class CanPlaceFlowers {
    private int[] flowersbed = {1, 0, 0, 0, 1};

    private boolean Solution(int[] flowersbed, int n){
        for (int i = 0; i < flowersbed.length; i++){
            if (flowersbed[i]==0 && (i==0 || flowersbed[i-1]==0) && (flowersbed[i+1]==0 || i==flowersbed.length-1)){
                n--;
                flowersbed[i]=1;
            }
        }

        return n==0;
    }

    public static void main(String[] args){
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        boolean result = canPlaceFlowers.Solution(canPlaceFlowers.flowersbed, 1);
        System.out.println(result);
    }
}
