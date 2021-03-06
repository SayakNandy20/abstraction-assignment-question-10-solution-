package paretchildabs10;

public class PermanentEmployee extends Employee {
private float pfpercentage;
private float pfamount;


public PermanentEmployee(String name, float salary, float netsalary, float pfpercentage, float pfamount) {
	super(name, salary, netsalary);
	this.pfpercentage = pfpercentage;
	this.pfamount = pfamount;
}
public float getPfpercentage() {
	return pfpercentage;
}
public void setPfpercentage(float pfpercentage) {
	this.pfpercentage = pfpercentage;
}
public float getPfamount() {
	return pfamount;
}
public void setPfamount(float pfamount) {
	this.pfamount = pfamount;
}
public void findnetsalary()
{
	float pfamount=(super.getSalary()*this.pfpercentage)/100;
	this.setPfamount(pfamount);
	float netsalary=super.getSalary()-pfamount;
	this.setNetsalary(netsalary);
}
public boolean validateinput(float salary,float pfpercent)
{
	if(salary>0 && pfpercent>=0)
		return true;
	else 
		return false;
}
}
