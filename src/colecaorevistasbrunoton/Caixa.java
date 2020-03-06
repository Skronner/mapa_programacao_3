/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaorevistasbrunoton;

import java.util.List;

/**
 *
 * @author Bruno
 */
public class Caixa {
    
    private int numero;
    
    private String identificacaoEtiqueta;

    private String cor;
        
    private List<Revista> listaRevistas;

    public Caixa(int numero, String identificacaoEtiqueta, String cor) {
        this.numero = numero;
        this.identificacaoEtiqueta = identificacaoEtiqueta;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Caixa "+ cor + " etiqueta " + identificacaoEtiqueta + " nr. " + numero;
    }
    
    
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getIdentificacaoEtiqueta() {
        return identificacaoEtiqueta;
    }

    public void setIdentificacaoEtiqueta(String identificacaoEtiqueta) {
        this.identificacaoEtiqueta = identificacaoEtiqueta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public List<Revista> getListaRevistas() {
        return listaRevistas;
    }

    public void setListaRevistas(List<Revista> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }
    
    
}
