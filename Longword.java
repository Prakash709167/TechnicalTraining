public class Longword {
     public static void main(String args[]){
        String str = "word";
        int size = str.length();
        if(size>=10){
            char first = str.charAt(0);
            char last = str.charAt(str.length()-1);
            int count = size-2;
            System.out.print(first);
            System.out.print(count);
            System.out.print(last);
            System.out.println();
        }
        else{
            System.out.println(str);
        }
     }
}