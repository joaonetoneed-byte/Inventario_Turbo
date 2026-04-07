
package model;


public class OrdemServico {
  private int id;
  private String descricao;
  private double valor;
  private String status;
  
 private Cliente cliente;
 private Veiculo veiculo;
  
  public OrdemServico(String descricao, double valor, Cliente cliente, Veiculo veiculo){
      this.id = id;
      this.descricao = descricao;
      this.valor = valor;
      this.cliente = cliente;
      this.veiculo = veiculo;
      this.status = "ABERTA";
  }
  public String getDescricao(){
      return descricao;
  }
  public double getValor(){
      return valor;
  }
  
  public String getStatus(){
      return status;
  }
  
  public Cliente getCliente(){
      return cliente;
  }
  public void setCliente(Cliente cliente){
      this.cliente = cliente;
  }
  public Veiculo getVeiculo(){
      return veiculo;
  }
  public void setVeiculo(Veiculo veiculo){
      this.veiculo = veiculo;
  }
  public int getId() {
        return id;
    }
  public void setId(int id) {
        this.id = id;
    }
  public void setStatus(String status) {
        this.status = status;
    }
  
}
