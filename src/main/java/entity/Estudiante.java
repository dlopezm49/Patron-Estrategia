package entity;


import lombok.Getter;

@Getter
public class Estudiante {
    private int carnet;
    private String nombre;

    public Estudiante(int carnet, String nombre) {
        setCarnet(carnet);
        setNombre(nombre);
    }

    public Estudiante() {
        this(100, "");

    }
    public void setCarnet (int carnet){
        this.carnet = carnet;
    }

    public void setNombre (String nombre){
        this.nombre = removerEspacios(nombre);
    }

    public String removerEspacios(String nombre){
        return nombre.trim().replaceAll("\\s+", " ");
    }

    @Override
    public String toString() {
        return "estudiante{" +
                "carnet=" + carnet +
                ", nombre='" + nombre + '\'' +
                '}';
    }


}
