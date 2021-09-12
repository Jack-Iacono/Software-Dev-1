package lab;

public class Course{
	  private String courseName;
	  private String[] students = new String[100];
	  private int numberOfStudents;
	    
	  public Course(String courseName) {
	    this.courseName = courseName;
	  }
	  
	  public void addStudent(String student) {
	    students[numberOfStudents] = student;
	    numberOfStudents++;
	  }
	  
	  public String[] getStudents() {
		String[] newStudents = new String[numberOfStudents];
		
		for(int i = 0; i < numberOfStudents; i++){
			
			newStudents[i] = students[i];
			
		}
		
	    return newStudents;
	  }

	  public int getNumberOfStudents() {
	    return numberOfStudents;
	  }  

	  public String getCourseName() {
	    return courseName;
	  }  
	  
	  public void dropStudent(String student) {
	    // Left as an exercise in Exercise 9.9
		  int index = -1;
		  
		  for(int i = 0; i < numberOfStudents; i++) {
			  
			  if(students[i].equals(student)){
				  index = i;
				  i = numberOfStudents;
			  }
			  
		  }
		  
		  if(index != -1) {
			  
			  String[] newStudents = new String[numberOfStudents];
			  
			  for(int j = 0; j < newStudents.length; j++){
				  
				  if(j < index){
					  newStudents[j] = students[j];
				  }else if(j > index) {
					  newStudents[j-1] = students[j];
				  }
				  
			  }
			  
			  for(int k = 0; k < numberOfStudents; k++) {
				  
				  students[k] = newStudents[k];
				  
			  }
			  
			  numberOfStudents--;
			  
		  }
		  
	  }
	}
