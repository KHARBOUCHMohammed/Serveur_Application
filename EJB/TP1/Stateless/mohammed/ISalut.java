package mohammed;
import javax.ejb.Remote;

@Remote
public interface ISalut {
    public String salut(String name);
}
