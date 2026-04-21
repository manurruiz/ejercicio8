package es.gimbernat;
public class Main {
    public static void main(String[] args) {

        Partido partido = new Partido("R.Betis", "Sevilla");

        Suscriptor s1 = new Suscriptor("Manu");
        Suscriptor s2 = new Suscriptor("Luis");
        Suscriptor s3 = new Suscriptor("Paco");

        AppEstadisticas stats = new AppEstadisticas();

        partido.suscribir(s1);
        partido.suscribir(s2);
        partido.suscribir(stats);

        partido.iniciarPartido();
        partido.golLocal();

        partido.suscribir(s3);

        partido.golVisitante();
        partido.descanso();


        partido.desuscribir(s2);

        partido.segundaParte();
        partido.golLocal();

        partido.desuscribir(s1);

        partido.finalPartido();
    }
}