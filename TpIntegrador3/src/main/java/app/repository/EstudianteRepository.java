package app.repository;

import app.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
    @Query("SELECT E FROM Estudiante E ORDER BY E.edad DESC")
    List<Estudiante> orderByEdad();

    @Query("SELECT E FROM Estudiante E WHERE E.nro_libreta =:nro_libreta")
    Estudiante getEstudianteByNumeroLibreta(@Param("nro_libreta") int nro_libreta);

    @Query("SELECT E FROM Estudiante E WHERE E.genero =:genero")
    List<Estudiante> getEstudiantesByGenero(@Param("genero") String genero);

    @Query("SELECT E FROM Estudiante E JOIN E.carreras M JOIN M.carrera C WHERE E.ciudad_residencia =:ciudad_residencia AND  C.nombre =:carrera")
    List<Estudiante> getEstudiantesByCarreraOrderByCiudad(@Param("carrera") String carrera, @Param("ciudad_residencia") String ciudad_residencia);


}
