public class LibraryMember{
	public String memberId;
	public String name;
	
	LibraryMember(String memberId,String name){
		this.memberId=memberId;
		this.name=name;
	}
	public void displayMemberDetails(){
		System.out.println("\nmember id is: "+memberId);
		System.out.println("name is: "+name);
	}
}