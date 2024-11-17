import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static char result(int score){
        if (score>=90) {return 65;}
        else if (score>=80) {return 66;}
        else if (score>=70) {return 67;}
        else if (score>=60) {return 68;}
        else {return 70;}
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        System.out.println(result(num));

        br.close();
    }
}