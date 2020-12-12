public class Elemento {

    private String nombre;
    private String abreviatura;
    private int numAtomico;
    private double masaAtomica;
    private String clasificacion;

    public Elemento(String nombre, String abreviatura, int numAtomico, double masaAtomica, String clasificacion) {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.numAtomico = numAtomico;
        this.masaAtomica = masaAtomica;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public int getNumAtomico() {
        return numAtomico;
    }

    public double getMasaAtomica() {
        return masaAtomica;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    @Override
    public String toString() {
        return String.format("Nombre: " + this.nombre + "\nNumero atomico: " + this.numAtomico + "\nMasa atomica: "
                + this.masaAtomica + "\nClasificacion: " + this.clasificacion + "\n");
    }
}
