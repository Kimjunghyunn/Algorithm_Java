public class Collatz {
    public static void main(String[] args) {
        System.out.println(solution1(6));
        System.out.println(solution1(626331));

        System.out.println(solution2(6));
        System.out.println(solution2(626331));
    }

    //통과 코드
    static int solution1(long num) {
        int answer = 0;

        while(num != 1){
            if(num % 2 == 0){
                num /= 2;
            }else{
                num = num * 3 + 1;
            }

            answer++;

            if(answer > 500) {
                answer= -1;
                break;
            }
        }
        return answer;
    }

    //삼항연산자 사용
    static int solution2(long num) {
        for(int i =0; i<500; i++){
            if(num==1) return i;
            num = (num%2==0) ? num/2 : num*3+1;
        }
        return -1;
    }
}
