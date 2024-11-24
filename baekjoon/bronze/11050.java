import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nk[0];
        int k = nk[1];

        int[] factorial = new int [11];
        factorial[0]=1; factorial[1]=1;

        for(int i = 2; i<11; i++){ factorial[i] = factorial[i-1]*i; }
        
        System.out.println(factorial[n]/(factorial[k]*factorial[n-k]));
    }
}