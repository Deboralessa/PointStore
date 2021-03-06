package entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Vendas {
	
	@Id 
	@Column(name="id_vendas")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idVendas;
	
	private String titulo;
	private String valor;
	
	@ManyToOne
	@JoinColumn(name="loja_id_loja")
	private Loja loja;
	
	@ManyToOne
	@JoinColumn(name="id_meus_pontos")
	private MeusPontos meusPontos;
	
	@OneToMany
	@JoinColumn(name="id_qualificacao")
	private Qualificacao qualificacao;
	
	
	public Integer getIdVendas() {
		return idVendas;
	}
	public void setIdVendas(Integer idVendas) {
		this.idVendas = idVendas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public Loja getLoja() {
		return loja;
	}
	public void setLoja(Loja loja) {
		this.loja = loja;
	}
	public MeusPontos getMeusPontos() {
		return meusPontos;
	}
	public void setMeusPontos(MeusPontos meusPontos) {
		this.meusPontos = meusPontos;
	}
	public Qualificacao getQualificacao() {
		return qualificacao;
	}
	public void setQualificacao(Qualificacao qualificacao) {
		this.qualificacao = qualificacao;
	}

}
