
package model;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return nome;
    }
    public String getTelefone (){
        return telefone;
    }
}
