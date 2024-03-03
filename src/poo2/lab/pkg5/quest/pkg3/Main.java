/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2.lab.pkg5.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BeatStore beatStore = new BeatStoreProxy();
        
        // Fazendo duas buscas, a segunda com o mesmo nome deve ser retornada do cache
        beatStore.buscar("PLAN type beat");
        beatStore.buscar("PLAN type beat");
    }
    
}
