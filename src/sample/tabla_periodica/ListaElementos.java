import java.util.ArrayList;
import java.util.List;

public class ListaElementos {

    private List lista;

    public ListaElementos() {
    }

    public List getLista() {
        return lista;
    }

    public void cargar() {
        this.lista = new ArrayList<Elemento>();
        lista.add(new Elemento("Hidrogeno", "H", 1, 1.00794, "no metal"));
        lista.add(new Elemento("Helio", "He", 2, 4.002602, "gases nobles"));
        lista.add(new Elemento("Litio", "Li", 3, 6.941, "alcalinos"));
        lista.add(new Elemento("Berilio", "Be", 4, 9.0121, "alcalinoterreos"));
        lista.add(new Elemento("Boro", "B", 5, 10.811, "metaloides"));
        lista.add(new Elemento("Carbono", "C", 6, 12.0107, "no metal"));
        lista.add(new Elemento("Nitrogeno", "N", 7, 14.0067, "no metal"));
        lista.add(new Elemento("Oxigeno", "O", 8, 15.9994, "no metal"));
        lista.add(new Elemento("Fluor", "F", 9, 18.998403, "halogeno"));
        lista.add(new Elemento("Neon", "Ne", 10, 20.1797, "gases nobles"));
        lista.add(new Elemento("Sodio", "Na", 11, 22.98976, "alcalinos"));
        lista.add(new Elemento("Magnesio", "Mg", 12, 24.3050, "alcalinoterreos"));
        lista.add(new Elemento("Aluminio", "Al", 13, 26.98153, "otros metales"));
        lista.add(new Elemento("Silicio", "Si", 14, 28.0855, "metaloides"));
        lista.add(new Elemento("Fosforo", "P", 15, 30.97696, "no metal"));
        lista.add(new Elemento("Azufre", "S", 16, 32.065, "no metal"));
        lista.add(new Elemento("Cloro", "Cl", 17, 35.453, "halogeno"));
        lista.add(new Elemento("Argon", "Ar", 18, 39.948, "gases nobles"));
        lista.add(new Elemento("Potasio", "K", 19, 39.0983, "alcalinos"));
        lista.add(new Elemento("Calcio", "Ca", 20, 40.078, "alcalinoterreos"));
        lista.add(new Elemento("Escandio", "Sc", 21, 44.955, "metales de transicion"));
        lista.add(new Elemento("Titanio", "Ti", 22, 47.867, "metales de transicion"));
        lista.add(new Elemento("Vanadio", "V", 23, 50.9415, "metales de transicion"));
        lista.add(new Elemento("Cromo", "Cr", 24, 51.9962, "metales de transicion"));
        lista.add(new Elemento("Manganeso", "Mn", 25, 54.93804, "metales de transicion"));
        lista.add(new Elemento("Hierro", "Fe", 26, 55.845, "metales de transicion"));
        lista.add(new Elemento("Cobalto", "Co", 27, 58.93319, "metales de transicion"));
        lista.add(new Elemento("Niquel", "Ni", 28, 58.6934, "metales de transicion"));
        lista.add(new Elemento("Cobre", "Cu", 29, 63.566, "metales de transicion"));
        lista.add(new Elemento("Zinc", "Zn", 30, 65.38, "metales de transicion"));
        lista.add(new Elemento("Galio", "Ga", 31, 69.723, "otros metales"));
        lista.add(new Elemento("Germanio", "Ge", 32, 72.64, "metaloides"));
        lista.add(new Elemento("Arcenico", "As", 33, 74.92160, "metaloides"));
        lista.add(new Elemento("Selenio", "Se", 34, 78.96, "no metal"));
        lista.add(new Elemento("Bromo", "Br", 35, 79.904, "halogeno"));
        lista.add(new Elemento("Kripton", "Kr", 36, 83.798, "gases nobles"));
        lista.add(new Elemento("Rubidio", "Rb", 37, 85.4678, "alcalinos"));
        lista.add(new Elemento("Estroncio", "Sr", 38, 87.62, "alcalinoterreos"));
        lista.add(new Elemento("Itrio", "Y", 39, 88.90585, "metales de transicion"));
        lista.add(new Elemento("Zirconio", "Zr", 40, 91.224, "metales de transicion"));
        lista.add(new Elemento("Niobio", "Nb", 41, 92.90638, "metales de transicion"));
        lista.add(new Elemento("Molibdeno", "Mo", 42, 95.96, "metales de transicion"));
        lista.add(new Elemento("Tecnecio", "Tc", 43, 98.43, "metales de transicion"));
        lista.add(new Elemento("Rutenio", "Ru", 44, 101.07, "metales de transicion"));
        lista.add(new Elemento("Rodio", "Rh", 45, 102.9055, "metales de transicion"));
        lista.add(new Elemento("Paladio", "Pd", 46, 106.42, "metales de transicion"));
        lista.add(new Elemento("Plata", "Ag", 47, 107.8682, "metales de transicion"));
        lista.add(new Elemento("Cadmio", "Cd", 48, 112.441, "metales de transicion"));
        lista.add(new Elemento("Indio", "In", 49, 114.818, "otros metales"));
        lista.add(new Elemento("Estaño", "Sn", 50, 118.710, "otros metales"));
        lista.add(new Elemento("Antimonio", "Sb", 51, 121.760, "metaloides"));
        lista.add(new Elemento("Telurio", "Te", 52, 127.60, "metaloides"));
        lista.add(new Elemento("Yodo", "I", 53, 126.9044, "halogeno"));
        lista.add(new Elemento("Xenon", "Xe", 54, 131.293, "gases nobles"));
        lista.add(new Elemento("Cesio", "Cs", 55, 132.9054, "alcalinos"));
        lista.add(new Elemento("Bario", "Ba", 56, 137.327, "alcalinoterreos"));
        lista.add(new Elemento("Lantano", "La", 57, 138.9054, "metales de transicion"));
        lista.add(new Elemento("Cesio", "Ce", 58, 140.116, "metales de transicion"));
        lista.add(new Elemento("Praseodimio", "Pr", 59, 140.9076, "metales de transicion"));
        lista.add(new Elemento("Neodimio", "Nd", 60, 144.242, "metales de transicion"));
        lista.add(new Elemento("Prometio", "Pm", 61, 145, "metales de transicion"));
        lista.add(new Elemento("Samario", "Sm", 62, 150.36, "metales de transicion"));
        lista.add(new Elemento("Europio", "Eu", 63, 151.964, "metales de transicion"));
        lista.add(new Elemento("Gadolinio", "Gd", 64, 157.25, "metales de transicion"));
        lista.add(new Elemento("Terbio", "Tb", 65, 158.9253, "metales de transicion"));
        lista.add(new Elemento("Disposio", "Dy", 66, 162.500, "metales de transicion"));
        lista.add(new Elemento("Holmio", "Ho", 67, 164.9303, "metales de transicion"));
        lista.add(new Elemento("Erbio", "Er", 68, 167.259, "metales de transicion"));
        lista.add(new Elemento("Tulio", "Tm", 69, 168.9342, "metales de transicion"));
        lista.add(new Elemento("Iterbio", "Yb", 70, 173.054, "metales de transicion"));
        lista.add(new Elemento("Lutecio", "Lu", 71, 174.9668, "metales de transicion"));
        lista.add(new Elemento("Hafnio", "Hf", 72, 178.49, "metales de transicion"));
        lista.add(new Elemento("Tantalio", "Ta", 73, 180.978, "metales de transicion"));
        lista.add(new Elemento("Wolfranio", "W", 74, 183.84, "metales de transicion"));
        lista.add(new Elemento("Renio", "Re", 75, 186.207, "metales de transicion"));
        lista.add(new Elemento("Osmio", "Os", 76, 190.23, "metales de transicion"));
        lista.add(new Elemento("Iridio", "Ir", 77, 192.217, "metales de transicion"));
        lista.add(new Elemento("Platino", "Pt", 78, 195.084, "metales de transicion"));
        lista.add(new Elemento("Oro", "Au", 79, 196.9665, "metales de transicion"));
        lista.add(new Elemento("Mercurio", "Hg", 80, 200.59, "metales de transicion"));
        lista.add(new Elemento("Talio", "Tl", 81, 204.3833, "otros metales"));
        lista.add(new Elemento("Plomo", "Pb", 82, 207.2, "otros metales"));
        lista.add(new Elemento("Bismutuo", "Bi", 83, 208.9804, "otros metales"));
        lista.add(new Elemento("Polonio", "Po", 84, 210, "metaloides"));
        lista.add(new Elemento("Astato", "At", 85, 210, "halogeno"));
        lista.add(new Elemento("Radon", "Rn", 86, 220, "gases nobles"));
        lista.add(new Elemento("Francio", "Fr", 87, 223, "alcalinos"));
        lista.add(new Elemento("Radio", "Ra", 88, 226, "alcalinoterreos"));
        lista.add(new Elemento("Actinio", "Ac", 89, 227, "actinidos"));
        lista.add(new Elemento("Torio", "Th", 90, 232.0380, "actinidos"));
        lista.add(new Elemento("Proctactinio", "Pa", 91, 231.0358, "actinidos"));
        lista.add(new Elemento("Uranio", "U", 92, 238.02289, "actinidos"));
        lista.add(new Elemento("Neptunio", "Np", 93, 237, "actinidos"));
        lista.add(new Elemento("Plutonio", "Pu", 94, 244, "actinidos"));
        lista.add(new Elemento("Americio", "Am", 95, 243, "actinidos"));
        lista.add(new Elemento("Curio", "Cm", 96, 247, "actinidos"));
        lista.add(new Elemento("Berkeio", "Bk", 97, 247, "actinidos"));
        lista.add(new Elemento("Californio", "Cf", 98, 251, "actinidos"));
        lista.add(new Elemento("Einstenio", "Es", 99, 252, "actinidos"));
        lista.add(new Elemento("Fermio", "Fm", 100, 257, "actinidos"));
        lista.add(new Elemento("Mendelevio", "Md", 101, 258, "actinidos"));
        lista.add(new Elemento("Nobelio", "No", 102, 259, "actinidos"));
        lista.add(new Elemento("Laurencio", "Lr", 103, 262, "metales de transicion"));
        lista.add(new Elemento("Rutherfodio", "Rf", 104, 261, "metales de transicion"));
        lista.add(new Elemento("Dubnio", "Db", 105, 262, "metales de transicion"));
        lista.add(new Elemento("Seabergio", "Sg", 106, 266, "metales de transicion"));
        lista.add(new Elemento("Bohrio", "Bh", 107, 264, "metales de transicion"));
        lista.add(new Elemento("Hassio", "Hs", 108, 277, "metales de transicion"));
        lista.add(new Elemento("Meitnerio", "Mt", 109, 268, "metales de transicion"));
        lista.add(new Elemento("Darmstadio", "Ds", 110, 271, "metales de transicion"));
        lista.add(new Elemento("Roentgenio", "Rg", 111, 272, "metales de transicion"));
        lista.add(new Elemento("Copernicio", "Cn", 112, 285, "metales de transicon"));
        lista.add(new Elemento("Ununtrio", "Uut", 113, 284, "elementos desconocidos"));
        lista.add(new Elemento("Flerovio", "Fl", 114, 289, "elementos desconocidos"));
        lista.add(new Elemento("Unumpentio", "Uup", 115, 288, "elementos desconocidos"));
        lista.add(new Elemento("Livermorio", "Lv", 116, 292, "elementos desconocidos"));
        lista.add(new Elemento("Ununseptio", "Uus", 117, 0, "elementos desconocidos"));
        lista.add(new Elemento("Ununoctio", "Uuo", 118, 294, "elementos desconocidos"));
    }
}
