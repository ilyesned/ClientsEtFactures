package metier;

import java.time.LocalDate;

public class Facture
{
	private Client nom;
	private LocalDate date;
	private int montant;
	private boolean reglee;


	public Facture(Client nom, int montant, boolean reglee, LocalDate date) 
	{
		this.nom = nom;
		this.montant = montant;
		this.reglee = reglee;
		this.date = date;
	}


	public Facture(int montant2, boolean reglee2) 
	{	
		this.montant = montant2;
		this.reglee = reglee2;
	}


	/**
	 * Retourne le client à qui est adressée la facture..
	 * @return le client.
	 */
	
	public Client getClient()
	{
		return nom;
	}

	/**
	 * Retourne le montant de la facture.
	 * @return le montant de la facture.
	 */
	
	public int getMontant()
	{
		return montant;
	}

	/**
	 * Retourne vrai si la facture est reglée.
	 * @return vrai ssi la facture est reglée.
	 */
	
	public boolean estReglee()
	{
		return reglee;
	}

	/**
	 * Retourne la date de la facture.
	 * @return la date de la facture.
	 */
	
	public LocalDate getDate()
	{
		return date;
	}

	/**
	 * Supprime la facture
	 */
	
	public void delete()
	{
		nom.facturesReglees().remove(this);
	}
	
	/**
	 * Duplique la facture.
	 * @return une copie de la facture.
	 */
	
	public Facture copie()
	{
		return null;
	}
}