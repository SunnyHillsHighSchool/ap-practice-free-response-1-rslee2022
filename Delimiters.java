import java.util.*;

public class Delimiters
{
	private String openDel;
	private String closeDel;

	public Delimiters(String open, String close)
	{
		openDel = open;
		closeDel = close;
	}

	public ArrayList<String> getDelimitersList(String[] tokens)
	{
     ArrayList<String> delimitersList = new ArrayList<String>();
     for(String s : tokens)
     {
        if(s.equals(openDel) || s.equals(closeDel))
        {
          delimitersList.add(s);
        }
     }
     return delimitersList;
	}

	public boolean isBalanced(ArrayList<String> delimiters)
	{
     int variable = 0;
     for(int i = 0; i < delimiters.size(); i++)
     {
        if(delimiters.get(i).equals(openDel))
          variable++;
        else if(delimiters.get(i).equals(closeDel))
          variable--;
          
        if(variable < 0)
          return false;
      }
      if(variable == 0)
        return true;
      
      return false;
	}
}