public class Calc {
	static int add(String number){
		if(number.equals("")) {
			return 0;
		}
		else {
			String[] nums=null;
			if(number.startsWith("//")){
				String[] customDelimatorWithNumber=number.split("\n",2);
				String[] customDelimator=customDelimatorWithNumber[0].split("\\]\\[");
				String delimator1="";
				String delimator2="";
				for(int i=0;i<customDelimator[0].length();i++) {
					if(customDelimator[0].charAt(i)=='/'
							||customDelimator[0].charAt(i)=='['
							||customDelimator[0].charAt(i)==']')
						continue;
					delimator1+="\\"+customDelimator[0].charAt(i);
				}
				if(customDelimatorWithNumber[0].contains("][")) {
					for(int i=0;i<customDelimator[1].length();i++) {
						if(customDelimator[1].charAt(i)=='/'
								||customDelimator[1].charAt(i)=='['
								||customDelimator[1].charAt(i)==']')
							continue;
						delimator2+="\\"+customDelimator[1].charAt(i);
					}
				}
				
				number=customDelimatorWithNumber[1];
				nums=number.split(delimator1+"|"+delimator2);
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
