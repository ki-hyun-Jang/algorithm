import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int num = 666;
        int cnt = 0;

        while (cnt<n){
            if (String.valueOf(num).contains("666")) {cnt+=1;}
            num+=1;
        }

        System.out.println(num-1);
    }
}