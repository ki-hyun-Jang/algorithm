import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for(int t = 0; t<T; t++){
            String[] inputs = br.readLine().split(" ");
            int Tnum = Integer.parseInt(inputs[0]);
            String Tstr = inputs[1];
            System.out.println(solution(Tnum,Tstr));
        }

    }

    static String solution(int num, String str){
        String result = "";
        int n = str.length();
        for(int i = 0; i<n; i++) {
            char s = str.charAt(i);
            for (int j = 0; j < num; j++) {
                result += String.valueOf(s);
            }
        }
        return result;
    }
}