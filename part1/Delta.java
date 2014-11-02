
public abstract class Delta extends Seq
{
    Delta(int num, int initial, int delta){
        numberP = num;
        initialP= initial;
        deltaP = delta;
        
    }//constructor
private:
    int numberP;    //added P for 'private'
    int intialP;
    int deltaP;
    
    // overriding toString - see Constant.java for descript
    String toString()
    {
       return "< " + numberP + " : " + intialP + " &" + deltaP + " >";
    }
    
    
}
