# spring-recipes - based on the Spring 5 recipes book - Have fun with the Spring framework!
* Best practicies:
  * Dependencies should be final and wired by constructor.
  * Contents of toString must exist and be readable by an Operator.
* Logging:
  * Spring Boot logging is disabled at boot.
  * application logging is configured.
* Configuration of the ComponentScan:
  * The class SpringRecipesApplication is in a package above all the others to make the component scanning work. 
  * ComponentScan is made safely (by classes).
  * Usage of Java configuration by class (safe):
    * JavaConfiguration.class
    * and Bean5RefBean2.class
  * The packages outside the package of the class JavaConfiguration and Bean5RefBean2 are not seen (not used). 
* More to come.