
public class Quiz implements Measurable 
{

	private String name;
	private int score;
	
	public Quiz(String na,int sc)
	{
		name = na;
		score = sc;
	}
	
	public double getMeasure()
	   {
	      return score;
	   }
	
}//Quiz