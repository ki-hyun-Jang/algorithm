import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] stop = {"0","0","0"};

        while (true){
            String[] inputs = br.readLine().split(" ");
            if (Arrays.equals(inputs, stop)) { break; }

            int a = Integer.parseInt(inputs[0])*Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1])*Integer.parseInt(inputs[1]);
            int c = Integer.parseInt(inputs[2])*Integer.parseInt(inputs[2]);

            if (a+b-c==0||a+c-b==0||b+c-a==0){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }

        }
    }
}