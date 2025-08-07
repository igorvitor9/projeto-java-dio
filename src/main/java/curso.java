package diocurso;


import java.time.LocalDate;
public class curso {
    public static void main(String[] args) {

    aulas aula1 = new aulas();

        aula1.setTitulo("Aula de java orientado a objetos");
        aula1.setDescricao("Nesta aula voce sera capaz de criar classes");
        aula1.setCargahoraria(8);



        mentoria mentoria1 = new mentoria();

        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aprendendo orientação a objetos");
        mentoria1.setData(LocalDate.of(2025, 8, 10));


        System.out.println("Título: " + aula1.getTitulo());
        System.out.println("Descrição: " + aula1.getDescricao());
        System.out.println("Carga horária: " + aula1.getCargahoraria());

        System.out.println("Título: " + mentoria1.getTitulo());
        System.out.println("Descrição: " + mentoria1.getDescricao());
        System.out.println("Data: " + mentoria1.getData());

    }

}

