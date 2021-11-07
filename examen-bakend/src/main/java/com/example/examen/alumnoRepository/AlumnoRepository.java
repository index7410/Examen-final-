package com.example.examen.alumnoRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.examen.modeloalumno.*;
@Repository

public interface AlumnoRepository extends JpaRepository<alumno, Long>{

}
