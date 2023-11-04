package br.com.igorsalves.vollmed.entity;

import javax.persistence.*;

import br.com.igorsalves.vollmed.dto.paciente.DadosCadastroPaciente;
import lombok.*;

@Getter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Paciente")
@Table(name = "pacientes")
public class PacienteEntity {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String cpf;
    private String telefone;

    @Embedded
    private EnderecoEntity endereco;

    public PacienteEntity(DadosCadastroPaciente dados) {
        nome = dados.getNome();
        email = dados.getEmail();
        telefone = dados.getTelefone();
        cpf = dados.getCpf();
        endereco = new EnderecoEntity(dados.getEndereco());
    }
}