
public class Delta extends Seq
{
    Delta(int num, int initial, int delta){
        numberP = num;
        initialP= initial;
        deltaP = delta;
        
    }//constructor

    private int numberP;    //added P for 'private'
    private int intialP;
    private int deltaP;
    
    // overriding toString - see Constant.java for descript
    private String toString()
    {
       return "< " + numberP + " : " + intialP + " &" + deltaP + " >";
    }
    
    
}
