
public class Jumble extends Seq
{
    Jumble( int [] values)
    {
        int size = values.length;
        valuesP = new int[ size ];
        valuesP = values;
        
    }//constructor
    
    private int[] valuesP;
    
    // overriding toString - see Constant.java for descript
    private String toString()
    {
        int size = valuesP.length;
        return "{ " + size + " : " + valuesP + " }";
    }
    
}
