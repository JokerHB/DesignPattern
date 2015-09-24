/*
 * builder pattern must have all the part for building
 * dirctor must give the correct order of building
 */

// Builder
interface BuilderPattern {
	public boolean addName();
	public boolean addAddress();
	public boolean addPhoneNumber();
	
	public Product getProduct();
}

// Director
class Director{
	public boolean construct(BuilderPattern builder) {
		builder.addName();
		builder.addAddress();
		builder.addPhoneNumber();
		
		return true;
	}
}

// Concrete builder -- Student
class StudentBuilder implements BuilderPattern {
	private Product detail = new Product();	
	
	@Override
	public boolean addName() {
		this.detail.add("Joker");
		
		return true;
	}

	@Override
	public boolean addAddress() {
		this.detail.add(" Earth");
		
		return true;
	}

	@Override
	public boolean addPhoneNumber() {
		this.detail.add(" ***-****-****");;
		
		return true;
	}

	@Override
	public Product getProduct() {
		return this.detail;
	}
}

// Concrete builder -- Teacher
class TeacherBuilder implements BuilderPattern {
	private Product detail = new Product();
	
	@Override
	public boolean addName() {
		this.detail.add("AIF");
		
		return true;
	}

	@Override
	public boolean addAddress() {
		this.detail.add(" Earth");
		
		return true;
	}

	@Override
	public boolean addPhoneNumber() {
		this.detail.add(" ***-****-****");
		
		return true;
	}

	@Override
	public Product getProduct() {
		return this.detail;
	}
	
}

// Product
class Product {
	// MARK : variable especially class must be new !!! 
	private String detail = new String();
	
	public void add(String str) {
		if(this.detail.isEmpty()) {
			this.detail = str;
		} else {
			this.detail += str;
		}
	}
	
	public void display() {
		if (this.detail.isEmpty()) {
			System.out.println("null");

			return ;
		}
		
		System.out.println(this.detail);
	}
}

// Client
public class Builder {
	public static void main(String[] args) {
		Director direcotr = new Director();
		BuilderPattern builder_stu = new StudentBuilder();
		BuilderPattern builder_tea = new TeacherBuilder();
		Product studentProduct = new Product();
		Product teacherProduct = new Product();
		
		System.out.println("before builder is ");
		studentProduct.display();
		if (direcotr.construct(builder_stu)) {
			studentProduct = builder_stu.getProduct();
		}
		System.out.println("After builder is ");
		studentProduct.display();
		
		System.out.println("before builder is ");
		teacherProduct.display();
		if (direcotr.construct(builder_tea)) {
			teacherProduct = builder_tea.getProduct();
		}
		System.out.println("After builder is ");
		teacherProduct.display();
	}
}
