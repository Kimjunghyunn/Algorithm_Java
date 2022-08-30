import java.util.Scanner;

public class ColoredPaper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] p = new int[100][100];

        int t = sc.nextInt();
        int cnt = 0;

        for(int i=0; i<t; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for(int k=x; k<x+10; k++) {
                for(int m=y; m<y+10; m++) {
                    if(p[k][m] == 0) {
                        p[k][m] = 1;
                        cnt++;
                    }
                }
            }
        }

        System.out.println(cnt);

    }
}
