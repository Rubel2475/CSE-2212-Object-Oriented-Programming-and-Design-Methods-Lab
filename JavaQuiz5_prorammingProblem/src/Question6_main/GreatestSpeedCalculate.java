package Question6_main;

import java.util.Scanner;

public class GreatestSpeedCalculate{
	
	private static final double r = 3.0;
	private static final double T = 60.0;
	
	public static double SpeedCalculate(double m){
		
		double v[] = {1.0,10.0,20.0,40.0};
		double mx = 0;
		
		for(int i=0; i<4; i++){
			
			double t = (m*v[i]*v[i])/r;
				
				if(t<=T && t>mx) {
					mx = v[i];
				}
		}
		
		return mx;
	}

}
