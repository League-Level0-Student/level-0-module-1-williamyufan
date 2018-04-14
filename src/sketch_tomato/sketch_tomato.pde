void setup() {
    size(500, 500);
}
void draw() {
    background(255, 255, 255);
    noStroke();
    fill(234,2,6);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(28,211,19);
    rect(176, 103, 12, 32);
    if(mousePressed){
     fill(255,255,255); 
ellipse(78,200,30,30);
    }
}