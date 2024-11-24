import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> strList = new ArrayList<>(set);

        strList.sort(( s1,s2) -> {
            int lengthComparison = Integer.compare(s1.length(), s2.length());
            return (lengthComparison != 0) ? lengthComparison : s1.compareTo(s2);
        });

        for (String str : strList) {
            System.out.println(str);
        }
    }
}