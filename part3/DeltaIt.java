// Delta(int num, int initial, int delta)
public class DeltaIt implements SeqIt {
  
    protected Delta delta_object;
    protected int i_num; //will keep track of where we are in sequence
    protected int i_initial;
    protected int i_delta;
    protected int i;
    
    DeltaIt( Delta s){
        delta_object = s;
        i_num = s.numberP; //numberP = total numbers in the sequence
        i_initial = s.initialP;
        i_delta = s.deltaP;
        i = 0;
    } //constructor
    
    public boolean hasNext()
    {
        if(i_num != 0)
        {
            return true;   //in java if boolean can only be true/false, not 1/0
        }
        else
        {
            return false;
        }
    }
    // return the next element and advance iterator to following item.
    public int next()
    {
        //next invoked when no elements remain
        if( i_num == 0)
        {
            System.err.println("No elements remain in Delta");
            System.exit(1);
        }
        
        i++; //for calculations
        i_num--;
        return(i_initial + ( (i-1) * (i_delta) ) );
        /*          (i-1) -> position in sequence, starts at 1. we -1 b/c inc
                    * i_delta -> inc/dec from delta (i-1) times
         ex:
                4   1   -1              [1 0 -1 -2]
         suppose:   i = 1, i++ = 2
                    initial + (i-1)*delta
                    1 + (1-1)*-1
                    1+0 = 1
                -------------------
                    i = 2, i++ = 3
                    1 + (2-1) * -1
                    1 + 1(-1) = 0
         */
    }
    
}
