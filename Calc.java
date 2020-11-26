public class Calc {
	static int add(String number){
		if(number.isEmpty()) {
			return 0;
		}
		else if(number.contains(",")){
			String[] nums=number.split(",");
			return Integer.parseInt(nums[0])+Integer.parseInt(nums[1]);
		}
		else
			return Integer.parseInt(number);
	}
}
