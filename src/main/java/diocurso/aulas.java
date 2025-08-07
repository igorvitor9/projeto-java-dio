package diocurso;


public class aulas {
    String titulo;
    String descricao;
    int cargahoraria;

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    @Override
    public String toString() {
        return "aulas{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}