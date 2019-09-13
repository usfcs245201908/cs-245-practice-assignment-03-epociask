public class BinaryIterativeSearch implements Practice03Search{
	

	
	public BinaryIterativeSearch(){

	
	}

	public String searchName(){
		return "binary iterative";
	}



	public int search(int []arr, int target){

		int low, high, middle;

		low = 0;
		high = arraySize;


		for(int i = 0; i < arr.length; i++){

				middle = (high - low) / 2;

				if(arr[middle] == target){
					return target; 
				}

				if(arr[middle] > target){
					low = middle+1;
					
				}
				else{
					end = middle-1;
				}
		}

		return -1;
	}
}