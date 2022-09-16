import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class WhitePages {
    public static void main(String[] args) throws IOException {
        String[] phoneBook = {"119", "97674223", "1195524421"};
        System.out.println(solution1(phoneBook));
        System.out.println(solution2(phoneBook));
    }

    static boolean solution1(String[] phoneBook) throws IOException {
        boolean answer = true;
        // 1. phoneBook을 sorting한다.
        Arrays.sort(phoneBook);

        // 2. 1중 Loop을 돌며 앞 번호가 뒷 번호의 접두어인지 확인한다.
        for (int i = 0; i < phoneBook.length - 1; i++) {
            if (phoneBook[i + 1].startsWith(phoneBook[i])) {
                return false;
            }
        }
        // 3. 여기까지 오면 접두어가 없다는 것이다.
        return answer;
    }

    static boolean solution2(String[] phoneBook) {
        boolean answer = true;
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return answer;
    }

}
