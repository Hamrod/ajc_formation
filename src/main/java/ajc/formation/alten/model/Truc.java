package ajc.formation.alten.model;

public class Truc {
    private int nombre;
    private String chaine;

    public Truc(int nombre, String chaine) {
        this.nombre = nombre;
        this.chaine = chaine;
    }

    public int getNombre() {
        return this.nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public String getChaine() {
        return this.chaine;
    }

    public void setChaine(String chaine) {
        this.chaine = chaine;
    }

}
