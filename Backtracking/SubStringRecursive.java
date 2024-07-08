public class SubStringRecursive {
    public static void Substring(String str,String ans,int n,int ind){
        if(ind==n){
            System.out.println(ans);
            return;
        }
        //Index doesnot want to contribute
        Substring(str,ans,n,ind+1);
        //Index want to contribute
        Substring(str,ans+str.charAt(ind),n,ind+1);
    }
    public static void main(String args[]){
        String s = "abc";
        Substring(s,"",s.length(),0);

    }
}