#include <SoftwareSerial.h>
SoftwareSerial WIFIS(2, 3); // phy pin4 and phy pin5

char charx = 0;

int LED_1 = 4; // phy pin6
int LED_2 = 5; // phy pin7
int LED_3 = 6; // phy pin9
int LED_4 = 7; // phy pin10

void setup() {
  WIFIS.begin(9600);
  Serial.begin(9600);

  pinMode(LED_1, OUTPUT);
  pinMode(LED_2, OUTPUT);
  pinMode(LED_3, OUTPUT);
  pinMode(LED_4, OUTPUT);
}

void loop() {
  if (WIFIS.available() > 0) {
    charx = WIFIS.read();

    Serial.print(charx);

    if (charx == 'A') {
      digitalWrite(LED_1, HIGH);
    } else if (charx == 'a') {
      digitalWrite(LED_1, LOW);
    }

    if (charx == 'B') {
      digitalWrite(LED_2, HIGH);
    } else if (charx == 'b') {
      digitalWrite(LED_2, LOW);
    }

    if (charx == 'C') {
      digitalWrite(LED_3, HIGH);
    } else if (charx == 'c') {
      digitalWrite(LED_3, LOW);
    }

    if (charx == 'D') {
      digitalWrite(LED_4, HIGH);
    } else if (charx == 'd') {
      digitalWrite(LED_4, LOW);
    }
  }
}
