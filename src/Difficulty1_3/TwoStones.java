/*
 * https://open.kattis.com/problems/twostones
Alice and Bob are playing a new game of stones. There are N stones placed on the ground, forming a sequence. The stones are labeled from 1 to N.

Alice and Bob in turns take exactly two consecutive stones on the ground until there are no consecutive stones on the ground. That is, each player can take stone i and stone i+1, where 1≤i≤N−1. If the number of stone left is odd, Alice wins. Otherwise, Bob wins.

Assume both Alice and Bob play optimally and Alice plays first, do you know who the winner is?

Input
The input contains an integer N (1≤N≤10000000), the number of stones.

Output
Output the winner, “Alice” or “Bob” (without the quotes), on a line.

Sample Input 1	Sample Output 1
1               Alice
Sample Input 2	Sample Output 2
2               Bob
Sample Input 3	Sample Output 3
5               Alice

 */
package Difficulty1_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoStones {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        
        System.out.println(N % 2 == 0 ? "Bob" : "Alice");
        
    }
}
