package br.com.igorsalves.vollmed.dto.endereco;

import javax.validation.constraints.*;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosEndereco {
  @NotBlank
  private String logradouro;

  @NotBlank
  private String bairro;

  @NotBlank
  @Pattern(regexp = "\\d{8}")
  private String cep;

  @NotBlank
  private String cidade;

  @NotBlank
  private String uf;

  private String complemento;

  private String numero;
}
