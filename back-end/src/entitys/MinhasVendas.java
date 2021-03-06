package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class MinhasVendas {
		
	@Id
	@Column(name="id_minhas_vendas")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMinhasVendas;
	
	@OneToMany
	@JoinColumn(name="id_vendas")
	private Vendas vendas;
	

	public Integer getIdMinhasVendas() {
		return idMinhasVendas;
	}

	public void setIdMinhasVendas(Integer idMinhasVendas) {
		this.idMinhasVendas = idMinhasVendas;
	}

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

}
