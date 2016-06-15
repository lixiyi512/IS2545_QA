public class Student extends Visitor {
		
	public Student(int id){
		super(id);
	}
	
	public void showType(){
		System.out.println("Visitor " + id + " is a Student.");
	}
	
	
	public boolean preference(int loc){
		boolean like = false;
		if(loc == LOC_CL) like = false;
		else if(loc == LOC_SH || loc == LOC_TP || loc == LOC_DT) like = true;
		return like;
	}
		
}