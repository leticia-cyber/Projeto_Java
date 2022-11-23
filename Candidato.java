import java.util.*;

public class Candidato{
    private String nome;
    private String nro;
    private String partido;
    private String cargo;
    private int nroVotos = 0;


    public String getnome (){
        return this.nome;
    }
    public void setnome(String nome){
        this.nome;
    }
    public String getnro(){
        return nro;
    }
    public void setnro(String nro){
        this.nro = nro;
    }
    public String getpartido (){
        return partido;
    }
    public void setpartido(String partido){
        this.partido = partido;
    }
    public String getcargo(){
        return cargo;
    }
    public void setcargo(String cargo){
        this.cargo = cargo;
    }
    public int getnroVotos(){
        return nroVotos;
    }
    public void interanroVotos(){
        this.nroVotos ++;
    }

    public Candidato(String nome, String nro, String partido, String cargo){
        this.nome = nome;
        this.nro = nro;
        this.partido = partido;
        this.cargo = cargo;
    }
    
}