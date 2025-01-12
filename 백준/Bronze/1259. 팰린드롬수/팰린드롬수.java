import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        while (!str.equals("0")){
            sb.append(solution(str)+"\n");
            str = br.readLine();
        }
        System.out.println(sb);
    }
    public static String solution (String value){
        int left = 0;
        int right = value.length()-1;

        while(left<=right){
            if (value.charAt(left)!=value.charAt(right)) return "no";
            left+=1;
            right-=1;
        }
        return "yes";
    }
}