public class NegativePositivePlus {

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        solution(absolutes, signs);
        solution1(absolutes, signs);
    }

    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == true) {
                answer += absolutes[i];
            }else {
                answer -= absolutes[i];
            }
        }

        System.out.println(answer);
        return answer;
    }
    static int solution1(int[] absolutes, boolean[] signs) {
        int answer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            answer += (signs[i] == true) ? +absolutes[i] : -absolutes[i];
        }

        System.out.println(answer);
        return answer;
    }

}
