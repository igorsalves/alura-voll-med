package br.com.igorsalves.vollmed.entity;

import javax.persistence.Embeddable;

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
}
