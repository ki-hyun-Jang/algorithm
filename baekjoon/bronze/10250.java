import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i<t; i++){
            String[] inputs = br.readLine().split(" ");
            int h = Integer.parseInt(inputs[0]);
            int w = Integer.parseInt(inputs[1]);
            int n = Integer.parseInt(inputs[2]);

            int f = n % h;
            int r = n / h;
            if(f==0) { System.out.println(h*100+r); }
            else{System.out.println(f*100+r+1); }
        }
    }
}