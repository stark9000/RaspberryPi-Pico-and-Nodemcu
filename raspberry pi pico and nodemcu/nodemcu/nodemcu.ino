//add necessary libraries.
#include <Arduino.h>
#include <ESP8266WiFi.h>

const char* SSID     = "NodeMCU-Access-Point";
const char* PASSWORD = "123456789";

WiFiServer SERVER(80);
WiFiClient  CLIENT;

void setup() {
  Serial.begin(9600);
  Serial.print("Setting AP (Access Point)…");
  WiFi.softAP(SSID, PASSWORD);
  IPAddress IP = WiFi.softAPIP();
  Serial.print("AP IP address: ");
  Serial.println(IP);
  SERVER.begin();
}

void loop() {
  if (SERVER.hasClient()) {
    if (!CLIENT || !CLIENT.connected()) {
      if (CLIENT) {
        CLIENT.stop();
      }
      CLIENT = SERVER.available();
    }
  }
  if (CLIENT && CLIENT.connected()) {
    if (CLIENT.available()) {
      while (CLIENT.available()) {
        char DATA = CLIENT.read();
        Serial.print(DATA);
      }
    }
  }
}
