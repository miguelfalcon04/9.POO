package POO.ArraysDeObjetos.Eje01;

public class Gato {
    private String nombre;
    private String color;
    private String raza;

    @Override
    public String toString() {
        return "Este gato se llama "+this.nombre+", es de color "+this.color+" y es de raza "+this.raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
