package br.com.igorsalves.vollmed.dto.endereco;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DadosEndereco {
  private String logradouro;
  private String bairro;
  private String cep;
  private String cidade;
  private String uf;
  private String complemento;
  private String numero;
}
