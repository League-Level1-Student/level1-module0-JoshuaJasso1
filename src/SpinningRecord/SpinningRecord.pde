import ddf.minim.*;
Minim minim;
AudioPlayer song;
PImage pictureOfRecord;
int angle = 0;
void setup() {
  size(600, 600);
  pictureOfRecord= loadImage("Record.jpg");
  pictureOfRecord.resize(600, 600);
  minim = new Minim(this);
  song= minim.loadFile("Let It Snow - Dean Martin.mp3", 512);
}
void draw() {
  if (mousePressed) {
    angle++;
    song.play();
    rotateImage(pictureOfRecord, angle);
  } else {
    song.pause();
    rotateImage(pictureOfRecord, angle);
  }
  image(pictureOfRecord, 0, 0);
}
void rotateImage(PImage image, int amountToRotate){
println("im here" + amountToRotate);
translate(width/2, height/2);
rotate(amountToRotate*TWO_PI/360);
translate(-image.width/2, -image.height/2);
}
