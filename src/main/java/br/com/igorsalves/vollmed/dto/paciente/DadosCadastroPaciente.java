package br.com.igorsalves.vollmed.dto.paciente;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import br.com.igorsalves.vollmed.dto.endereco.DadosEndereco;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosCadastroPaciente {
  @NotBlank 
  String nome;

  @NotBlank 
  @Email 
  String email;

  @NotBlank 
  String telefone;
  
  @NotBlank 
  @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}") 
  String cpf;
  
  @NotNull 
  @Valid 
  DadosEndereco endereco;
}
