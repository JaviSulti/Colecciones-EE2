

package coo.ee2.Entidades;

public class CantanteFamoso {
    
    private String nombre;
    private String discoConMasVentas;

    public CantanteFamoso() {
    }

    public CantanteFamoso(String nombre, String discoConMasVentas) {
        this.nombre = nombre;
        this.discoConMasVentas = discoConMasVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscoConMasVentas() {
        return discoConMasVentas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscoConMasVentas(String discoConMasVentas) {
        this.discoConMasVentas = discoConMasVentas;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre=" + nombre + ", discoConMasVentas=" + discoConMasVentas + '}';
    }
            
}
