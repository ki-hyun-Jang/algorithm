import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String quack  = br.readLine();
        int answer = 0;
        int[] arr = new int[5];
        for(int i = 0; i<quack.length(); i++){
            if(quack.charAt(i)=='q'){
                arr[0] += 1;
            }else if (quack.charAt(i)=='u'){
                arr[1] += 1;
            }else if (quack.charAt(i)=='a'){
                arr[2] += 1;
            }else if (quack.charAt(i)=='c'){
                arr[3] += 1;
            }else {
                arr[4] += 1;
            }
            if(!check(arr)) {
                System.out.println(-1);
                return;
            }
            answer = Math.max(count(arr),answer);
        }
        if(!Arrays.equals(arr, new int[]{0, 0, 0, 0, 0})) answer = -1;
        System.out.println(answer);
    }

    public static boolean check(int[] arr){
        for (int i = 1; i<5; i++){
            if (arr[i-1] <arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static int count(int[] arr){
        int cnt = 0;
        int min = 2500;
        int max = 0;
        for (int i = 0; i<5; i++) {
            if (arr[i]<min) min=arr[i];
            if (arr[i]>max) max=arr[i];
        }
        if (min>1||max>=min) {
            cnt = max;
            for (int i = 0; i<5; i++) {
                arr[i] -= min;
            }
        }
        return cnt;
    }
}