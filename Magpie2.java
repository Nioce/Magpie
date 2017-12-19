/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String alapabet = "abcdefghijklmnopqrstuvwxyz";
        String response = "";
        statement = statement.toLowerCase();
        int n = statement.indexOf("no");
        if ((n>0 && alapabet.indexOf(statement.substring(n-1, n)) == -1) || n==0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0){
            response = "Tell me more about your family.";
        }
        else if(statement.indexOf("history") >=0){
            if(statement.indexOf("rome")>=0 || statement.indexOf("roman")>=0){
                response = ("I think Rome'(Romans) were an intricate part of ancient civilization");   
            }
            else{
                response = ("I think that was an important time of history"); 
            }
        }
        else if (statement.indexOf("cat") >= 0
                || statement.indexOf("dog") >= 0
                || statement.indexOf("hamster") >= 0){
            if(statement.indexOf("cat") >=0 && statement.indexOf("dog") == -1){
            response = "Tell me more about your cat'(s).";}
            else if((statement.indexOf("dog") >=0) && statement.indexOf("cat") == -1){
            response = "Tell me more about your dog'(s).";}
            else if(statement.indexOf("hamster") >=0 && statement.indexOf("dog") == -1){
            response = "Tell me more about your hamster'(s).";}
            else{
            response = "Tell me more your pets!";}
        }
        else if (statement.indexOf("mr.") >= 0
                || statement.indexOf("ms.") >= 0
                || statement.indexOf("mis.") >= 0
                || statement.indexOf("mir.") >= 0){
                    if ((statement.indexOf("mr.") == 0
                    || statement.indexOf("mir.") == 0) && (statement.indexOf("ms.")==-1)){
                        response = "He sounds like a good person.";}
                    else if ((statement.indexOf("ms.") == 0
                    || statement.indexOf("mis.") == 0)&& (statement.indexOf("mr.")==-1)){
                        response = "She sounds like a good person";}
                    else{
                        response = "They sound like good people";
                    }
        }
        else if(statement.length()>0|| statement.length()==0){
            statement = statement.trim();
            if(statement.length() == 0){
                response = "please say something";
            }
            
            else
            {
                response = getRandomResponse();
            }
        }
        
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Thats neat";
        }
        else if (whichResponse == 5)
        {
            response = "I could see that.";
        }
        
        return response;
    }
}
