/*
 * The number S is called the mean of two numbers R1 and R2 if S is equal to (R1+R2)/2. Mirko’s birthday present for Slavko was two integers R1 and R2. Slavko promptly calculated their mean which also happened to be an integer but then lost R2! Help Slavko restore R2.

Input
The first and only line of input contains two integers R1 and S, both between −1000 and 1000.

Output
Output R2 on a single line.

Sample Input 1      Sample Output 1
11 15               19
Sample Input 2      Sample Output 2
4 3                 2
 */
package Difficulty1_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class R2 {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int R1 = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int R2 = 2 * S - R1;
        
        System.out.println(R2);
    }
}
