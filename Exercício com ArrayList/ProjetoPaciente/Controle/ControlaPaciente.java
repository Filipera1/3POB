package ProjetoPaciente.Controle;
import ProjetoPaciente.Dominio.Paciente;
import java.util.ArrayList;
import java.util.Scanner;

public class ControlaPaciente {
    private ArrayList<Paciente> pacientes;
    
    public ControlaPaciente() {
        this.pacientes = new ArrayList<>();
    }

    public void adicionarPaciente(int numero, double altura, double peso) {
        Paciente paciente = new Paciente(numero, altura, peso);
        pacientes.add(paciente);
        System.out.println("\n Paciente adicionado com sucesso!");
    }

    public void listarPacientes() {

        if(pacientes.isEmpty())
        {
            System.out.println("\n Nenhum paciente cadastrado!");
        }
        else
        {
            for(Paciente paciente: pacientes)
            {
                System.out.println("--------------------------");
                paciente.listarPacientes();
                System.out.println("--------------------------");
            }
        }
    }

    public void alterarPaciente(int numero) {
        Paciente paciente = buscarPacientePorNumero(numero);

        if (paciente != null) 
        {
            Scanner leia = new Scanner(System.in);
            System.out.print("Nova altura: ");
            double novaAltura = leia.nextDouble();
            System.out.print("Novo peso: ");
            double novoPeso= leia.nextDouble();
            
            paciente.setAltura(novaAltura);
            paciente.setPeso(novoPeso);
            System.out.println("Paciente alterado com sucesso!");
        } 
        else 
        {
            System.out.println("Paciente com número " + numero + " não encontrado.");
        }
       
    }

    public void excluirPaciente(int numero) {

        Paciente paciente = buscarPacientePorNumero(numero);

        if (paciente != null) 
        {
            pacientes.remove(paciente);
            System.out.println("Paciente excluído com sucesso!");
        } 
        else 
        {
            System.out.println("Paciente com número " + numero + " não encontrado.");
        }
    }

    private Paciente buscarPacientePorNumero(int numero) {
        for (Paciente paciente : pacientes) 
        {
            if (paciente.getNumero() == numero) 
            {
                return paciente;
            }
        }
        return null;
    }

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
    public static void main(String[] args)
    {
        ControlaPaciente controle = new ControlaPaciente();

        Scanner leia = new Scanner(System.in);
        int opcao;

        do
        {
            System.out.flush();
            clearScreen();
            System.out.println("\n\t--- MENU ---\n");
            System.out.println("Opção 1: Adicionar paciente");
            System.out.println("Opção 2: Listar pacientes");
            System.out.println("Opção 3: Alterar paciente");
            System.out.println("Opção 4: Excluir paciente");
            System.out.println("Opção 5: Sair\n");
        
            System.out.print("Opção desejada: ");
            opcao = leia.nextInt();

            switch (opcao) 
            {
                case 1:
                    clearScreen();
                    System.out.println("\n\t--- ADICIONAR PACIENTE ---\n");
                    System.out.print("Entre com o numero do paciente: ");
                    int numero = leia.nextInt();
                    System.out.print("Entre com a altura do paciente: ");
                    leia.skip("\n");
                    double altura = leia.nextDouble();
                    System.out.print("Entre com o peso do paciente: ");
                    double peso = leia.nextDouble();
                    controle.adicionarPaciente(numero, altura, peso);
                    break;

                case 2:
                    clearScreen();
                    System.out.println("\n\t--- LISTA DE PACIENTES ---\n");
                    controle.listarPacientes();        
                    break;

                case 3:
                    System.out.print("Número do paciente a alterar: ");
                    int numeroAlterar = leia.nextInt();
                    leia.nextLine(); // Limpa o buffer
                    controle.alterarPaciente(numeroAlterar);
                    break;

                case 4:
                    System.out.print("Número do paciente a excluir: ");
                    int numeroExcluir = leia.nextInt();
                    controle.excluirPaciente(numeroExcluir);
                    break;
            
                case 5:
                    System.out.println("\nEncerrado!");
                    break;

                default:
                    System.out.println("\nOpção inválida!");
                    break;
            }
   
            System.out.println("\nAperte qualquer tecla para continuar...");
            leia.skip("\n");
            leia.nextLine();
        } while(opcao!=5);
        
        leia.close();
    }
}