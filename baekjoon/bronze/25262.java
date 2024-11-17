import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result1 = 0;
        int result2 = 0;
        for (int i=1; i<=9; i++){
            String input = br.readLine();
            int currentNum = Integer.parseInt(input);
            if (result1< currentNum){
                result1 = currentNum;
                result2 = i;
            }
        }
        System.out.println(result1);
        System.out.println(result2);
    }
}