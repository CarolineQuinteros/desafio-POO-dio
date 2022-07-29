import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class MAIN {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria("8")

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo();("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCaroline = new Dev();
        devCaroline.setNome("Caroline");
        devCaroline.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Caroline:" + devCaroline.getConteudosInscritos());
        devCaroline.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Caroline:" = devCaroline.getConteudosConcluido());
        System.out.println("XP:" = devCaroline.calcularTotalXp());

        System.out.println("---");

        Dev devHeitor = new Dev();
        devHeitor.setNome("Heitor");
        devHeitor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Heitor:" + devHeitor.getConteudosInscritos());
        devHeitor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Conclu[idos Heitor:" = devHeitor.getConteudosConcluido());
        System.out.println("XP:" = devHeitor.calcularTotalXp());





    }
}
