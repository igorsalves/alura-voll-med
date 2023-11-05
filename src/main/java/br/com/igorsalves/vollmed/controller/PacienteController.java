package br.com.igorsalves.vollmed.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igorsalves.vollmed.dto.paciente.DadosCadastroPaciente;
import br.com.igorsalves.vollmed.dto.paciente.DadosListagemPaciente;
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

  @GetMapping
  public Page<DadosListagemPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"}) Pageable paginacao) {
      return pacienteRepository.findAll(paginacao).map(DadosListagemPaciente::new);
  }
}
