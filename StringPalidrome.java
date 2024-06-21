public class StringPalidrome {
    public static boolean palidrome(String st){
        String str = st.toLowerCase();
        for(int i = 0; i<str.length()/2;i++){
            int n = str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args []){
        String str = "Racecar";
        boolean check = palidrome(str);
        if(check){
            System.out.println("String is palidrome");
        }
        else{
            System.out.println("String is not palidrome");
        }
    }
}