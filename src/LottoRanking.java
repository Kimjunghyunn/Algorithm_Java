public class LottoRanking {
    /**
     * 1	6개 번호가 모두 일치
     * 2	5개 번호가 일치
     * 3	4개 번호가 일치
     * 4	3개 번호가 일치
     * 5	2개 번호가 일치
     * 6(낙첨)	그 외
     */
    public static void main(String[] args) {
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        solution(lottos, win_nums);
    }

    static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt = 0;
        int cnt = 0;

        for (int lotto: lottos) {
            if (lotto == 0) zeroCnt++;
            else {
                for (int win_num : win_nums) {
                    if (lotto == win_num){
                        cnt++;
                        break;
                    }
                }
            }
        }

        answer[0] = rank(cnt + zeroCnt);
        answer[1] = rank(cnt);

        for (int ans: answer) {
            System.out.println(ans);
        }

        return answer;
    }
    static int rank(int cnt){
        switch (cnt) {
            case 6 :
                return 1;
            case 5 :
                return 2;
            case 4 :
                return 3;
            case 3 :
                return 4;
            case 2 :
                return 5;
            default:
                return 6;
        }
    }
}
