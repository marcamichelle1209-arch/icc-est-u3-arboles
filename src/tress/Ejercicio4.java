package tress;

import node.Node;

public class Ejercicio4 {
    
    public int maxDepth(Node<Integer> root){
        if(root==null){
            return 0;
        }
            int left = maxDepth(root.getLeft());
            int right = maxDepth(root.getRight());
            return Math.max(left, right)+1;
        
           
        }  
}
