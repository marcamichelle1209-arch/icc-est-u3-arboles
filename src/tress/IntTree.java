package tress;

import node.Node;
import java.util.LinkedList;
import java.util.Queue;

public class IntTree {
    private Node<Integer> root;
    int peso = 0;
    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
        
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
        peso ++;
    }
    public int getPeso(){
        return peso;
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayoy o nenor y decidir si lo ingerso a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.println(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.println(actual + " ");

    }
    // inOrder
    public void inOrder() {   //Izquierda, Raíz, Derecha
        inOrderRecursivo(root);

    }
    public void inOrderRecursivo(Node<Integer> actual){
        if(actual == null){
            return;
        }
        inOrderRecursivo(actual.getLeft());
        System.out.println(actual + " ");
        inOrderRecursivo(actual.getRight());
    
    }
    //recorridos
    //quedarme con el que yo entienda
    public void porNiveles(){  //no recibe parametros por que empieza desde la raiz
        if(root == null){
            System.out.println("El arbol esta vacio");
            return;
        }
        Queue<Node<Integer>> cola = new LinkedList<>();
            cola.add(root);

            while (!cola.isEmpty()) {
                Node<Integer> actual = cola.poll();
                System.out.println(actual.getValue() + " ");

                if(actual.getLeft() !=null){
                   cola.add(actual.getLeft());
                }
                if(actual.getRight() !=null){
                    cola.add(actual.getRight());
                }
                
            }
            System.out.println();
        }

        // para calcular la altura 
        public int obtenerAltura(){
            return calcularAlturaRecursivo(root);
        }
           
        private int calcularAlturaRecursivo(Node<Integer> actual) {
        
        if (actual == null) {
            return 0;
        }
        int alturaIzq = calcularAlturaRecursivo(actual.getLeft() );
        int alturaDer = calcularAlturaRecursivo(actual.getRight());

        return Math.max(alturaIzq, alturaDer) + 1;

        }
        public int peso(){
            return calcularPesoRecursivo(root);
        }
        //peso
        //genera llamadas recursivas
        //espacial
        public int obtenerPeso(){
            return calcularPesoRecursivo(root);          
        }

        private int calcularPesoRecursivo(Node<Integer> actual){

            if(actual == null){
                return 0;

            }
            int pesoIzq = calcularPesoRecursivo(actual.getLeft() );
            int pesoDer = calcularPesoRecursivo(actual.getRight());
            return pesoIzq + pesoDer +1;
        }
}




    // inorder
    // niveles
    // altura    


