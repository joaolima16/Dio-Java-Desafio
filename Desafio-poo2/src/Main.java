import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dominio.Conteudo;
import dominio.Curso;
import dominio.Mentoria;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("PRogramação em java");
        curso1.setCargaHoraria(8);
        

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Programação em JS");
        curso2.setCargaHoraria(15);



        Conteudo  conteudo = new Curso();
        Conteudo  conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em JS");
        mentoria.setDescricao("Teste em JS");
        mentoria.setData(LocalDate.now());

        
    }
}