  # Section 9 - Constructors, Method Overloading, Reserved word "this", Attribute Encapsulation

  ## Constructors

  Constructors are class operations that are executed when an object is instantiated. **They also define in which conditions an object can be instantiated**. For instance, if you are registering a new student, you can define your constructor to ask for name, course and contact information in such a manner that a student **can only be registered if those essential data fields are properly filled**. That way, you can avoid that a student register without name is improperly created.

```
public class Student {
	
	private String name;
	private String email;
	private String course;
	
	public Student( String name, String email, String course) {
		this.name = name;
		this.email = email;
		this.course = course;
	}

    [...]
}
```

  ## "This" reserved keyword

  _"This"_ is a special word that specifies that an variable is referring to a Class attribute and not a local variable. For example, if your student constructor has a local variable "name" you'll use "_this.name_" to refer to the Class attribute "name" and not to the local variable "name".

  ```
public Tenant( String name, String email, String course) {
		this.name = name;
		this.email = email;
		this.course = course;
	}
  ```

  ## Method overloading

You can make multiple methods with the same name, that is called method overloading. This is specially useful if you want a class to have more than one constructor option, allowing for different ways to instantiate an objetc. For example, let's suppose you want blood type and an extra contact option to be an _avaliable_ but _optional_ data to be informed while creating a new student register: you can create multiple constructors named "Student" allowing for different instatiation options.

```
public class Student {
	
	private String name;
	private String email;
	private String course;
    private String bloodType;
    private String extraContact;
	
	public Student( String name, String email, String course) {
		this.name = name;
		this.email = email;
		this.course = course;
	}

    public Student( String name, String email, String course, String extraContact) {
		this.name = name;
		this.email = email;
		this.course = course;
        this.extraContact = extraContact;
	}

    public Student( String name, String email, String course, String bloodType) {
		this.name = name;
		this.email = email;
		this.course = course;
        this.bloodType = bloodType;
	}

    [...]
}
```
  ## Encapsulation

Encapsulation is way to limit how a class attributes can be accessed. For instance, if a students course is a private attribute you won't be able to directly access that attribute from another class, in other words, you won't be able to freely assign different values to the "course" attribute. 

This is useful to stablish rules in a project about how an attribute should be manipulated or to comply your code design to ceratin bussiness rules. 

So, if "course" is a private attribute, you'll need to write a method that defines how it can be acessed: which data must be informed? which data is valid? which steps are mandatory, to avoid insconsistencies? This way, if you or someone else is developing code that involves manipulating that attribute, whenever trying to access it you'll be able to see what is the way it should be done.

Another example: in [banking operations](./exercises/entities/Account.java), you can limit the ways an account balance can be modified, maybe it can only be modified when a deposit or a withdraw is done. To avoid it being arbitrarily modified, the attribute is made private and methods such as Deposit and Withdraw establish the proper way to perform these operations.

```
public class Account {
	
	private int accountID;
	private String accountHoldersName;
	private double accountBalance;
	private static final double WITHDRAWL_TAX = 5.00;
	
	[...]

	public void Deposit( double depositValue ) {
		accountBalance += depositValue;
	}
	
	public void Withdrawl( double withdrawlValue ) {
		accountBalance = accountBalance - withdrawlValue - WITHDRAWL_TAX;
	}
	
	public String toString() {
		return "Account " + accountID
				+ ", Holder: " + accountHoldersName
				+ ", Balance: $ " + String.format("%.2f", accountBalance);
	}
}
```