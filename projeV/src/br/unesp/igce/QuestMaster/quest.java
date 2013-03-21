/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.QuestMaster;

/**
 *
 * @author aluno
 */
public class quest {
    private String titulo;
    private String npc;
    
    quest (String titulo){
        this.titulo = titulo;
        this.npc = " ";
    }
    public static void main(String[] args){
        quest x = new quest ("Viajar");
    }
}
