public static long lcmarray(ArrayList<Long> element_array) 
	{ 
		long lcm_of_array_elements = 1; 
		int divisor = 2; 
		
		while (true) { 
			int counter = 0; 
			boolean divisible = false; 
			
			for (int i = 0; i < element_array.size(); i++) {

				if (element_array.get(i) == 0) { 
					return 0; 
				} 
				else if (element_array.get(i) < 0) { 
					element_array.set(i,element_array.get(i) * (-1)); 
				} 
				if (element_array.get(i) == 1) { 
					counter++; 
				}  
				if (element_array.get(i) % divisor == 0) { 
					divisible = true; 
					element_array.set(i,element_array.get(i) / divisor); 
				} 
			} 
			if (divisible) { 
				lcm_of_array_elements = lcm_of_array_elements * divisor; 
			} 
			else { 
				divisor++; 
			} 
			if (counter == element_array.size()) { 
				return lcm_of_array_elements; 
			} 
		} 
	}
