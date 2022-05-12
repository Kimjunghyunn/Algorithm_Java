import java.io.*;

/*부분집합 구하기(공집합 제외)*/
public class SubsetDFS {
    static int n;
    static int[] ch;

    /* 깊이우선탐색(이진트리순회) */
    public static void DFS(int L){
        String tmp = "";
        if (L == n + 1) {
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp += (i + " ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L + 1); //사용한다

            ch[L] = 0;
            DFS(L + 1); //사용하지 않는다
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ch = new int[n + 1];
        DFS(1);
    }
}
