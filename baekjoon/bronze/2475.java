import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int result = 0;

        for (int i=0; i<5; i++){
            int num = Integer.parseInt(inputs[i]);
            result += num*num;
        }
        System.out.println(result%10);
        br.close();

    }
}