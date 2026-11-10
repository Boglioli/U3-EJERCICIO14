public class Piloto {
    private String licencia;
    private String nombre;
    private double horas;

    public Piloto(String licencia, String nombre) {
        this.licencia = licencia;
        this.nombre = nombre;
        this.horas = 0;
    }

    public void registrarVuelo(double cantidad) {
        if (cantidad > 0) {
            horas += cantidad;
            System.out.println("vuelo registrado");
        } else {
            System.out.println("cantidad de horas invalida");
        }
    }

    public double getHoras() {
        return horas;
    }
}

