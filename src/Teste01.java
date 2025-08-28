import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste01 {

    public static void main(String[] args) {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno(557123, "Ian", "ADM"));
        lista.add(new Aluno(567210, "Jonas", "ADS"));
        lista.add(new Aluno(589554, "Yuno", "SI"));
        lista.add(new Aluno(563555, "Arthur", "ENG"));
        lista.add(new Aluno(563555, "Arthur", "ENG"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

        lista.sort(Comparator.comparing(Aluno::getNome)
                .thenComparing(Aluno::getRm));
        System.out.println();

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }

}
