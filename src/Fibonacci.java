import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    /* 피보나치 수열 공식 Fn = Fn-1 + Fn-2 (n ≥ 2) */
    static int[] fibo;
    public static int DFS(int n){
        if (fibo[n] > 0) return fibo[n];
        else if(n==1) return fibo[n]=1;
        else if(n==2) return fibo[n]=1;
        else return fibo[n]=DFS(n-2)+DFS(n-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fibo = new int[N + 1];
        System.out.println(DFS(N));
    }
}