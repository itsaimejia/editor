import java.util.List;

public class Evaluar {

    private String element;

    public Evaluar(String element) {
        this.element = element;

    }

    public void informacion() {
        ListaElementos lista = new ListaElementos();

        lista.cargar();
        List<Elemento> l = lista.getLista();

        for (Elemento obj : l) {
            if (obj.getAbreviatura().toLowerCase().equals(this.element.toLowerCase())) {
                if (obj.getClasificacion().equals("no metal") || obj.getClasificacion().equals("gases nobles")) {
                    System.out.println(obj.toString());
                }
            }
        }

    }
}
