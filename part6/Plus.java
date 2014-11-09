/*  Overloading class, allows us to use the same name for methods but with different parameters
 

    ALL OF THIS IS ACCORDING TO PRINTING STATEMENTS OF PLUS() IN OUTPUT.CORRECT
 */

public class Plus
{

    public static Seq plus(Constant c1, Constant c2)
    {
        //numP is the number of times ValueP is printed out
        
        int num_temp = 0;
        int value_temp = 0;
        
        if(c1.numP <= c2.numP)
        {
            num_temp = c1.numP;
        }
        else if(c2.numP < c1.numP)
        {
            num_temp = c2.numP;
        }
        
        if(num_temp == 0)
        {
            value_temp = 0;
        }
        else
        {
            value_temp = c1.valueP + c2.valueP;
        }
        
        Constant n_constant = new Constant(num_temp, value_temp); //has to match up to the constructor
        
        return n_constant;
    }
    
    public static Seq plus(Delta d1, Delta d2)
    {
        int temp_num = 0;
        int temp_initial = 0;
        int temp_delta = 0;
        
        if( d1.numberP <= d2.numberP)
        {
            temp_num = d1.numberP;
        
        }
        else if(d2.numberP < d1.numberP)
        {
            temp_num = d2.numberP;
        }
        temp_initial = (d1.initialP) + (d2.initialP);
        temp_delta = (d1.deltaP) + (d2.deltaP);
        
        
        Delta n_delta = new Delta(temp_num, temp_initial, temp_delta);
        
        return n_delta;
    }
    
    public static Seq plus(Jumble j1, Jumble j2)
    {
        int[] n_valu;
        int size = 0;
        
        if( j1.valuesP.length <= j2.valuesP.length)
        {
            size = j1.valuesP.length;
        }
        else if(j2.valuesP.length < j1.valuesP.length)
        {
            size = j2.valuesP.length;
        }
        
        n_valu = new int[ size ];
        
        Jumble n_jumble = new Jumble( n_valu );

        if(size != 0)
        {

            for(int i = 0; i< (n_jumble.valuesP.length) ;  i++)
            {
                n_jumble.valuesP[i] = j1.valuesP[i] + j2.valuesP[i];
            }
        }
        
        return n_jumble;
    }
}