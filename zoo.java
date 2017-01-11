import java.util.*;

public class Zoo{
  
  private ArrayList<Animal> cage;


  public Zoo(){
    this.cage = new ArrayList<Animal>();
  }
  

  public void encage(Animal guest){
    cage.add(guest);
  }


  public int animalCount(){
    return cage.size();
  }

  public Animal free(){
    if(animalCount > 0){
      return cage.remove(0)
    }
  }

  public void empty() {
    cage.clear();
  }
}


