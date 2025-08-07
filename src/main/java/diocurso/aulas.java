package diocurso;



public class aulas {
    String titulo;
    String descricao;
    int cargahoraria;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

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