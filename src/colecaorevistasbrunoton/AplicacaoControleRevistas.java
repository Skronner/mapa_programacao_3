/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecaorevistasbrunoton;

import static java.lang.System.in;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */
public class AplicacaoControleRevistas {

    
    static Scanner in = new Scanner(System.in);
        static List<Amigo> amigos = new ArrayList<>();
        static List<Revista> revistas = new ArrayList<>();
        static List<Caixa> caixas = new ArrayList<>();
        static List<Colecao> colecoes = new ArrayList<>();
        static List<Emprestimo> emprestimos = new ArrayList<>();              
        
        static Amigo amigo;
        static Revista revista;
        static Caixa caixa;
        static Colecao colecao;
        static Emprestimo emprestimo;
                        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*pré-carga nos itens para teste e exmplo*/
        cargaTeste();       
        
        int opcao = 999;
                
        while (opcao !=0 ) {
            menuGeral();
            opcao = in.nextInt();
            in.nextLine();
            switch (opcao){
                case 1:                                                 
                    cadastrarAmigo();                    
                    break;
                case 2:                     
                    listar(amigos, "Amigos");
                    break;                    
                case 3:                    
                    excluir(amigos);
                    break;
                case 4:                    
                    cadastrarRevista();                    
                    break;
                case 5:                    
                    listar(revistas, "Revistas");
                    break;
                case 6: 
                    excluir(revistas);
                    break;
                case 7:
                    cadastrarCaixa();
                    break;                    
                case 8:                    
                    listar(caixas, "Caixas");
                    break;
                case 9:
                    excluir(caixas);
                    break;
                case 10:
                    cadastrarColecao();
                    break;
                case 11:                     
                    listar(colecoes, "Coleções");
                    break;
                case 12:                  
                    excluir(colecoes);
                    break;                    
                case 13:
                    cadastrarEmprestimos();
                    break;
                case 14:                    
                    listar(emprestimos, "Empréstimos");
                    break;
                case 15:
                    excluir(emprestimos);
                    break;                        
                case 0:
                    encerrar();
                    break;
                default:                       
                    System.out.println("\nSelecionada opção " + opcao + ".");
                    System.out.println("\nEssa é uma opção inválida.");
                    System.out.println("\n\n");
                    opcao = 999;                        
            }
        }    
    }
    
    private static void menuGeral(){                
        System.out.println("-----Menu Geral-----");
        System.out.println("1) Cadastrar Amigos.");        
        System.out.println("2) Listar Amigos."); 
        System.out.println("3) Excluir Amigos.");
        System.out.println("4) Cadastrar Revistas.");        
        System.out.println("5) Listar Revistas.");
        System.out.println("6) Excluir Revistas.");
        System.out.println("7) Cadastrar Caixas.");        
        System.out.println("8) Listar Caixas.");
        System.out.println("9) Excluir Caixas.");
        System.out.println("10) Cadastrar Coleções.");        
        System.out.println("11) Listar Coleções.");
        System.out.println("12) Excluir Coleções.");
        System.out.println("13) Cadastrar Empréstimos.");        
        System.out.println("14) Listar Empréstimos.");
        System.out.println("15) Excluir Empréstimos.");
        System.out.println("0) Sair.");        
        System.out.println("Digite uma opção numérica do seguinte menu e tecle Enter:");
            }
    
        
    
    private static void listar( List<?> lista, String tipo){
        System.out.println("-----Listar "+ tipo  +"-----");
        if (lista.size()>0){
            for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+") " + lista.get(i).toString() + ".");
        }
        }else{
            System.out.println("Não há elementos para listar.");            
        };
        System.out.println("-----Fim da Lista-----\n");                            
    }
    
    private static void encerrar(){        
        System.exit(0);
    }

    private static void excluir(List<?> lista){
        System.out.println("-----Excluir elementos-----");                    
        listar(lista, "Elementos");
        if (lista.size() > 0){            
            System.out.print("Selecione o elemento a ser removido:");
            int elemento = in.nextInt();
            in.nextLine();
            while (elemento < 0 || elemento >= lista.size()) {
                System.out.println("Elemento inválido.");                
                listar(lista, "Elementos");
                System.out.print("\nSelecione o elemento a ser removido:");
                elemento = in.nextInt();
                in.nextLine();
            }
            if (elemento >= 0 && elemento < lista.size()) {                
                System.out.println("Excluir " + lista.get(elemento).toString());
                lista.remove(elemento);                
                System.out.println("-----Elemento removido com sucesso-----\n");
            }
            
        }else{
            System.out.println("Não há elementos para excluir.\n");
        }
    };

        private static void cadastrarAmigo() {        
        System.out.println("\n-----Cadastrar Amigo-----");
        
        System.out.print("Nome do amigo:");
        String nome  = in.nextLine();
                
        System.out.print("Telefone:");
        String telefone = in.nextLine();        
        
        System.out.print("Local do amigo:");
        String local  = in.nextLine();                  
        
        amigo = new Amigo(nome,telefone,local);
        amigos.add(amigo);                    
        
        System.out.println("-----Amigo cadastrado com sucesso!-----\n");                    
        //System.out.println(amigo.toString() + "\n");    
        listar(amigos, "Amigos");
    }
    
    private static void cadastrarRevista() {
        System.out.println("\n-----Cadastrar Revista-----");
        if ( colecoes.size() > 0 ){
            if( caixas.size() > 0 ){
            listar(colecoes, "Coleções");
            System.out.print("Selecione a Coleção da Revista:");
            int colecaoIndex = in.nextInt();   
            in.nextLine();
            while ( colecaoIndex < 0 || colecaoIndex >= colecoes.size() ) {
                listar(colecoes, "Coleções");
                System.out.print("Selecione a Coleção da Revista:");
                colecaoIndex = in.nextInt();  
                in.nextLine();
            }
        colecao = colecoes.get(colecaoIndex);
        System.out.println(colecao.getNome());
        
        System.out.print("Ano:");
        int ano  = in.nextInt();   
        in.nextLine();
                    
        System.out.print("Número da Edição:");
        int numero = in.nextInt();    
        in.nextLine();
        
        
        listar(caixas,"Caixas");
        System.out.print("Selecione a Caixa em que Revista Está");
        int caixaIndex = in.nextInt();    
        in.nextLine();
            while ( caixaIndex < 0 || caixaIndex >= caixas.size() ) {
                listar(caixas, "Caixas");
                System.out.print("Selecione a Caixa da Revista:");
                caixaIndex = in.nextInt();           
                in.nextLine();
            }
        caixa = caixas.get(caixaIndex);
        System.out.println(caixa.toString());                
        revista  = new Revista(colecao, ano, numero,caixa);
        revistas.add(revista);                    
        
        System.out.println("-----Revista cadastrada com sucesso!-----\n");                    
        //System.out.println(revista.toString() + "\n");  
        listar(revistas, "Revistas");
                
            }else{
                //System.out.println("Não há caixas cadastradas para armazenar revistas.");            
                System.out.println("Cadastre uma Caixa antes de cadastrar uma revista.");            
                cadastrarCaixa();
                cadastrarRevista();
                return;
            }
        }else {
            //System.out.println("Não há coleções para cadastrar revistas.");            
            System.out.println("Cadastre uma Coleção antes de cadastrar uma revista.");            
            cadastrarColecao();
            cadastrarRevista();
            return;
        }
        return;
    }

    private static void cadastrarCaixa() {
        System.out.println("\n-----Cadastrar Caixa-----");
        
        System.out.print("Número da Caixa:");
        int numero  = in.nextInt();
        in.nextLine();
        
        System.out.print("Etiqueta da Caixa:");
        String etiqueta  = in.next();
        in.nextLine();
        
        System.out.print("Cor da Caixa:");
        String cor  = in.next();
        in.nextLine();
        
        caixa  = new Caixa(numero,etiqueta,cor);
        caixas.add(caixa);                    
        
        System.out.println("-----Caixa cadastrada com sucesso!-----\n");                    
        //System.out.println(caixa.toString() + "\n"); 
        listar(caixas,"Caixas");
    }

    private static void cadastrarColecao() {
        System.out.println("\n-----Cadastrar Coleção-----");
        
        System.out.print("Nome da coleção:");        
        String nome  = in.nextLine();
        //in.nextLine();
        
        colecao  = new Colecao(nome);
        colecoes.add(colecao);                    
        
        System.out.println("-----Coleção cadastrada com sucesso!-----\n");                    
        //System.out.println(colecao.toString() + "\n");    
        listar(colecoes, "Coleções");
    }

    private static void cadastrarEmprestimos() {
        System.out.println("\n-----Cadastrar Empréstimo-----");
        if ( revistas.size() > 0 ) {
            if( amigos.size() > 0 ) {                                                
                listar(amigos, "Amigos");
                System.out.print("\nSelecione o amigo que emprestará a revista:");                
                int amigoIndex = 999;
                while ( amigoIndex < 0 || amigoIndex >= amigos.size()) {
                    amigoIndex = in.nextInt();
                    in.nextLine();
                }
                Amigo amigoTemp = amigos.get(amigoIndex);
                
                System.out.print("\nSelecione a revista será emprestada:");                
                listar(revistas, "Revistas");
                int revistaIndex = 999;
                while ( revistaIndex < 0 || revistaIndex >= revistas.size()) {
                    revistaIndex = in.nextInt();
                    in.nextLine();
                }
                Revista revistaTemp = revistas.get(amigoIndex);
                
                System.out.print("\nInforme a data de empréstimo:");                
                String dataEmprestimo = in.next();
                in.nextLine();
                
                System.out.print("\nInforme a data de devolução:");                
                String dataDevolucao = in.next();
                in.nextLine();
                                               
                emprestimo = new Emprestimo(amigoTemp,revistaTemp,dataEmprestimo,dataDevolucao);
                emprestimos.add(emprestimo);
         
                System.out.println("-----Empréstimo cadastrado com sucesso!-----\n");                    
                //System.out.println(amigo.toString() + "\n");   
                listar(emprestimos,"Empréstimos");
                
            } else {
                //System.out.println("Não há amigos cadastrados à quem emprestar.");
                System.out.println("Cadastre um amigo para poder registrar a quem emprestou a revista.");
                cadastrarAmigo();
                cadastrarEmprestimos();
            }
        } else{
            //System.out.println("Não há revistas cadastradas para emprestar.");
            System.out.println("Cadastre uma revista para poder emprestar.");
            cadastrarRevista();
            cadastrarEmprestimos();
        }              
        
    }

    private static void cargaTeste() {
        amigos.add(new Amigo("Bruno Ton","41-3042-7070","Escola"));
        amigos.add(new Amigo("Eduardo Tomé","41-98407-6393","Trabalho"));
        amigos.add(new Amigo("Rosane Dutra","41-1234-9874","Padaria"));
        amigos.add(new Amigo("Manezinho"," não tem","Futebol"));
        amigos.add(new Amigo("Pedro Bó","41-9995-0074","Cunhado"));
        colecoes.add(new Colecao("Batman"));
        colecoes.add(new Colecao("Naruto"));
        colecoes.add(new Colecao("Sandman"));
        colecoes.add(new Colecao("Dragon Ball"));
        colecoes.add(new Colecao("Gundam"));
        colecoes.add(new Colecao("Dylan Dog"));
        caixas.add(new Caixa(1,"Heróis","Azul"));
        caixas.add(new Caixa(2,"Mangás","Amarela"));
        caixas.add(new Caixa(3,"Outras","Preta"));
        revistas.add(new Revista(colecoes.get(0),1998,15,caixas.get(0)));
        revistas.add(new Revista(colecoes.get(0),1998,16,caixas.get(0)));
        revistas.add(new Revista(colecoes.get(0),1998,17,caixas.get(0)));
        revistas.add(new Revista(colecoes.get(0),1998,18,caixas.get(0)));
        revistas.add(new Revista(colecoes.get(0),1998,19,caixas.get(0)));
        revistas.add(new Revista(colecoes.get(1),2003,1,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,2,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,3,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,4,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,7,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,8,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(1),2003,10,caixas.get(1)));
        revistas.add(new Revista(colecoes.get(4),1994,2,caixas.get(2)));
        emprestimos.add(new Emprestimo(amigos.get(0),revistas.get(0),"02/02/2020","05/04/2020"));
        emprestimos.add(new Emprestimo(amigos.get(1),revistas.get(1),"08/03/2020","01/05/2020"));
    }

}
