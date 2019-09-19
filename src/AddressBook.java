import java.util.ArrayList;
/**
 * 
 * @author aubinmusingya
 *
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
	public void addBuddy(String name, String address, String phoneNumber) {
		BuddyInfo bud = new BuddyInfo(name, address, phoneNumber);
		this.addressBook.add(bud);
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
		
		addressBook.addBuddy("Noah", "Canada", "613...");
		
		addressBook.addBuddy("Liya", "Canada", "437...");
	}
}
