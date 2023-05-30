package mohammed;
import javax.ejb.Stateful;


@Stateful
public class SaluerStateful implements ISaluer{

  public String name;

  @Override
  public String salut(String name){
     this.name=name;
     return "Salut " + name;
  }

  @Override
  public String re_salut(){

    return "Resault "+this.name ;

  }

}
