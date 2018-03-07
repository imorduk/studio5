const int pin3 = 12; //blue
const int pin2 = 11; //yellow
const int pin1 = 10; //green
const int pin0 = 9; //red

int input = 0;

int zero = 0;
int one = 0;
int two = 0;
int three = 0;

void setup(){
  Serial.begin(9600);
  pinMode(11,OUTPUT);
  pinMode(9,OUTPUT);
  pinMode(10,OUTPUT);
  pinMode(12,OUTPUT);
}

void loop(){
  if(Serial.available()>0){
    input = Serial.read();
  digitalWrite(12, HIGH);
  if(input <= 57){
    zero = (input & 0x01);
    one = (input & 0x02)>>1;
    two = (input & 0x04)>>2;
    three = (input & 0x08)>>3;
  }
  else{
    zero = (input & 0x01);
    one = (input & 0x02)>>1;
    two = (input & 0x04)>>2;
    three = 1;
  }
  digitalWrite(12, three);
  digitalWrite(11, two);
  digitalWrite(10, one);
  digitalWrite(9, zero);
  }
}

