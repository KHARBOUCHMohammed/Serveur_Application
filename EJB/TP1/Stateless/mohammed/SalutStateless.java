package mohammed;
import javax.ejb.Stateless;


@Stateless
public class SalutStateless implements ISalut{

    @Override
    public String salut(String name) {
     

        return "Salut " + name;
    }
    
}
