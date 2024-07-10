public class N_Queen {
    public static boolean QueenPosition(int board[][],int n,int i){
        if(i==n){
            print(board,n);
            return false;
        }
        for(int j =0;j<n;j++){
            if(isSafe(board,n,i,j)){
                board[i][j]=1;
                boolean canplace= QueenPosition(board,n,i+1);
                if(canplace){
                    return true;
                }
            }
            board[i][j]=0;
        }
        return false;

    }
    public static boolean isSafe(int board[][],int n,int r,int c){
        //straight up
        for(int i=r-1;i>=0;i--){
            if(board[i][c]==1){
                return false;
            }
        }
        //diagonal left up
        int i=r-1;
        int j = c-1;
        while(i>=0 && j>=0){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j--;
        }
        //diagonal right up
        i =r-1;
        j=c+1;
        while(i>=0 && j<n){
            if(board[i][j]==1){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    public static void print(int board[][],int n){
        System.out.println("---------Chess Board---------------");

        for(int i =0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n = 4;
        int board[][] = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j]=0;
            }
        }
        print(board,n);
        QueenPosition(board,n,0);

    }
}