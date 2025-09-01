package exercicio01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("E", 5.75, 15));
        lista.add(new Candidato("A", 9.5, 3));
        lista.add(new Candidato("C", 9.5, 10));

        Comparator<Candidato> cmp =
                Comparator.comparing(Candidato::getNotaTecnica)
                .thenComparing(Candidato::getAnosExperiencia).reversed()
                .thenComparing(Candidato::getNome);

        lista.sort(cmp);
        AtomicInteger cont = new AtomicInteger(0
        );
        lista.forEach(candidato -> {
            System.out.println(cont.incrementAndGet() + "° | " +candidato);
        });
    }
}
