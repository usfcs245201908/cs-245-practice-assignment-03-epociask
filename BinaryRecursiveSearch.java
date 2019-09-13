public class BinaryRecursiveSearch implements Practice03Search{



	public BinaryRecursiveSearch(){

	}


	public String searchName(){

		return "binary recursive";
	}
	public int binSearch(int []arr, int target, int low, int high){



		int mid = (low + high) / 2; 
		if(low > high){


			return -1;
		}


		if(arr[mid] > target){

			binSearch(arr, target, low, mid - 1);
		}

		if (arr[mid] < target){

			binSearch(arr, target, mid, high -1);
		}


			return target; 
	}


	public int search(int []arr, int target){

	int found = binSearch(arr, target, 0, arr.length-1);

		return found;
	}
}