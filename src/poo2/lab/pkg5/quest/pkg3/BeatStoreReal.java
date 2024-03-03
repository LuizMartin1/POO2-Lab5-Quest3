/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo2.lab.pkg5.quest.pkg3;

/**
 *
 * @author Luiz Henrique
 */
// Objeto real que faz a busca do beat
public class BeatStoreReal implements BeatStore {

    @Override
    public void buscar(String beat) {
        System.out.println("Buscando o beat: " + beat);
    }
}
