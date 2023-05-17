package Proyecto.Final;

public class Datos {

    private String clave;
    private String nombre;
    private String apellido;
    private String empresa;
    private String tel1;
    private String tel2;
    private String correo;

    public Datos() {

    }

    public Datos(String clave, String nombre, String apellido, String empresa, String tel1, String tel2, String correo) {

        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.empresa = empresa;
        this.tel1 = tel1;
        this.tel2 = tel2;
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTel1() {
        return tel1;
    }

    public void setTel1(String tel1) {
        this.tel1 = tel1;
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        this.tel2 = tel2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
