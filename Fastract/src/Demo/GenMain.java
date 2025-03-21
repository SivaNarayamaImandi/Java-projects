package Demo;

public class GenMain {
	public static void Engineering(Generalization g) {
		if(g instanceof MechEngg)
		{
			MechEngg me=(MechEngg) g;
			me.writeExam();
			me.weild();
		}
		else if(g instanceof CivilEngg)
		{
			CivilEngg c=(CivilEngg)g;
			c.build();
			c.writeExam();
		}
		else {
			CSE cs=(CSE)g;
			cs.writeExam();
			cs.CsEngg();
		}
	}
	public static void main(String[] args) {
		Engineering((Generalization)new CivilEngg());
	}
}
