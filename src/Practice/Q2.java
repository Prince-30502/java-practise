package Practice;

import java.util.Scanner;

public class Q2 {


        public   static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter ur size   ");
            int n =sc.nextInt();
            int[]arr= new int[n];
            System.out.println("Enter Array of Elements: ");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();

                // printing negative values;
            }
            for(int i =0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }

