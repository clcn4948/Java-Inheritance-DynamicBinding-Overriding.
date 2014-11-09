// the Seq base class

/*  Abstract classes can't be called by an instance, but can be subclassed
    EX:
        Seq testing = new Seq(); <-- ERROR!
 
    Usually used to have a common functionality with a collection of children abstract classes.
    If class declared abstract, not all methods have to be abstract.
    -Subclasses of abstract superclass must override abstract methods
    -only time subclass doesn't have to implement abstract method iff also abstract class
 
 */
public abstract class Seq
{
    public abstract int min();
    
    public abstract SeqIt createSeqIt();
}
