// Jumble( int [] values )
public class JumbleIt implements SeqIt {
   
    protected Jumble jumble_object;
    protected int i;
       
    JumbleIt( Jumble s)
    {
        jumble_object = s; 
        i = 0;
    }
    
    
    // any more elements?
    public boolean hasNext()
    {
        if( i < jumble_object.valuesP.length) //if exist within the array
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /*  since these iterator classes need to access things like valuesP, by decalring them protected it allows access to these other classes because they're considered in the same program package... protected is like saying 'friend' in C++
     */
    // return the next element and advance iterator to following item.
    public int next()
    {
        //when next() invoked s.t. no elements remain
        if( jumble_object.valuesP.length == 0)
        {
            System.err.println("Invoking next() in jumble wrong");
            System.exit(1);
        }
        
        i++;
        return ( jumble_object.valuesP[i-1]); //we i-1 because we had to advance the iterator first and then return
    }
    
}
