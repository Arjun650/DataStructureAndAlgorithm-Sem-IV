package Tree;

public class tree {
     Node root; 
    class Node{
        int data; 
        Node left , right; 
        Node(int data){
            this.data = data; 
            left = null; 
            right = null; 
        }
    }

    public void nonRecInsert(int data){
        Node newNode = new Node(data);
        if(root == null){
            root = newNode; 
            return; 
        }
        else{
            Node current = root ; 
            Node parent = null;
            while(current != null){ 
                parent = current; 

                if(data < current.data){
                    current = current.left;
                    if(current == null){
                        parent.left = newNode; 
                        return; 
                    }
                }
                else{
                    current = current.right; 
                    if(current == null){
                        parent.right = newNode; 
                        return ; 
                    }
                }
            }
        }
    }

    public Node insertRecursive(Node root, int data){
        if(root == null){
            root = new Node(data); 
            return root ; 
        }
        if(data < root.data){
            root.left = insertRecursive(root.left, data);

        }
        else if(data > root.data){
            root.right = insertRecursive(root.right, data);
        }
        return root; 


    }
    // public Node insertRecursive(Node root , int data){
    //     if(root == null){
    //         root = new Node(data); 
    //         return root;  
    //     }

    // }
        public void inorder(Node root){
            if(root != null){
                inorder(root.left);
                System.out.print(root.data + " ");
                inorder(root.right);
            }
        }

       
    public static void main(String[] args){
        tree Tree = new tree(); 
        Tree.root = Tree.insertRecursive(Tree.root , 9);
        Tree.root = Tree.insertRecursive(Tree.root , 5);
        Tree.root = Tree.insertRecursive(Tree.root , 1);
        Tree.root = Tree.insertRecursive(Tree.root , 7);
        Tree.root = Tree.insertRecursive(Tree.root , 2);
        Tree.root = Tree.insertRecursive(Tree.root , 12);
        Tree.root = Tree.insertRecursive(Tree.root , 8);
        Tree.root = Tree.insertRecursive(Tree.root , 4);
        Tree.root = Tree.insertRecursive(Tree.root , 3);
        Tree.root = Tree.insertRecursive(Tree.root , 11);
        Tree.inorder(Tree.root);

    }
}
