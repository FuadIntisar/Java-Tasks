package Discussion6;

import java.util.Scanner;

public class string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.print("Enter a string: ");
        String s = sc.nextLine();
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();


    
        String s1 = s;
        String rev = "";
        for(int i = s1.length() - 1; i >= 0; i--){
            rev += s1.charAt(i);
        }
        if(s1.equals(rev)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }


        
        int[] freq = new int[256];
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }
        for(int i = 0; i < 256; i++){
            if(freq[i] > 0){
                System.out.println((char)i + ": " + freq[i]);
            }
        }
    }
}
