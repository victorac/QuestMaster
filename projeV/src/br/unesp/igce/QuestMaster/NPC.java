/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.QuestMaster;

/**
 *
 * @author Victor Campos
 */
public class NPC {
    public String nome;
    public String sexo;
    public String descrição;
    public int quests; 
    
    NPC (String nome, String sexo, String descrição){
        this.nome = nome;
        this.sexo = sexo;
        this.descrição = descrição;
        this.quests = 0;
        
    }
    public static void main(String[] args) {
        NPC pessoa = new NPC("Gabi","'Feminino'","Garota maluquinha..");
        System.out.println("NPC: " 
                +pessoa.nome 
                + "\n" +"sexo: "
                +pessoa.sexo 
                +"Descrição: "+pessoa.descrição 
                +"numero de quests: "+pessoa.quests );
        
        
    }
}
