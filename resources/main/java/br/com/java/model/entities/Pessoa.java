package br.com.java.model.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "Pessoa")
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	// autoIncremento
	@Column(name = "IdPessoa", nullable = false)
	private Integer idPessoa;

	@Column(name = "Nome", nullable = false, length = 80)
	private String nome;

	@Column(name = "E-mail", nullable = false, length = 80)
	private String email;

	@Column(name = "Telefone", nullable = false, length = 15)
	private String telefone;

	@Column(name = "CPF", nullable = false, length = 14)
	private String cpf;

	@Column(name = "Data_De_Nasciemnto", nullable = false)
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dataDeNascimento;

	@Column(name = "Data_De_Cadastro", nullable = false)
	@Temporal(javax.persistence.TemporalType.DATE)
	private Date dataDeCadastro;

	@ManyToOne(optional = false)
	@ForeignKey(name = "PessoaSexo")
	private Pessoa pessoas;

	public Pessoa() {
		super();
	}

	public Pessoa getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa pessoas) {
		this.pessoas = pessoas;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public Date getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(Date dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idPessoa == null) ? 0 : idPessoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		if (idPessoa == null) {
			if (other.idPessoa != null)
				return false;
		} else if (!idPessoa.equals(other.idPessoa))
			return false;
		return true;
	}

}
