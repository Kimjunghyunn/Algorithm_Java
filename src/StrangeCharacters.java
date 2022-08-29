public class StrangeCharacters {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    static String solution(String s) {
        int cnt = 0; //초기화
        String answer = "";
        String[] str = s.split("");

        for (int i = 0; i < str.length; i++){
            //공백을 확인하여 cnt 초기화
            if(str[i].equals(" ")) {
                cnt = 0;
            } else if(cnt % 2 == 0){
                //문자열 대문자로 변환
                str[i] = str[i].toUpperCase();
                cnt++;
            } else if(cnt % 2 != 0) {
                //문자열 소문자로 변환
                str[i] = str[i].toLowerCase();
                cnt++;
            }
            answer += str[i];
        }
        return answer;
    }
}
