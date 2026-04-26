## **8B: ZIGBEE COMMUNICATION**

### **AIM:**

To write a program to control an LED using a Zigbee module.

---


## **Hardware & Software Requirements**

| S.No | Hardware & Software Requirements | Quantity |
| ---- | -------------------------------- | -------- |
| 1    | Arduino IDE 2.0                  | 1        |
| 2    | Arduino UNO Development Board    | 2        |
| 3    | Jumper Wires                     | Few      |
| 4    | Arduino USB Cable                | 2        |
| 5    | Zigbee Module                    | 2        |




### **CONNECTIONS:**

* Connect both Zigbee modules to the PC using USB-to-serial adapters
* Open XCTU software, detect both Zigbee modules
* Configure one module as Coordinator and the other as Router/End Device
* Set same PAN ID and baud rate (e.g., 9600 bps)
* Open serial terminal for both modules
* Send data from transmitter terminal
* Observe received data on receiver terminal

---

## **PROGRAM**

### **TRANSMITTER SIDE:**

```cpp
#include <SoftwareSerial.h>

SoftwareSerial mySerial(2, 3);

void setup() {
    mySerial.begin(9600);
    Serial.begin(9600);
}

void loop() {
    mySerial.write('A');
    Serial.println('A');
    delay(1000);

    mySerial.write('B');
    Serial.println('B');
    delay(1000);
}
```

---

### **RECEIVER SIDE:**


#include <SoftwareSerial.h>

SoftwareSerial mySerial(2, 3);

void setup() {
    mySerial.begin(9600);
    Serial.begin(9600);
    pinMode(4, OUTPUT);
}

void loop() {
    if (mySerial.available() > 0) {
        char data = mySerial.read();
        Serial.println(data);

        if (data == 'A')
            digitalWrite(4, HIGH);
        else if (data == 'B')
            digitalWrite(4, LOW);
    }
}

## **Transmitter Connections**

| Arduino UNO Pin | Zigbee Module |
| --------------- | ------------- |
| VCC             | 5V            |
| GND             | G             |
| 2               | TX            |
| 3               | RX            |

---
## **Receiver Connections**

| Arduino UNO Pin | Zigbee Module | Arduino Development Board |
| --------------- | ------------- | ------------------------- |
| VCC             | 5V            | 5V                        |
| GND             | G             | GND                       |
| 2               | TX            | —                         |
| 3               | RX            | —                         |
| 4               | —             | LED1                      |

---