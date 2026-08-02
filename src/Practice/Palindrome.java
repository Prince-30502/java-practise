package Practice;

import java.util.Scanner;

public class Palindrome {

        public static void main(  String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println(" Enter ur number  ");
            int x =sc.nextInt();

            int temp =x;
            int rev =0;

            while(x>0){
                int digit = x%10;
                rev = rev *10+digit;
                x=x/10;
            }
            if(temp == rev){
                System.out.println(" palindrome");
            }else
                System.out.println(" not a palindrome");
        }
    }

