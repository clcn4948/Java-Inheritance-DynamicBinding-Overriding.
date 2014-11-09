//Throwable object when no elements remain- termination model


/*      This is a checked exception, where when a user gives a bad 'input' the program has declared methods that will throw an exception to the handler 
 
    Defining our own exception is derived from predefined Java Exception class (already built in)
 
    When you throw an object anything after it will not be executed.
 
    Since current method using throw is interrupted then the function that is calling the current method is interrupted to...and the main!
 So we must be able to catch an exception using a try/catch statement for throwing a statement because we don't want to have a system.exit(1) for all because we still want main() to continue executing!

 */


public class UsingIteratorPastEndException extends Exception
{
    /*  We are putting this at the top level so that we will avoid errors from javac    */
    static final long serialVersionUID = 98L; // any number works here.

    
    public UsingIteratorPastEndException(String msg){
        super(msg);     //calls constructor in the base class and saves msg + bit more
    }//constructor
    
}