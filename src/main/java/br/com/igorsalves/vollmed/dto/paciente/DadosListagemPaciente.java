package br.com.igorsalves.vollmed.dto.paciente;

import br.com.igorsalves.vollmed.entity.PacienteEntity;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosListagemPaciente {
  String nome;
  String email; 
  String cpf;

  public DadosListagemPaciente(PacienteEntity paciente) {
    nome = paciente.getNome();
    email = paciente.getEmail();
    cpf = paciente.getCpf();
  }
}
