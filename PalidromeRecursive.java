public class PalidromeRecursive {
    public static boolean isPalidrome(String st,int i,int j){
        st = st.toLowerCase();
        //base case
        if(i==j){
            return true;
        }
        //space handling
        if(st.charAt(i)==' '){
            return isPalidrome(st,i+1,j);
        }
        if(st.charAt(j)==' '){
            return isPalidrome(st,i,j-1);
        }
        //comparing left to right
        if(st.charAt(i)!= st.charAt(j)){
            return false;
        }
        return isPalidrome(st,i+1,j-1);
        
    }
    
    public static void main(String args[]){
        String str = "R a ce c ar";
        System.out.println(isPalidrome(str,0,str.length()-1));

    }
}