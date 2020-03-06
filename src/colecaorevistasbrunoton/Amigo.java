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
public class Amigo {
    
    private String nome;
    
    private String telefone;
    
    private String localAmigo;    
    
    private List<Emprestimo> listaEmprestimos;

        public Amigo(String nome, String telefone, String localAmigo) {
        this.nome = nome;
        this.telefone = telefone;
        this.localAmigo = localAmigo;
    }

    @Override
    public String toString() {
        return nome + ", tel. " + telefone + ", " + localAmigo + '}';
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getLocalAmigo() {
        return localAmigo;
    }

    public void setLocalAmigo(String localAmigo) {
        this.localAmigo = localAmigo;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }


    
}
