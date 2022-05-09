public class JadenCase {

    public static String solution(String s) {
        String answer = "";

        String[] str = s.toLowerCase().split(""); //소문자로 변환 후 공백을 기준으로 문자열에 저장
        boolean flag = true;

        for(String ss : str){
            answer += flag ? ss.toUpperCase() : ss;
            flag = ss.equals(" ") ? true : false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "3people unFollowed me";
        String s1 = "for the last week";

        System.out.println(solution(s));
        System.out.println(solution(s1));

    }
}
