public class SquareDigit {

  public int squareDigits(int n) {
    String s = String.valueOf(n);
    StringBuilder returnString = new StringBuilder();
    for(int i=0;i<s.length();i++)
      returnString.append(String.valueOf((int)Math.pow(Character.getNumericValue(s.charAt(i)),2)));
    String r = returnString.toString();
    int test = Integer.parseInt(r);
    return test;
  }
}