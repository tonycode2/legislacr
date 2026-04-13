package com.legislacr.rh.legislarh.Models;

import java.time.LocalDate;
import java.util.List;

import com.legislacr.rh.legislarh.DTOs.PlanillaDTO;

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
    
    //TODO: manejo de excepciones personalizado

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

    public PlanillaDTO PlanillaADto(PlanillaEmpleado planillaEmpleado){
        return new PlanillaDTO(
            fechaInicioPeriodo = planillaEmpleado.getFechaInicioPeriodo(),
            fechaFinPeriodo = planillaEmpleado.getFechaFinPeriodo(),
            salarioBase = planillaEmpleado.getSalarioBase(),
            tipoDeSalario = planillaEmpleado.getTipoDeSalario(),
            cantidadDiasAusente = planillaEmpleado.getCantidadDiasAusente(),
            cantidadHorasAusente = planillaEmpleado.getCantidadHorasAusente(),
            cantidadDiasVacaciones = planillaEmpleado.getCantidadDiasVacaciones(),
            diasVacaciones = planillaEmpleado.getDiasVacaciones(),
            cantidadDiasIncapacitado = planillaEmpleado.getCantidadDiasIncapacitado(),
            entidadIncapacidad = planillaEmpleado.getEntidadIncapacidad(),
            diasIncapacitado = planillaEmpleado.getDiasIncapacitado(),
            esCasado = planillaEmpleado.isEsCasado(),
            cantidadHijos = planillaEmpleado.getCantidadHijos()
        );
    }

    public PlanillaEmpleado deDtoAPlanilla(PlanillaDTO dto){
        setFechaInicioPeriodo(dto.fechaInicioPeriodo());
        setFechaFinPeriodo(dto.fechaFinPeriodo());
        setSalarioBase(dto.salarioBase());
        setTipoDeSalario(dto.tipoDeSalario());
        setCantidadDiasAusente(dto.cantidadDiasAusente());
        setCantidadHorasAusente(dto.cantidadHorasAusente());
        setCantidadDiasVacaciones(dto.cantidadDiasVacaciones());
        setDiasVacaciones(dto.diasVacaciones());
        setCantidadDiasIncapacitado(dto.cantidadDiasIncapacitado());
        setEntidadIncapacidad(dto.entidadIncapacidad());
        setDiasIncapacitado(dto.diasIncapacitado());
        setEsCasado(dto.esCasado());
        setCantidadHijos(dto.cantidadHijos());
        return this;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((fechaInicioPeriodo == null) ? 0 : fechaInicioPeriodo.hashCode());
        result = prime * result + ((fechaFinPeriodo == null) ? 0 : fechaFinPeriodo.hashCode());
        result = prime * result + salarioBase;
        result = prime * result + ((tipoDeSalario == null) ? 0 : tipoDeSalario.hashCode());
        result = prime * result + cantidadDiasAusente;
        result = prime * result + Float.floatToIntBits(cantidadHorasAusente);
        result = prime * result + cantidadDiasVacaciones;
        result = prime * result + ((diasVacaciones == null) ? 0 : diasVacaciones.hashCode());
        result = prime * result + cantidadDiasIncapacitado;
        result = prime * result + ((entidadIncapacidad == null) ? 0 : entidadIncapacidad.hashCode());
        result = prime * result + ((diasIncapacitado == null) ? 0 : diasIncapacitado.hashCode());
        result = prime * result + (esCasado ? 1231 : 1237);
        result = prime * result + cantidadHijos;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlanillaEmpleado other = (PlanillaEmpleado) obj;
        if (fechaInicioPeriodo == null) {
            if (other.fechaInicioPeriodo != null)
                return false;
        } else if (!fechaInicioPeriodo.equals(other.fechaInicioPeriodo))
            return false;
        if (fechaFinPeriodo == null) {
            if (other.fechaFinPeriodo != null)
                return false;
        } else if (!fechaFinPeriodo.equals(other.fechaFinPeriodo))
            return false;
        if (salarioBase != other.salarioBase)
            return false;
        if (tipoDeSalario == null) {
            if (other.tipoDeSalario != null)
                return false;
        } else if (!tipoDeSalario.equals(other.tipoDeSalario))
            return false;
        if (cantidadDiasAusente != other.cantidadDiasAusente)
            return false;
        if (Float.floatToIntBits(cantidadHorasAusente) != Float.floatToIntBits(other.cantidadHorasAusente))
            return false;
        if (cantidadDiasVacaciones != other.cantidadDiasVacaciones)
            return false;
        if (diasVacaciones == null) {
            if (other.diasVacaciones != null)
                return false;
        } else if (!diasVacaciones.equals(other.diasVacaciones))
            return false;
        if (cantidadDiasIncapacitado != other.cantidadDiasIncapacitado)
            return false;
        if (entidadIncapacidad == null) {
            if (other.entidadIncapacidad != null)
                return false;
        } else if (!entidadIncapacidad.equals(other.entidadIncapacidad))
            return false;
        if (diasIncapacitado == null) {
            if (other.diasIncapacitado != null)
                return false;
        } else if (!diasIncapacitado.equals(other.diasIncapacitado))
            return false;
        if (esCasado != other.esCasado)
            return false;
        if (cantidadHijos != other.cantidadHijos)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PlanillaEmpleado [fechaInicioPeriodo=" + fechaInicioPeriodo + ", fechaFinPeriodo=" + fechaFinPeriodo
                + ", salarioBase=" + salarioBase + ", tipoDeSalario=" + tipoDeSalario + ", cantidadDiasAusente="
                + cantidadDiasAusente + ", cantidadHorasAusente=" + cantidadHorasAusente + ", cantidadDiasVacaciones="
                + cantidadDiasVacaciones + ", diasVacaciones=" + diasVacaciones + ", cantidadDiasIncapacitado="
                + cantidadDiasIncapacitado + ", entidadIncapacidad=" + entidadIncapacidad + ", diasIncapacitado="
                + diasIncapacitado + ", esCasado=" + esCasado + ", cantidadHijos=" + cantidadHijos
                + ", getFechaInicioPeriodo()=" + getFechaInicioPeriodo() + ", getFechaFinPeriodo()="
                + getFechaFinPeriodo() + ", getSalarioBase()=" + getSalarioBase() + ", getTipoDeSalario()="
                + getTipoDeSalario() + ", getClass()=" + getClass() + ", getCantidadDiasAusente()="
                + getCantidadDiasAusente() + ", getCantidadHorasAusente()=" + getCantidadHorasAusente()
                + ", getCantidadDiasVacaciones()=" + getCantidadDiasVacaciones() + ", getDiasVacaciones()="
                + getDiasVacaciones() + ", getCantidadDiasIncapacitado()=" + getCantidadDiasIncapacitado()
                + ", getEntidadIncapacidad()=" + getEntidadIncapacidad() + ", getDiasIncapacitado()="
                + getDiasIncapacitado() + ", isEsCasado()=" + isEsCasado() + ", getCantidadHijos()="
                + getCantidadHijos() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }
    

}
