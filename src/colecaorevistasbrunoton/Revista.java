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
public class Revista {
    
    private int numeroEdicao;
    
    private int ano;
    
    private Caixa caixa;
    
    private Colecao colecao;
    
    private List<Emprestimo> emprestimos;

    public Revista(Colecao colecao, int ano, int numeroEdicao, Caixa caixa ) {
        this.numeroEdicao = numeroEdicao;
        this.ano = ano;
        this.caixa = caixa;
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Revista{" 
            + colecao.getNome()
            + ", ano " + ano 
            + ", ed. " + numeroEdicao             
            + "," + caixa.toString()+ '}';
    }

    
    
    public int getNumeroEdicao() {
        return numeroEdicao;
    }

    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Caixa getCaixa() {
        return caixa;
    }

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public Colecao getColecao() {
        return colecao;
    }

    public void setColecao(Colecao colecao) {
        this.colecao = colecao;
    }
 
    
    
}
