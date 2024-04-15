public class treeImplementation {
    
     Node root; 
    class Node{
        int data; 
        Node left; 
        Node right; 

        Node(int data){
            this.data = data; 
            this.left = null; 
            this.right = null; 
        }
    }
    

    public Node insertRecursive(Node root, int data) {
        if (root == null) {
            // If root is null, create a new node and set it as the root of the tree
            return new Node(data);
        }
    
        if (root.data > data) {
            // Insert into the left subtree
            root.left = insertRecursive(root.left, data);
        } else {
            // Insert into the right subtree
            root.right = insertRecursive(root.right, data);
        }
        // Return the root of the (sub)tree after insertion
        return root;
    }
    

    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.right);
    }

    public boolean search(Node node, int y){
        if(node == null)
            return false; 
        if(node.data > y){
            return search(node.left, y);
        }
        else if(node.data == y){
            return true; 
        }
        else{
            return search(node.right , y);
        }

    }
    int count; 
    public int calculateInNode(Node root){
        if(root == null){
            return 0; 
        }
        else{
            calculateInNode(root.left);
            if(root.left != null && root.right != null){
                count++; 
            }
            calculateInNode(root.right);
        }
        return count; 
    }

    public void externalNode(Node root){
        if(root == null){
            return ;
        }
        else{
            externalNode(root.left);
            if(root.left == null && root.right == null){
            System.out.println(root.data);
            }
            externalNode(root.right);
        }
    }

    public int returnRootNode(){
        return root.data; 
    }
    public static void main(String[] args){
        treeImplementation tree= new treeImplementation();
        int values[] = {  56, 32 , 6 , 2 , 77 ,23};
        for(int i = 0 ; i< values.length ; i++){
            tree.root = tree.insertRecursive(tree.root, values[i]);
        }

        // tree.root = tree.insertRecursive(tree.root , 9);
        // tree.root = tree.insertRecursive(tree.root , 5);
        // tree.root = tree.insertRecursive(tree.root , 1);
        // tree.root = tree.insertRecursive(tree.root , 7);
        // tree.root = tree.insertRecursive(tree.root , 2);
        // tree.root = tree.insertRecursive(tree.root , 12);
        // tree.root = tree.insertRecursive(tree.root , 8);
        // tree.root = tree.insertRecursive(tree.root , 4);
        // tree.root = tree.insertRecursive(tree.root , 3);
        // tree.root = tree.insertRecursive(tree.root , 11);
        // tree.inorder(tree.root);
        // System.out.println(tree.search(tree.root , 2));
        // System.out.println(tree.calculateInNode(tree.root));
        // tree.externalNode(tree.root);
        System.out.println(tree.returnRootNode());
        }

}
