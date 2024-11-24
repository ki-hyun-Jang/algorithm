import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        String[] TP = br.readLine().split(" ");
        int T = Integer.parseInt(TP[0]);
        int P = Integer.parseInt(TP[1]);

        int Tresult = 0;
        for(int i =0; i<arr.length; i++) {
            int e = Integer.parseInt(arr[i]);
            if(e%T==0){Tresult += e/T;}
            else{Tresult += e / T + 1;}
        }
        System.out.println(Tresult);
        System.out.print(N/P);
        System.out.printf(" ");
        System.out.print(N%P);
    }
}