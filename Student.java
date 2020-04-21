public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private int gradYear;
    private int gender;         //1 = male,  2 = female,  3 = non-binary/other
    private boolean boarding;   //true = boarding,  false = dayStu

    private int waitStat;    //0 = notWaiting,  1 = 1stWait,  2 = 2ndWait,  3 = 1stSunday, 4 = 2ndSunday
    private int table;      //-2 = Expelled, -1 = default,  0 = ParkerRoom
    private boolean locked;

    public Student(int studentID, String firstName, String lastName, int gradYear, int gender, boolean boarding){
        //read from Excel File
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.gender = gender;
        this.boarding = boarding;

        this.waitStat = 0;
        this.table = -1;        //defaults to -1
        this.locked = false;
    }

    public int getID(){
        return studentID;
    }

    public String getFirstN(){
        return firstName;
    }

    public String getLastN(){
        return lastName;
    }

    public int getGradYear(){
        return gradYear;
    }

    public boolean getBoardStat(){
        return boarding;
    }


    public int getWaitStat(){
        return waitStat;
    }
    public void setWaitStat(int stat){
        waitStat = stat;
    }


    public int getTable(){
        return table;
    }
    public void setTable(int tableAssig){
        table = tableAssig;
    }


    public boolean isLocked(){
        return locked;
    }
    public void unlock(){
        locked = false;
    }
    public void lock(){
        locked = true;
    }

}
