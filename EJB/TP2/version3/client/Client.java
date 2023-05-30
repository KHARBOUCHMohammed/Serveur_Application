import javax.naming.InitialContext;
import javax.naming.Context;
import javax.naming.NamingException;
import java.util.Scanner;
import mohammed.GestionEmprunts;
import mohammed.InfosLivre;
import java.util.List;
import java.util.ArrayList;

public class Client {

  public static void main(String[] args) throws NamingException {

    Scanner scanner = new Scanner(System.in);

    InitialContext context = new InitialContext();
    GestionEmprunts gestionEmprunts = (GestionEmprunts) context.lookup("mohammed.GestionEmprunts");
     InfosLivre infosLivre = (InfosLivre) context.lookup("mohammed.InfosLivre");
      


      int ident, identLivre, ide;
      String nombre;

   while(true){
    System.out.println("Bienvenue dans le client");
    System.out.println("Choisisez un numero SVP ....");
    System.out.println("Pour Emprunter un livre: Merci de saisir 1");
    System.out.println("Pour Rendre un livre: Merci de saisir 2");
    System.out.println("Pour voir les livres disponibles: Merci de saisir 3");

       nombre = scanner.nextLine();
     
         switch(nombre)
         {
           case "1": 
            System.out.println("Merci de saisir votre ID: ");
            ident = scanner.nextInt();
             gestionEmprunts.initSession(ident);

             System.out.println("Merci de saisir Identifiant de livre a emprinter : ");

             identLivre = scanner.nextInt();
             gestionEmprunts.emprunter(Integer.toString(identLivre));

             System.out.println("Livre emprinter avec succeess!");
             break;


           case "2":
             System.out.println("Merci de saisir votre ID: ");
             ident = scanner.nextInt();
             gestionEmprunts.initSession(ident);

             System.out.println("Merci de saisir Identifiant de livre a rendre : ");

              identLivre = scanner.nextInt();
             gestionEmprunts.rendre(Integer.toString(identLivre));

             System.out.println("Livre rendu avec succeess!");

          
           break;


           case "3":
          
             System.out.println("livre disponibles: ");
              ide = scanner.nextInt();
              String titre = infosLivre.getTitreParISBN(Integer.toString(ide));
              System.out.println("Titre du livre : " + titre);

              List<String> titres = infosLivre.getLivresDisponibles();
              System.out.println("Livres disponibles : ");
                for (String titre2 : titres) 
                {
                  System.out.println("- " + titre2);
                }

            
           break;



          }
    }



}






    //  gestionEmprunts.initSession(151);

    //  gestionEmprunts.emprunter("151");

     // gestionEmprunts.rendre("151");

     /* InfosLivre infosLivre = (InfosLivre) context.lookup("mohammed.InfosLivre");
      
      // Récupération du titre d'un livre par son ISBN
      String titre = infosLivre.getTitreParISBN("151");
      System.out.println("Titre du livre : " + titre);

      List<String> titres = infosLivre.getLivresDisponibles();
        System.out.println("Livres disponibles : ");
        for (String titre2 : titres) {
            System.out.println("- " + titre2);
        }
*/












}
