# spring-recipes - based on the Spring 5 recipes book - Have fun with the Spring framework!
* Best practicies:
  * Dependencies should be final and wired by constructor.
  * Contents of toString must be readable by an Operator.
* Logging:
  * Spring Boot logging is disabled at boot.
  * application logging is configured.
* Configuration of the ComponentScan:
  * The class SpringRecipesApplication is in a package above all the others to make the component scanning work. 
  * ComponentScan is made safely (by classes).
  * Usage of SequenceGeneratorConfiguration.class (safe).
  * The packages outside the package of the class SequenceGeneratorConfiguration are not seen (not used) 
  and the class ShoudNotBeInstantiated is not instantiated. 
* The package shop is used to demo configuration invoking constructors.
   * An extra class ProductAdmin was added to demo the wiring of an array and a List of beans (artificial).
   * This is to demo the case (should not happen) when a type is wired to multiple beans.
  