package app.controller;

import app.dto.EstudianteDto;

import app.services.EstudianteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("estudiantes")
public class EstudianteController {

    private final EstudianteService service;

    public EstudianteController(EstudianteService service) {
        this.service = service;
    }

    @GetMapping("/order/edad")
    List<EstudianteDto> orderByEdad() {
        return service.orderByEdad();
    }

    @GetMapping("/nrolibreta/{nro_libreta}")
    EstudianteDto getEstudianteByNumeroLibreta(@PathVariable int nro_libreta) {
        return service.getEstudianteByNumeroLibreta(nro_libreta);
    }

    @GetMapping("/genero/{gender}")
    List<EstudianteDto> getEstudiantesByGenero(@PathVariable String gender) {
        return service.getEstudiantesByGenero(gender);
    }

    @GetMapping("/carrera/{career}/{city}")
    List<EstudianteDto> getEstudiantesByCarreraOrderByCiudad(@PathVariable String career, @PathVariable String city) {
        return service.getEstudiantesByCarreraOrderByCiudad(career, city);
    }

    @PostMapping("/")
    public EstudianteDto addEstudiante(@RequestBody EstudianteDto e) {
        return service.create(e);
    }
}
