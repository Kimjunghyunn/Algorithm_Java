import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* [백준] 1182:부분수열의 합 */

public class PartialSeqSum {
    static int N, S, cnt=0;
    static int[] arr;

    /* 깊이우선탐색(이진트리순회) */
    public static void DFS(int L, int su){
        if (L == N) {
            if (su == S) {
                cnt++;
            }
            return;
        } else {
            DFS(L+1, su+arr[L]); //다음 깊이의 값을 사용한다
            DFS(L+1, su); //사용하지 않는다
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        DFS(0,0);

        if (S == 0) {
            cnt--;
            System.out.println(cnt);
        }else System.out.println(cnt);
    }
}
