import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    static int result(int year){
        if (year % 4 != 0){
            return 0;
        } else if (!(year % 100 == 0) || (year % 400 == 0)) {
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(result(num));

        br.close();
    }
}