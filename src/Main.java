import br.com.dio.desafio.dominio.*;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição do Curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescricao("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Jaca Developer");
        bootcamp.setDescricao("Descrição do Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devRafa = new Dev();
        devRafa.setNome("Rafael");
        devRafa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rafael" + devRafa.getConteudosInscritos());

        devRafa.progredir();
        devRafa.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rafael" + devRafa.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rafael" + devRafa.getConteudosConcluidos());
        System.out.println("XP " + devRafa.calcularTotalXp());

        System.out.println("---------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());

        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
        System.out.println("XP " + devJoao.calcularTotalXp());

    }
}