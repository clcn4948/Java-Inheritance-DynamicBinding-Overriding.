
public class Delta extends Seq
{
    
    protected int numberP;    //added P for 'private'
    protected int initialP;
    protected int deltaP;
    

    Delta(int num, int initial, int delta){
        numberP = num;
        initialP = initial;
        deltaP = delta;
        
    }//constructor
    // overriding toString - see Constant.java for descript
    public String toString()
    {
        //special case if num = 0
        if(numberP == 0)
        {
            initialP = 0;
            deltaP = 0;
        }
        
       return ("< " + numberP + " : " + initialP + " &" + deltaP + " >");
    }
    
    
}
