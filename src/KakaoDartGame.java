import java.util.Arrays;
import java.util.stream.IntStream;

public class KakaoDartGame {
    public static void main(String[] args) {
        //테스트 1~7
        System.out.println(solution("1S2D*3T")); //37
        System.out.println(solution("1D2S#10S")); //9
        System.out.println(solution("1D2S0T")); //3
        System.out.println(solution("1S*2T*3S")); //23
        System.out.println(solution("1D#2S*3S")); //5
        System.out.println(solution("1T2D3D#")); //-4
        System.out.println(solution("1D2S3T*")); //59

    }

    static int solution(String dartResult) {
        //다트 게임은 총 3번의 기회로 구성, 따라서 점수를 담을 arr 의 길이는 3
        int[] arr = new int[3];
        int idx = 0;
        int answer = 0;

        for(int i=0; i < dartResult.length(); i++){
            //점수 확인
            if ('0' <= dartResult.charAt(i) && dartResult.charAt(i) <= '9'){
                //점수가 10일 경우
                if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0'){
                    arr[idx++] = 10;
                    i++; // i+1까지가 10인 것을 확인하였으므로 다음 순서로 넘김
                    continue;
                }
                arr[idx++] = dartResult.charAt(i) - '0'; //char -> int 형변환
                continue;
            }

            //영역 및 옵션 확인
            switch (dartResult.charAt(i)) {
                //위에서 idx++을 해주었기 때문에 점수를 담은 arr 을 확인하기 위해 idx-1
                case 'S':
                    arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 1));
                    break;
                case 'D':
                    arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 2));
                    break;
                case 'T':
                    arr[idx - 1] = (int) (Math.pow((arr[idx - 1]), 3));
                    break;
                case '*':
                    arr[idx - 1] *= 2;
                    if (idx >= 2)
                        arr[idx - 2] *= 2;
                    break;
                case '#':
                    arr[idx - 1] *= -1;
                    break;
            }
        }

        answer = IntStream.of(arr).sum();
        return answer;
    }
}
