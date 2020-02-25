package lab2;

public abstract class MediaItem extends Item {
	 private int runtime;

	public MediaItem() {
		super();
	}

	public MediaItem(int runtime) {
		super();
		this.runtime = runtime;
	}
	public MediaItem(int runtime,int id,String title,int copies) {
		super(id,title,copies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
}
