
/**
* data = 노드 안에 있는 값
* lt = 루트(부모)노드의 왼쪽노드(자식)의 주소값을 저장
* rt = 루트(부모)노드의 오른쪽노드(자식)의 주소값을 저장
**/
class Node{
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
/*깊이우선탐색(이진트리순회)*/
public class DepthFirstSearch {
    Node root;
    public void DFS(Node root){
        if(root==null)
            return;
        else{
            System.out.print(root.data+" "); //전위순회
            DFS(root.lt);
//            System.out.print(root.data+" "); //중위순회
            DFS(root.rt);
//            System.out.print(root.data+" "); //후위순회
        }
    }

    public static void main(String args[]) {
        DepthFirstSearch tree = new DepthFirstSearch();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);
    }
}
