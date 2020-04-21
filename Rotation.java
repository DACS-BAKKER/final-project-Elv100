import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Rotation {
    private int numOfTables;
    private boolean canDayStuWait;  //canDayStudents wait in this rotation;
    private int rotationIndx;   //current rotation#
    private int gradClassYear; //current graduating class year

    private ParkerRoom parker;
    private ArrayList<Table> tables;



    public Rotation(int numOfTables, boolean canDayStuWait, int rotationIndx, int gradClassYear) {
        //prompt User
        this.numOfTables = numOfTables;
        this.canDayStuWait = canDayStuWait;
        this.rotationIndx = rotationIndx;
        this.gradClassYear = gradClassYear;

        this.parker = new ParkerRoom();
        for (int i = 0; i < numOfTables; i++) {
            this.tables.add(new Table(/*READ INFO FROM EXCEL FILE*/));
        }
    }

    public boolean FillAll(){
        exemptParkerRoom();
        //isWinter();
        fillWaiting();
        fillRest();
    }

    private boolean exemptParkerRoom(){
        //loop thru ParkerRoom List memory file
        //Per student, Read & match ID#
        if (/*Matches*/) {
            currStudent.table = 0;		//table 0 signifies parker room
            currStudent.locked = true;
            parker.add(currStudent);
        } else {
            return false;
        }
    }

    private boolean fillWaiting() {
        int[] RandTable = makeTableBijection();  //random table bijection/table caesar cipher

        //generate random Boolean
        //determines if 1st wait runs first, or 2nd wait runs first
        Random randBool = new Random();
        boolean waitAssignOrder = randBool.nextBoolean();

        if (canDayStuWait) {
            //1st Waiting loop
            //runs through table
            for (int i = 0; i < numOfTables; i++){
                if(!student.boarding && DayStudentsArentAllAlreadyAssigned){    //if day students arent already assigned.
                    //have Counter for “Searching For CurrentNumberOfTimes1stWaited”
                    //run students
                    if (#ofTimes1stWaited = Counter){
                        currentTable.1stwaiter = currStudent;
                        student.TableID = currentTable;
                        student.locked = true;
                        /*assign SundayWaiters*/
                    }
                } else {  //DayStudentsAreAlready All assigned,
                    Do Boarding filling
                }
            }
            // 2nd Waiting loop
            for (int i = 0; i < numOfTables; i++){

            }

        }
    }

    private boolean fillRest () {
        //fill in rest of students
    }

    private int[] makeTableBijection(){
        int[] bijection = new int[numOfTables];
        //shuffle the array

        return bijection;
    }


}
