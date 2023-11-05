package br.com.igorsalves.vollmed.dto.medico;

import br.com.igorsalves.vollmed.entity.MedicoEntity;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosListagemMedico {
  private String nome;

  private String email;

  private String crm;

  private Especialidade especialidade;

  public DadosListagemMedico(MedicoEntity medico) {
    nome = medico.getNome();
    email = medico.getEmail();
    crm = medico.getCrm();
    especialidade = medico.getEspecialidade();
  }
}
