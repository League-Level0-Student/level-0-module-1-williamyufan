import ddf.minim.*;    
Minim minim;    
AudioPlayer sound;
void setup() {
  minim = new Minim(this);
  sound = minim.loadFile("beep.wav");
  size(500, 500);
  fill(188, 121, 38);
  ellipse(150, 150, 150, 150);
}
void draw() {

  PImage bacon = loadImage("canadianbacon.ppm.gif");
  bacon.resize(20, 20);

  image(bacon, 100, 100);
  image(bacon, 150, 150);

  if (mousePressed) {
    sound.play();
    image(bacon, mouseX, mouseY);
  }
}