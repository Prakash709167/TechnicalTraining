public class Diameter {
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
    public static int Height(Node root){
        if(root == null){
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh,rh)+1;
    }
    public static int diaofTree(Node root){
        if(root == null){
            return 0;
        }
        int leftdia = diaofTree(root.left);
        int lh = Height(root.left);
        int rightdia = diaofTree(root.right);
        int rh = Height(root.right);
        
        int selfdia = lh+rh+1;
        return Math.max(selfdia, Math.max(leftdia,rightdia));
    }
    static class Info{
        int dia;
        int ht;
        public Info(int dia, int ht){
            this.dia = dia;
            this.ht = ht;
        }
    }
    public static Info Treedia(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info leftinfo = Treedia(root.left);
        Info rightinfo = Treedia(root.right);

        int selfdia = Math.max(Math.max(leftinfo.dia,rightinfo.dia),leftinfo.ht+rightinfo.ht+1);
        int ht = Math.max(leftinfo.ht,rightinfo.ht)+1;

        return new Info(selfdia,ht);
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
        System.out.println(Treedia(root).dia);
    }
}