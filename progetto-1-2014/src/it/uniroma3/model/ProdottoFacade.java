package it.uniroma3.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Stateless
public class ProdottoFacade {
	
    @PersistenceContext(unitName = "unit-progetto-1-2014")
    private EntityManager  em;
    
	public Prodotto createProduct(String nome, String codice, Float prezzo, String descrizione) {
		Prodotto prodotto = new Prodotto(nome, prezzo, descrizione, codice);
		em.persist(prodotto);
		return prodotto;
	}
	
	public Prodotto getProduct(Long id) {
	    Prodotto prodotto = em.find(Prodotto.class, id);
		return prodotto;
	}
	
	public List<Prodotto> getAllProdotti() {
        CriteriaQuery<Prodotto> cq = em.getCriteriaBuilder().createQuery(Prodotto.class);
        cq.select(cq.from(Prodotto.class));
        List<Prodotto> prodotti = em.createQuery(cq).getResultList();
		return prodotti;
	}

	public void updateProdotto(Prodotto prodotto) {
        em.merge(prodotto);
	}
	
    private void deleteProdotto(Prodotto prodotto) {
        em.remove(prodotto);
    }

	public void deleteProdotto(Long id) {
        Prodotto prodotto = em.find(Prodotto.class, id);
        deleteProdotto(prodotto);
	}
}