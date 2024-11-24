import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i =0; i<N; i++){
            if (N==solution(i)){
                answer=i;
                break;
            }
        }
        System.out.println(answer);
    }
    static int solution(int num){
        int result = num;
        while (num%10!=0){
            result += (num%10);
            num /= 10 ;
        }
        return result;
    }
}