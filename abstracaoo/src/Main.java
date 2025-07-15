import abstracao.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp=new Bootcamp();
        Curso curso1=new Curso();
        curso1.setTitulo("CURSO 1");
        curso1.setCargaHoraria(7);
        curso1.setDescricao("Curso poo java top");
        Curso curso2=new Curso();
        curso2.setTitulo("CURSO 2");
        curso2.setCargaHoraria(5);
        curso2.setDescricao("Curso SPRINGBOOT");
        Mentoria mentoria=new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Ajudando pessoas com java");

        bootcamp.setNome("Bootcamp Java");
        bootcamp.setDescricao("Bootcamp com intuito de aprofundar o conhecimento em java e srpingBoot");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev luan =new Dev();
        luan.setNome("Luan");
        luan.incresverBootcamp(bootcamp);
        System.out.println(luan.calcularXpTotal());
        Dev manu=new Dev();
        manu.incresverBootcamp(bootcamp);
        System.out.println("Luan concluido:"+luan.getConteudosConcluidos());
        System.out.println("Manu concluido:"+manu.getConteudosConcluidos());
        luan.progredir();
        System.out.println("Luan concluido:"+luan.getConteudosConcluidos());
        System.out.println(luan.getConteudosIncritos());
        System.out.println(luan.calcularXpTotal());
    }
}
