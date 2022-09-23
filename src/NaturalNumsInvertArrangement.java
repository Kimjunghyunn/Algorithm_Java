public class NaturalNumsInvertArrangement {
    public static void main(String[] args) {
        NaturalNumsInvertArrangement nnia = new NaturalNumsInvertArrangement();

        nnia.solution(12345);
        System.out.println();

        nnia.solution1(12345);
        System.out.println();

        int[] arr = nnia.solution2(12345);
        for (int a:arr) {
            System.out.print(a);
        }
    }

    // 통과코드
    public int[] solution(long n) {
        String s = ""+n;
        int[] arr = new int[s.length()];

        int i = 0;

        while(n != 0) {
            arr[i] += n%10;
            n /= 10;
            i++;
        }

        for (int a:arr) {
            System.out.print(a);
        }
        return arr;
    }

    //다르게 푼 코드
    public int[] solution1(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
            System.out.print(answer[i]);
        }
        return answer;
    }

    //보고 놀란 코드
    public int[] solution2(long n) {
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
