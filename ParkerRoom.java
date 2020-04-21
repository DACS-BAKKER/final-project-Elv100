import java.util.ArrayList;

public class ParkerRoom {
    public ArrayList<Student> parkerAssig;

    public ParkerRoom(){
        this.parkerAssig = new ArrayList<Student>();
    }

    public void add(Student currStu){
        parkerAssig.add(currStu);
    }

    public Student remove(int stuIndex) {
        Student output = null;
        if(!parkerAssig.get(stuIndex).isLocked()) {     //if student isn't locked
            output = parkerAssig.remove(stuIndex);
        }
        return output;
    }
}
