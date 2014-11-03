
public class Jumble extends Seq
{
     protected int[] valuesP;
    
    
    Jumble( int [] values)
    {
        int size = values.length;
        valuesP = new int[ size ];
        
        
        for(int i = 0; i<size; i++)
        {
            valuesP[i] = values[i]; // <--for loop, junk occurs if valuesp=values
        }
    }//constructor
    
   
    //System.arraycopy( object, begin of array pos, destination obj, desti position, int length);
    
    
    // overriding toString - see Constant.java for descript
    public String toString()
    {
        int size = valuesP.length;
        
        System.out.print("{ " + size + " : ");
        for(int y : valuesP)
        {
            System.out.print(y + " " );
        }
        
        return ("}"); //    <--returning a STRING object, doesn't require space, for loop provides it.
     //   return ("{ " + size + " : " + valuesP + " }"); <-- can not print out an array like this! gives crap!
    }
    
}
