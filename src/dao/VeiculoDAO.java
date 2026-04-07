package dao;

import model.Veiculo;
import java.sql.Connection; 
import java.sql.PreparedStatement; 

public class VeiculoDAO {
    
    private Connection conn;

    public VeiculoDAO() {
      
        this.conn = new Conexao().getConexao();
    }

    public void cadastrar(Veiculo veiculo) {
        String sql = "INSERT INTO veiculo_cliente (modelo, marca, placa, ano) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, veiculo.getModelo());
            stmt.setString(2, veiculo.getMarca());
            stmt.setString(3, veiculo.getPlaca());
            stmt.setInt(4, veiculo.getAno()); 
            
            stmt.execute();
        } catch (Exception e) {
            System.out.println("Erro ao salvar no banco: " + e.getMessage());
        }
    }
}