package lab8;
import java.util.concurrent.*;

public class TimerMainExecutor {
	public static void main(String[] args) {
		ExecutorService service = Executors.newCachedThreadPool();
		Runnable runnable = new Timer();
		
		try {
			service.submit(runnable);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
