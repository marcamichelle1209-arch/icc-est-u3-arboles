package collections.sets.maps;

import java.util.TreeMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
// es un interfaz generica
    //clave ,valor
    //Map<Tipo clave, tipo valor
    // Mao<K,V>
    //String,Integer
    public Map<String ,Integer> construirHashMap(){
        Map<String ,Integer> map = new HashMap<>();
        // estamos intanciando de tipo HasMap

     map.put("A", 10);
     map.put("B", 20);
     map.put("C", 30);
     map.put("A", 50);

     System.out.println(map.size());
     System.out.println(map);
     System.out.println(map.values().toArray());



     for (int i = 0; i < map.size(); i++) { //esto los valores
        //valores que setransformaron en un aray imprimi cada posicion del array
        //Map->V ->Valores ->array->array[posicion]
        System.out.println(map.values().toArray()[i]); // value me devuelve una collecion de tipo integer por que yo le di ese valor
     // 
    
    }
    //Map->K->keys ->set-> valor del set
    for (String key : map.keySet())
     {
        System.out.println(key);   // esto eslas claves
    }

    //t=. ENTRY<V,K>
    map.entrySet();
    for (Map.Entry<String, Integer> entry: map.entrySet()) {
    
        System.out.println(entry);

    }
    return map;
}

    public LinkedHashMap<String,Integer> coLinkedHashMap(){
        LinkedHashMap<String,Integer> lMap = new LinkedHashMap<>();

      lMap.put("A", 2);
         lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
         lMap.put("D", 5);
       lMap.put("F", 3);
         lMap.put("G", 8);
        lMap.put("H", 85);
   lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }
   

    public Map<String,Integer> cTreeMap(){
        Map<String,Integer> lMap = new TreeMap<>();

      lMap.put("A", 2);
         lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
         lMap.put("D", 5);
       lMap.put("F", 3);
         lMap.put("G", 8);
        lMap.put("H", 85);
   lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }

   //public void elimiarDuplicadosAndSort(List<Contacto> contactos){
    // Set<Contacto> tSet = new TreeSet<>();
     //for (Contacto contacto : contactos){
       // tSet.add(contacto);
     //}
   // }
}
     // put si exite el elmento actualiza el valor por el valor que esta duplicado




    

