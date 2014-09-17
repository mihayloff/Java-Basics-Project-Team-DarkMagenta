package main;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;


public class Enemy {
	private int x;
	private int y;
	static double enemySpeed = 5;
	static Image enemyImage;
	
	public Enemy(int x, int y) {
		this.x = x;
		this.y = y;
		
		enemyImage();
	}
	
	public void tick() {
		x -= (int)enemySpeed;
	}
	
	public void paint(Graphics g) {
		g.drawImage(enemyImage, x, y, null);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(this.x, this.y, enemyImage.getWidth(null), enemyImage.getHeight(null));
	}
	
	public int getX() {
		return x;
	}
	
	private void enemyImage(){
		
		ImageIcon ii = new ImageIcon("res/Images/enemy.png");
		enemyImage = ii.getImage();
		
	}
}