package app.controller;

import app.model.Matricula;
import app.services.MatriculaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("matriculas")
public class MatriculaController {
    private final MatriculaService service;

    public MatriculaController(MatriculaService service) {
        this.service = service;
    }

    @PostMapping("/")
    public Matricula addMatricula(@RequestBody Matricula m) {
        return service.addMatricula(m);
    }
}
