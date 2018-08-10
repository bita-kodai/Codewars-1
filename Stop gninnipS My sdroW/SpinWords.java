public class SpinWords {

  public String spinWords(String sentence) {
    String[] stuff = sentence.split(" ");
    for(int i=0;i<stuff.length;i++)
      if(stuff[i].length() >= 5) stuff[i] = (new StringBuilder(stuff[i]).reverse().toString());
    StringBuilder temp = new StringBuilder();
    for(int i=0;i<stuff.length;i++) {
      temp.append(stuff[i]);
      if(i<stuff.length-1) temp.append(" ");
    }
    return temp.toString();
  }
}