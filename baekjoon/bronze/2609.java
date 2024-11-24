import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ab = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = ab[0];
        int b = ab[1];
        int gcd1 = gcd(a,b);

        System.out.println(gcd1);
        System.out.println(a*b/gcd1);
    }

    static int gcd(int a, int b){
        if (a%b==0){ return b;}
        return gcd(b,a%b);
    }
}