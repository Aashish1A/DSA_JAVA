import java.util.*;

public class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------String declaration---------
        // String str = "Aashish";
        // System.out.println(str);

        // String s = sc.nextLine();
        // System.out.println(s);

        // ---------Build-in function of string -----------
        String str = "Hello World";

        System.out.println(str.length()); // return length

         System.out.println(str.charAt(3)); // return charAt index no

         System.out.println(str.indexOf("w")); // return character index

        System.out.println(str.toUpperCase()); // convert in upperCase

        System.out.println(str.toLowerCase()); // convert in lowerCase
        
        System.out.println(str.contains("Aa")); // Check the string value in available or not

        System.out.println(str.startsWith("A")); // return true if str starts with the given letter

        System.out.println(str.endsWith("h"));  // return true if str ends with the given letter

        String str1 = "Java";
        System.out.println(str.concat(str1)); // Concat two string

        sc.close();
    }
}