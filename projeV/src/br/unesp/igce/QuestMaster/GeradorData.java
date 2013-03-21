/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.QuestMaster;
/**
 *
 * @author aluno
 */
import java.util.Date;
import java.util.Random;

public class GeradorData {
    public Date geraData(){
        Random g = new Random();
        int d = g.nextInt(90);
        Date agora = new Date();
        long agoramili = agora.getTime();
        return new Date(agoramili+d*24*3600000);
    }
    public static void main (String[] args){
        for (int i = 0; i < 10; i++) {
            GeradorData g = new GeradorData();
            System.out.println(g.geraData());
            
            
        }
    }
    
}
