import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        int value = 1;
        int index = 0;
        StringBuilder sb = new StringBuilder();

        for(int i= 0; i<n; i++) {
            answer[i]=Integer.parseInt(br.readLine());
        }

        while(result.size()!=n){
            if(value<=answer[index]){
                stack.addLast(value);
                value+=1;
                sb.append("+"+"\n");
            } else if (!stack.isEmpty()&&stack.peekLast()==answer[index]) {
                result.add(stack.pollLast());
                index+=1;
                sb.append("-"+"\n");
            }else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}