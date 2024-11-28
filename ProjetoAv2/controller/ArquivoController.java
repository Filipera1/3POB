package controller;

import model.*;

import java.io.*;
import java.util.ArrayList;

public class ArquivoController {
    private static final String caminhoArquivo = "funcionarios.txt";

    public ArrayList<Funcionario> carregarFuncionarios() {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) { // Esperamos 4 partes: ID, Tipo, Nome, Salário
                    int id = Integer.parseInt(partes[0]);
                    String tipo = partes[1];
                    String nome = partes[2];
                    double salario = Double.parseDouble(partes[3]);

                    Funcionario funcionario = criarFuncionario(tipo, nome, salario);
                    if (funcionario != null) {
                        funcionario.setId(id);
                        funcionarios.add(funcionario);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado. Iniciando com lista vazia.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return funcionarios;
    }

    public void salvarFuncionarios(ArrayList<Funcionario> funcionarios) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminhoArquivo))) {
            for (Funcionario funcionario : funcionarios) {
                String linha = funcionario.getId() + ";" + funcionario.getClass().getSimpleName() + ";" +
                               funcionario.getNome() + ";" + funcionario.getSalario();
                bw.write(linha);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar os funcionários: " + e.getMessage());
        }
    }

    private Funcionario criarFuncionario(String tipo, String nome, double salario) {
        return switch (tipo) {
            case "Desenvolvedor" -> new Desenvolvedor(nome, salario);
            case "Gerente" -> new Gerente(nome, salario);
            case "Treinador" -> new Treinador(nome, salario);
            case "GerenteDesenvolvedor" -> new GerenteDesenvolvedor(nome, salario);
            default -> null;
        };
    }
}
