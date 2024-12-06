/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Cristóbal Varas
 */
public class CuentaSocio {
    private double totalPagado;
    private int cuotasPagadas;

    public CuentaSocio() {
        this.totalPagado = 0.0;
        this.cuotasPagadas = 0;
    }

    public void pagarCuota(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        this.totalPagado += monto;
        this.cuotasPagadas++;
    }

    public double getTotalPagado() {
        return totalPagado;
    }

    public int getCuotasPagadas() {
        return cuotasPagadas;
    }
}
