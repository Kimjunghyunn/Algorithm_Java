public class MatrixBorderRotation {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] queries = {{2, 2, 5, 4}, {3, 3, 6, 6}, {5, 1, 6, 3}};
        solution(rows, columns, queries);
    }

    static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer =  new int[queries.length];
        int[][] map = new int[rows][columns];
        int num = 1;

        //map 초기화
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                map[i][j] = num++;
            }
        }

     /*
        열 증가부터 시작,
        도착 열에 도달했다면 행 증가,
        도착 행에 도달했다면 열 감소,
        시작 열에 도달했다면 행 감소, 도착
        (2,2 -> 2,3 -> 2,4) ->
        (3,4 -> 4,4 -> 5,4) ->
        (5,3 -> 5,2) ->
        (4,2 -> 3,2)
     */
        for (int i = 0; i < queries.length; i++) {
            int[] query = queries[i];
            int r1 = query[0]-1, c1 = query[1]-1, r2 = query[2]-1, c2 = query[3]-1;
            int tmp = map[r1][c1];
            int min = tmp;

            for(int r=r1+1 ; r<=r2 ; r++) {
                min = Math.min(min, map[r][c1]);
                map[r-1][c1] = map[r][c1];
            }
            for(int c=c1+1 ; c<=c2 ; c++) {
                min = Math.min(min, map[r2][c]);
                map[r2][c-1] = map[r2][c];
            }
            for(int r=r2-1 ; r>=r1 ; r--) {
                min = Math.min(min, map[r][c2]);
                map[r+1][c2] = map[r][c2];
            }
            for(int c=c2-1 ; c>c1 ; c--) {
                min = Math.min(min, map[r1][c]);
                map[r1][c+1] = map[r1][c];
            }
            map[r1][c1+1] = tmp;
            answer[i] = min;
        }

        for (int ans: answer) {
            System.out.println(ans);
        }

        return answer;
    }
}