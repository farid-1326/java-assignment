package come.te.problem4;

public class UserMainCode {
	public static Double averageElements(Integer[] array) {
		Integer count = 0;
		Double sum = 0.0;
		Double avg=0.0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length; j++) {
				if(i!=0 && i!=1 && i%j==0) {
					count++;
				}
			}
			if(count==2) {
				avg++;
				sum += array[i];
			}
			count=0;
		}
		return sum/avg;
	}
}
