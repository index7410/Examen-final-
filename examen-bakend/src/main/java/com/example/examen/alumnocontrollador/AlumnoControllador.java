package com.example.examen.alumnocontrollador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.alumnoRepository.AlumnoRepository;
import com.example.examen.modeloalumno.alumno;

@RestController
@RequestMapping("api/")

public class AlumnoControllador {
	
   @Autowired
   private AlumnoRepository alumnoRepository;
   
   public List<alumno> getAlumno(){   
	return this.alumnoRepository.findAll() ;  
   }
 
   
}
