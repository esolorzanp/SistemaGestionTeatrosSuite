package model;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Personaje
{
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     * @generated
     * @ordered
     */

    private String codigo;

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
     */
    public Personaje(){
        super();
        this.codigo = "";
        this.nombre = "";
    }

    public Personaje(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personaje= {" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                '}' + '\n';
    }
}

