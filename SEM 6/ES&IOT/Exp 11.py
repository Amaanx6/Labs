*EXPERIMENT – 11**
**INTERFACING SENSORS WITH RASPBERRY PI**

**AIM:**
To interface the IR sensor and Ultrasonic sensor with Raspberry Pi Pico.



### Hardware & Software Tools Required
| S.No | Item                                | Quantity |
| ---- | ----------------------------------- | -------- |
| 1    | Thonny IDE                          | 1        |
| 2    | Raspberry Pi Pico Development Board | 1        |
| 3    | Jumper Wires                        | Few      |
| 4    | Micro USB Cable                     | 1        |
| 5    | IR Sensor                           | 1        |
| 6    | Ultrasonic Sensor                   | 1        |


### PROGRAM

#### IR SENSOR:


from machine import Pin
from time import sleep

buzzer = Pin(16, Pin.OUT)
ir = Pin(15, Pin.IN)

while True:
    ir_value = ir.value()
    if ir_value == True:
        print("Buzzer OFF")
        buzzer.value(0)
    else:
        print("Buzzer ON")
        buzzer.value(1)
    sleep(0.5)
    

#### ULTRASONIC SENSOR:


from machine import Pin
import utime

trig = Pin(14, Pin.OUT)
echo = Pin(15, Pin.IN)
buzzer = Pin(16, Pin.OUT)

def get_dist():
    trig.low()
    utime.sleep_us(2)
    trig.high()
    utime.sleep_us(5)
    trig.low()

    while echo.value() == 0:
        start = utime.ticks_us()
    while echo.value() == 1:
        end = utime.ticks_us()

    return (end - start) * 0.0343 / 2

while True:
    d = get_dist()
    print("Distance:", d)

    buzzer.value(d <= 10)
    utime.sleep(0.1

```


### RESULT: The IR and Ultrasonic Sensor were successfully interfaced with Raspberry pi pico and the output was obtained based on the sensor input condition

---


### Connections (IR Sensor)

| Raspberry Pi Pico Pin | Board Label | IR Sensor Module |
| --------------------- | ----------- | ---------------- |
| GP16                  | BUZZER      | —                |
| GP15                  | —           | OUT              |
| —                     | 5V          | VCC              |
| —                     | GND         | GND              |

---

### Connections (Ultrasonic Sensor)

| Raspberry Pi Pico Pin | Board Label | Ultrasonic Sensor Module |
| --------------------- | ----------- | ------------------------ |
| GP16                  | BUZZER      | ECHO                     |
| GP15                  | —           | TRIG                     |
| GP14                  | —           | VCC                      |
| —                     | 5V          | VCC                      |
| —                     | GND         | GND                      |