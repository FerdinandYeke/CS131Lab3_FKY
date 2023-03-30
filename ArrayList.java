package arraylist;
public class ArrayList<T>{

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
   	private T arItem;
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
	
  //addItem method begins here
  
  /*
   * The addItem method inserts a new generic item type
   * into the array. If the item adds successfully, it
   * returns true. Otherwise, it returns false.
   * 
   */
  	public boolean addItem(T item)
  	{
  		//this.currentItem = item;
  		
  		this.arItem = item;
  		boolean result = true;
  		
  		
  		if(arList.length == DEFAULT_SIZE || arList.length < DEFAULT_SIZE)
  		{
  			if(arList.length <= currentItem)
  	  		{	/*
  	  			 currentItem = currentItem + 1;
  	  			 
  	  			 arList[0] = arList[currentItem];
  	  			 */
  				currentItem = currentItem+1;
  	  			arList[0] = item;
  	  			
  	  			 result = true;
  	  		}
  	  		
  	  		else if(arList.length > currentItem)
  	  		{
  	  			result = false;
  	  		}
  	  		
  		}
  		
  		return result;
  		
  		
  		
  		/*
  		if(arList.length == DEFAULT_SIZE || arList.length < DEFAULT_SIZE)
  		{
  			for(int i = 0; i < arList.length; i++)
  	  		{
  	  			if(arList.length == currentItem)
  	  			{
  	  				arList[i] = arItem;
  	  				result = true;
  	  			}
  	  			
  	  			else
  	  			{
  	  				result = false;
  	  			}
  	  		}
  		}
  		return result;
  		
  	}
  	*/
  		
  	}//addItem method ends here
  	
  	//toString method starts here
  	
  	/*
  	 * This method iterates through the array, while
  	 * printing out how many items are in the array.
  	 * 
  	 */
  	StringBuilder sb = new StringBuilder();
	@Override
	public String toString() {
		
		for(T arItem : arList)
		{
			sb.append(arItem);
		}
		
		return "ArrayList [arList=" + sb.length() + "]";
	}//toString method ends here.
  
}//end class
