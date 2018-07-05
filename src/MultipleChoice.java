import java.util.List;
import java.util.ArrayList; 

public class MultipleChoice implements Question {
	
	private final int NUMBER_OF_ANSWER_CHOICES = 4; 
	private List<String> answers = new ArrayList<String>(NUMBER_OF_ANSWER_CHOICES);
	
	MultipleChoice(String a, String b, String c, String d)
	{
			answers.add(0, a); 
			answers.add(1, b);
			answers.add(2, c);
			answers.add(3, d);
	}
	
	@Override
	public List<String> getAnswers()
	{
		return answers; 
	}
	
	@Override 
	public void displayAnswers()
	{
		System.out.println(answers); 
	}

}
