package diocurso;
import java.time.LocalDate;
public class curso {
    public static void main(String[] args) {
    mentoria mentoria1 = new mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aprendendo orientação a objetos");
        mentoria1.setData(LocalDate.of(2025, 8, 10));

        System.out.println("Título: " + mentoria1.getTitulo());
        System.out.println("Descrição: " + mentoria1.getDescricao());
        System.out.println("Data: " + mentoria1.getData());

    }

}

