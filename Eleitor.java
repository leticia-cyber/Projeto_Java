import java.util.*;

public class Eleitor{
    private String nome;
    private String cpf;
    private String votoPrefeito;
    private String votoGovernador;
    private String votoPresidente;


    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getcpf() {
        return cpf;
    }
    public void setcpf (String cpf){
        this.cpf = cpf;
    }
    public String getvotoPrefeito() {
        return votoPrefeito;
    }
    public void setvotoPrefeito (String votoPrefeito){
        this.votoPrefeito = votoPrefeito;
    }
    public String getvotoGovernador() {
        return votoGovernador;
    }
    public void setvotoGovernador (String votoGovernador){
        this.votoGovernador = votoGovernador;
    }
    public String getvotoPresidente() {
        return votoPresidente;
    }
    public void setvotoPresidente (String votoPresidente){
        this.votoPresidente = votoPresidente;
    }
    public Eleitor(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

}