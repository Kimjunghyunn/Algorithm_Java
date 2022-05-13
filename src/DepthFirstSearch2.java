import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/** Node2 클래스(String 버전)
 * data = 노드 안에 있는 값(문자형)
 * lt = 루트(부모)노드의 왼쪽노드(자식)의 주소값을 저장
 * rt = 루트(부모)노드의 오른쪽노드(자식)의 주소값을 저장
 **/

class Node2 {
    String data;
    Node2 lt;
    Node2 rt;

    public Node2(String data) {
        this.data = data;
    }
}

/* 깊이우선탐색(이진트리순회) */
public class DepthFirstSearch2 {
    Node2 root;

    public void AddNode(String data, String leftData, String rightData) {
        if (root == null) { // 아무것도 없는 초기 상태 - A 루트 노드 생성
            root = new Node2(data);

            // 좌우 값 존재시 노드 생성
            if (!leftData.equals(".")) {
                root.lt = new Node2(leftData);
            }
            if (!rightData.equals(".")) {
                root.rt = new Node2(rightData);
            }
        } else { // 초기상태가 아닌 경우 위치 찾기 - A 루트 노드 이후
            Search(root, data, leftData, rightData);
        }
    }

    public void Search(Node2 root, String data, String leftData, String rightData) {
        if (root == null) { // 도착 노드 null이면 재귀 종료 - 삽입할 노드 X
            return;
        } else if (root.data.equals(data)) { // 들어갈 위치
            if (!leftData.equals(".")) { // 값이 있는 경우만 좌우 노드 생성 (. - X)
                root.lt = new Node2(leftData);
            }
            if (!rightData.equals(".")) {
                root.rt = new Node2(rightData);
            }
        } else { // 탐색할 노드가 남아 있는 경
            Search(root.lt, data, leftData, rightData); // 왼쪽 재귀 탐색
            Search(root.rt, data, leftData, rightData); // 오른쪽 재귀 탐색
        }
    }

    // 전위 순회 root > left > right
    public static void preorder(Node2 root){
        if(root==null) {
            return;
        }
        else{
            System.out.print(root.data); //전위순회
            preorder(root.lt);
            preorder(root.rt);
        }
    }

    // 중위 순회 left > root > right
    public static void inorder(Node2 root){
        if(root==null) {
            return;
        }
        else{
            inorder(root.lt);
            System.out.print(root.data); //중위순회
            inorder(root.rt);
        }
    }

    // 후위 순회 left > right > root
    public static void postorder(Node2 root){
        if(root==null) {
            return;
        }
        else{
            postorder(root.lt);
            postorder(root.rt);
            System.out.print(root.data); //후위순회
        }
    }

    public static void main(String args[]) throws IOException {
        DepthFirstSearch2 tree = new DepthFirstSearch2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] data = new String[N+1];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                data[j] = st.nextToken();
            }
            tree.AddNode(data[0], data[1], data[2]);
        }


        tree.preorder(tree.root); //전위
        System.out.println();

        tree.inorder(tree.root);  //중위
        System.out.println();

        tree.postorder(tree.root); //후위

        br.close();
    }
}