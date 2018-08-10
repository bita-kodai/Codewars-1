public class CalculateRotation {
  static int shiftedDiff(String first, String second){
    if(first.length() != second.length())
      return -1;
    else return (second + second).indexOf(first);
  }
}