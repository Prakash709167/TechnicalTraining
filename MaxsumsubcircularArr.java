public class MaxsumsubcircularArr {
    public static void Subarr(int n[]){
        int currmaxsubArr = 0;
        int currminSubarr = 0;
        int maxsum = Integer.MIN_VALUE;
        int minsum =Integer.MAX_VALUE;
        int totalsum =0;
        for(int i = 0; i<n.length;i++){
            currmaxsubArr = Math.max(currmaxsubArr,0)+n[i];
            maxsum = Math.max(maxsum,currmaxsubArr);
            currminSubarr = Math.min(currminSubarr,0)+n[i];
            minsum = Math.min(minsum,currminSubarr);
            totalsum = totalsum+n[i];
        }         
        if(minsum == totalsum){
            System.out.println(maxsum);
        }
        else{
            int ans = Math.max(maxsum,totalsum-minsum);
            System.out.println(ans);
        }
    }
    public static void main(String args[]){
        int nums[] = {-3,-2,-3};
        Subarr(nums);
    }
}