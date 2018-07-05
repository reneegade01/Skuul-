import java.util.List; 
import java.util.ArrayList;

public class SimulationDriver {
	
	public static void main (String args[]) {
	
		Question multipleChoice = new MultipleChoice("A", "B", "C", "D");
		Question singleChoice = new SingleChoice("True", "False");
		List<Student> students = new ArrayList<Student>();
		Student one = new Student();
		Student two = new Student();
		students.add(0, one);
		students.add(1, two); 
		Service iVote = new iVoteService(singleChoice, "Question?", students);
		one.submitAnswer("True");
		two.submitAnswer("False");
		iVote.acceptSubmissions();
		iVote.displayStatistics(); 
		Service vote = new iVoteService(multipleChoice, "What is your favorite of these letters?", students);
		one.submitAnswer("A");
		two.submitAnswer("B");
		one.submitAnswer("C");;
		vote.acceptSubmissions();
		vote.displayStatistics(); 
	}
	
}
