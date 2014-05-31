package it.uniroma3.model;

import java.util.List;
import javax.persistence.*;

@Entity
@NamedQuery(name = "findAllProdotti", query = "SELECT p FROM Prodotto p")
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	private Float prezzo;

	@Column(length = 2000)
	private String descrizione;

	@Column(nullable = false)
	private String codice;

	@ManyToMany(mappedBy = "prodotti")
	private List<Fornitore> fornitori;

	public Prodotto() {
	}

	public Prodotto(String nome, Float prezzo, String descrizione, String codice) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
		this.codice = codice;
	}

	// Getters & Setters

	public Long getId() {
		return id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodice() {
		return this.codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public boolean equals(Object obj) {
		Prodotto prodotto = (Prodotto) obj;
		return this.getCodice().equals(prodotto.getCodice());
	}

	public int hashCode() {
		return this.codice.hashCode();
	}

	public void setId(Long id) {
		this.id = id;
	}

}