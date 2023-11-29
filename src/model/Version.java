package model;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

public class Version {
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Obra obra;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Director director;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Date fechaCreacion;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String pathDocumento;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    public Version() {
        super();
        this.obra = null;
        this.director = null;
        this.fechaCreacion = null;
        this.pathDocumento = null;
    }

    public Version(Obra obra, Director director, Date fechaCreacion, String pathDocumento) {
        this.obra = obra;
        this.director = director;
        this.fechaCreacion = fechaCreacion;
        this.pathDocumento = pathDocumento;
    }

    public Obra getObra() {
        return obra;
    }

    public void setObra(Obra obra) {
        this.obra = obra;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getPathDocumento() {
        return pathDocumento;
    }

    public void setPathDocumento(String pathDocumento) {
        this.pathDocumento = pathDocumento;
    }

    @Override
    public String toString() {
        return "Version = {" +
                "obra=" + obra +
                ", director=" + director +
                ", fechaCreacion=" + fechaCreacion +
                ", pathDocumento='" + pathDocumento + '\'' +
                '}'+'\n';
    }
}

