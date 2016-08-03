	
	public static int getMinMax(int order,int flag){
		int[] minNums = {12,123,1234,12345,123456,1234567,12345678};
		int[] maxNums = {98,789,6789,56789,456789,3456789,23456789};
		if(flag == 1){
			return minNums[order-2];
		}
		else{
			return maxNums[order-2];
		}
	}
	
	public static int getMin(int order){
		return getMinMax(order,1);
	}
	
	public static int getMax(int order){
		return getMinMax(order,2);
	}