package inventarioturbo;

import java.util.ArrayList;
import java.util.Scanner;
import model.Cliente;
import model.Veiculo;

public class InventarioTurbo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Veiculo> listaVeiculos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n== SISTEMA INVENTARIO TURBO ==");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Cadastrar veículo"); 
            System.out.println("4 - Sair"); 
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Cadastro de cliente ===");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();

                    Cliente novoCliente = new Cliente(nome, telefone);
                    listaClientes.add(novoCliente);

                    System.out.println("Cliente cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n=== Clientes cadastrados ===");
                    if (listaClientes.isEmpty()) {
                        System.out.println("Nenhum cliente na lista.");
                    } else {
                        for (Cliente c : listaClientes) {
                            System.out.println("Nome: " + c.getNome() + " | Tel: " + c.getTelefone());
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n=== Cadastro de Veículo ===");
                    System.out.print("Marca: ");
                    String marca = sc.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();
                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    Veiculo novoVeiculo = new Veiculo("Marca", "Modelo", "Placa", "Cliente Teste", 2026);
                    listaVeiculos.add(novoVeiculo);

                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 4); 

        sc.close();
    }
}