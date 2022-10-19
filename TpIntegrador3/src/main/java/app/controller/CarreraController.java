package app.controller;


import app.dto.CarreraDto;
import app.dto.ReporteDto;
import app.dto.ReporteCarreraInscriptosDto;
import app.model.Carrera;
import app.services.CarreraService;
import org.springframework.web.bind.annotation.*;


import java.util.List;
@RequestMapping("carreras")
@RestController
public class CarreraController {
    private final CarreraService service;

    public CarreraController(CarreraService service) {
        this.service = service;
    }

    @GetMapping("/inscriptos")
    public List<ReporteCarreraInscriptosDto> getCarrerasOrdenadasPorCantidadInscriptos() {
        return service.getCarrerasOrdenadasPorCantidadInscriptos();
    }

    @GetMapping("/reporte")
    public List<ReporteDto> getReporte() {
        return service.getReporte();
    }

    @PostMapping("/")
    public CarreraDto addCarrera (@RequestBody CarreraDto c){
        return service.addCarrera(c);
    }
}
