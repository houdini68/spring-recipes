# spring-recipes - based on the Spring 5 recipes book - Have fun with the Spring framework!
* Best practicies:
  * Dependencies should be final and wired by constructor.
  * Contents of toString must exist and be readable by an Operator (human being).
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
* IoC
  * bean1 of type Bean1:
    * Nothing fancy here. A bean with 2 attributes. bean1 is constructed by Java configuration.
  * bean21, bean22 and bean23 of type Bean2:
    * Several beans of the type Bean2. If nothing is done, if the type Bean2 is autowired then an error is reported 
    because there are more than 1 bean of type Bean2 and Spring doesn't know which bean of type bean2 to choose.
  * bean5RefBean2 of type Bean5RefBean2:
    * bean5RefBean2 does make usage of the type Bean2. As there are several beans of typeBean2 that are declared
  , the bean Bean5RefBean2 **must** reference **a collection** of type Bean2. An array, a List and a Map. 
  bean5RefBean2 is not constructed by Java configuration but uses the annotation Component that is automatically
   discovered by Spring.
  * bean3 of type Bean3:
    * bean3 is reference by the bean bean4RefBean3.
  * bean4RefBean3 of type Bean4RefBean3:
    * bean4RefBean3 is constructed by Java configuration and makes a reference to type Bean3. In the Java configuration
    , the method bean3() is used to pass a bean of type Bean3.
  * If there is only one constructor and this constructor makes usage of beans then it must not be annotated by Autowired.
  Sring does add aut. then annotation Autowired.
  * bean6NotInstantiated of type Bean6NotInstantiated
    * As the name implies, the bean bean6NotInstantiated is not instantiated because it is not instantiated
     by Java configuration and does not use the annotation Component (commented ou in the code).
  * bean7RefBean6NotInstantiated of type Bean7RefBean6NotInstantiated
    * The bean bean7RefBean6NotInstantiated makes a reference to bean6NotInstantiated that does not exist. 
    If nothing is done an error is reported at runtime by Spring: 
    <BR>***************************
    <BR>APPLICATION FAILED TO START
    <BR>***************************
    <BR>Description:
    <BR>Parameter 0 of constructor in com.rudyvissers.springrecipes.javaconfiguration.components.Bean7RefBean6NotInstantiated
     required a bean of type 'com.rudyvissers.springrecipes.javaconfiguration.components.Bean6NotInstantiated'
     that could not be found.
    * It is why Autowired is passed the parameter 'required = false' but of course the reference to bean6NotInstantiated
     is null.
   * bean8Father of type Bean8Father.