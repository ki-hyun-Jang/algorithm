import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String n = br.readLine();
            if (n.equals("0")){ break;}
            int start = 0;
            int end = n.length()-1;
            String answer = "yes";
            while (start <= end){
                if (n.charAt(start) == n.charAt(end)){
                    start +=1;
                    end -=1;
                }else{
                    answer = "no";
                    break;
                }
            }
            System.out.println(answer);
        }
    }
}