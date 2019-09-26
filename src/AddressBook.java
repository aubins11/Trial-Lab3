


import java.util.ArrayList;
/**
 * 
 * @author aubinmusingya
 * https://github.com/aubins11/Trial-Lab3.git
 */
public class AddressBook {

	private ArrayList<BuddyInfo> addressBook;
	
	/**
	 * 
	 */
	public AddressBook() {
		this.addressBook = new ArrayList<>();
	}
	
	/**
	 * 
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public void addBuddy(BuddyInfo bud) {
		if(bud != null) {
		this.addressBook.add(bud);
		}
	}
	
	/**
	 * 
	 * @param bud
	 */
	public void removeBuddy(BuddyInfo bud) {
		this.addressBook.remove(bud);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AddressBook addressBook = new AddressBook();
		BuddyInfo buddy =  new BuddyInfo("Noah", "Canada", "613...");
		addressBook.addBuddy(buddy);
		addressBook.removeBuddy(buddy);
	}
}
