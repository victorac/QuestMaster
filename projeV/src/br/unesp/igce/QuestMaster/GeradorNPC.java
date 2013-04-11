/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.QuestMaster;

import java.util.Random;
/**
 *
 * @author Victor Campos
 */

public class GeradorNPC {
    private String [] nomes = {
        "Gabi",
        "Robertison",
        "Juliete",
        "Wilson",
        "Judite"
    };
    private String [] nomes2 = {
      "Oliveira",
      "Santos",
      "Alemida",
      "de Abreu",
      "Hilde",
      "Cristofani"
    };
    private String [] nomes3 = {
        "Perez",
        "Campos",
        "Topeira",
        "Ruvido"
        
    }; 
      public NPC GeraNpc(){
         
          Random g = new Random();
          int d = g.nextInt(50);
          int mod5 = d % 5;
          int mod6 = d % 6;
          int mod4 = d % 4;
          String saida ="" ;
          saida = nomes[mod5]+" "+nomes2[mod6]+" "+nomes3[mod4];
          
          return new NPC(saida,"","");
      }
          public static void main(String[] args) {
        GeradorNPC teste = new GeradorNPC();
              for (int i = 0; i < 10; i++) {
                NPC novo = teste.GeraNpc();
                System.out.println(novo.nome);                  
              }
    
        
                    
    }
          
          
          
          
    }

