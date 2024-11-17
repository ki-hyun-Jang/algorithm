import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] inputs = br.readLine().split(" ");
        int max = -1000000;
        int min = 1000000;

        for (int i = 0; i<n; i++){
            int num = Integer.parseInt(inputs[i]);
            if ( max < num ){ max = num; }
            if ( min > num ){ min = num; }
        }
        System.out.printf("%d %d",min,max);
    }
}