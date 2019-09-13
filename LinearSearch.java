public class LinearSearch implements Practice03Search{


	

	public LinearSearch(){

	}

	public String searchName(){
		return "linear";
	}


	public int search(int[] arr, int target){



		for(int i = 0; i < arr.length; i++){

				
		if(arr[i] == target){

			return target;
		}
	}

		return -1;
}

}