import java.util.HashSet;
import java.util.Set;

public class Teste02 {
    public static void main(String[] args) {
        Set<Aluno> lista = new HashSet<>();
        lista.add(new Aluno(557123, "Ian", "ADM"));
        lista.add(new Aluno(567210, "Jonas", "ADS"));
        lista.add(new Aluno(589554, "Yuno", "SI"));
        lista.add(new Aluno(563555, "Arthur", "ENG"));
        lista.add(new Aluno(582367, "Renato", "ADS"));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}
