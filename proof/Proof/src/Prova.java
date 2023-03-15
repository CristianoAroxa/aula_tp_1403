
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
public class Prova {
    private String nome;
    private double pontos;
    private String nivel;
    
    public Prova(){
        this("",0.0,"");
    }

    public Prova(String nome, double pontos, String nivel) {
        this.nome = nome;
        this.pontos = pontos;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public void nivelProva(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        setNome(scan.next());
        System.out.println("Digite a quantidade de pontos obtidos pelo aluno");
        setPontos(scan.nextDouble());
        
        if(getPontos()<=100){
            setNivel("Nível 1");
        }
        else if((getPontos() > 100) && getPontos()< 200){
           setNivel("Nível 2");          
        }
         else if(getPontos()>= 200){
            setNivel("Nível 3");
        } 
         else{
             System.out.println("Valor inválido!!!");
        }
    }
    
    public String listarResultados(){
       return("O aluno: "+getNome()+" obete a pontuação: "+getPontos()+"\nEle está no "+getNivel());
    }
}
