public class Calc {
	static int add(String number){
		if(number.equals("")) {
			return 0;
		}
		else {
			String[] nums=null;
			if(number.startsWith("//")){
				String[] customDelimatorWithNumber=number.split("\n",2);
				String customDelimator=customDelimatorWithNumber[0];
				String delimator="";
				for(int i=0;i<customDelimator.length();i++) {
					if(customDelimator.charAt(i)=='/'
							||customDelimator.charAt(i)=='['
							||customDelimator.charAt(i)==']')
						continue;
					delimator+="\\"+customDelimator.charAt(i);
				}
				System.out.println(delimator);
				number=customDelimatorWithNumber[1].trim();
				nums=number.split(delimator);
			}
			else {
				nums=number.split(",|\n");
			}
			int sum=0;
			for(String num: nums) {
				try {
					if(Integer.parseInt(num)<0)
						throw new RuntimeException("Negatives not allowed: -1");
					if(Integer.parseInt(num)>1000)
						continue;
					
					sum+=Integer.parseInt(num);
				}catch(NumberFormatException e) {
					continue;
				}
			}
			return sum;
		}
	}
}
