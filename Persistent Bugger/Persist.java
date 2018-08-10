class Persist {
	public static int persistence(long n) {
    if( Math.abs(n) / 10 == 0)
      return 0;
  
    int count = 0;
		while(true) {
      String nString = Long.toString(n);
      String[] splitString = nString.split("");
      
      long temp = 1L;
      for(int i=0;i<splitString.length;i++) {
        temp *= Integer.parseInt(splitString[i]);
      }
      
      count++;
      n = temp;
      
      if( Math.abs(temp) / 10 == 0)
        break;
    }
    return count;
  }
}