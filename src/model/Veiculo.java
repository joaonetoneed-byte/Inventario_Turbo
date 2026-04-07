
package model;


public class Veiculo {
 private int id;
 private String modelo;
 private String placa;
 private String marca;
 private String cliente;
 private int ano;
 
 public Veiculo(String marca, String modelo,String placa,String cliente, int ano){
     this.marca = marca;
     this.modelo = modelo;
     this.placa = placa;
     this.ano = ano;
     this.cliente = cliente;
 }
 
 public String getCliente() {
    return cliente;
}

public void setCliente(String cliente) {
    this.cliente = cliente;
}
 public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

 public String getModelo(){
     return modelo;
 }
 
 public String getPlaca (){
     return placa;
 }
 public String getMarca(){
     return marca;
 }
 public void setMarca(String marca){
     this.marca = marca;
 }
}
