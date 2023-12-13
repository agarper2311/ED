/*
 * Para cambiar los encabezados de licencia, elige Encabezados de licencia en las Propiedades del proyecto.
 * Para cambiar este archivo de plantilla, elige Herramientas | Plantillas
 * y abre la plantilla en el editor.
 */
package actividad_02_ud3_ed;

/**
 * La clase CCuenta representa una cuenta bancaria con funciones para gestionar el saldo, realizar operaciones como ingresos y retiros, y obtener información sobre la cuenta.
 * 
 * @author Ana
 */
public class CCuenta {

    protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor sin parámetros de la clase CCuenta.
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta.
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial.
     * @param tipo Tasa de interés.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Asigna un nombre al titular de la cuenta.
     * 
     * @param nom Nuevo nombre del titular.
     */
    public void asignarNombre(String nom) {
        nombre = nom;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular.
     */
    public String obtenerNombre() {
        return nombre;
    }

    /**
     * Obtiene el estado actual del saldo de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta. Lanza una excepción si la cantidad es negativa.
     * 
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad a ingresar es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
    }

    /**
     * Realiza un retiro de la cuenta. Lanza excepciones si la cantidad es negativa o si no hay suficiente saldo.
     * 
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad a retirar es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    /**
     * Obtiene el número de cuenta.
     * 
     * @return El número de cuenta.
     */
    public String obtenerCuenta() {
        return cuenta;
    }

    /**
     * Establece un nuevo número de cuenta.
     * 
     * @param cuenta El nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece un nuevo saldo para la cuenta.
     * 
     * @param saldo El nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene la tasa de interés de la cuenta.
     * 
     * @return La tasa de interés.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece una nueva tasa de interés para la cuenta.
     * 
     * @param tipoInterés La nueva tasa de interés.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
