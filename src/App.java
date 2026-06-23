

import java.util.Random;

import models.Person;
import tress.BinaryTree;
import tress.Ejercicio1;
import tress.IntTree;

public class App {
    public static void main(String[] args) throws Exception {
        

        runIntTree();
        runPersonTree();
        runIntComparativaPesos();
        runEjercicios();
        runEjercicios1();

    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CICLOS
        // node5.setLeft(root);

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20Ñ
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println(  "pre Order");
        arbolNumeros.preOrder();

        System.out.println(  "Pos Order");
        arbolNumeros.posOrder();

        System.out.println( " in Order");
        arbolNumeros.inOrder();

        System.out.println("por Niveles");
        arbolNumeros.porNiveles();

        System.out.println("Altura del Arbol");
        int altura = arbolNumeros.obtenerAltura();
        System.out.println("La altura es: " + altura);

        System.out.println("Peso del arbol");
        int peso = arbolNumeros.obtenerPeso();
        System.out.println("el peso es " + peso);

        

    }
    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[]{5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);

    }

    private static void runEjercicios1(){
        Ejercicio1 ejercicio2 = new Ejercicio1();
        int[] numeros = new int[]{4,2,7,1,3,6,9};
        ejercicio2.insert(numeros);

    }
    private static void runPersonTree(){
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));   
        personTree.insert(new Person("Rafael", 30));

        personTree.inOrder();
        personTree.posOrder();
        personTree.preOrder();
        personTree.porNiveles();

    }
       private static void runIntComparativaPesos() {
        IntTree tree = new IntTree();
        Random random = new Random();

        final int TOTAL_NODOS = 50_000;
        final int MIN = 1;
        final int MAX = 50_000;

        // Insertar 50 000 números aleatorios entre 1 y 50 000
        for (int i = 0; i < TOTAL_NODOS; i++) {
            int value = random.nextInt(MAX - MIN + 1) + MIN;
            tree.insert(value);
        }

        // Medir peso con variable acumulada
        long inicioPesoVariable = System.nanoTime();

        int pesoVariable = tree.getPeso();

        long finPesoVariable = System.nanoTime();

        double tiempoPesoVariableMs = (finPesoVariable - inicioPesoVariable) / 1_000_000.0;

        // Medir peso recursivo
        long inicioPesoRecursivo = System.nanoTime();

        int pesoRecursivo = tree.peso();

        long finPesoRecursivo = System.nanoTime();

        double tiempoPesoRecursivoMs = (finPesoRecursivo - inicioPesoRecursivo) / 1_000_000.0;

        // Resultados
        System.out.println("Cantidad de nodos insertados: " + TOTAL_NODOS);
        System.out.println("Peso usando variable: " + pesoVariable);
        System.out.println("Peso usando recursion: " + pesoRecursivo);

        System.out.println();

        System.out.println("Tiempo getPeso(): "
                + tiempoPesoVariableMs + " ms");

        System.out.println("Tiempo pesoRecursivo(): "
                + tiempoPesoRecursivoMs + " ms");
    }   
}
