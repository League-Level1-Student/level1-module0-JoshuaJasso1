int x = 20;
int y = 50;
int speed= 5;
int speed2= 5;
void setup() {
  size(500, 500);
}
void draw() {
  background(160, 160, 160);
  if (x ==500) {
    speed = -speed;
  } else if (x==0) {
    speed = -speed;
  }
  if (y==500) {
    speed2 = -speed2;
  } else if (y==0) {
    speed2= -speed2;
  }
  fill(255, 0, 0);
  stroke(255, 0, 0);
  ellipse(x+=speed, y+=speed2, 25, 25);
  rect(mouseX, 480, 100, 25);
  boolean intersect= intersects(x, y, mouseX, 480, 100);
  if (intersect==true) {
    speed2 = -speed2;
  } else {
  }
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else
    return false;
}
