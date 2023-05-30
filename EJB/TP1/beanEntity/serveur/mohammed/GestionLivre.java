package mohammed;
import javax.ejb.*;
import javax.persistence.*;

@Stateless
public class GestionLivre implements IGetsionLivre{
	
	@PersistenceContext(unitName="MonLivrePersistence")
	protected EntityManager em;
	
	@Override
	public void nouveauLivre(String isbn, String titre ){

        Livre livre =new Livre(isbn , titre);
        em.persist(livre);

    }
    
	@Override
  	public void supprimerLivre(String isbn){

  		Livre livre = em.find(Livre.class,isbn);
  		if(livre!=null)
  		{
  			em.remove(livre);
  		}
  		}
  		
	@Override
  	public String emprinterLivre(String isbn){
		  Livre livre = em.find(Livre.class,isbn);
		  // on verifie si le livre existe dans la base de donnée
		  if(livre != null){
		  
		  
		  // si le livre est disponible 
	       if(livre.getDispo() == 1){
			   // on affect 0; pour l'emprinter
			   livre.setDispo(0);
			   return "le livre a été emprunter avec succès";
	 
	       }else{
	      	  return "Ce livre n'est pas disponibe , vous ne pouvez pas l'emprunter";
	       }
        
        }else{
           return "Le livre n'est pas  diponible dans la BD";
        }


  }


    @Override
  public String rendreLivre(String isbn){

   // vérifier si le livre existe dans la BD
      Livre livre = em.find(Livre.class , isbn);

       if(livre != null){
      
	      //on rendre le livre
	      if(livre.getDispo() == 0){
              
               livre.setDispo(1);  
               return "le livre a été rendu";
	             
	      }else{
	           return "Ce livre est déja disponibe ";
	      }
       }else{
       	    return " Ce livre n'éxiste pas";
       }
   

}
	
}

