//Constant( int num, int value)

public class ConstantIt implements SeqIt {
    
    protected Constant constant_object;
    protected int i_value;
    protected int i_num;
    
    ConstantIt( Constant s){
        constant_object = s;
        i_value = s.valueP;
        i_num = 0;
    }; //constructor
    
    //These methods are defined with the implementation
    public boolean hasNext()
    {
        if(i_num < constant_object.numP)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    // return the next element and advance iterator to following item.
    public int next()
    {
        //if we're already at NUMP that means we don't have anymore 'next'
        if( i_num == constant_object.numP)
        {
           System.err.println("ConstantIt called past end");
            System.exit(1);
        }
        
        
        ++i_num; //counter to how many times we have printed out VALUE, it has to be less than I_NUM!
        
        //  from output.correct, it only returns the i_value , i_num amount of times
        return i_value;
    }
}
