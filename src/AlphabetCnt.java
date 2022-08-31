import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCnt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int[] answer = new int[26]; //알파벳 소문자 26

        //아스키 코드를 사용하여 알파벳자리에 맞게 1을 대입
        for(int i = 0; i < arr.length; i++){
            answer[arr[i]-97] += 1;
        }

        //출력
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
