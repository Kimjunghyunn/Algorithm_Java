public class AddMissingNumbers {
    public static void main(String[] args) {
        int[] test1 = {1,2,3,4,6,7,8,0};
        int[] test2 = {5,8,4,0,6,7,9};

        System.out.println(solution(test1));
        System.out.println(solution(test2));
    }
    static int solution(int[] numbers) {
        int answer = 45;

        for(int number : numbers) {
            answer -= number;
        }

        return answer;
    }
}
