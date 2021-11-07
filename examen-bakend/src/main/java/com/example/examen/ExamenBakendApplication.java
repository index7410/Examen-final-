package com.example.examen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.examen.alumnoRepository.AlumnoRepository;

@SpringBootApplication
public class ExamenBakendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamenBakendApplication.class, args);
	}
    
	@Autowired
	private AlumnoRepository alumnoRepository;
	

	public void run(String... args)throws Exception {
		this.alumnoRepository.save(new alumno)
	}
}
