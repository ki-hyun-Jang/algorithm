import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = 1000-Integer.parseInt(br.readLine());
        int[] coins = {500,100,50,10,5,1};
        for(int coin: coins){
            answer += (n / coin);
            n%=coin;
        }
        System.out.println(answer);
    }
}