/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import gui.Cuota;

public class Socio {
    private String rut;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String domicilio;
    private String comuna;
    private int numeroSocio;
    private CuentaSocio cuenta;
    private int montoPagado;

    // Constructor actualizado para agregar montoPagado
    public Socio(String rut, String nombre, String apellidoPaterno, String apellidoMaterno,
                 String telefono, String domicilio, String comuna, int numeroSocio, int montoPagado) {
        if (rut.length() < 11 || rut.length() > 12) {
            throw new IllegalArgumentException("El RUT debe tener entre 11 y 12 caracteres.");
        }
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.numeroSocio = numeroSocio;
        this.montoPagado = montoPagado;
        this.cuenta = new CuentaSocio();  // Asumiendo que ya tienes esta clase CuentaSocio.
    }

    /**
     *
     * @param string
     * @param maria
     * @param yoma
     * @param perez
     * @param string0
     * @param avenida_A_Veces_Viva
     * @param santiago
     * @param i
     */
    public Socio(String string, String maria, String yoma, String perez, String string0, String avenida_A_Veces_Viva, String santiago, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Socio(String string, String juan, String perez, String yoma, String string0, String avenida_Siempre_Viva, String santiago, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public CuentaSocio getCuenta() {
        return cuenta;
    }

    public int getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(int montoPagado) {
        this.montoPagado = montoPagado;
    }

    @Override
    public String toString() {
        return "RUT: " + rut + "\n" +
               "Nombre: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Domicilio: " + domicilio + "\n" +
               "Comuna: " + comuna + "\n" +
               "Número de Socio: " + numeroSocio + "\n" +
               "Monto Pagado: " +

    public void agregarCuota(Cuota cuota) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
