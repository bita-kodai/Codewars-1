public class SequenceSum {
	public static int[] sumOfN(int n) {
    if(n<0) {
      n*=-1;
      int[] x = new int[n + 1];
      while(n >= 0) {
        x[n] = (((n + 1) * n) / 2) * -1;
        n--;
      }
      return x;
    }
    else {
      int[] x = new int[n + 1];
      while(n >= 0) {
        x[n] = ((n + 1) * n) / 2;
        n--;
      }
      return x;
    }
  }
}