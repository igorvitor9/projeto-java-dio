package diocurso;


import java.time.LocalDate;
public class curso {
    public static void main(String[] args) {

    aulas aula1   = new aulas();
        aula1.setTitulo("Aula de java orientado a objetos");
        aula1.setDescricao("Nesta aula voce sera capaz de criar classes");
        aula1.setCargahoraria(8);

    aulas aula2 = new aulas();
        aula2.setTitulo("Aula de Java avançada");
        aula2.setDescricao("Nesta aula você aprenderá recursos avançados de OOP");
        aula2.setCargahoraria(10);


        mentoria mentoria1 = new mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Aprendendo orientação a objetos");
        mentoria1.setData(LocalDate.of(2025, 8, 10));


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("descriçao");
        bootcamp.getConteudos().add(aula1);
        bootcamp.getConteudos().add(aula2);
        bootcamp.getConteudos().add(mentoria1);



        dev devmaria = new dev();
        devmaria.setNome("maria");
        devmaria.inscreverbootcamp(bootcamp);
        System.out.println("conteudo inscrito" + devmaria.getConteudosinscritos());

        devmaria.progredir();

        System.out.println("conteudo concluidos" + devmaria.getConteudosconcluidos());
        System.out.println("XP: " + devmaria.calculartotalxp());

        System.out.println("---------");

        dev devjoao = new dev();
        devjoao.setNome("joao");
        devjoao.inscreverbootcamp(bootcamp);
        System.out.println("conteudo inscrito" + devjoao.getConteudosinscritos());

        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();
        System.out.println("conteudo concluidos" + devmaria.getConteudosconcluidos());
        System.out.println("XP: " + devjoao.calculartotalxp());


        /*System.out.println("Título: " + aula1.getTitulo());
        System.out.println("Descrição: " + aula1.getDescricao());
        System.out.println("Carga horária: " + aula1.getCargahoraria());

        System.out.println("Título: " + mentoria1.getTitulo());
        System.out.println("Descrição: " + mentoria1.getDescricao());
        System.out.println("Data: " + mentoria1.getData());*/





    }

}

