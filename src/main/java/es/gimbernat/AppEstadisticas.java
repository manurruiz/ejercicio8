package es.gimbernat;

public class AppEstadisticas implements Observador {

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Nuevo evento registrado " + mensaje);
    }
}
