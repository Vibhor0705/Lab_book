package lab2;

public class VideoCD extends MediaItem {
	private int releaseYear;

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public VideoCD(int releaseYear) {
		super();
		this.releaseYear = releaseYear;
	}

	public VideoCD() {
		super();
	}
	public VideoCD(int releaseYear,int runtime,int id,String title,int copies) {
		super(runtime,id,title,copies);
		this.releaseYear = releaseYear;
	}
	
}
