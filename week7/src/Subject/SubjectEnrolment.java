package Subject;

public class SubjectEnrolment {
	 Stu list[];
	 Subject sub;
	 int count;
	
	public SubjectEnrolment(Subject s){
		list =new Stu[s.getNumber()];
		count =0;
	}
	public boolean add(Stu stu){
		if(stu==null)
			return false;
		if(list.length<=count)
			return false;
		list[count]=stu;
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
	public Stu get(int index){
		return list[index];
	}
	public int size(){
		return count;
	}
	public int length() {
		return list.length;
	}
	public String toString(){
		String msg="";
		for(int i=0;i<list.length && list[i]!=null;i++)
			msg=msg+list[i].toString()+"\n";
		return msg;
	}

}
