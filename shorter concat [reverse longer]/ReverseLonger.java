public class ReverseLonger {


	public static String shorterReverseLonger(String a, String b) {
		StringBuilder s = new StringBuilder();
    		if(a.length() >= b.length()) {
    	 		s.append(b);
      			for(int i=a.length()-1;i>=0;i--) s.append(a.charAt(i));
      				s.append(b);
    		}
    		else {
      			s.append(a);
      			for(int i=b.length()-1;i>=0;i--) s.append(b.charAt(i));
      				s.append(a);
    		}
    		return s.toString();
	}

}