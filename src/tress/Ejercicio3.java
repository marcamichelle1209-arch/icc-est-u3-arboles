package tress;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import node.Node;

public class Ejercicio3 {
    
    public List<List<Node>> listLevels(Node root){
       
         List<List<Node>> resultado = new ArrayList<>(); 
         // aqui lo que hace es comprobar si esta vacio el arbol
        if(root==null){   
        return resultado;
        }
            Queue<Node> cola = new LinkedList<>();
            cola.add(root);

            while (!cola.isEmpty()){
                int tamanioNivel = cola.size();
                List<Node> nivel = new ArrayList<>();

                for (int i=0; i<tamanioNivel; i++){
                    Node actual = cola.poll();
                    nivel.add(actual);

                    if(actual.getLeft() !=null){
                        cola.add(actual.getLeft());
                    }
                    if(actual.getRight() != null){
                        cola.add(actual.getRight());
                    }
                   
                }
                 resultado.add(nivel);
            }
            return resultado;

    }
}
//arboles grafos sett, direccionarios 