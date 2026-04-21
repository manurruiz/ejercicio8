package es.gimbernat;

import java.util.ArrayList;
import java.util.List;

public class Suscriptor implements Observador {
    private String nombre;
    private List<Partido> partidos = new ArrayList<>();


    public Suscriptor(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibe que : " + mensaje);

    }
    public void seguirPartido(Partido p) {
        partidos.add(p);
        p.suscribir(this);
    }
}