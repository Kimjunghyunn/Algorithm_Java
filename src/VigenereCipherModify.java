import java.util.Scanner;

public class VigenereCipherModify {
    static StringBuilder solution(String sc, String key) {
        int cnt = 0;                                 //암호화 키 초기화용
        StringBuilder result = new StringBuilder();  //압축완료한 문자를 저장할 StringBuilder

        for (int i = 0; i < sc.length(); i++) {
            if(cnt == key.length()) cnt = 0;         //key 반복 카운트 초기화

//            System.out.println(key.charAt(cnt));

            int keyNum = key.charAt(cnt) -'a'+1;     // 암호화 키 알파벳 순서 찾기(본인포함이므로 +1을 해줌)

           // System.out.println(keyNum);

            if (sc.charAt(i) == ' ') {
                result.append(' ');
                cnt++;
                continue;
            }
            // System.out.println(sc.charAt(i)-keyNum);
            if (sc.charAt(i)-keyNum < 'a') {      //(암호화 될 위치가 'a' 보다 작다면) 'z'로 돌아가서 위치 설정 후 result에 저장
                //System.out.println(sc.charAt(i) + (26 - keyNum));
                result.append((char)(sc.charAt(i) + (26 - keyNum)));
            } else {
                //System.out.println(sc.charAt(i) - keyNum);
                result.append((char)(sc.charAt(i) - keyNum));//암호화 될 위치 result에 저장
            }
            cnt++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String secretCode = scan.nextLine();
        String secretCodeKey = scan.nextLine();

        System.out.println(solution(secretCode, secretCodeKey));
    }
}
