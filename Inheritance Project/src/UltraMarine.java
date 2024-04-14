
public class UltraMarine extends SpaceMarine
	{
protected int troopCount = 1000;

public UltraMarine()
{
	System.out.println("We are the Emperor's chosen");
}

public void getTroopCount()
{
	System.out.println("We have "+ troopCount + " troops among us. \n"
			+ "This is only a fraction of the total " + super.troopCount+ " Space Marines we have.");
}
	public void raiseBattleStandard()
	{
		System.out.println("For honor and the emperor!");
	}

	}
