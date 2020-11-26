public class Calc {
	static int add(String number){
		if(number.equals("")) {
			return 0;
		}
		else {
			String[] nums=null;
			if(number.startsWith("//")){
				String[] customDelimatorWithNumber=number.split("\n",2);
				String delimator=customDelimatorWithNumber[0];
				number=customDelimatorWithNumber[1].trim();
				nums=number.split(delimator.substring(2));
			}
			else {
				nums=number.split(",|\n");
			}
			int sum=0;
			for(String num: nums) {
				try {
					if(Integer.parseInt(num)<0)
						throw new RuntimeException("Negatives not allowed: -1");
					
					sum+=Integer.parseInt(num);
				}catch(NumberFormatException e) {
					continue;
				}
			}
			return sum;
		}
	}
}
