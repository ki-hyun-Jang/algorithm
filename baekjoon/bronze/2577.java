import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int result = a * b * c;
        String[] result2 = String.valueOf(result).split("");
        int[] answer = new int[10];

        for (int i = 0; i < result2.length; i++) {
            answer[Integer.parseInt(result2[i])] += 1;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(answer[i]);
        }
    }
}