package estructures.grafos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import node.Node;

public class Grafo<T> {
    //collection de nodos
   
    // set hash set tree set
    //Set<Node> nodes; ->

    //map hash map tree map-> mejor manera de utilizar grafos
     //Map<Node> , Set<Node>> g = new TreeMap<>(){
    //

    private Map<Node<T>, Set<Node<T>>> graph;

    public Grafo(){
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
    }

    public void add(T data){
        Node<T> node = new Node<T>(data);
        graph.putIfAbsent(node, new HashSet<Node<T>>());


    }
    //entiendo el hascode
    public void addEdge(T v1, T v2  ){
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(v1);
        add(v2);
        graph.get(nv1).add(nv2);
          graph.get(nv2).add(nv1);


    }

    public void  addEdgeUni(T v1 , T v2 ){ //add con dos direcciones

        add(v1);
         add(v2);
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
         
        graph.get(nv1).add(nv2);
    }

    public void printlnGraph(){ //imprimir el grafo
        for(Map.Entry<Node<T>,Set<Node<T>>> entry:graph.entrySet()){
            System.out.println(entry.getKey() + "->");
            for (Node<T> coneccion : entry.getValue()) {
                System.out.println(coneccion);
            }
            System.out.println();
        }
    }
    //crear un grafo de letras
    //como seria bfs dfs el rrecorrido
}
 


