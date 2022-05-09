public class MaxMin {

    public static String solution(String s) {

        //문자열 공백 단위로 끊어서 배열에 저장
        String[] str = s.split(" ");

        //min, max 초기화
        int max = Integer.parseInt(str[0]);
        int min = max;

        for(int i=0; i<str.length; i++){
            int num = Integer.parseInt(str[i]);
            if(min > num) min = num;
            if(max < num) max = num;
        }

        return min+" "+max;
    }
    public static void main(String[] args) {
        String s = "1 2 3 4";
        String s1 = "-1 -2 -3 -4";
        String s2 = "-1 -1";

        System.out.println(solution(s));
        System.out.println(solution(s1));
        System.out.println(solution(s2));

    }
}
