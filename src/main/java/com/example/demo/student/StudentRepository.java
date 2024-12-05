package com.example.demo.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//<[Entidad a manejar], [Tipo de dato a usar como clave primaria]>
//Esta interfaz es la responsable del acceso a los datos
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> { }
