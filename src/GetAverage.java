import java.util.Arrays;

public class GetAverage {
    public static void main(String[] args) {
        GetAverage average = new GetAverage();
        int[] arr = {1,2,3,4};

        System.out.println(average.solution(arr));
        System.out.println(average.solution1(arr));
    }

    //통과 코드
    public double solution(int[] arr) {
        double answer = 0;
        for(int a : arr){
            answer += a;
        }
        return answer/arr.length;
    }

    //보고 놀란 코드 (스트림 사용)
    public double solution1(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
