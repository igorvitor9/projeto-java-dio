package diocurso;

public abstract class conteudo {
    protected static double XP_PRADRAO = 100;

    private String titulo;
    private String descricao;

    public abstract double calcularxp();


    public String getTitulo(){
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
