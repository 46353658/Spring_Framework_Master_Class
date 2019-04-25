// SPRING IS A DEPENDENCY INJECTION FRAMEWORK

// ComplexBusinessService is tightly coupled with BubbleSortAlgorithm

	public class ComplexBusinessService {
		SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
	...
	public class BubbleSortAlgorithm implements SortAlgorithm {
	...

// Removal of tight coupling

	public class ComplexBusinessService {
		SortAlgorithm sortAlgorithm; // = new BubbleSortAlgorithm();
		public ComplexBusinessService(SortAlgorithm sortAlgorithm) {
			this.sortAlgorithm = sortAlgorithm;
		}	
	}

// Whoever wants to use the ComplexBusinessService can provide the SortAlgorithm

	SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
	ComplexBusinessService businessService = new ComplexBusinessService(sortAlgorithm);

// How does Spring know to create an instance of BubbleSortAlgorithm?
// How does Spring know to create an instance of ComplexBusinessService and populate
// instance of BubbleSortAlgorithm?

// Basically how does it know to do this?

	SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
	ComplexBusinessService businessService = new ComplexBusinessService(sortAlgorithm);

// @Component annotation tells Spring it needs to manage these instances:

	@Component
	public class ComplexBusinessService {
		SortAlgorithm sortAlgorithm;
	...
	@Component
	public class BubbleSortAlgorithm implements SortAlgorithm {
	...

// In order to indicate that sortAlgorithm is a dependency of ComplexBusinessService,
// you use the @Autowired annotation, Spring manages the instances of every class
// with the @Component annotation, with @Autowired -> Spring will look for the
// dependency among the components it manages to find a match

// Spring will create an instance of BubbleSortAlgorithm and it will pass it
// to the constructor of ComplexBusinessService when creating an instance

	@Component
	public class ComplexBusinessService {

		@Autowired
		SortAlgorithm sortAlgorithm;
	...
	@Component
	public class BubbleSortAlgorithm implements SortAlgorithm {
	...

// Terminology

	//Beans:

		//With the @Component annotation we are telling Spring to manage 
		//instances of ComplexBusinessService and BubbleSortAlgorithm,
		//these instances are called Beans

		//Beans are the different objects managed by the Spring framework

	//Autowiring:

		//The process where Spring identifies the dependencies, identifies
		//the matches for the dependencies and populates them 

	//Dependency injection:

		//Injecting the instance required into the Bean that requires it

	//Inversion Of Control:

		//The instance of the dependency is no longer created by the class
		//that needs it itself, the control is given to the framework
		//instead

	//IOC Container:

		//A generic term that represents anything implementing Inversion Of 
		//Control. In the Spring framework the typical IOC Container is '
		//the Application Context

	//Application Context:

		//Is where all the beans are created and managed, where all the 
		//core logic of the Spring framework happens

/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/

// DEPENDENCIES

	@Component
	public class TodoController {

		@Autowired
		TodoBusinessService businessService;
	...

	@Component 
	public class TodoBusinessService {

		@Autowired
		TodoDataService dataService;
	...

	@Component
	public class TodoDataService {

		@Autowired
		JdbcTemplate template;


/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/

// BEAN SCOPE

	// Default - singleton

	// singleton - One instance per Spring Context
		// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
	// prototype - New bean whenever requested
		// @Scope("prototype")
		// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	// request - One bean per HTTP request
	// session - One bean per HTTP session

/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/

// CDI (Context and dependency injection) -> An interface defining how to do dependency injection

	// Java EE Dependency Injection Stardard (JSR-330)

	// Spring supports most annotations
		// @Inject (@Autowired)
		// @Named (@Component & @Qualifier)
		// @Singleton (Defines a scope of Singleton)

/*-----------------------------------------------------------------------------*/
/*-----------------------------------------------------------------------------*/

	// What are the beans? -> Marked with @Component
	// What are the dependencies of a bean? -> Marked with @Autowired
	// Where to search for beans? => No need because of @SpringBootApplication (current package and subpackages will be searched) 
