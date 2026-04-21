package es.gimbernat;
public class Main {
    public static void main(String[] args) {

        Partido partido = new Partido("R.Betis", "Sevilla");
        Partido partido2 = new Partido("At.Madrid", "Madrid");


        Suscriptor s1 = new Suscriptor("Manu");
        Suscriptor s2 = new Suscriptor("Luis");
        Suscriptor s3 = new Suscriptor("Paco");

        AppEstadisticas stats = new AppEstadisticas();

        partido.suscribir(s1);
        partido2.suscribir(s1);

        partido.suscribir(s2);
        partido2.suscribir(s3);

        partido.suscribir(stats);
        partido2.suscribir(stats);

        partido.iniciarPartido();
        partido2.iniciarPartido();
        partido.golLocal();
        partido2.golLocal();

        partido.suscribir(s3);
        partido2.suscribir(s2);

        partido.golVisitante();
        partido2.golVisitante();

        partido.descanso();
        partido2.descanso();

        partido.desuscribir(s2);
        partido2.desuscribir(s2);

        partido.segundaParte();
        partido2.segundaParte();
        partido.golLocal();
        partido2.golLocal();

        partido.desuscribir(s1);
        partido2.desuscribir(s1);
        partido.finalPartido();
        partido2.finalPartido();
    }
}