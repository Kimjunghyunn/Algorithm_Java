import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a,b;

        int n = sc.nextInt();
        List<String> A = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            a = sc.next();
            A.add(a);
        }

        int m = sc.nextInt();
        List<String> B = new ArrayList<>(m);
        for(int i=0; i<m; i++) {
            b = sc.next();
            B.add(b);
        }

        Collections.sort(A);

        for(int i=0; i<m; i++) {
            int idx = Collections.binarySearch(A, B.get(i));
            if (idx < 0){
                System.out.println(0);
            }else System.out.println(1);
        }
    }
}
