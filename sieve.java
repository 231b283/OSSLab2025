public class Main
{
	public ArrayList<Integer> func(int [] arr){
	    boolean [] sieve = new boolean[arr.length];
	    for(int i = 0; i < sieve.length; i++){
	        sieve[i] = true;
	    }
	    
	    sieve[0] = sieve[1] = false;
	    
	    for (int i = 2; i < Math.sqrt(arr.length); i++) {
            if (sieve[i]) {
                for (int j = i * i; j < arr.length; j += i) {
                    sieve[j] = false;
                }
            }
        }
	    
	    ArrayList<Integer> li = new ArrayList<>();
	    for(int i = 0; i < arr.length; i++){
	        if(sieve[i]){
	            li.add(i);
	        }
	    }
	    return li;
	}
}
