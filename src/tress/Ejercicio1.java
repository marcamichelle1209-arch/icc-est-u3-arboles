package tress;

import node.Node;

public class Ejercicio1{
    //actual=
         //crear un arbol BTS - instanciar Binary tree
        //insertar los numeros del arbol
        //imprimir el arbol

        //otro metodo que imprima
        ///t tabulaciones
        /// 
    public void insert(int[] numeros){
        BinaryTree<Integer> tree = new BinaryTree<>();
          for (int numeros1: numeros){
            tree.insert(numeros1);
        }
        printTree(tree.getRoot());
    }

    public void printTree(Node<Integer> root){
           System.out.println("Imprimir el arbol");
            printTreeRecursivo(root, 0);
        }

    public void printTreeRecursivo(Node<Integer> actual, int nivel){
         if (actual == null) 
            return;

        printTreeRecursivo(actual.getRight(), nivel + 1);
        System.out.println("  ".repeat(nivel) + actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);

    }
    
}   

