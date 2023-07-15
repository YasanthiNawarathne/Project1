public class main{
	public static void main(String args[]){
		
		LibraryItem b1=new book("The Catcher in the Rye","B001","J.D. Salinger", 240);
		LibraryItem b2=new book("To Kill a Mockingbird","B002", "Harper Lee", 281);
		LibraryItem b3=new book("1984","B003","George Orwell",328);
		LibraryItem b4=new book("Pride and Prejudice","B004","Jane Austen",432);
		LibraryItem b5=new book("The Hobbit","B005","J.R.R. Tolkien",320);
		
		LibraryItem m1=new Magazine("National Geographic","M001","August 2023","National Geographic Society");
		LibraryItem m2=new Magazine("Time","M002","September 2023","Time USA,LLC");
		LibraryItem m3=new Magazine("Forbes","M003","June 2023","Forbes Media");
		LibraryItem m4=new Magazine("Vogue","M004","July 2023","Condé Nast");
		LibraryItem m5=new Magazine("Sports Illustrated","M005","July 2023","Maven Coalition");
		
		LibraryMember lm1=new LibraryMember("L001","John Doe");
		LibraryMember lm2=new LibraryMember("L002","Jane Smith");
		LibraryMember lm3=new LibraryMember("L003","David Johnson");
		LibraryMember lm4=new LibraryMember("L004","Sarah Williams");
		LibraryMember lm5=new LibraryMember("L005","Michael Brown");
	
		b1.checkOut();
		b1.checkIn();
		
		System.out.println("\n------BOOKS-------");
		b1.displayItemDetails();
		b2.displayItemDetails();
		b3.displayItemDetails();
		b4.displayItemDetails();
		b5.displayItemDetails();
		
		System.out.println("\n------MAGAZINES-------");
		m1.displayItemDetails();
		m2.displayItemDetails();
		m3.displayItemDetails();
		m4.displayItemDetails();
		m5.displayItemDetails();
		
		System.out.println("\n------LIBRARY MEMBERS-------");
		lm1.displayMemberDetails();
		lm2.displayMemberDetails();
		lm3.displayMemberDetails();
		lm4.displayMemberDetails();
		lm5.displayMemberDetails();
	}
}