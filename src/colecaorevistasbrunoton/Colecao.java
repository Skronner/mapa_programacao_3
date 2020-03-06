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
public class Colecao {
    
    private String nome;
 
    private List<Revista> listaRevistas;

    public Colecao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Colecao{" + nome + '}';
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Revista> getListaRevistas() {
        return listaRevistas;
    }

    public void setListaRevistas(List<Revista> listaRevistas) {
        this.listaRevistas = listaRevistas;
    }
    
    
}
