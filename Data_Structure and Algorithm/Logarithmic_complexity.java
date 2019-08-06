class Logarithmic_complexity{

	public int binarySearch(int[] sorted,int first,int last,int elementTobeSerached){
    int iteration = 0;
    while(first < last){
    	iteration++;
        System.out.println("i"+iteration);
        int result = (first+last)/2;
        System.out.println(result);
        if (elementTobeSerached < sorted[result]) {
        last = result;
        first = result+1;
    }else{
    	return result;
    }

    }
    return -1;
	}
	public static void main(String[] args) {
		 Logarithmic_complexity log = new  Logarithmic_complexity();
		 
	}
}