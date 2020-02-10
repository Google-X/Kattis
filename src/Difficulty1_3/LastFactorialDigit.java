/*
 * 
The factorial of N, written as N!, is defined as the product of all the integers from 1 to N. For example, 3!=1×2×3=6.

This number can be very large, so instead of computing the entire product, just compute the last digit of N! (when N! is written in base 10).

Input
The first line of input contains a positive integer 1≤T≤10, the number of test cases. Each of the next T lines contains a single positive integer N. N is at most 10.

Output
For each value of N, print the last digit of N!.

Sample Input 1	Sample Output 1
3               1
1               2
2               6
3

Sample Input 2	Sample Output 2
2               0
5               2
2

 */
package Difficulty1_3;

import java.util.Scanner;

public class LastFactorialDigit {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int N = s.nextInt();
        int[] last = new int[N];
        
        for(int i = 0; i < N; i++){
            int num = s.nextInt();
            int temp = 1;
            
            while(num != 0){
                temp *= num;
                num -= 1;
            }
            
            if(temp > 9) last[i] = temp % 10;
            else last[i] = temp;
        }
        
        for(int nums : last){
            System.out.println(nums);
        }
    }
}
