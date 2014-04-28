package br.com.java.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "Id_Endereco", nullable = false)
	private Integer idEndereco;

	@Column(name = "Bairro", nullable = false)
	private String bairro;

	@Column(name = "Nome_Logradouro", nullable = false)
	private String nomeLogradouro;

	@Column(name = "CEP", nullable = false)
	private String cep;

	@Column(name = "Numero", nullable = false)
	private Integer numero;

	@Column(name = "Complemento", nullable = false)
	private Integer complemento;

}
