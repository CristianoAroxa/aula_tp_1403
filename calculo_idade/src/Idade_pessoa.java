
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
public class Idade_pessoa {
    private int anoAtual;
    private int idade;
    private int anoNasc;
    
    public Idade_pessoa(){
        this(0,0,0);    
}

    public Idade_pessoa(int anoAtual, int idade, int anoNasc) {
        this.anoAtual = anoAtual;
        this.idade = idade;
        this.anoNasc = anoNasc;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

   public void calcularIdade(){
       Scanner scan = new Scanner(System.in);
       System.out.println("Digite o ano de nascimento: ");
       setAnoNasc(scan.nextInt());
       System.out.println("Digite o ano atual: ");
       setAnoAtual(scan.nextInt());
       idade = anoAtual - anoNasc;
   }
   
   public String mostrarIdade(){
       System.out.println("Você tem " +getIdade()+ " anos!");
        return null;
   }
    
    
}
