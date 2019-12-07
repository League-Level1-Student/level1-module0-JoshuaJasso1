int y = 5;
int randomNumber = (int) random(width);
void setup() {
  size(200, 200);
}
void draw() {
  background(128, 128, 128);
  fill(55, 55, 255);
  stroke(55, 55, 255);
  ellipse(5, y++, 10, 10);
  if (y>height) {
    y = 5;
  }
}
