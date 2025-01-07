import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int answer = 0;

        for(int i = 0; i<n; i++) {
            int left = 0;
            int right = n-1;
            while(left<right){
                if (i == left || i== right){
                    if (i == left) left +=1;
                    if (i == right) right -=1;
                    continue;
                }
                int value = arr[left]+arr[right];
                if (value == arr[i]){
                    answer+=1;
                    break;
                }
                else if (value > arr[i]) right-=1;
                else if (value < arr[i]) left+=1;
            }
        }
        System.out.println(answer);
    }
}
