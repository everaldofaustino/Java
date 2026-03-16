package OrientadaAObjetos;

public class Musica {

    //- Classe **`Música`**
    //
    //    Represente  uma **`Música`.** A classe deve ter atributos como **título**, **artista** e **gênero**.
    //    Os métodos dessa classe serão, no mínimo, **reproduzir, pausar** e **exibir descrição.**

    private String titulo;
    private String artista;
    private String genero;
    private boolean estaTocando;

    Musica(String titulo, String artista, String genero){

        if(titulo == null || titulo.trim().isEmpty()){
            System.out.println("Título inválido!");
            return;

        }

        if(artista==null || artista.trim().isEmpty()){
            System.out.println("Artista inválido!");
            return;
        }

        if(genero == null || genero.trim().isEmpty()){
            System.out.println("Gênero inválido!");
        }
        this.titulo = titulo;
        this.artista = artista;
        this.genero = genero;


    }

    //Getters

    public String getTitulo(){
        return titulo;
    }

    public String getArtista(){
        return artista;
    }

    public String getGenero(){
        return genero;
    }

    public void reproduzir(){
        if(estaTocando){
            System.out.println("▶️ A música '" + titulo + "' já está tocando!");
        }else{
            estaTocando = true;
            System.out.println("▶️ Reproduzindo: " + titulo + " - " + artista);
        }


    }

    public void pausa(){
        if(!estaTocando){
            System.out.println("A música já está pausada!");
            }
        else{
            estaTocando = false;
            System.out.println("Mpusica pausada: " + titulo);
        }


    }

    public void exibirDescricao(){
        System.out.println("======DESCRIÇÃO======");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Gênero: " + genero);
    }
}
