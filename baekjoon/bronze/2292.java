import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int currentNum = 1;
        int count = 1;

        while (N>currentNum){
            currentNum += (6*count);
            count+=1;
        }
        System.out.println(count);
    }
}