package com.legislacr.rh.legislarh.DTOs;

import java.time.LocalDate;
import java.util.List;

public record PlanillaDTO(
    LocalDate fechaInicioPeriodo,
    LocalDate fechaFinPeriodo,
    int salarioBase,
    String tipoDeSalario,
    int cantidadDiasAusente,
    float cantidadHorasAusente,
    int cantidadDiasVacaciones,
    List<LocalDate> diasVacaciones,
    int cantidadDiasIncapacitado,
    String entidadIncapacidad,
    List<LocalDate> diasIncapacitado,
    boolean esCasado,
    int cantidadHijos
) {

}
