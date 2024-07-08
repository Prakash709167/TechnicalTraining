public class AllPrmutation {
    public static String Swap(String st,int i,int n){
        char []ch = st.toCharArray();
        char temp = ch[i];
        ch[i]= ch[n];
        ch[n] = temp;
        return String.valueOf(ch);
    }
    public static void Permutation(String str,int n, int indx){
        //base case
        if(indx == n-1){
            System.out.println(str);
            return;
        }
        for(int i = indx ; i<n;i++){
        //recursive case
        //swap
        str = Swap(str,indx,i);
        // recursive call
        Permutation(str,n,indx+1);
        //swap
        str = Swap(str,indx,i);
        
        }

    }
    
    public static void main(String args[]){
        String s = "abcd";
        int n = s.length();
        Permutation(s,n,0);
    }
}