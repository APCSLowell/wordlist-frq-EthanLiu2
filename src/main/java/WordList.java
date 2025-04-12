import java.util.*;

public class WordList
{
  private ArrayList <String> myList;

  public WordList() { myList = new ArrayList<String>(); }
  public void add(String word) { myList.add(word); }
  public String toString() { return myList.toString(); }

  public int numWordsOfLength(int len)
  {
     int cnt = 0;
    for (Object w: myList) {
        String s = (String)w; 
        if (s.length() == len) {
            cnt++;
        }
    }
    return cnt; 
  }

  public void removeWordsOfLength(int len)
  {
   for (int i=myList.size() - 1; i>=0; i--) {
        String s = (String)myList.get(i);
        if (s.length() == len) {
            myList.remove(i); 
        }
    }

  }
}
