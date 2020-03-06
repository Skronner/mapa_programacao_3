/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaorevistasbrunoton;

import java.time.LocalDate;

/**
 *
 * @author Bruno
 */
public class Emprestimo {
    
    private Amigo amigo;
    
    private Revista revista;
    
    private String dataEmprestimo;
    
    private String dataDevolucao;
    
    

    public Emprestimo(Amigo amigo, Revista revista, String dataEmprestimo, String dataDevolucao) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.amigo = amigo;
        this.revista = revista;
    }

    @Override
    public String toString() {
        return "Emprestimo{"+ amigo + "," + revista + " dataEmprestimo=" + dataEmprestimo + ", dataDevolucao=" + dataDevolucao + '}';
    }

    
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Amigo getAmigo() {
        return amigo;
    }

    public void setAmigo(Amigo amigo) {
        this.amigo = amigo;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    
    
    
}
