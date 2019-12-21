int y = 5;
int x = 100;
int buckety= 190;
int randomNumber = (int) random(200);
int score = 0; 
void setup() {
  size(200, 200);
}
void draw() {
  background(128, 128, 128);
  rect(mouseX, buckety, 15, 15);
  fill(55, 55, 255);
  stroke(55, 55, 255);
  ellipse(randomNumber, y, 10, 10);
  y=y+5;
  if (y>height-10) {
    y = 5;
    randomNumber= (int) random(200);
}
  if (y == buckety){
  checkCatch(randomNumber);
  }
  fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}
void checkCatch(int x){
     if (x > mouseX && x < mouseX+100)
          score++;
          
     else if (score > 0)
          score--;
     println("Your score is now: " + score); }
