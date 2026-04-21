package es.gimbernat;
import java.util.ArrayList;
import java.util.List;

public class Partido {
    private String equipoLocal;
    private String equipoVisitante;
    private int golesLocal = 0;
    private int golesVisitante = 0;

    private List<Observador> observadores = new ArrayList<>();

    public Partido(String local, String visitante) {
        this.equipoLocal = local;
        this.equipoVisitante = visitante;
    }

    public void suscribir(Observador o) {
        observadores.add(o);
    }

    public void desuscribir(Observador o) {
        observadores.remove(o);
    }

    private void notificar(String mensaje) {
        for (Observador o : observadores) {
            o.actualizar(mensaje);
        }
    }


    public void iniciarPartido() {
        notificar("Empieza el partido " + equipoLocal + " - " + equipoVisitante);
    }

    public void descanso() {
        notificar("Descanso. Marcador: " + golesLocal + "-" + golesVisitante);
    }

    public void segundaParte() {
        notificar("Empieza la segunda parte");
    }

    public void finalPartido() {
        notificar("Final del partido. Marcador: " + golesLocal + "-" + golesVisitante);
    }

    public void golLocal() {
        golesLocal++;
        notificar("Gol de " + equipoLocal + ". Marcador: " + golesLocal + "-" + golesVisitante);
    }

    public void golVisitante() {
        golesVisitante++;
        notificar("Gol de " + equipoVisitante + ". Marcador: " + golesLocal + "-" + golesVisitante);
    }
}