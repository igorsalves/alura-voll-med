package br.com.igorsalves.vollmed.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igorsalves.vollmed.dto.paciente.DadosCadastroPaciente;
import br.com.igorsalves.vollmed.entity.PacienteEntity;
import br.com.igorsalves.vollmed.repository.PacienteRepository;

@RestController
@RequestMapping("pacientes")
public class PacienteController {
  @Autowired
  private PacienteRepository pacienteRepository;

  @PostMapping
  @Transactional
  public ResponseEntity<PacienteEntity> cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
    var paciente = pacienteRepository.save(new PacienteEntity(dados));

    return ResponseEntity.status(HttpStatus.CREATED).body(paciente);    
  }
}
