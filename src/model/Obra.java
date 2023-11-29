package model;

import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

public class Obra {
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String codigo;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String nombre;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String autor;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String pathGuion;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private TipoObra tipo;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private List<Personaje> personajes;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    public Obra() {
        super();
        this.codigo = "";
        this.nombre = "";
        this.autor = "";
        this.pathGuion = "";
        this.tipo = TipoObra.OTRO;
        personajes = new ArrayList<>();
    }

    public Obra(String codigo, String nombre, String autor, String pathGuion, TipoObra tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.pathGuion = pathGuion;
        this.tipo = tipo;
        personajes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPathGuion() {
        return pathGuion;
    }

    public void setPathGuion(String pathGuion) {
        this.pathGuion = pathGuion;
    }

    public TipoObra getTipo() {
        return tipo;
    }

    public void setTipo(TipoObra tipo) {
        this.tipo = tipo;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public boolean validarPersonajeUnico(Personaje parameter) {
        // TODO implement me
        return false;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public boolean agregarPersonaje(Personaje x) {
        return personajes.add(x);
    }

    @Override
    public String toString() {
        return "Obra= {" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", autor='" + autor + '\'' +
                ", pathGuion='" + pathGuion + '\'' +
                ", tipo=" + tipo +
                ", personajes=" + personajes +
                '}' + '\n';
    }
}

