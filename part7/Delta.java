
public class Delta extends Seq
{
    
    protected int numberP;    //added P for 'private'
    protected int initialP;
    protected int deltaP;
    

    /*  
     (num, initial, delta)  --> num = total numbers in a seq
                            --> initial = starting # of seq
                            --> delta = # decremented from seq

    */
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
    
    //abstract method w/in Seq
    public int min()
    {
        if(deltaP<0)    //decrementing
        {
            // Computing O(1) for min value
            return( initialP + ((numberP-1)*(deltaP)) );
            //  num-1 b/c excluding initial
            //  we + it because deltaP = (-) , if we - then it will be (--) == +
        }
        else
        {
         return (initialP); // else initial would be smallest b/c incrementing
        }
        
    }
    
    //returns a 'seqit' because it's the base class... this is an abstract method w/in SEQ
    public SeqIt createSeqIt()
    {
        DeltaIt iterator = new DeltaIt(this);
        return(iterator);
    }
    
}
