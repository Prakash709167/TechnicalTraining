public class StringPalidrome {
    public static boolean palidrome(String st){
        st = st.toLowerCase();
        int start =0;
        int end = st.length()-1;
        // while(start <= end){
        //     if(st.charAt())
        // }
        while(start<end){
            // int n = st.length();
            if(!Character.isLetterOrDigit(start)){
                start++;
            }
            else if(!Character.isLetter(end)){
                end--;
            }
            else if(st.charAt(start)!=st.charAt(end-start)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String args []){
        String str = "A man, a plan, a canal: Panama";
        boolean check = palidrome(str);
        if(check){
            System.out.println("String is palidrome");
        }
        else{
            System.out.println("String is not palidrome");
        }
    }
}