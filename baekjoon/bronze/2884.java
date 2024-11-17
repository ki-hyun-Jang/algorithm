import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int h = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);
        if (m-45>=0){ // 분만 바뀌는 경우
            System.out.printf("%d %d",h,m-45);
        }else{
            if (h-1<0){ // 날짜 시간 분 다 바뀌는 경우
                System.out.printf("23 %d",60+m-45);
            }else{ // 시간 분 만 바뀌는 경우
                System.out.printf("%d %d",h-1,60+m-45);
            }
        }
    }
}