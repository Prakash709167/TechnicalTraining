import java.util.*;
public class tree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree{
        static int idx = -1;
        public Node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
        public void preorder(Node root){
            if(root == null){
                // System.out.print(-1+" ");
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
        public void inorder(Node root){
            if(root == null){
                // System.out.print(-1+" ");
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
        public void postorder(Node root){
            if(root == null){
                // System.out.print(-1+" ");
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node temp = q.remove();
                if(temp==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(temp.data + " ");
                    if(temp.left != null){
                        q.add(temp.left);
                    }
                    if(temp.right != null){
                        q.add(temp.right);
                    }
                }
            }

        }
    }
    public static void main(String args[]){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binaryTree tr = new binaryTree();
        Node root = tr.buildTree(nodes);
        // System.out.println(root.data);
        System.out.print("preorder :- ");
        tr.preorder(root);
        System.out.println();
        System.out.print("Inorder :- ");
        tr.inorder(root);
        System.out.println();
        System.out.print("PostOrder :- ");
        tr.postorder(root);
        System.out.println();
        System.out.println("levelorder :- ");
        tr.levelorder(root);
    }
}