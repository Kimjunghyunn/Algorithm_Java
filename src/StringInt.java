public class StringInt {
    public static void main(String[] args) {
        System.out.println(solution("1234"));
        System.out.println(solution("-1234"));
    }
    static int solution(String s) {
        return Integer.parseInt(s);
    }
}
