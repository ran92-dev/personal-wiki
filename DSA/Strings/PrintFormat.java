package DSA.Strings;

import java.util.Locale;

public class PrintFormat {

    public static void printFromated(String s){
        System.out.format("The value of provided input is %s \n",s);
        System.out.printf("value is %s \n", s);
        System.out.format(Locale.FRANCE,   "The value of the float " + "variable is %f, while the " +
    "value of the integer variable " + "is %d, and the string is %s%n", 
    2.45f, 23232, "helloworld");
    }

    public static void main( String [] args){
            String s="abcde";
            printFromated(s);
    }

    

    
    
}
