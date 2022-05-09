public class NextMaxNum {
    public static int solution(int n) {
        String binaryNum = Integer.toBinaryString(n); // 10➡2진수
        int cnt = 0;
        int nextNum = n;

        //2진수내의 1의 갯수 카운트
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1')
                cnt++;
        }

        while(true){
            int nextCnt = 0; //초기화
            nextNum++;

            String nextBinaryNum = Integer.toBinaryString(nextNum);

            for (int i = 0; i < nextBinaryNum.length(); i++) {
                if (nextBinaryNum.charAt(i) == '1')
                    nextCnt++;
            }
            if (cnt == nextCnt){ break;}
        }
        return nextNum;
    }

    //테스트
    public static void main(String[] args) {
        int n = 78;
        int n2 = 15;
        System.out.println(solution(n));
        System.out.println(solution(n2));
    }

}
