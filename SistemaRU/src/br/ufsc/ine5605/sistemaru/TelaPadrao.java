/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufsc.ine5605.sistemaru;

import java.util.Scanner;

/**
 *
 * @author 12041789921
 */
public abstract class TelaPadrao {
    
    private Scanner teclado;

    public TelaPadrao() {
        this.teclado = new Scanner(System.in);
    }
    
    public int leInteiro(){
        //TODO TRATA EXCEÇOES 
        int i = teclado.nextInt();
        teclado.nextLine();
        return i;
        
    }
    
    public float leFloat() {
        float i = teclado.nextFloat();
        teclado.nextLine();
        return i;
    }
    
    public String leString() {
        return teclado.nextLine();
    }
    public boolean leBoolean() {
        return teclado.nextBoolean();
    }
     
    public abstract void mostraConteudoTela();
    
    public void operacaoRealizada(){
        System.out.println("");
        System.out.println("-> OPERAÇÃO REALIZADA COM SUCESSO");
        System.out.println("");
    }
    
    public void clear(){
        for (int i=0; i<=40;i++){
            System.out.println("");
        }
    }
}
