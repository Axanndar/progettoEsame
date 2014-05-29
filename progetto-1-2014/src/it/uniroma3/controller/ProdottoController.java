package it.uniroma3.controller;

import java.util.List;

import it.uniroma3.model.Prodotto;
import it.uniroma3.model.ProdottoFacade;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;


@ManagedBean
public class ProdottoController {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private Float prezzo;
	private String descrizione;
	private String codice;
	private Prodotto prodotto;
	private List<Prodotto> prodotti;
	
	@EJB
	private ProdottoFacade productFacade;
	
	public String createProdotto() {
		this.prodotto = productFacade.createProduct(nome, codice, prezzo, descrizione);
		return "prodotto"; 
	}
	
	public String listProdotti() {
		this.prodotti = productFacade.getAllProdotti();
		return "prodotti"; 
	}

	public String findProdotto() {
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}
	
	public String findProdotto(Long id) {
		this.prodotto = productFacade.getProduct(id);
		return "prodotto";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}
}


