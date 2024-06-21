import java.lang.Math;
public class AsteroidCollision {
    public static void collision(int n[]){
        int size = n.length;
        for(int i = 1; i<size; i++){
            for(int j = i; j>0; j--){
                if(n[j-1]>0 && n[i]<0){
                    if(Math.abs(n[j-1]) < Math.abs(n[i])){
                        n[j-1]=0;
                    }
                    else if(Math.abs(n[j-1]) == Math.abs(n[i])){
                        n[j-1]=n[i]=0;
                        break;
                    }
                    else{
                        n[i] = 0;
                        break;
                    }
                }
            }
        }
        int count = 0;
        for(int i =0; i<size;i++){
            if(n[i]!=0){
                count++;
            }
        }
        int ans[]= new int[count];
        int index = 0;
        for(int i = 0;i<size;i++){
            if(n[i]!=0){
                ans[index++]=n[i];
            }
        }
        for(int i=0;i<count;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={-90, 70, 60, 35, -65, 180, 70, -70, 60};
        collision(arr);
    }
}