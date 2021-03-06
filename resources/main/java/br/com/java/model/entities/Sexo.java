package br.com.java.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "sexo")
public class Sexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "IdSexo", nullable = false)
	private Integer idSexo;

	@Column(name = "Descricao", unique = true, nullable = false, length = 9)
	private String descricao;

	@OneToMany(mappedBy = "sexo", fetch = FetchType.LAZY)
	@ForeignKey(name = "PessoaSexo")
	private List<Pessoa> pessoas;

	public Sexo() {
		super();
	}

	public List<Pessoa> getPessoa() {
		return pessoas;
	}

	public void setPessoa(List<Pessoa> pessoa) {
		this.pessoas = pessoa;
	}

	public Integer getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idSexo == null) ? 0 : idSexo.hashCode());
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
		Sexo other = (Sexo) obj;
		if (idSexo == null) {
			if (other.idSexo != null)
				return false;
		} else if (!idSexo.equals(other.idSexo))
			return false;
		return true;
	}

}
