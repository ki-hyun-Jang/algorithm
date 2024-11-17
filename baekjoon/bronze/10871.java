import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        String[] inputs2 = br.readLine().split(" ");

        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        for(int i=0; i<a; i++){
            int value = Integer.parseInt(inputs2[i]);
            if (value < b) {System.out.printf(inputs2[i]+" ");}
        }

        br.close();
    }
}