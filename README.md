# spring-recipes - based on the Spring 5 recipes book - Have fun with the Spring framework!
16 September 2018
* Best practicies:
  * Dependencies should be final and wired by constructor.
* How to disable the Spring Boot logging at boot?
* How to configure the application logging?
* How to configure the ComponentScan?
  * Configuration of the ComponentScan safely.
  * Inclusion of SequenceGeneratorConfiguration.class (safe)
  * and the packages outside the package of the class SequenceGeneratorConfiguration are not seen
  * and so is the class ShoudNotBeInstantiated not instantiated 
  * The class SpringRecipesApplication is in a package above all the others to make the component scanning work.
 * The package shop is used to demo configuration invoking constructors.
   * An extra class ProductAdmin was added to demo the wiring of an array and a List of beans (artificial).
  