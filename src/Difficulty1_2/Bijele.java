/*
 * https://open.kattis.com/problems/bijele
Mirko has found an old chessboard and a set of pieces in his attic. Unfortunately, the set contains only white pieces, and apparently an incorrect number of them. A set of pieces should contain:

One king, One queen, Two rooks, Two bishops, Two knights, Eight pawns

Mirko would like to know how many pieces of each type he should add or remove to make a valid set.

Input
The input consists of 6 integers on a single line, each between 0 and 10 (inclusive). The numbers are, in order, the numbers of kings, queens, rooks, bishops, knights and pawns in the set Mirko found.

Output
Output should consist of 6 integers on a single line; the number of pieces of each type Mirko should add or remove. If a number is positive, Mirko needs to add that many pieces. If a number is negative, Mirko needs to remove pieces.

Sample Input 1	Sample Output 1
0 1 2 2 2 7     1 0 0 0 0 1
Sample Input 2	Sample Output 2
2 1 2 1 2 1     -1 0 0 1 0 7
 */
package Difficulty1_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bijele {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int[] defaultNum = {1, 1, 2, 2, 2, 8};
        
        for(int i = 0; i < defaultNum.length; i++){
            defaultNum[i] -= Integer.parseInt(st.nextToken());
        }
        
        for(int i = 0; i < defaultNum.length; i++){
            if(i == defaultNum.length - 1){
                System.out.print(defaultNum[i]);
            } else {
                System.out.print(defaultNum[i] + " ");
            }
        }
    }
}