public class RatInMaze {
    public static boolean path(int mat[][],int n,int m,int i,int j,int ways[][]){
        //--------------base case----------------------------------
        if(i==n-1 && j==m-1){
            ways[i][j]=1;
            System.out.println("Yes, Rat can Reach");
            System.out.println("The Possible Path will be :");
            for(int k=0;k<n;k++){
                for(int l = 0;l<m;l++){
                    System.out.print(ways[k][l]+ " ");
                }
                System.out.println();
            }
            return false;
        }
        //--------------recursive case-----------------------------
        ways[i][j]=1;
        //For right path
        if(j+1<m && mat[i][j+1]==0){
            boolean canReach = path(mat,n,m,i,j+1,ways);
            if(canReach){
                return true;
            }
        }
        // For DownWard path
        if(i+1<n && mat[i+1][j]==0){
            boolean canReach = path(mat,n,m,i+1,j,ways);
            if(canReach){
                return true;
            }
        }
        ways[i][j]=0;
        return false;
    }
    
    public static void main(String args[]){
        int n=4,m=5;
        int mat[][] = {{0,0,0,0,1},
                       {0,1,1,0,0},
                       {0,0,1,1,1},
                       {0,0,0,0,0}};
        int ways[][] = new int[n][m];
        path(mat,n,m,0,0,ways);        
        // if(path(mat,n,m,0,0,ways)){
        //     System.out.println("Yes, Rat can Reach");
        // } 
        // else{
        //     System.out.println("No, Rat cannot be Reach");
        // }
        // System.out.println("The Possible Path will be :");
        // for(int i=0;i<n;i++){
        //     for(int j = 0;j<m;j++){
        //         System.out.print(ways[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
          
    }
}