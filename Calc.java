public class Calc {
	static int add(String number){
		if(number.equals("")) {
			return 0;
		}
		else {
			int sum=0;
			String[] nums=number.split(",|\n");
			for(String num: nums) {
				sum+=Integer.parseInt(num);
			}
			return sum;
		}
	}
}
