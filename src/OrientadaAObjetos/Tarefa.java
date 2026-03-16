package OrientadaAObjetos;

import java.time.LocalDateTime;

public class Tarefa {


    //Constantes
    private String descricao;
    private LocalDateTime dataCriacao;
    private String estado;

    //Construtor

    public Tarefa(String descricao){
        setDescricao(descricao);
        this.dataCriacao = LocalDateTime.now();
        this.estado = "Pendente";

    }

    public String getDescricao(){
        return descricao;
    }

    public LocalDateTime getDataCriacao(){
        return dataCriacao;
    }
    public String getEstado(){
        return  estado;
    }

    public void setDescricao(String descricao){
        this.descricao= descricao;

    }



    public void setDataCriacao(LocalDateTime dataCriacao){

    }



    public void setEstado(String estado){
        this.estado = estado;
    }

    public void marcarConcluida(){
        this.estado="Concluída";

    }

    public String toString(){
       return ("A tarefa " + getDescricao() + " Foi " + getEstado() +  " e criada em " + getDataCriacao());


    }



}
