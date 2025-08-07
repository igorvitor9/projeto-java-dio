package diocurso;



public class aulas extends conteudo{

    int cargahoraria;

    @Override
    public double calcularxp() {
        return XP_PRADRAO * cargahoraria;
    }


    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }



    public int getCargahoraria() {
        return cargahoraria;
    }

    @Override
    public String toString() {
        return "aulas{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }


}