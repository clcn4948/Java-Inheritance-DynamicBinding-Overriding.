
public class Delta extends Seq
{
    
    private int numberP;    //added P for 'private'
    private int initialP;
    private int deltaP;
    

    Delta(int num, int initial, int delta){
        numberP = num;
        initialP = initial;
        deltaP = delta;
        
    }//constructor
    // overriding toString - see Constant.java for descript
    public String toString()
    {
       return ("< " + numberP + " : " + initialP + " &" + deltaP + " >");
    }
    
    
}
