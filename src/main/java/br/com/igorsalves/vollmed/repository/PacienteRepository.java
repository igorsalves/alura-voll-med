package br.com.igorsalves.vollmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igorsalves.vollmed.entity.PacienteEntity;

public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {
  
}
