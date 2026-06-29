package utp.edu.pe.proyectodp.service;

import utp.edu.pe.proyectodp.entity.Administrador;

import java.util.List;
import java.util.Optional;
/**
 * Implementación del patrón Pattern para la generación de códigos únicos.
 *
 * <p>Esta clase garantiza la existencia de una única instancia durante
 * toda la ejecución del sistema, permitiendo generar códigos consecutivos
 * para matrículas, pagos, cursos y otros módulos.</p>
 *
 * @author Evelyn
 * @version 1.0
 * @since 2026
 */
public interface AdministradorService {

    List<Administrador> listar();

    Optional<Administrador> buscarPorId(Long id);

    Administrador guardar(Administrador administrador);

    Administrador actualizar(Long id, Administrador administrador);

    void eliminar(Long id);
}
