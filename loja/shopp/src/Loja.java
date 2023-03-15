
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
public class Loja {
    private String razaoSocial;
    private String cpfCliente;
    private double valorItem;
    private double qtdItensComp;
    private double valorTotalCompra;
    
    public Loja(){
        this("","",0.0,0.0,0.0);
    }

    public Loja(String razaoSocial, String cpfCliente, double valorItem, double qtdItensComp, double valorTotalCompra) {
        this.razaoSocial = razaoSocial;
        this.cpfCliente = cpfCliente;
        this.valorItem = valorItem;
        this.qtdItensComp = qtdItensComp;
        this.valorTotalCompra = valorTotalCompra;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setValorItem(double valorItem) {
        this.valorItem = valorItem;
    }

    public double getQtdItensComp() {
        return qtdItensComp;
    }

    public void setQtdItensComp(double qtdItensComp) {
        this.qtdItensComp = qtdItensComp;
    }

    public double getValorTotalCompra() {
        return valorTotalCompra;
    }

    public void setValorTotalCompra(double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }

     public void inserirDadosLoja(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite a razão social da loja: ");
       setRazaoSocial(scan.next());
       System.out.println("Digite o cpf  do cliente: ");
       setCpfCliente(scan.next());
       System.out.println("Digite o valor de cada item: ");
       setValorItem(scan.nextDouble());
       System.out.println("Digite a quantidade de itens comprados: ");
       setQtdItensComp(scan.nextDouble());
       valorTotalCompra = valorItem * qtdItensComp;
     }   
       
    public String mostrarDadosLoja(){
        return("A loja " +getRazaoSocial()+"\nCpf " +getCpfCliente()+ "\nComprou " +getQtdItensComp()+ "\nItens ao custo unitário de: R$ "+getValorItem()+  " \nE o valor total da compra foi: R$"+getValorTotalCompra());
    }
}
