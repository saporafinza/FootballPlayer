
public class FootballPlayerTest {

	public static void main(String[] args) {

		FootballPlayer Ronaldo = new FootballPlayer();
		
		Ronaldo.name = "Cristiano Ronaldo";
		Ronaldo.no = 7;
		Ronaldo.inPlay = true;
		Ronaldo.minutes = 0;
		Ronaldo.numberOfGoals = 0;
		
		
		Ronaldo.play(15);
		Ronaldo.score();
		Ronaldo.score();
		
		System.out.println("Number of goals Ronaldo scored: " + Ronaldo.numberOfGoals);
		System.out.println("In minutes to play Ronaldo " + Ronaldo.minutes);
		System.out.println("Ronaldo have " + Ronaldo.no + " form number" );
		
		
		
		
		
		
		
		
	}

}
