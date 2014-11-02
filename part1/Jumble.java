
public class Jumble extends Seq
{
     private int[] valuesP;
    
    
    Jumble( int [] values)
    {
        int size = values.length;
        valuesP = new int[ size ];
        valuesP = values;
        
    }//constructor
    
   
    
    // overriding toString - see Constant.java for descript
    public String toString()
    {
        int size = valuesP.length;
        return "{ " + size + " : " + valuesP + " }";
    }
    
}
