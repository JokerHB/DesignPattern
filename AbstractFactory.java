/*
 * can build many interface of product
 * kinds of product
 */

// abstract product A
interface IProductA {
	public void display();
}

// abstract product B
interface IProductB {
	public void display();
}

// concrete product A
class ProductA implements IProductA {
	
	@Override
	public void display() {
		System.out.println("Hello,This is product A");
	}
}

// concrete product B
class ProductB implements IProductB {
	
	@Override
	public void display() {
		System.out.println("Hello,This is product B");
	}
}

// abstract factory
interface IFactory {
	public IProductA getProductA();
	public IProductB getProductB();
}

// factory that produce different class
class Factory implements IFactory {
	
	@Override
	public IProductA getProductA() {
		return new ProductA();
	}
	
	@Override
	public IProductB getProductB() {
		return new ProductB();
	}
}

public class AbstractFactory {
	public static void main(String[] args) {
		IFactory factory = new Factory();
		factory.getProductA().display();
		factory.getProductB().display();
	}
}
