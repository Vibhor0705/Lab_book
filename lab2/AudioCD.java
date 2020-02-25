package lab2;

public class AudioCD extends MediaItem
{
	private String artist;
	private String audioGenre;
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAudioGenre() {
		return audioGenre;
	}
	public void setAudioGenre(String audioGenre) {
		this.audioGenre = audioGenre;
	}
	public AudioCD(String artist, String audioGenre) {
		super();
		this.artist = artist;
		this.audioGenre = audioGenre;
	}
	public AudioCD(String artist, String audioGenre,int runtime,int id,String title,int copies) {
		super(runtime,id,title,copies);
		this.artist = artist;
		this.audioGenre = audioGenre;
	}
	public AudioCD() {
		super();
	}
	
	
}
