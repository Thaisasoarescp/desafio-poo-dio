import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoUm = new Curso();
        cursoUm.setTitulo("Curso Java");
        cursoUm.setDescricao("descrição curso Java");
        cursoUm.setCargaHoraria(8);
            System.out.println(cursoUm);

        Curso cursoDois = new Curso();
        cursoDois.setTitulo("Curso JS");
        cursoDois.setDescricao("descrição curso Javascript");
        cursoDois.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(cursoUm);
        System.out.println(cursoDois);
        System.out.println(mentoria);

    }
}
