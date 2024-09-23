public class CountNode {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int val){
            this.data = val;
            this.left = null;
            this.right = null;
        }
    }
    public static int NoOfNode(Node root){
        if(root == null){
            return 0;
        }
        int lc = NoOfNode(root.left);
        int rc = NoOfNode(root.right);
        return lc+rc+1;
    }
    
    public static void main(String args[]){

        /**
         *                  1
         *                /   \
         *               2     3
         *              / \   / \
         *             4   5 6   7
         * 
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(NoOfNode(root));


        // int n = 10;
        // String str = String.valueOf(n);
        // System.out.println(str+1);

    }
}