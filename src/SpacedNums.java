public class SpacedNums {
    public static void main(String[] args) {
        solution(2, 5);
    }
    static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < answer.length; i++) {
            if (i == 0){
                answer[i] = x;
            }else{
                answer[i] = answer[i-1]+x;
            }

        }

        for (long ans: answer) {
            System.out.print(ans);
        }

        return answer;
    }
}
