import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int [][] answer = new int [15][15];
        for(int i = 0; i<15; i++) {
            answer[0][i] = i;
            answer[i][1] = 1;
        }
        for(int i = 1; i<15; i++) {
            for(int j = 2; j<15; j++){
                answer[i][j] = answer[i-1][j]+answer[i][j-1];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i<t; i++){
            int n = Integer.parseInt(br.readLine());
            int k = Integer.parseInt(br.readLine());
            System.out.println(answer[n][k]);
        }
    }
}
