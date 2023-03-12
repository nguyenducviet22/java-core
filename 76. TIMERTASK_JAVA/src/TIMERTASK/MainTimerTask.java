package TIMERTASK;

import java.time.Year;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainTimerTask {

	public static void main(String[] args) {

		Timer timer = new Timer();

		TimerTask task = new TimerTask() {
			int counter = 10;

			@Override
			public void run() {
				if (counter >= 0) {
					System.out.println(counter + " seconds");
					counter--;
				} else {
					System.out.println("HAPPY NEW YEAR");
					System.out.println("Task is completed");
					timer.cancel();
				}
			}
		};

		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.NOVEMBER);
		date.set(Calendar.DAY_OF_MONTH, 18);
		date.set(Calendar.HOUR_OF_DAY, 12);
		date.set(Calendar.MINUTE, 07);
		date.set(Calendar.SECOND, 50);
		date.set(Calendar.MILLISECOND, 0);
		
//		timer.schedule(task, 10000);//1000 milliseconds = 1 seconds
		
//		timer.schedule(task, date.getTime());

//		timer.scheduleAtFixedRate(task, 0, 1000);
		
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);

	}

}
