package diocurso;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate datainicial = LocalDate.now();
    private final LocalDate datafinal = datainicial.plusDays(45);

    private Set<dev> devsinscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDatainicial() {
        return datainicial;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<dev> getDevsinscritos() {
        return devsinscritos;
    }

    public void setDevsinscritos(Set<dev> devsinscritos) {
        this.devsinscritos = devsinscritos;
    }

    public Set<conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<conteudo> conteudos) {
        this.conteudos = conteudos;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(datainicial, bootcamp.datainicial) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(devsinscritos, bootcamp.devsinscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, datainicial, datafinal, devsinscritos, conteudos);
    }
}
