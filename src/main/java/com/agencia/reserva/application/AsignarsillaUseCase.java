package com.agencia.reserva.application;

import com.agencia.reserva.domain.entity.Asientosdetalles;
import com.agencia.reserva.domain.service.vueloService;

public class AsignarsillaUseCase {
    private final vueloService vueloService;

    public AsignarsillaUseCase(vueloService vueloService) {
        this.vueloService = vueloService;
    }

    public void execute(Asientosdetalles asientosdetalles) {
        vueloService.asignarsilla(asientosdetalles);
        // vueloService.BuscarVuelo();
    }
}
