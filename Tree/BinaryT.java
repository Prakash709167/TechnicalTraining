public class BinaryT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int value){
            this.data = value;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
        public void PreOrderTravel(Node root){
            if(root == null){
                System.out.print(-1+" ");
    
                return;
            }
            System.out.print(root.data + " ");
            PreOrderTravel(root.left);
            PreOrderTravel(root.right);
        }
        public void InOrderTravel(Node root){
            if(root == null){
                System.out.print(-1+" ");
                return;
            }
            InOrderTravel(root.left);
            System.out.print(root.data+" ");
            InOrderTravel(root.right);
        }
    }
    
    public static void main(String args []){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        tree.PreOrderTravel(root);
        System.out.println();
        tree.InOrderTravel(root);
        System.out.println();
    }
}