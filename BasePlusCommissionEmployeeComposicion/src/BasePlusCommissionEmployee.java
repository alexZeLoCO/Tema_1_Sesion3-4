
public class BasePlusCommissionEmployee {

	private CommissionEmployee employee;
	private double base;
	
	//Constructor
	public BasePlusCommissionEmployee ( String first, String last, String ssn, double sales, double rate, double base) {
		employee=new CommissionEmployee(first,last,ssn,sales,rate);
		setBase(base);
	}
	
	//Setters
	public void setFirstName (String Name) {
		employee.setFirstName(Name);
	}
	
	public void setLastName (String Last) {
		employee.setLastName(Last);
	}
	
	public void setSsn (String ssn) {
		employee.setSocialSecurityNumber(ssn);
	}
	
	public void setSales (double sales) {
		employee.setGrossSales(sales);
	}
	
	public void setCommissionRate (double rate) {
		employee.setCommissionRate(rate);
	}
	
	public void setBase(double base) {
		if (base>=0) {
			this.base=base;
		} else  {
			System.out.println("Base Salary entered not valid.");
		}
	}
	
	//Observers - Getters
	public String getFirstName() {
		return employee.getFirstName();
	}
	
	public String getLastName() {
		return employee.getLastName();
	}
	
	public String getSsn() {
		return employee.getSocialSecurityNumber();
	}
	
	public double getSales() {
		return employee.getGrossSales();
	}
	
	public double getCommissionRate() {
		return employee.getCommissionRate();
	}
	
	public double getBase() {
		return base;
	}

	//earnings calculation
	public double earnings() {
		return employee.earnings() + getBase();
	}
	
	@Override
	public String toString() {
		return String.format("BasePlusCommissionEmployee: \n \t First & Last names: %s, %s. \n \t SSN: %s. \n \t Base salary: %.2f€. \t Commission Rate: %.2f \n \t Gross Sales: %.2f. \t Total Earnings: %.2f€. \n",
															getLastName(),getFirstName(),		getSsn(),			getBase(),		getCommissionRate(),		getSales(),				earnings());
	}
	
	/*
	 * C) VENTAJAS/DESVENTAJAS DE USAR COMPOSICIÓN:
	 * 
	 * 	-Ventajas:	Una vez hecha CommissionEmployee, sólo se usa BasePlusCommissionEmployee
	 * 				No es necesario usar atributos de CommissionEmployee en BasePlusCommissionEmployee
	 * 
	 * 	-Desventajas: Necesario duplicar todos los métodos de CommissionEmployee en BasePlusCommissionEmployee
	 */
}
