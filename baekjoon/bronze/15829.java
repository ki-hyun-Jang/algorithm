import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long answer = 0;
        long power = 1; 
        long mod = 1234567891; 

        for (int i = 0; i < N; i++) {
            answer = (answer + (str.charAt(i) - 96) * power) % mod;
            power = (power * 31) % mod; 
        }

        System.out.println(answer);
    }
}