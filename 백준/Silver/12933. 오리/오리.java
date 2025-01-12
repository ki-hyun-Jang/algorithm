import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sound = br.readLine();

        // "quack"의 순서: q=0, u=1, a=2, c=3, k=4
        int[] counts = new int[5]; // 각 문자 상태를 관리
        int ducks = 0; // 동시에 소리를 내는 오리 수
        int maxDucks = 0; // 최대 오리 수

        for (char ch : sound.toCharArray()) {
            if (ch == 'q') { // 새로운 소리 시작
                counts[0]++;
                ducks++;
                maxDucks = Math.max(maxDucks, ducks);
            } else if (ch == 'u') {
                if (counts[0] > 0) {
                    counts[0]--;
                    counts[1]++;
                } else {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'a') {
                if (counts[1] > 0) {
                    counts[1]--;
                    counts[2]++;
                } else {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'c') {
                if (counts[2] > 0) {
                    counts[2]--;
                    counts[3]++;
                } else {
                    System.out.println(-1);
                    return;
                }
            } else if (ch == 'k') {
                if (counts[3] > 0) {
                    counts[3]--;
                    ducks--; // 소리 끝났으므로 오리 수 감소
                } else {
                    System.out.println(-1);
                    return;
                }
            } else {
                // 잘못된 문자 입력
                System.out.println(-1);
                return;
            }
        }

        // 모든 소리가 "k"로 끝났는지 확인
        if (ducks == 0) {
            System.out.println(maxDucks);
        } else {
            System.out.println(-1);
        }
    }
}