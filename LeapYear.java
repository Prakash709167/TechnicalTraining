public class LeapYear {
    public static boolean leap(int year){
        if(year % 2000 == 0){
            return false;
        }
        else if(year % 400 == 0){
            return true;
        }
        else if(year % 100 == 0){
            return false;
        }
        else if(year % 4 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String args []){
        int year = 2024;
        boolean res = leap(year);
        if(res){
            System.out.println(year +" is a leap year");
        }
        else{
            System.out.println(year +" is not a leap year");
        }

    }
}