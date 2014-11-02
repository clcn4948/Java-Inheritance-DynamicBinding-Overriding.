/*  Abstract classes can't be called by an instance, but can be subclassed
    Usually used to have a common functionality with a collection of children abstract classes
 */

//SEQ is its base class
public class Constant extends Seq
{
    private int numP;
    private int valueP;

    Constant( int num, int value)
    {
        numP = num;
        valueP = value;
    }//Constructor

    
    /*  
        overriding toString method (within the Object class->no need to declare within Seq
     
        Had to make public, else this error: 
                    attempting to assign weaker access privileges; was public
     */
    public String toString()
    {
        return "[ " + numP + " : " + valueP + " ]";
    }
    
    
}
