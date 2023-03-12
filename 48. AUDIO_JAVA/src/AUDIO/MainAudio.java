package AUDIO;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;

public class MainAudio {
	static String response = "";

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {

		Scanner sc = new Scanner(System.in);
		File file = new File("DaiThienBong.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);

		while (!response.equals("Q")) {
			System.out.println("P = play,  S = stop, R = reset, Q = quit");
			System.out.println("Enter your choice: ");

			response = sc.next();
			response = response.toUpperCase();

			switch (response) {
			case ("P"):
				clip.start();
				break;

			case ("S"):
				clip.stop();
				break;

			case ("R"):
				clip.setMicrosecondPosition(0);
				break;

			case ("Q"):
				clip.start();
				break;

			default:
				System.out.println("Not a valid response");
			}
		}
		System.out.println("Byeeeeee");
	}
}
