package week8;
/**
 * Represents a general library item for ONE library branch.
 * Provides unique sequential IDs and shared branch information.
 * @author James OBrien
 */

public abstract class LibraryItem {

  
	// ============================================================
    // TODO 1: Add a field for the branch code (same for all items)
	static int BRANCH_CODE = 1100;
  
    // Every LibraryItem shares the same branch code (e.g. 1100).
	
    //Example  ??? ??? int BRANCH_CODE = XXXX;
	// ------------------------------------------------------------
    // TODO 2: Add a counter to track the next available ID number. nextID
    // ------------------------------------------------------------
    private static int nextID = 1;
   
    // the whole class shares one counter.
   
	//Example  ??? ??? ???  nextID=1 ;
	// ------------------------------------------------------------
	 
    private final String itemId;
    private final String title;

 // TODO 3: In the constructor, fix the String.format and apply post-increment to nextID.
 // itemId should be assigned a formatted string value based on nextID so that it appears
 // as 001, 002, 003, etc. (Hint: use "%03d" in String.format), read hints in instructions
 // After assigning the formatted value, increment nextID.
   
    public LibraryItem(String title) {
        this.title = title;
        this.itemId = String.format("ID: %03d", nextID);  
        nextID++;
    }

    public String getItemId() { return itemId; }
    public String getTitle()  { return title;  }

    public abstract int getLoanDays();

    public String describe() {
        return "[#" + itemId + " | " + title + " | Loan: " + getLoanDays() + " days]";
    }
    public static int getNextId() {
        return nextID;
    }
}
