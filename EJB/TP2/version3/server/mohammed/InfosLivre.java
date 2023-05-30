package mohammed;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface InfosLivre {
    String getTitreParISBN(String isbn);
    List<String> getLivresDisponibles();
}