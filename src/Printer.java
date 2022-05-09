import java.util.Collections;
import java.util.PriorityQueue;

public class Printer {
    public static int solution(int[] priorities, int location) {
        int answer = 1; //출력 순서

        //우선순위 큐 생성(우선순위 내림차순 정렬) 문서 우선순위 저장
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int priority : priorities) {
            //E offer() : 큐 안에 값 저장
            queue.offer(priority);
        }

        //우선순위가 높은 순으로 기존 배열에서 일치하는 문서 잧기
        while (!queue.isEmpty()) {
            for(int i=0; i < priorities.length; i++){
                //E peek() : 현재 꺼낼 값 확인
                if(queue.peek() == priorities[i]){
                    if(i == location){
                        return answer;
                    }
                    answer++;
                    queue.poll(); //큐 값 꺼내기
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 1};
        int location1 = 2;
        
        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;

        System.out.println(solution(priorities1, location1));
        System.out.println(solution(priorities2, location2));

    }
}
