public class NaturalNumN {

    public static int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++){
            int sum = 0; // sum 초기화

            for(int j= i ; j <= n; j++){
                sum += j;

                if(sum == n){
                    System.out.println("answer 카운트-------------------------");
                    answer++;
                    break;
                }
                System.out.println("반복문 j break");
            }
            System.out.println("반복문 i 끝");
        }

        return answer;
    }

    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution(n));
    }
}
