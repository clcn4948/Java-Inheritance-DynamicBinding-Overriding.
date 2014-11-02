/*  Abstract classes can't be called by an instance, but can be subclassed
    Usually used to have a common functionality with a collection of children abstract classes
 */

//SEQ is its base class
public abstract class Constant extends Seq
{
    Constant( int num, int value)
    {
        numP = num;
        valueP = value;
    }//Constructor
private:
    int numP;
    int valueP;
    
    /*  overriding toString method (within the Object class->no need to declare within Seq*/
    String toString()
    {
        return "[ " + numP + " : " + valueP + " ]";
    }
    
    
}
