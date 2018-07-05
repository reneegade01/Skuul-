import java.util.Arrays;
import java.util.List;

public class iVoteService implements Service {
	
	private Question question; 
	private List<String> submissions;
	private List<Student> students;
	private int[] counters; 
	private String anAnswer;
	
	iVoteService(Question q, String question, List<Student> st)
	{
		this.question = q;
		counters = new int[q.getAnswers().size()];
		this.students = st;
		System.out.println(question);
	}
	
	@Override
	public void acceptSubmissions()
	{
		for (int i = 0; i < students.size(); i++) {
			anAnswer = students.get(i).getSubmittedAnswer();
			submissions.add(i, anAnswer + "\n");
		}			
	}
	
	private void calculateStatistics()
	{
		int amount = 0; 
		for (int i = 0; i < submissions.size(); i++) 
		{
			for (int j = 0; j < counters.length; j++)
			{
				if (submissions.get(i).equals(question.getAnswers().get(j))) 
				{
					counters[j] = amount++;	
				}
			}	
		}
	}
	
	
	public void displayStatistics()
	{
		calculateStatistics(); 
		for (String temporary : question.getAnswers())
		{
			System.out.println(temporary); 
			for (int j = 0; j < counters.length; j++)
			{
				System.out.println(counters[j]); 
			}
		}
	}

}
