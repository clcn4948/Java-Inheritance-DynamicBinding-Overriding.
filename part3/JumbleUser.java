public class JumbleUser {
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
        int checking_orig;
        int checking_next;
        int length = 1;
        int temp_length = 1;
        
        //Jumble is an array of numbers
        if(j.valuesP.length == 0)
        {
            return 0;
        }
        else
        {
            JumbleIt j_it = new JumbleIt(j);    //passes j to the constructor
             checking_orig = j_it.next(); //first item
            while( j_it.hasNext() )
            {
                checking_next = j_it.next();
                
                if( checking_orig <= checking_next)
                {
                    temp_length++;
                    if(length < temp_length)
                    {
                        length = temp_length; //replace longest NDCSS length , else we keep orig value
                    }
                    
                }
                else
                {
                    temp_length = 1; //reset temp length
                   
                }
                
                checking_orig = checking_next; //replace the 'original' number
                
            }//while()
        }//else()
        return length;
    }

}