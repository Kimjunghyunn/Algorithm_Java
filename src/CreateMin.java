import java.util.Arrays;

public class CreateMin {
    public static int solution(int []A, int []B) {
        int answer = 0;
        //오름차순 정렬
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i=0; i<A.length; i++){
            answer = answer+(A[i] * B[A.length-i-1]); //배열 B를 거꾸로 하여 내림차순으로 곱함
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 2};
        int[] b = {5, 4, 4};

        System.out.println(solution(a,b));
    }
}
