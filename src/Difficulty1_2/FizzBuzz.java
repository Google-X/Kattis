package Difficulty1_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FizzBuzz {
    public static void main(String[] args) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        for(int n = 1; n <= N; n++){
            if(n % X == 0 && n % Y == 0) System.out.println("FizzBuzz");
            else if(n % X == 0) System.out.println("Fizz");
            else if(n % Y == 0) System.out.println("Buzz");
            else System.out.println(n);
        }
    }
}
