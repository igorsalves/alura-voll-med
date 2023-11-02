package br.com.igorsalves.vollmed.dto.medico;

import br.com.igorsalves.vollmed.dto.endereco.DadosEndereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosCadastroMedico {
  private String nome;
  private String email;
  private String crm;
  private Especialidade especialidade;
  private DadosEndereco endereco;
}
