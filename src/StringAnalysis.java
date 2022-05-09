import java.util.Scanner;

public class StringAnalysis {
    public static StringBuilder solution(String s) {
        StringBuilder result = new StringBuilder();  //압축완료한 문자를 저장할 StringBuilder
        int lowerCase = 0;
        int upperCase = 0;
        int number = 0;
        int space = 0;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                upperCase++;
                continue;
            } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                lowerCase++;
                continue;
            } else if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                number++;
                continue;
            } else {
                space++;
                continue;
            }
        }
        return result.append(lowerCase + " " + upperCase + " " + number + " " + space);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextLine()) {
            String s = scan.nextLine();
            System.out.println(solution(s));
        }
    }
}

