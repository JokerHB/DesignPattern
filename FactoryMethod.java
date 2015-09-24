/*
 * only one interface of product
 * only one kind of product 
 */

// abstract factory 
interface IFactory_Method {
	public IProduct_Method getProduct();
}

// interface of product
interface IProduct_Method {
	public void displayMethodA();
	public void displayMethodB();
}

// concrete product
class ProductA_Method implements IProduct_Method {

	@Override
	public void displayMethodA() {
		System.out.println("This is ProductA, method A");
	}

	@Override
	public void displayMethodB() {
		System.out.println("This is ProductA, method B");
	}
}

class ProductB_Method implements IProduct_Method {
	
	@Override
	public void displayMethodA() {
		System.out.println("This is ProductB, method A");
	}

	@Override
	public void displayMethodB() {
		System.out.println("This is ProductB, method B");
	}
}

// concrete factory 
class FactoryA_Method implements IFactory_Method {

	@Override
	public IProduct_Method getProduct() {
		
		return new ProductA_Method();
	}
	
}

class FactoryB_Method implements IFactory_Method {
	
	@Override
	public IProduct_Method getProduct() {
		
		return new ProductB_Method();
	}
	
}

// client
public class FactoryMethod {
	public static void main(String[] args) {
		IFactory_Method facotry = new FactoryA_Method();
		IProduct_Method product = facotry.getProduct();
		
		product.displayMethodA();
		product.displayMethodB();
	}
}