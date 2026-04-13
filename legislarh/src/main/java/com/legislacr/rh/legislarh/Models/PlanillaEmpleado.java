package com.legislacr.rh.legislarh.Models;

import java.time.LocalDate;
import java.util.List;

public class PlanillaEmpleado {
    private LocalDate fechaInicioPeriodo;
    private LocalDate fechaFinPeriodo;
    private int salarioBase;
    private String tipoDeSalario;
    private int cantidadDiasAusente;
    private float cantidadHorasAusente;
    private int cantidadDiasVacaciones;
    private List<LocalDate> diasVacaciones;
    private int cantidadDiasIncapacitado;
    private String entidadIncapacidad;
    private List<LocalDate> diasIncapacitado;
    private boolean esCasado;
    private int cantidadHijos;

    public PlanillaEmpleado() {
    }

    public PlanillaEmpleado(LocalDate fechaInicioPeriodo,
            LocalDate fechaFinPeriodo,
            int salarioBase,
            String tipoSalario,
            int cantidadDiasAusente,
            float cantidadHorasAusente,
            int cantidadDiasVacaciones,
            List<LocalDate> diasVacaciones,
            int cantidadDiasIncapacitado,
            String entidadIncapacidad,
            List<LocalDate> diasIncapacitado,
            boolean esCasado,
            int cantidadHijos) {
        this.fechaInicioPeriodo = fechaInicioPeriodo;
        this.fechaFinPeriodo = fechaFinPeriodo;
        this.salarioBase = salarioBase;
        this.tipoDeSalario = tipoSalario;
        this.cantidadDiasAusente = cantidadDiasAusente;
        this.cantidadHorasAusente = cantidadHorasAusente;
        this.cantidadDiasVacaciones = cantidadDiasVacaciones;
        this.diasVacaciones = diasVacaciones;
        this.cantidadDiasIncapacitado = cantidadDiasIncapacitado;
        this.entidadIncapacidad = entidadIncapacidad;
        this.diasIncapacitado = diasIncapacitado;
        this.esCasado = esCasado;
        this.cantidadHijos = cantidadHijos;
    }

    public LocalDate getFechaInicioPeriodo() {
        return fechaInicioPeriodo;
    }

    public void setFechaInicioPeriodo(LocalDate fechaInicioPeriodo) {
        this.fechaInicioPeriodo = fechaInicioPeriodo;
    }

    public LocalDate getFechaFinPeriodo() {
        return fechaFinPeriodo;
    }

    public void setFechaFinPeriodo(LocalDate fechaFinPeriodo) {
        this.fechaFinPeriodo = fechaFinPeriodo;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getTipoDeSalario() {
        return tipoDeSalario;
    }

    public void setTipoDeSalario(String tipoDeSalario) {
        this.tipoDeSalario = tipoDeSalario;
    }

    public int getCantidadDiasAusente() {
        return cantidadDiasAusente;
    }

    public void setCantidadDiasAusente(int cantidadDiasAusente) {
        this.cantidadDiasAusente = cantidadDiasAusente;
    }

    public float getCantidadHorasAusente() {
        return cantidadHorasAusente;
    }

    public void setCantidadHorasAusente(float cantidadHorasAusente) {
        this.cantidadHorasAusente = cantidadHorasAusente;
    }

    public int getCantidadDiasVacaciones() {
        return cantidadDiasVacaciones;
    }

    public void setCantidadDiasVacaciones(int cantidadDiasVacaciones) {
        this.cantidadDiasVacaciones = cantidadDiasVacaciones;
    }

    public List<LocalDate> getDiasVacaciones() {
        return diasVacaciones;
    }

    public void setDiasVacaciones(List<LocalDate> diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }

    public int getCantidadDiasIncapacitado() {
        return cantidadDiasIncapacitado;
    }

    public void setCantidadDiasIncapacitado(int cantidadDiasIncapacitado) {
        this.cantidadDiasIncapacitado = cantidadDiasIncapacitado;
    }

    public String getEntidadIncapacidad() {
        return entidadIncapacidad;
    }

    public void setEntidadIncapacidad(String entidadIncapacidad) {
        this.entidadIncapacidad = entidadIncapacidad;
    }

    public List<LocalDate> getDiasIncapacitado() {
        return diasIncapacitado;
    }

    public void setDiasIncapacitado(List<LocalDate> diasIncapacitado) {
        this.diasIncapacitado = diasIncapacitado;
    }

    public boolean isEsCasado() {
        return esCasado;
    }

    public void setEsCasado(boolean esCasado) {
        this.esCasado = esCasado;
    }

    public int getCantidadHijos() {
        return cantidadHijos;
    }

    public void setCantidadHijos(int cantidadHijos) {
        this.cantidadHijos = cantidadHijos;
    }

    
}
