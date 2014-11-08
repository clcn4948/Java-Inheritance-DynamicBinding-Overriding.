//Constant( int num, int value)

public class ConstantIt implements SeqIt {
    
    protected Constant constant_object;
    protected int i_value;
    protected int i_num;
    
    ConstantIt( Constant s){
        constant_object = s;
        i_value = s.valueP;
        i_num = s.numP;
    }; //constructor
    
    //These methods are defined with the implementation
    public boolean hasNext()
    {
        if(i_num != 0)
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
        --i_num;
        //  from output.correct, it only returns the value (num) times
        return i_value;
    }
}
