public class Atm {
	Object[] withdraw()
	{
		Money m=new Money();
		m.value=2000;
		Receipt r=new Receipt();
		r.date="01 may";
		Object[] p={m,r};
		return p;
		
	}

}
