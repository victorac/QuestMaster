/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.QuestMaster;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class quest {
    private String titulo;
    private String npc;
    public Date data = new Date();
    
    quest (String titulo, String npc){
        this.titulo = titulo;
        this.npc = npc;
        
    }
    public static void main(String[] args){
        quest x = new quest ("Viajar", "Clotilde");
        System.out.print("Titulo: " + x.titulo + "\n" );
        System.out.print(x.data + "\n");
        System.out.print("NPC: " + x.npc + "\n");
    }
}
