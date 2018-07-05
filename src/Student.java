
public class Student {
	
	private String studentID;
	private String submittedAnswer; 
	
	Student()
	{
		studentID = toString();
	}
	
	String getID() 
	{
		return studentID; 
	}
		
	void submitAnswer(String a)
	{
		this.submittedAnswer = a; 
	}
	
	String getSubmittedAnswer()
	{
		return submittedAnswer; 
	}
	

}
