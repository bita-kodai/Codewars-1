public class BackWardsPrime {
	public static boolean isPrime(long p) {
    if(p<13L) return false;
    if(p%2==0) return false;
    for(long i=3L;i<Math.sqrt(p)+1;i++) if(p%i==0) return false;
    return true;
  }
  public static boolean isPalindrome(long p) {
    if((new StringBuilder(String.valueOf(p)).reverse().toString()).equals(String.valueOf(p))) return true;
    return false;
  }
	public static String backwardsPrime(long start, long end) {
    StringBuilder primes = new StringBuilder();
		while(start <= end) {
      if(!isPrime(start)) {
        start++;
        continue;
      }
      else if(!isPalindrome(start) && isPrime(Long.valueOf(new StringBuilder(String.valueOf(start)).reverse().toString()).longValue())) {
        primes.append(String.valueOf(start));
        if(end != start) primes.append(" ");
      }
      start++;
    }
    return primes.toString().trim();
	}
}