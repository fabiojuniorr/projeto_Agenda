package br.com.java.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.stream.events.EndElement;

import org.hibernate.annotations.ForeignKey;

@Entity
@Table(name = "Tipo_Endereco")
public class TipoEndereco implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "Id_Tipo_Endereco", nullable = false)
	private Integer idTipoEndereco;

	@Column(name = "Descricao_Tipo_Endereco", nullable = false)
	private String descricaoTipoEndereco;

	@OneToMany(mappedBy = "Tipo_Endereco", fetch = FetchType.LAZY)
	@ForeignKey(name = "Endereco_TipoEndereco")
	private List<Endereco> enderecos;

	public TipoEndereco() {
		super();
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	public Integer getIdTipoEndereco() {
		return idTipoEndereco;
	}

	public void setIdTipoEndereco(Integer idTipoEndereco) {
		this.idTipoEndereco = idTipoEndereco;
	}

	public String getDescricaoTipoEndereco() {
		return descricaoTipoEndereco;
	}

	public void setDescricaoTipoEndereco(String descricaoTipoEndereco) {
		this.descricaoTipoEndereco = descricaoTipoEndereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((idTipoEndereco == null) ? 0 : idTipoEndereco.hashCode());
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
		TipoEndereco other = (TipoEndereco) obj;
		if (idTipoEndereco == null) {
			if (other.idTipoEndereco != null)
				return false;
		} else if (!idTipoEndereco.equals(other.idTipoEndereco))
			return false;
		return true;
	}

}
