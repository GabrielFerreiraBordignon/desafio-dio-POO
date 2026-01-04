import desafio.dominio.Curso;
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
}
