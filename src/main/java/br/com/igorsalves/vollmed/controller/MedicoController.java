package br.com.igorsalves.vollmed.controller;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.igorsalves.vollmed.dto.medico.DadosCadastroMedico;
import br.com.igorsalves.vollmed.dto.medico.DadosListagemMedico;
import br.com.igorsalves.vollmed.entity.MedicoEntity;
import br.com.igorsalves.vollmed.repository.MedicoRepository;

@RestController
@RequestMapping("medicos")
public class MedicoController {
  @Autowired
  private MedicoRepository medicoRepository;
  
  @PostMapping
  @Transactional
  public ResponseEntity<MedicoEntity> cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
    var medico = medicoRepository.save(new MedicoEntity(dados));

    return ResponseEntity.status(HttpStatus.CREATED).body(medico) ;
  }

  @GetMapping
  public ResponseEntity<List<DadosListagemMedico>> listar() {
    var medicos = medicoRepository.findAll().stream().map(DadosListagemMedico::new).collect(Collectors.toList());

    return ResponseEntity.status(HttpStatus.OK).body(medicos);
  }
}
