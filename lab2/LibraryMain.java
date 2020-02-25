package lab2;

public class LibraryMain extends Item {
 public static void main(String[] args) {
	Item item[] = new Item[4];
	Book book = new Book("Java","vj",1,"technical",10);
	item[0]=book;
	Journal journal=new Journal(1998,"vj",2,"verbal",20);
	item[1]=journal;
	VideoCD videoCd = new VideoCD(1990,5,3,"songs",15);
	item[2]= videoCd;
	AudioCD audioCd = new AudioCD("abcd","genre",5,4,"lecture",15);
	item[3]= audioCd;
	
	LibraryMain lib = new LibraryMain();
	lib.display(item);
	
}
 public void display(Item[] item) {
	 for(int i=0 ; i < item.length;i++) {
		 Item a = item[i];
		 if(a instanceof Book) {
			 Book book = (Book)a;
				bookDisplay(book);
			 }
		 else if(a instanceof Journal) {
			 Journal journal = (Journal)a;
				journalDisplay(journal);
			 }
		 else if(a instanceof VideoCD) {
			 VideoCD video = (VideoCD)a;
			 videoCdDisplay(video);
			 }
		 else if(a instanceof AudioCD) {
			 AudioCD audio = (AudioCD)a;
				audioCdDisplay(audio);
			 }
		 else {
			 break;
		 }
		 
 }
 }
 public  void bookDisplay(Book b) {
	 //Book b= new Book();
	 System.out.println("Book name = "+b.getBookName()+" book id = "+b.getId()+"book copies = "+b.getCopies()+" book title =  "+b.getTitle());
 }
 public void journalDisplay(Journal j) {
	 System.out.println("Journal year "+j.getYear()+"  journal author : "+j.getAuthor()+"Journal id = "+j.getId());
 }
 public void videoCdDisplay(VideoCD v) {
	 System.out.println("video cd "+v.getReleaseYear()+"  video runtime ="+v.getRuntime());
 }
 public void audioCdDisplay(AudioCD a) {
	 System.out.println("audio cd "+a.getAudioGenre()+"  Artist  "+a.getArtist());
 }
 
}
