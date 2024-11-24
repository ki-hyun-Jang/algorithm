import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42];

        for (int i = 0; i<10; i++){
            int num = Integer.parseInt(br.readLine());
            arr[num%42] += 1;
        }
        int result = 0;
        for (int i = 0; i<42; i++){
            if (arr[i]!=0){result += 1;}
        }
        System.out.println(result);
    }
}