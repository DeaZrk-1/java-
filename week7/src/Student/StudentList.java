package Student;

public class StudentList {
	Student list[];
	int count;
	public StudentList(int max){
		list=new Student[max];
		count =0;
	}
	public boolean add(Student student){
		if(student==null)
			return false;
		if(list.length<=count)
			return false;
		list[count]=student;
		count++;
		return true;
	}
	public boolean remove(int index){
		if(index>=count||index<0)
			return false;
		list[index]=null;
		for(int i=index;i<count;i++){
			list[i]=list[i+1];
		}
		count--;
		return true;
	}
	public int indexof(String id){
		for(int i=0;i<list.length && list[i]!=null;i++){
			if(list[i].getId().equals(id))
				return i;
		}
		return -1;
	}
	public Student get(int index){
		return list[index];
	}
	public int size(){
		return count;
	}
	public String toString(){
		String msg="";
		for(int i=0;i<list.length && list[i]!=null;i++)
			msg=msg+list[i].toString()+"\n";
		return msg;
	}
	
}
