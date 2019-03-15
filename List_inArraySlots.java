/**
  Implement a list of Objects
 */

public class List_inArraySlots{
    // =================================================
    // FIELDS
    private Object[] list;
    private int filledElements;
    private static final int INITIAl_CAPACITY = 10;
    
    // =================================================
    // CONSTRUCTORS
    
    /**
      Construct an empty list with a small initial capacity.
     */    
    public List_inArraySlots(){
        list = new Object[INITIAl_CAPACITY];
    }
    
    // =================================================
    // METHODS
    
    /**
      @return the number of elements in this list
     */
    public int size(){
        return filledElements;
    }
    
     /**
       @return a string representation of this list,
       in [a,b,c,] format
      */    
    public String toString(){
        String stringRep = "[";
        for (int index = 0; index < filledElements; index++)
            stringRep += list[index] + ",";
        stringRep += "]";
        return stringRep;
    }
    
    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public boolean add( Object value){

        // expand if necessary
        if (filledElements == list.length) expand();
        
        // then add value    
        list[filledElements] = value;
        filledElements++;
        
        return true;
    }
    
    /**
      Appends @value to the end of this list.
      @return true, in keeping with conventions yet to be discussed
     */
    public void expand(){
        Object[] bigger = new Object[ list.length *2];
        for (int index = 0; index < filledElements; index++)
            bigger[index] = list[index];
        
        list = bigger; 
    }
    
    /**
      @returns the value of the elements
        at the given index
     */
    public Object get(int index){
        return list[index];
    }
}