package metier;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Client
{
	/** 
	 * Crée un client.
	 * @param nom le nom du client. 
	 */
	
	private String nom;
	private List<Facture> factures = new ArrayList<Facture>();
	private static List<Client> listClient = new ArrayList<>();
	
	public Client(String nom)
	{
		this.nom = nom;
		listClient.add(this);
	}

	/**
	 * Retourne le nom du client.
	 * @return le nom du client.
	 */
	
	public String getNom()
	{
		return nom;
	}
	
	/**
	 * Modifie le nom du client.
	 * @param nom le nom du client.
	 */
	
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * Créé une facture.
	 * @param montant Le montant de la facture.
	 * @return la facture créée.
	 */
	
	
	
	public Facture createFacture(int montant)
	{
//		Facture factureT = new Facture(this, montant, false, LocalDate.now());
//		facture.add(factureT);
//		return factureT;
		return createFacture(montant, false);
	}
	
	/**
	 * Retourne une copie de la liste des factures du client. 
	 * @return une copie de la liste des factures du client.
	 */
	
	
	
	public List<Facture> getFactures()
	{
		return new ArrayList<>(factures);
	}
	
	/**
	 * Retourne la somme des montants des factures.
	 * @return la somme des montants des factures.
	 */
	
	public int sommeMontants()
	{
		int somme = 0;
		for (Facture facture : factures)
			somme += facture.getMontant();
		return somme;
	}

	/**
	 * Créé une facture en précisant si elle est reglée.
	 * @param montant Le montant de la facture.
	 * @param reglée Vrai si la facture est reglée.
	 * @return la facture créée.
	 */
	
	public Facture createFacture(int montant, boolean reglee)
	{
//		Facture facture = new Facture(this, montant, reglee);
//		factures.add(facture);
		return null;
	}	
	
	/**
	 * Retourne la liste des factures reglées. 
	 * @return la liste des factures reglées.
	 */

	public List<Facture> facturesReglees()
	{
		List<Facture> facturesReglees = new ArrayList<>();
		for (Facture facture : factures)
			if(facture.estReglee())
				facturesReglees.add(facture);
		return facturesReglees;
	}
	

	/**
	 * Retourne tous les clients créés.
	 * @return une copie de la liste de tous les clients.
	 */
	public static List<Client> tous()
	{
		List<Client> clients = new ArrayList<Client>();
		for (int i = 0; i < clients.size(); i++)
			clients.add(listClient.get(i));
		return clients;
	}
	
	/**
	 * Supprime le client.
	 */
	
	public void delete()
	{
		listClient.remove(this);
	}
}
