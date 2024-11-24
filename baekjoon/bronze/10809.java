import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);

        for (int i = 0; i<str.length(); i++){
            char num = str.charAt(i);
            if (arr[num-97]==-1) {arr[num-97] = i;}
        }
        for (int i = 0; i<26; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}