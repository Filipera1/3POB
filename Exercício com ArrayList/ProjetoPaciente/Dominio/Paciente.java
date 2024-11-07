package ProjetoPaciente.Dominio;
import java.text.DecimalFormat; 

public class Paciente {
    private int numero;
    private double peso;
    private double altura;

    public Paciente(int numero, double peso, double altura) {
        this.numero = numero;
        this.peso = peso;
        this.altura = altura;
    }

    DecimalFormat decimal = new DecimalFormat("0.00");

    // - GETTERS - //
    public double getAltura() {
        return altura;
    }

    public int getNumero() {
        return numero;
    }

    public double getPeso() {
        return peso;
    }

    // - SETTERS - //
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // - Método de Listar Pacientes - //
    public void listarPacientes() {
        System.out.println("Número: " + decimal.format(numero) + "Altura: " + decimal.format(altura) + "Peso: " + decimal.format(peso));
    }
}
