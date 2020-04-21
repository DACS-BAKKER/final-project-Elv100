import java.util.ArrayList;

public class Table {
    private int tableID;
    private String faculty;
    private int maxCap;
    private int currSize;

    private ArrayList<Student> stuAtTable;

    public Table(int tableID, String faculty, int maxCap){
        this.tableID = tableID;
        this.faculty = faculty;
        this.maxCap = maxCap;

        this.currSize = 1;      //defaults at 1 for faculty;
        this.stuAtTable = new ArrayList<Student>();
    }

    public boolean isFilled(){
        return maxCap == currSize;
    }

    public boolean add(Student currStu){
        if(!isFilled()){
            stuAtTable.add(currStu);
            currSize++;
            return true;
        } else {
            System.out.println("Table " +tableID +" is Filled!");
            return false;
        }
    }

    public Student remove(int stuIndex){
        Student output = null;
        if(stuIndex <= currSize - 1){
            if(!stuAtTable.get(stuIndex).isLocked()) { //if student isn't locked
                output = stuAtTable.remove(stuIndex);
                currSize--;
            }
        }
        return output;
    }

    public int getTableID(){
        return tableID;
    }

    public String getFaculty(){
        return faculty;
    }

    public int getMaxCap(){
        return maxCap;
    }

    public int getCurrSize(){
        return currSize;
    }
}
