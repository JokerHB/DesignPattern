// demo class
class APaper implements Cloneable {
	private String str = new String();
	
	public APaper() {
		this.str = "Hi,I'm APaper";
	}
	
	// settings for clone,u can set copy method here
	public APaper clone() {
		APaper obj = null;
		
		try {
			obj = (APaper)super.clone();
		}
		catch(CloneNotSupportedException exception) {
			System.err.println("AbstractPaper is not Cloneable");  
		}
		
		return obj;
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public void display() {
		System.out.println(this.str);
	}
	
}

public class Prototype {
	public static void main(String[] args) {
		APaper pA = new APaper();
		APaper pB = pA.clone();
		APaper pC = pA;
		
		System.out.println("before set pA");
		pA.display();
		pB.display();
		pC.display();
		
		pA.setStr("now I'm PaperB");
		
		System.out.println("after set pA");
		pA.display();
		pB.display();
		pC.display();
	}
}
