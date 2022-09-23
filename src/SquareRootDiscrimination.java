public class SquareRootDiscrimination {
    public static void main(String[] args) {
        SquareRootDiscrimination srd = new SquareRootDiscrimination();

        System.out.println(srd.solution(121));
        System.out.println(srd.solution1(121));
    }

    //통과코드
    public long solution(long n) {
        long answer = (long) Math.sqrt(n);

        if(n == Math.pow(answer,2)) {
            return (long)(Math.pow(answer+1, 2));
        }else {
            return -1;
        }
    }

    //다른 사람 풀이
    public long solution1(long n) {
        if (Math.pow((int)Math.sqrt(n), 2) == n) {
            return (long) Math.pow(Math.sqrt(n) + 1, 2);
        }
        return -1;
    }
}
