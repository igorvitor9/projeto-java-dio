package diocurso;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class dev {
    private String nome;
    private Set<conteudo> conteudosinscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosconcluidos = new LinkedHashSet<>();

    public void inscreverbootcamp(Bootcamp botcamp){}

    public  void progredir(){}

    public void  calculartotalxp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudosinscritos() {
        return conteudosinscritos;
    }

    public void setConteudosinscritos(Set<conteudo> conteudosinscritos) {
        this.conteudosinscritos = conteudosinscritos;
    }

    public Set<conteudo> getConteudosconcluidos() {
        return conteudosconcluidos;
    }

    public void setConteudosconcluidos(Set<conteudo> conteudosconcluidos) {
        this.conteudosconcluidos = conteudosconcluidos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        dev dev = (dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosinscritos, dev.conteudosinscritos) && Objects.equals(conteudosconcluidos, dev.conteudosconcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosinscritos, conteudosconcluidos);
    }
}
