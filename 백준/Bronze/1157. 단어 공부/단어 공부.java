import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.toUpperCase();
        String answer = "";
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)+1);
        }

        for (int v : map.values()) if (max<v) max = v;
        for (Character v : map.keySet()){
            if (map.get(v).equals(max)) answer += v;
        }
        System.out.println(answer.length()>1 ? "?" : answer);
    }
}