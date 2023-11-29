package model;

import java.util.Date;
/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Actor
{
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private String cedula;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private String nombre;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private Date fechaNacimiento;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private Sexo sexo;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private TipoPapel tipoPapel;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private Personaje personaje;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     */
    public Actor(){
        super();
        this.cedula = "";
        this.nombre = "";
        this.fechaNacimiento = null;
        this.sexo = null;
        this.tipoPapel = TipoPapel.OTRO;
        this.personaje = new Personaje();
    }

    public Actor(String cedula, String nombre, Date fechaNacimiento, Sexo sexo, TipoPapel tipoPapel) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.tipoPapel = tipoPapel;
        this.personaje = new Personaje();
    }
}

