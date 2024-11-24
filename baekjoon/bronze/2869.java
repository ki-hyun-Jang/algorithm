import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int a = arr[0];
        int b = arr[1];
        int v = arr[2];

        int answer = 1;
        int current = v-a;
        if (current > 0) {
            answer += current / (a - b);
            current -= (current / (a - b)*(a-b));
            answer += (current % (a-b) == 0) ? 0 : 1;
        }
        System.out.println(answer);
    }
}