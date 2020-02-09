/*
 * https://open.kattis.com/problems/pieceofcake2
It is Greg’s birthday! To celebrate, his friend Sam invites Greg and two other friends for a small party. Of course, every birthday party must have cake.

Sam ordered a square cake. She makes a single horizontal cut and a single vertical cut. In her excitement to eat cake, Sam forgot to make these cuts through the middle of the cake.

Of course, the biggest piece of cake should go to Greg since it is his birthday. Help Sam determine the volume of the biggest piece of cake that resulted from these two cuts.

\includegraphics{cake.png}
Input
The input consists of a single line containing three integers n (2≤n≤10000), the length of the sides of the square cake in centimeters, h (0<h<n), the distance of the horizontal cut from the top edge of the cake in centimeters, and v (0<v<n), the distance of the vertical cut from the left edge of the cake in centimeters. This is illustrated in the figure above.

Each cake is 4 centimeters thick.

Output
Display the volume (in cubic centimeters) of the largest of the four pieces of cake after the horizontal and vertical cuts are made.

Sample Input 1	Sample Output 1
10 4 7          168
Sample Input 2	Sample Output 2
5 2 2           36
Sample Input 3	Sample Output 3
4 2 1           24
 */
package Difficulty1_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PieceOfCake {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int mid = 0;
        
        if(n % 2 == 0) mid = n / 2;
        else mid = (n / 2) + 1;
        
        if(h < mid) h = n - h;
        if(v < mid) v = n - v;
        
        System.out.println(4 * h * v);
        
    }
}
