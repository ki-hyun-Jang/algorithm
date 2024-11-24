import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split("");
            System.out.println(solution(input));
        }
    }

    static int solution(String[] str){
        int result =0;
        int currentInt = 1;
        for(int j = 0; j < str.length; j++){
            if (str[j].equals("O") ){
                result += currentInt;
                currentInt += 1;
            }else{
                currentInt = 1;
            }
        }
        return result;
    }
}