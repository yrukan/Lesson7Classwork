package by.htp.lesson7classwork;

public class StudentsGroup {

	//add unlimited number of students
	//print all students from group to console
	
	private Student[] students;
	private int studentsCounter;
	private int MaxCounter;
	private int MaxYear;

	
	public void setStudents(Student[] students){
		if(students != null)
		this.students = students;
	}
			
	public Student[] getStudents(){
		return this.students;
	}
	
	public int getMaxYear(){
		return this.MaxYear;
	}
	
	public int getMaxCount(){
		return this.MaxCounter;
	}
	
	public void getStudentsLengths(Student[] students){
		this.studentsCounter = students.length;
	}

	public void addStudent(Student student){
		if(this.students != null){
    		if(studentsCounter < this.students.length){
    			this.students[studentsCounter] = student;
    			studentsCounter++;
    			
    		}else{
    			Student[] newstudents = new Student[this.students.length + 1];
    			for(int i=0; i<this.students.length; i++){
    				newstudents[i] = this.students[i];    				
    			}
    			this.students = newstudents;
    			this.students[studentsCounter] = student;
    			studentsCounter++;
    			
       		}
    	}
    	else {
    		this.students = new Student[5];
    		this.students[0] = student;
    		studentsCounter++;
    		
    	    }
        }
	
	public int getStudentsAverageOldYear(){
		int YearCounter = 0;
		for(int i = 0; i< this.students.length; i++){
			YearCounter = YearCounter + this.students[i].getStudentYearOld(); 
		}
		YearCounter = (int)YearCounter/this.students.length;
		if(YearCounter%10 >=5) YearCounter++;
		return YearCounter;
	}
	
	public int getStudentsEntranceYear2015(){
		int Counter = 0;
		for(int i = 0; i< this.students.length; i++){
			if(students[i].getStudentEntranceYear() == 2015)
			Counter++; 
		}
		return Counter;
	}
	
	public void getMaxStudentsEntranceYear(){
		int maxYear = 0;
		int maxCounter = 0;
		
		for(int i = 0; i< this.students.length; i++){
			int Year = this.students[i].getStudentEntranceYear();
			int Counter = 1;
			
			for(int j=0; j<this.students.length; j++){
			    if(this.students[j].getStudentEntranceYear() == Year)
			    Counter++; 
			}
			if(Counter > maxCounter){
				maxYear = this.students[i].getStudentEntranceYear();
				maxCounter = Counter;
			}			
		}
		this.MaxYear = maxYear;
		this.MaxCounter = maxCounter;
	}
	
	public void printStudents(){
		System.out.println("Students group: ");
		Student[] s = this.students; 
		for(int i = 0; i<s.length; i++){
			System.out.println(i+1 + ". Name: " + s[i].getStudentName() + " Surname: " + s[i].getStudentSurname() + " Year Old: " + s[i].getStudentYearOld() + " Entrance Year: " + s[i].getStudentEntranceYear());
		}
	}
	
	/*public void bubleSortByAge(){
		int maxAge = 0;
		Student max = new Student();
		Student[] s = new Student[studentsCounter];
		
		max = this.students[0];
				
		for(int i = 0; i< this.students.length; i++){
			//max = this.students[i];
			for(int j=i+1; j<this.students.length; j++){
			    if(this.students[j].getStudentYearOld() > maxAge){
			    	maxAge = this.students[j].getStudentYearOld();
			    	max = this.students[j];
			    	this.students[j] = this.students[i];
			    	this.students[i] = max;
			    }
			}
			
		}
		
	}*/
	
 }