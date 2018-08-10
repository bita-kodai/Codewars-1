public class Kata {
  public static String HighAndLow(String numbers) {
    String[] s = numbers.split(" ");
    StringBuilder sb = new StringBuilder();
    int highest = Integer.parseInt(s[0]);
    int lowest = highest;
    for(int i=0;i<s.length;i++) {
      if(Integer.parseInt(s[i]) > highest) highest=Integer.parseInt(s[i]);
      if(Integer.parseInt(s[i]) < lowest) lowest=Integer.parseInt(s[i]);
    }
    sb.append(String.valueOf(highest) + " " + String.valueOf(lowest));
    return sb.toString();
  }
}