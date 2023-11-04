package br.com.igorsalves.vollmed.dto.medico;

import javax.validation.Valid;
import javax.validation.constraints.*;

import br.com.igorsalves.vollmed.dto.endereco.DadosEndereco;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosCadastroMedico {
  @NotBlank
  private String nome;

  @NotBlank
  @Email
  private String email;

  @NotBlank
  @Pattern(regexp = "\\d{4,6}")
  private String crm;

  @NotNull
  private Especialidade especialidade;

  @NotNull 
  @Valid
  private DadosEndereco endereco;
}
