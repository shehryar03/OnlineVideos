package inheritance_and_so_on;
/*
 * Why we need Encapsulation?
 * We use private variables and bind them with public getters and setters as the methods we can maintain log
 * files OR we can authenticate the user etc just think about server side concept we must not use variables
 * directly with objects as it may cause security issue.
 * It is better to access variables with the help of methods (getter and setters).
 */
class Tea
{
	private int type;
	private String company;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
}

public class Encapsulation 
{

	public static void main(String[] args) 
	{
		Tea t1 = new Tea();
		t1.setCompany("Lipton");
		t1.setType(1);
		System.out.print(t1.getCompany());
		System.out.println();
		System.out.print(t1.getType());
	}

}
