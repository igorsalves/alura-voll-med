package br.com.igorsalves.vollmed.entity;

import javax.persistence.*;

import br.com.igorsalves.vollmed.dto.medico.DadosCadastroMedico;
import br.com.igorsalves.vollmed.dto.medico.Especialidade;
import lombok.*;

@Table(name = "medicos")
@Entity(name= "Medico")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MedicoEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String nome;
  private String email;
  private String crm;

  @Enumerated(EnumType.STRING)
  private Especialidade especialidade;

  @Embedded
  private EnderecoEntity endereco;

  public MedicoEntity(DadosCadastroMedico dados) {
    nome = dados.getNome();
    email = dados.getEmail();
    crm = dados.getCrm();
    especialidade = dados.getEspecialidade();
    endereco = new EnderecoEntity(dados.getEndereco());
  }
}
