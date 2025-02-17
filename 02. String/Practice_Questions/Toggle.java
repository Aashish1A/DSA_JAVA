package Practice_Questions;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0; i<str.length(); i++){

            boolean isCapital = true; // true -> capital

            char ch = str.charAt(i); // A

            if(ch==' ') continue;

            int ascii = (int)ch; // 65

            if(ascii>=97) isCapital = false; // small

            if(isCapital==true){
                ascii += 32;
                char dh = (char)ascii; // a
                str.setCharAt(i, dh);
            }

            else{ // small
                ascii -= 32;
                char dh = (char)ascii;
                str.setCharAt(i, dh);
            }

        }
        
        System.out.println(str);
        
        sc.close();
    }
}
