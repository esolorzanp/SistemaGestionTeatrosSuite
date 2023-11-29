package model;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

public class Funcion {
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Date fecha;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private Time hora;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private List<Tiquete> tiquetes;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    public Funcion() {
        super();
        this.fecha = null;
        this.hora = null;
        tiquetes = new ArrayList<>();
    }

    public Funcion(Date fecha, Time hora) {
        this.fecha = fecha;
        this.hora = hora;
        tiquetes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Funcion= {" +
                "fecha=" + fecha +
                ", hora=" + hora +
                ", tiquetes=" + tiquetes +
                '}' + '\n';
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public Tiquete[] generarTiquetes(int parameter) {
        // TODO implement me
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    public boolean reemplazarActor(Actor parameter, Actor parameter2) {
        // TODO implement me
        return false;
    }

}

