import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        String result = "";

        for (int i=0; i<number; i++){
            result += "*";
            System.out.println(result);
        }
        br.close();

    }
}