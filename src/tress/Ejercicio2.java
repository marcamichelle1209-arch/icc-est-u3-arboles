package tress;

import java.util.LinkedList;
import java.util.Queue;

import node.Node;

public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root){
        // imprimir arbol original
        // prinTree(root);

    
        //invertRecursively(root);
        
        System.out.println("Arbol invertido:");
        printTree(root);
        return root;

        //imprimir el arbol invertido
        // printTRRE(root);


    }
     public void printTree(Node<Integer> root){
           System.out.println("Imprimir el arbol");
            printTreeRecursivo(root, 0);
        }

    public void printTreeRecursivo(Node<Integer> actual, int nivel){
         if (actual == null)
            System.out.println("El arbol esta vacio"); 
            return;
            Queue<Node<Integer>> cola = new LinkedList<>();
            cola.add(actual);

            while (!cola.isEmpty()) {
                Node<Integer> actual = cola.poll();
                System.out.println(actual.getValue() + " ");

                if(actual.getLeft() !=null){
                   cola.add(actual.getRight());
                }
                if(actual.getRight() !=null){
                    cola.add(actual.getLeft());
                }
                
            }
            System.out.println();
        }
    }
    


