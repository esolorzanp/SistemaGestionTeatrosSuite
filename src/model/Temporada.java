package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

public class Temporada {
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Version version;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Teatro teatro;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Date fechaInicio;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Date fechaFin;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String pathAfiche;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String pathVideo;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private float valorContrato;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private List<Funcion> funciones;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private List<Actor> actores;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    public Temporada() {
        super();
        this.version = null;
        this.teatro = null;
        this.fechaInicio = null;
        this.fechaFin = null;
        this.pathAfiche = "";
        this.pathVideo = "";
        this.valorContrato = 0.0f;
        funciones = new ArrayList<>();
        actores = new ArrayList<>();
    }

    public Temporada(Version version, Teatro teatro, Date fechaInicio, Date fechaFin, String pathAfiche, String pathVideo, float valorContrato) {
        this.version = version;
        this.teatro = teatro;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.pathAfiche = pathAfiche;
        this.pathVideo = pathVideo;
        this.valorContrato = valorContrato;
        funciones = new ArrayList<>();
        actores = new ArrayList<>();
    }

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

    public Teatro getTeatro() {
        return teatro;
    }

    public void setTeatro(Teatro teatro) {
        this.teatro = teatro;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPathAfiche() {
        return pathAfiche;
    }

    public void setPathAfiche(String pathAfiche) {
        this.pathAfiche = pathAfiche;
    }

    public String getPathVideo() {
        return pathVideo;
    }

    public void setPathVideo(String pathVideo) {
        this.pathVideo = pathVideo;
    }

    public float getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(float valorContrato) {
        this.valorContrato = valorContrato;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void setActores(List<Actor> actores) {
        this.actores = actores;
    }


    @Override
    public String toString() {
        return "Temporada= {" +
                "version=" + version +
                ", teatro=" + teatro +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", pathAfiche='" + pathAfiche + '\'' +
                ", pathVideo='" + pathVideo + '\'' +
                ", valorContrato=" + valorContrato +
                ", funciones=" + funciones +
                ", actores=" + actores +
                '}';
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public boolean agregarFuncion(Funcion x) {
        return funciones.add(x);
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public boolean agregarActor(Actor x) {
        return actores.add(x);
    }

}

