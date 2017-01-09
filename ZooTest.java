import static org.junit.Assert.assertEquals;
import org.junit.*;



public class ZooTest{
 Zoo zoo;
 Animal animal;

 @Before 
 public void before() {
   zoo = new Zoo();
   animal = new Animal("Simba");
 }
 
 @Test 
 public void hasName(){
  assertEquals("Simba", animal.getName());
 }

 @Test
 public void startsWithNoAnimal(){
   assertEquals(0, zoo.animalCount());
 }

 @Test
 public void canEncage(){
  zoo.encage(animal);;
  assertEquals(1,zoo.animalCount());
 }


}  