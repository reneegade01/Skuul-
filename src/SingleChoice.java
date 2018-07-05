import java.util.List;

public class SingleChoice implements Question {
	
	private List<String> answers;
	
	SingleChoice(String a1, String a2)
	{
		answers.add(0, a1); 
		answers.add(1, a2);
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
