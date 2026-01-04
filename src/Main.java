import desafio.dominio.Bootcamp;
import desafio.dominio.Curso;
import desafio.dominio.Dev;
import desafio.dominio.Mentoria;

void main() {
    Curso curso1 = new Curso();
    curso1.setDescricao("Curso java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setDescricao("Curso js");
    curso2.setDescricao("Descrição curso js");
    curso2.setCargaHoraria(8);

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria java");
    mentoria.setDescricao("Descricao mentoria java");
    mentoria.setData(LocalDate.now());

    System.out.println(curso1);
    System.out.println(curso2);
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Java developer");
    bootcamp.setDescricao("Descricção java");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos: " + devCamila.getConteudoInscritos());
    devCamila.progredir();
    System.out.println("Conteudos: " + devCamila.getConteudosConcluidos());



    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteudos: " + devJoao.getConteudoInscritos());
    devJoao.progredir();
    System.out.println("Conteudos: " + devJoao.getConteudosConcluidos());

}
