package softserve.lopushanska.miniproject.model;

public class User {
	private int Id;
	private String name;
	private int age;
	private String email;
	private String placeOfWork;

	public User() {
	}

	public User(int Id, String name, int age, String email, String placeOfWork) {
		this.Id = tId;
		this.name = name;
		this.age = age;
		this.email = email;
		this.placeOfWork = placeOfWork;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
        	return email;
    }

    public void setEmail(String email) {
        	this.email = email;
    	}
	
	public String getPlaceOfWork() {
        	return placeOfWork;
    	}

    	public void setPlaceOfWork(String placeOfWork) {
        	this.placeOfWork = placeOfWork;
    	}
	
}
