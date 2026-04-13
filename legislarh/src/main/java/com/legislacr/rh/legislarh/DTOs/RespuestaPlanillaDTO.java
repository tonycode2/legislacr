package com.legislacr.rh.legislarh.DTOs;

import java.time.LocalDate;
import java.util.List;

public record RespuestaPlanillaDTO(int idEmpleado,
    LocalDate fechaInicioPeriodo,
    LocalDate fechaFinPeriodo,
    float salarioBase,
    String tipoDeSalario,
    int cantidadDiasAusente,
    float cantidadHorasAusente,
    int cantidadDiasVacaciones,
    List<LocalDate> diasVacaciones,
    int cantidadDiasIncapacitado,
    String entidadIncapacidad,
    List<LocalDate> diasIncapacitado,
    float salarioParaPagar
){

}
