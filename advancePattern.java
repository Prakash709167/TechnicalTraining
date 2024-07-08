public class advancePattern {
    public static void pt(int n){
        int row = 2*n-1,col=2*n-1;
        for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) {
				// if((i==1 || i==col) || (j==1 || j==col)){
				// 	System.out.print(n);
                // }
                // else if((i==2 || i==col-1) || (j==2 || j==col-1)){
				// 	System.out.print(n-1);
                // }
                // else if((i==3 || i==col-2) || (j==3 || j==col-2)){
				// 	System.out.print(n-2);
                // }

                // else{
				// 	System.out.print(n-3);
                // }

                int dt = i-1, db = row-i, dl = j-1, dr = col-j;
                System.out.print(n-Math.min(Math.min(dt,db),Math.min(dl,dr)));
            }
			System.out.println();
			
		}

    }


    public static void main(String args[]){
        int n =6;
        pt(n);
    }
}