package logica;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pelicula")
public class Pelicula {
    @Id
    @Column(name = "codigo", nullable = false, length = 10)
    private String codigo;
    @Column(name = "titulo", nullable = false, length = 100)
    private String titulo;
    @Column(name = "duracion", nullable = false)
    private int duracion;
    @Column(name = "año_lanzamiento", nullable = false)
    private int añoLanzamiento;
    @Column(name = "sinopsis", nullable = false, length = 150)
    private String sinopsis;
    @Column(name = "genero", nullable = false, length = 50)
    private String genero;
    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.MERGE)
    private List<Ejemplar> ejemplares = new ArrayList<>();
    @Column(name = "fechaDescuento", nullable = false, length = 50)
    @Temporal(TemporalType.DATE)
    private Date fechaDescuento;
    @Column(name = "descuentoPorGenero", nullable = false)
    private double descuentoPorGenero;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Date getFechaDescuento() {
        return fechaDescuento;
    }

    public void setFechaDescuento(Date fechaDescuento) {
        this.fechaDescuento = fechaDescuento;
    }

    public double getDescuentoPorGenero() {
        return descuentoPorGenero;
    }

    public void setDescuentoPorGenero(double descuentoPorGenero) {
        this.descuentoPorGenero = descuentoPorGenero;
    }
}
