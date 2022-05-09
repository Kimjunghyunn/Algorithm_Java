import java.util.*;

public class StringZip {
    public static int solution(String s) {
        int answer = s.length(); //압축하기 전 문자열 길이 초기화

        for (int i = 1; i <= s.length() / 2; i++) { //최대 압축정도는 전체길이의 반절
            int zip = 1; //현재 압축정도
            String zipStr = s.substring(0, i); //압축할 문자
            StringBuilder result = new StringBuilder(); //압축완료한 문자를 저장할 StringBuilder

            for (int j = i; j <= s.length(); j += i) {
                String next = s.substring(j, j + i > s.length() ? s.length() : i + j); //다음 문자 추출
                if (zipStr.equals(next)) { // 현재문자 다음문자 비교 후 같으면 압축정도 증가
                    zip++;
                } else {  // 다를 경우
                    result.append((zip != 1 ? zip : "") + zipStr); // (압축이 안됬을 경우는 공백, 압축이 됬을경우 zip 붙여줌) + 압축할 문자를 넣어줌
                    zipStr = next;
                    zip = 1;
                }
            }
            result.append(zipStr);
            answer = Math.min(answer, result.length());
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(solution(s));
    }
}

/*출처: https://yline.tistory.com/166?category=511149 [Y_LINE's_Repository]*/
