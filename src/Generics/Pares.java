package Generics;

import java.util.LinkedHashSet;

import java.util.Set;
import java.util.Optional;

public class Pares<K extends Number,V>{

    private final Set<Par<K,V>> itens = new LinkedHashSet<>();

    public void adicionar(K key,V value){
        if(key == null) return;

        Par<K , V> novoPar = new Par<>(key, value);

        if (itens.contains(novoPar)){
            itens.remove(novoPar);
        }
        itens.add(new Par<K, V>(key, value));


    }

    public V getValue(K key){
        if(key == null) return null;
        Optional <Par<K, V>> parOptional = itens.stream()
                .filter(p -> key.equals(p.getKey()))
                .findFirst();

        return parOptional.isPresent() ? parOptional.get().getValue() : null;
    }
}
