package collections.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {
  

    public Sets() {
    }

    public Set<String> construirHashSet(){
        Set<String> hashSet = new HashSet<>();
       hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");
        return hashSet;

    }

    public Set<String>  construirLinkedHashSet(){
        Set<String> LinkedHashSet = new LinkedHashSet<>();
        LinkedHashSet.add("A");
        LinkedHashSet.add("B");
        LinkedHashSet.add("C");
        LinkedHashSet.add("D");
        LinkedHashSet.add("E");
        LinkedHashSet.add("F");
        LinkedHashSet.add("1Ggggggeegeg");
         LinkedHashSet.add("2G2gggggeegeg");
         LinkedHashSet.add("3Gggggeegeg");
         LinkedHashSet.add("4Ggggggeegeg");
       LinkedHashSet.add("5Ggggggeegeg");
       LinkedHashSet.add("5Ggggggeegeg");
       LinkedHashSet.add("6Ggggggeegeg");
         LinkedHashSet.add("G7gggggeegeg");
        return LinkedHashSet;

    }
    public Set<String> construirTreeSet(){
        Set<String> TreeSet = new TreeSet<>();
         TreeSet.add("A");
         TreeSet.add("B");
         TreeSet.add("C");
       TreeSet.add("D");
        TreeSet.add("E");
         TreeSet.add("F");
        TreeSet.add("1Ggggggeegeg");
         TreeSet.add("2G2gggggeegeg");
       TreeSet.add("3Gggggeegeg");
         TreeSet.add("4Ggggggeegeg");
       TreeSet.add("5Ggggggeegeg");
        TreeSet.add("5Ggggggeegeg");
        TreeSet.add("6Ggggggeegeg");
         TreeSet.add("G7gggggeegeg");
        return  TreeSet;


    }
     public Set<Contacto> construirTreeSetConComparador(){
                                            //funcion flecha   // aqui  se genero una funvion
       // Set<Contacto> tCSet = new TreeSet<>((c1,c2)-> {return c1.getNombre().compareTo(c2.getNombre());} ); //funcion comparador
       Set<Contacto> tCSet = new TreeSet<>();
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Ana", "Gomez", "987654321"));
        tCSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        tCSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        tCSet.add(new Contacto("Juan", "Perez", "123456789"));
        tCSet.add(new Contacto("Juan", "Lopez", "123456789")); // Duplicado, no se agregará


        //tuvimos eeror al querer comparar objetos
        return tCSet;

        //
    }
     public Set<Contacto> construirHashSetContacto(){
        Set<Contacto> hCSet= new HashSet<>();
        Contacto c1 =(new Contacto("Juan", "Perez", "123456789"));
      Contacto c2 =(new Contacto("Ana", "Gomez", "987654321"));
        Contacto c3 =(new Contacto("Pedro", "Lopez", "456789123"));
       Contacto c4 =(new Contacto("Maria", "Rodriguez", "789123456"));
     Contacto c5 =(new Contacto("Juan", "Perez", "123456789"));
        Contacto c6 =(new Contacto("Juan", "Lopez", "123456789")); // Duplicado, no se agregará
        System.out.println("c1"+ hashCode()); // utliza la referncia de la memoria me da un hascode
        hCSet.add(c1);
         hCSet.add(c2);
          hCSet.add(c3);
           hCSet.add(c4);
            hCSet.add(c5);
             hCSet.add(c6);
            
             return hCSet;

     }
}


