import java.util.*;
public class PeytaAndString {
    public static int comparision(String s1, String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        int len = s1.length();
        int ans =0;
        for(int i = 0; i<len;i++){
            if (s1.charAt(i) > s2.charAt(i)) {
                ans = 1;
                return ans;
            } else if (s1.charAt(i) < s2.charAt(i)) {
                ans = -1;
                return ans;
            }
        }
        return ans;
    }
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s2 = in.nextLine();
        System.out.println(comparision(s1,s2));

    }
}