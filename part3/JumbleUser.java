public class JumbleUser extends JumbleIt //uses jumbleit's methods
{
    /*  NDCSS = non-decreasing contiguous subsequence (subset)
        ex:
            S: 5 6 7 1 2 2 3
            ss: 5 6
            ss: 7
            ss: 5 7     <-- same order
     
            ->subseq w/in sequence S also a sequence s.t.
            ->it appears in same order w/in S
        
        contiguous ss = subsequence w/ elements appear in continous order of sequence S
     
            ss: 5 6 = contiguous
            ss: 5 7 != contiguous
        
        non-decreasing = any 2 adjacent #, 1st <= 2nd
     
            ss: 5 6 = non-decreasing
            ss: 3 2 4 != non-decreasing
     */
    
    
    /*  Find length of longest NDCSS w/in Jumble j  */
    public static int lengthLongestNDCSS1(Jumble j)
    {
        //Jumble is an array of numbers
        if(j.valuesP.length == 0)
        {
            return 0;
        }
        else
        {
            JumbleIt j_it = new JumbleIt(j);    //passes j to the constructor
            while( hasNext() )
            {
                
            }
        }
    }

}