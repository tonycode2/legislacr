package com.legislacr.rh.legislarh.Services;

import java.util.List;

import com.legislacr.rh.legislarh.DTOs.PlanillaDTO;

public interface PlanillaServiceInterface {
    public PlanillaDTO calcularPlanilla(PlanillaDTO planilla);
    public List<PlanillaDTO> calcularListaDePlanillas(List<PlanillaDTO> listaPlanillas);
}
