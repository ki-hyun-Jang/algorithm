import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int result = 0;
        for(int i = 0; i<N; i++) {
            if (solution(Integer.parseInt(arr[i]))){ result += 1;}
        }
        System.out.println(result);
    }
    static boolean solution(int num){
        if (num==1){return false;}
        if (num==2){return true;}
        for(int i = 2; i<num; i++){
            if (num%i==0){return false;}
        }
        return true;
    }
}