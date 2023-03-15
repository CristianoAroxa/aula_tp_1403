
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dsm-2
 */
public class Categoria_cliente {
    private String nome;
    private double numeroConta;
    private double saldoMedio;
    
    public Categoria_cliente(){
        this(",",0.0,0.0);
    }

    public Categoria_cliente(String nome, double numeroConta, double saldoMedio) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldoMedio = saldoMedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }
    public void verificarSaldo(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do cliente: ");
        setNome(scan.next());
        System.out.println("Digite o número da conta do cliente: ");
        setNumeroConta(scan.nextDouble());
        System.out.println("Digite o saldo médio do cliente: ");
        setSaldoMedio(scan.nextDouble());
        
        if(getSaldoMedio() < 1000){
            System.out.println("Cliente Bronze");
        }
        else if((getSaldoMedio() > 1000)&& getSaldoMedio() <2500){
            System.out.println("Cliente Silver");
        }
        else{
            System.out.println("Cliente Gold");
        }
    }
    
    public String mostrarDadosCliente(){
        return("O(a) cliente: "+getNome()+"\nConta número: "+getNumeroConta()+"\nPossui saldo médio: "+getSaldoMedio());
    }
}
