package br.com.igorsalves.vollmed.entity;

import javax.persistence.Embeddable;

import br.com.igorsalves.vollmed.dto.endereco.DadosEndereco;
import lombok.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {
  private String logradouro;
  private String bairro;
  private String cep;
  private String cidade;
  private String uf;
  private String complemento;
  private String numero;

  public EnderecoEntity(DadosEndereco endereco) {
    logradouro = endereco.getLogradouro();
    bairro = endereco.getBairro();
    cep = endereco.getCep();
    cidade = endereco.getCidade();
    uf = endereco.getUf();
    complemento = endereco.getComplemento();
    numero = endereco.getNumero();
  }
}
