public class Evaporator { 
	
	public static int evaporator(double content, double evap_per_day, double threshold) {
    		double min = content * (threshold / 100);
    		int days = 1;
    		while(true) {
    			content -= (content * (evap_per_day/100));
      			if(content > min) days++;
      			else break;
    		}
		return days;
	}
}