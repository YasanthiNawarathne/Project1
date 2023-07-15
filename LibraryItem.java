public abstract class LibraryItem{
	public String title;
	public String itemID;
	public boolean checkout;
	
	LibraryItem(String title,String itemID){
		this.title=title;
		this.itemID=itemID;
		this.checkout=true;
	}
	
	public void checkOut(){
		if(checkout)
			System.out.println(title+" checked out");
		else
			System.out.println(title+" is already checked out");
		
	}
	public void checkIn(){
		if(!checkout)
			System.out.println(title+" checked in");
		else
			System.out.println(title+" is already checked in");
	}
	public void displayItemDetails(){
		System.out.println("\ntitle is: "+title);
		System.out.println("item id is: "+itemID);
	}
	
} 