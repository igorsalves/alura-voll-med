package br.com.igorsalves.vollmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.igorsalves.vollmed.entity.MedicoEntity;

public interface MedicoRepository extends JpaRepository<MedicoEntity, Long> {
  
}
