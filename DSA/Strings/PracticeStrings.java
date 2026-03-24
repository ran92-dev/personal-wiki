package DSA.Strings;

public class PracticeStrings {
    
    public static String concatinate(String a, String b){
            return a+b;
    }
    public static Boolean isEqual( String a, String b){
        return a == b;
    }

    public static void main(String [] args){
            String a ="ranj";
            String b = "siso";
            System.out.println(a);
            System.out.println(b);
            System.out.println(System.identityHashCode(a));
            System.out.println(b.hashCode());
            System.out.println(concatinate(a, b).hashCode());
            
            /** Prove that String concatination creates a new object */
          Boolean isEqual= isEqual(a+b,"ranjsiso");

          System.out.println(isEqual);
          String c= "Hello"+"World"; //Compile time 
          String y= "HelloWorld";
          System.out.println(isEqual(c, y));

            //Strings are stored in string pool as unique string object, hence duplicate strigns has same object.
            
          System.out.println(isEqual(a,"ranj"));

    }
}
