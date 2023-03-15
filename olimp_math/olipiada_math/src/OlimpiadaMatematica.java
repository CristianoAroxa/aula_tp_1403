
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
public class OlimpiadaMatematica {
    private String nome;
    private String endereco;
    private double media;
    private double notaMenor;
    private double notaMaior;
    
    public OlimpiadaMatematica(){
        this("","",0.0,0.0,0.0);
    }

    public OlimpiadaMatematica(String nome, String endereco, double media, double notaMenor, double notaMaior) {
        this.nome = nome;
        this.endereco = endereco;
        this.media = media;
        this.notaMenor = notaMenor;
        this.notaMaior = notaMaior;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public double getNotaMenor() {
        return notaMenor;
    }

    public void setNotaMenor(double notaMenor) {
        this.notaMenor = notaMenor;
    }

    public double getNotaMaior() {
        return notaMaior;
    }

    public void setNotaMaior(double notaMaior) {
        this.notaMaior = notaMaior;
    }
    
    public void calcularMedia(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setNome(scan.next());
        System.out.println("Digite o endereço do aluno: ");
        setEndereco(scan.next());
        System.out.println("Digite a nota menor do aluno: ");
        setNotaMenor(scan.nextDouble());
        System.out.println("Digite a maior nota do aluno: ");
        setNotaMaior(scan.nextDouble());
        media = (notaMenor + notaMaior)/2;
        
        if(getMedia()>9){
            System.out.println("Aluno inscrito: ");
        }
        else{
            System.out.println("Média Insuficiente! ");
        }          
        
    }
    
    public String verificarMedia(){
        return("O aluno(a): "+getNome()+"\nObteve média: "+getMedia());
    }
    
    
}
