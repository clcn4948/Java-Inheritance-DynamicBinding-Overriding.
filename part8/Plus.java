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
        
        return Testing_Delta(n_delta);
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
        
        return Testing_Jumble(n_jumble);
    }
    
    
    public static Seq plus( Constant c , Delta d)
    {
        
        int temp_num = 0;
        int temp_initial = 0;
        int temp_delta = 0;
        
        if( c.numP <= d.numberP)
        {
            temp_num = c.numP;
        }
        else if( d.numberP < c.numP)
        {
            temp_num = d.numberP;
        }
        
        if( temp_num == 0)
        {
            temp_initial = 0;
            temp_delta = 0;
        }
        else
        {
            temp_initial = c.valueP + d.initialP;
            temp_delta = d.deltaP;
        }
        
        Delta n_delta = new Delta(temp_num, temp_initial, temp_delta);
        
        return Testing_Delta(n_delta);
       
    }
    
    public static Seq plus( Delta d , Constant c)
    {
        
        int temp_num = 0;
        int temp_initial = 0;
        int temp_delta = 0;
        
        if( c.numP <= d.numberP)
        {
            temp_num = c.numP;
        }
        else if( d.numberP < c.numP)
        {
            temp_num = d.numberP;
        }
        
        if( temp_num == 0)
        {
            temp_initial = 0;
            temp_delta = 0;
        }
        else
        {
            temp_initial = c.valueP + d.initialP;
            temp_delta = d.deltaP;
        }
        
        Delta n_delta = new Delta(temp_num, temp_initial, temp_delta);
        
        return Testing_Delta(n_delta);
        
    }
    
    public static Seq plus( Constant c , Jumble j)
    {
        
        int[] n_valu;
        int size = 0;
        
        if( c.numP <= j.valuesP.length)
        {
            size = c.numP;
        }
        else if(j.valuesP.length < c.numP)
        {
            size = j.valuesP.length;
        }
        
        n_valu = new int[ size ];
        
        Jumble n_jumble = new Jumble( n_valu );
        
        if(size != 0)
        {
            
            for(int i = 0; i< (n_jumble.valuesP.length) ;  i++)
            {
                n_jumble.valuesP[i] = j.valuesP[i] + c.valueP;
            }
        }
        
        return Testing_Jumble(n_jumble);
    }
    
    public static Seq plus( Jumble j, Constant c)
    {
        
        int[] n_valu;
        int size = 0;
        
        if( c.numP <= j.valuesP.length)
        {
            size = c.numP;
        }
        else if(j.valuesP.length < c.numP)
        {
            size = j.valuesP.length;
        }
        
        n_valu = new int[ size ];
        
        Jumble n_jumble = new Jumble( n_valu );
        
        if(size != 0)
        {
            
            for(int i = 0; i< (n_jumble.valuesP.length) ;  i++)
            {
                n_jumble.valuesP[i] = j.valuesP[i] + c.valueP;
            }
        }
        
        return Testing_Jumble(n_jumble);
        
    }
    
    public static Seq plus( Jumble j, Delta d)
    {
        
        
        int[] n_valu;
        int size = 0;
        
        if( d.numberP <= j.valuesP.length)
        {
            size = d.numberP;
        }
        else if(j.valuesP.length < d.numberP)
        {
            size = j.valuesP.length;
        }
        
        n_valu = new int[ size ];
        
        Jumble n_jumble = new Jumble( n_valu );
        
        if(size != 0)
        {
            
            for(int i = 0; i< (n_jumble.valuesP.length) ;  i++)
            {
                n_jumble.valuesP[i] = j.valuesP[i] + d.initialP + (d.deltaP * i);
            }
        }
        
        return Testing_Jumble(n_jumble);
        
    }
    
    public static Seq plus( Delta d, Jumble j)
    {
        int[] n_valu;
        int size = 0;
        
        if( d.numberP <= j.valuesP.length)
        {
            size = d.numberP;
        }
        else if(j.valuesP.length < d.numberP)
        {
            size = j.valuesP.length;
        }
        
        n_valu = new int[ size ];
        
        Jumble n_jumble = new Jumble( n_valu );
        
        if(size != 0)
        {
            
            for(int i = 0; i< (n_jumble.valuesP.length) ;  i++)
            {
                n_jumble.valuesP[i] = j.valuesP[i] + d.initialP + (d.deltaP * i);
            }
        }
        
        return Testing_Jumble(n_jumble);
    }
    
    
    public static Seq Testing_Delta( Delta enter)
    {
        //Delta <5,4,0> = [5:4]
        //if( enter instanceof Delta )
       // {
            
            if( enter.deltaP == 0)
            {
                Constant d_constant = new Constant( enter.numberP, enter.initialP);
                return d_constant;
            }
          //  else
            //{
                return enter;
            //}
        //}

    }
    public static Seq Testing_Jumble(Jumble enter)
    {
        
        
        //if( enter instanceof Jumble)
        //{
        
        
        int length = enter.valuesP.length;
        
        //  {0:..} = [0:0]
        if(length == 0 )
        {
            Constant j0_constant = new Constant(0, 0);
            return j0_constant;
        }
        //{ 1 : 194 } = [1:194]
        else if(length == 1)
        {
            Constant j1_constant = new Constant(1, enter.valuesP[0]);
            return j1_constant;
        }
        //  {4: 0 0 0 0} = [4:0]
        else if(length > 1 && enter.valuesP[0] == 0)
        {
            Constant j2_constant = new Constant(length, 0);
            return j2_constant;
        }

        // { 3 : 254, 253 253 } = <3 , 254, -1>
        else if(length > 1 && enter.valuesP[0] != 0)    //length = 2, must exist {1, 2} -> valuesp[0] , valuesp[1]
        {
            int between = 0;
            int temp_between = 0;
            between = enter.valuesP[0] - enter.valuesP[1];
            
            for(int i = 1; i< length; i++)
            {
                temp_between = enter.valuesP[i-1] - enter.valuesP[i]; //length = 2, [0] - [1]
                    if(temp_between != between)
                    {
                        break;
                    }
            }
                
            //{ 3: 120 120 120} = [3:120]
            if(temp_between == 0 && between == 0)
            {
                Constant j3_constant = new Constant(length, enter.valuesP[0]);
                return j3_constant;
            }
            // { 3 : 254, 253 253 } = <3 , 254, -1>
            else if(temp_between == between)
            {
                Delta j_delta = new Delta(length, enter.valuesP[0], -between);
                return j_delta;
            }
                
            
        } //else if
        
        
        return enter;
    }
}