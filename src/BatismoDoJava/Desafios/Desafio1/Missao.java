package BatismoDoJava.Desafios.Desafio1;

public class Missao {

    private String nome;
    private String nivel;
    private boolean status;

    public Missao(String nome,String nivel, boolean status){
        this.nome = nome;
        this.nivel = nivel;
        this.status = status;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNivel() {
        return nivel;
    }
    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

}
