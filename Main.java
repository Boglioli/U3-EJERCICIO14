public class Main {
    public static void main(String[] args) {
        Piloto p = new Piloto("2211" , "martin");
        p.registrarVuelo(4.5);
        p.registrarVuelo(1);
        p.registrarVuelo(-3.6);
        p.registrarVuelo(5);
        System.out.println("horas acumuladas: " + p.getHoras());
    }
}
