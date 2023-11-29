package model;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 *
 * @generated
 */

public class SecretariaCultura {
    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String nit;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String razonSocial;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String direccion;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String email;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     * @ordered
     */

    private String telefono;

    /**
     * <!-- begin-user-doc -->
     * <!--  end-user-doc  -->
     *
     * @generated
     */
    public SecretariaCultura() {
        super();
        this.nit = "";
        this.razonSocial = "";
        this.direccion = "";
        this.email = "";
        this.telefono = "";
    }

    public SecretariaCultura(String nit, String razonSocial, String direccion, String email, String telefono) {
        this.nit = nit;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "SecretariaCultura = {" +
                "nit='" + nit + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

