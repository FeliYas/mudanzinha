import java.util.ArrayList;

public class ModoDeTransporte {
    private ArrayList<ObjetosTransportables> transportables;
    private double capacidad;
    private double capacidadMaxima;
    private Dimension dimension;
    private int cantidadMaxima;

    ModoDeTransporte(double capacidadMaxima, Dimension dimension, int cantidadMaxima){
        setTransportables(new ArrayList<ObjetosTransportables>());
        setCapacidad(capacidad);
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
        setCantidadMaxima(cantidadMaxima);
    }


    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public ArrayList<ObjetosTransportables> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<ObjetosTransportables> transportables) {
        this.transportables = transportables;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
}