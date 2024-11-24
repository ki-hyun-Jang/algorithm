import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        double answer = 0.0;
        double maxScore = (double)Arrays.stream(score).max().orElseThrow();
        for (int i = 0; i<n; i++){
            answer += score[i]/maxScore*100.0;
        }
        System.out.println(answer/n);
    }
}