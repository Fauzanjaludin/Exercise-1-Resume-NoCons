package a1;

public class findlargel {

	public void largestelem() {
		double[][] multelm={{3.2,3.4,2.7},{2.5,3.0,2.8}};
		double largest;
		for (int i=0 ; i<multelm.length ; i++) {
			largest=multelm[i][0];
			for (int y=0 ; y<multelm[i].length ; y++) {
				if(largest < multelm[i][y]) {
					largest = multelm[i][y];
					
				}
			System.out.println("largest element of row "+(i+1)+" = "+largest);	
			}
		}
		
		
		
		
		
	}
}
