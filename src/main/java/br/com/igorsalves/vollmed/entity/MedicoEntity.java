package br.com.igorsalves.vollmed.entity;

import javax.persistence.*;

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
}
