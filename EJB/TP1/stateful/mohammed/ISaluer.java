package mohammed;
import javax.ejb.Remote;

@Remote
public interface ISaluer {

  public String salut(String name);

  public String re_salut();

}
