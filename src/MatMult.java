import java.util.Arrays;

public class MatMult {

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr2[0].length; j++){
                for(int z=0; z< arr1[0].length; z++){
                    answer[i][j] += arr1[i][z] * arr2[z][j];
                }
            }
        }

        //2차원 배열 출력
        for(int i = 0; i < answer.length; i++){
            System.out.println(Arrays.toString(answer[i]));
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] arr1 = {{1,4}, {3,2}, {4,1}};
        int[][] arr2 = {{3,3}, {3,3}};

        int[][] arr3 = {{2,3,2}, {4,2,4}, {3,1,4}};
        int[][] arr4 = {{5,4,3}, {2,4,1},{3,1,1}};



        //arr2 열 길이 테스트
        //System.out.println(arr2[0].length);

        solution(arr1, arr2);
        solution(arr3, arr4);

    }
}


