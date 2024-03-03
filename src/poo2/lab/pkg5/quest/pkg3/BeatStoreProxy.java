/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg5.quest.pkg3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Luiz Henrique
 */
// Proxy que verifica se o beat já está em cache antes de buscar
public class BeatStoreProxy implements BeatStore {
    private BeatStoreReal beatStoreReal = new BeatStoreReal();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public void buscar(String beat) {
        if(cache.containsKey(beat)){
            System.out.println("Retornando o resultado da cache para " + beat);
        } else {
            cache.put(beat, beat);
            beatStoreReal.buscar(beat);
        }
    }
    
}
