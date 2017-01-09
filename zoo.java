public class Zoo{
  private String name;
  private Animal[] cage;


  public Zoo(String name){
    this.name = name;
    this.cage = new Animal[10];

  }
  
  public String getName(){
    return this.name;
  }

  public void encage(Animal eg){
   if (isCageFull()) return;

    int nextIndex = animalCount();
    cage[nextIndex] = eg;
  }

  public int animalCount(){
    int count = 0;
    for (Animal animal : cage){
      if (animal != null) {
        count += 1;
      }
    }
    return count; 
  }
  public boolean isCageFull(){
    return animalCount() == cage.length;
  }

  public void empty() {
    for(int i=0; i< cage.length; i++) {
      cage[i] = null;
    }
  }
}