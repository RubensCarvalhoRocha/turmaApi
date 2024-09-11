package com.senai.eng.faculdadeApi.repository;

import com.senai.eng.faculdadeApi.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {
}
