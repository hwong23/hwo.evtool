package hwo.evtool;

public class Evaluacion {

	public static void main(String args[]) {
		Criterio equipoClave = new EquipoClave();
		equipoClave = new CriterioDirector (equipoClave);
		equipoClave = new CriterioArquitecto (equipoClave);

		System.out.println(equipoClave.getDescription()
				+ " $" + equipoClave.cost());

		// Beverage beverage2 = new DarkRoast();
		// beverage2 = new Mocha(beverage2);
		// beverage2 = new Mocha(beverage2);
		// beverage2 = new Whip(beverage2);
		// System.out.println(beverage2.getDescription()
		// 		+ " $" + beverage2.cost());
    //
		// Beverage beverage3 = new HouseBlend();
		// beverage3 = new Soy(beverage3);
		// beverage3 = new Mocha(beverage3);
		// beverage3 = new Whip(beverage3);
		// System.out.println(beverage3.getDescription()
		// 		+ " $" + beverage3.cost());
	}
}
