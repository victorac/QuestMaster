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
public class Quest {
    public String titulo;
    private String npc;
    public Date data = new Date();
    public String descrição;
    
    Quest (String titulo, String npc){
        this.titulo = titulo;
        this.npc = npc;
        
    }
    public static void main(String[] args){
        Quest x = new Quest ("Viajar", "Clotilde");
        System.out.print("Titulo: " + x.titulo + "\n" );
        System.out.print(x.data + "\n");
        System.out.print("NPC: " + x.npc + "\n");
    }
}
