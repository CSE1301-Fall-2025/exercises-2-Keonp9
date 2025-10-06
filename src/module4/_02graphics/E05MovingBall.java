package module4._02graphics;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.Scanner;


import edu.princeton.cs.introcs.StdDraw;

public class E05MovingBall {

	/*
	 * Exercise: Read and run the code below and make sure you
	 * understand how it works before proceeding.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numberOfBalls = 0;
		while(numberOfBalls == 0){
			System.out.println("Choose difficulty (Easy/Medium/Hard): "); 
			if(scan.hasNext("Easy") || scan.hasNext("easy")){
				numberOfBalls = 5;
			} else if (scan.hasNext("Medium") || scan.hasNext("medium")){
				numberOfBalls = 10;
			} else if(scan.hasNext("Hard") || scan.hasNext("Hard")) {
				numberOfBalls = 15;
			}
		}
		double[] ballX = new double[numberOfBalls];
		double[] ballXVelocity = new double[numberOfBalls];
		double[] ballY = new double[numberOfBalls];
		double[] ballYVelocity = new double[numberOfBalls];

		for(int i = 0; i < numberOfBalls; i++){ //generate starting values
			ballX[i] = Math.random();
			ballY[i] = Math.random();
			ballXVelocity[i] = Math.random()*0.01;
			ballYVelocity[i] = Math.random()*0.01;
		}

		double playerX = 0.5;
		double playerY = 0.5;
		double playerSpeed = 0.01;

		int score =0;
		long currentTime = System.currentTimeMillis();

		double radius = 0.05;
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(radius);
		
		while (true) {
			
			//Clear the canvas
			StdDraw.clear();
			
			//update the ball position
			for(int i =0; i < numberOfBalls; i++){
				ballX[i] = ballX[i] + ballXVelocity[i];
				if(ballX[i] > 1 || ballX[i] < 0) { //too far right
				ballXVelocity[i] = -ballXVelocity[i]; //back to left
				}
				ballY[i] = ballY[i] + ballYVelocity[i];
				if(ballY[i] > 1 || ballY[i] < 0) { //too far right
				ballYVelocity[i] = -ballYVelocity[i]; //back to left
				}
				double distance  = Math.sqrt(Math.pow(playerX-ballX[i], 2) + Math.pow(playerY-ballY[i], 2));
				if(distance < radius){
				playerX = 0.5;
				playerY = 0.5;
				score = 0;
				}
		}
			if(StdDraw.isKeyPressed(KeyEvent.VK_W)){ //move up
				playerY += playerSpeed;
				if(playerY > 1){
					playerY = 1;
				}
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_S)){ //move down
				playerY -= playerSpeed;
				if(playerY < 0){
					playerY = 0;
				}
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_A)){ //move left
				playerX -= playerSpeed;
				if(playerX < 0){
					playerX = 0;
				}
			}
			if(StdDraw.isKeyPressed(KeyEvent.VK_D)){ //move right
				playerX += playerSpeed;
				if(playerX > 1){
					playerX = 1;
				}
			}

			long now = System.currentTimeMillis();
			if(now-currentTime > 1000) { //one second has passed
				score++;
				currentTime = now;
			}
			//draw on canvas
			StdDraw.setPenColor(Color.RED);
			for(int i = 0; i < numberOfBalls; i++){
			StdDraw.point(ballX[i], ballY[i]);
			}
			StdDraw.setPenColor(Color.BLACK);
			StdDraw.point(playerX, playerY);
			StdDraw.text(0.5, 0.1, "Score: " + score);
			//pause to make the animation smooth
			StdDraw.show();
			StdDraw.pause(10);
			
		}
	}

	private static boolean hasNext(String string) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
	}
}
