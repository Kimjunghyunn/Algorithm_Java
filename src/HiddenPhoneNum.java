public class HiddenPhoneNum {
    public static void main(String[] args) {
        System.out.println(solution1("01033334444"));
        System.out.println(solution1("027778888"));

    }

    //통과 코드
    static String solution1(String phoneNumber) {
        String answer = "";
        for(int i=0; i<phoneNumber.length(); i++){
            if(i < phoneNumber.length()-4) {
                answer += "*";
            }else {
                answer += phoneNumber.charAt(i);
            }
        }
        return answer;
    }

    //다른 방법 1
    static String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }

    //보고 놀랐던 코드
    static String solution(String phone_number) {
        return phone_number.replaceAll(".(?=.{4})", "*");
    }
}
