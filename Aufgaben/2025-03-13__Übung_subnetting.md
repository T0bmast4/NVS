# Übung Subnetting

## Übung 1

Bilde aus dem Netz 192.168.0.0 /24 4 Subnetze. Netze mit Mindestzahl an nutzbaren
Host aber nicht darunter wählen:
Netz a mit 20,
Netz b mit 15,
Netz c mit 30, und das
Netz d mit den Rest Anteil der Netzwerkadressen.

**Antwort**
| Netz          | Subnetmask    | NetzID        | erste Adresse | letzte Adresse| Broadcast     |
| ------------- | ------------- | ------------- | ------------- | ------------- | ------------- |
| Netz a        | /27           | 192.168.0.0   | 192.168.0.1   | 192.168.0.30  | 192.168.0.31  |
| Netz b        | /27           | 192.168.0.32  | 192.168.0.33  | 192.168.0.62  | 192.168.0.63  |
| Netz c        | /27           | 192.168.0.64  | 192.168.0.65  | 192.168.0.94  | 192.168.0.95  |
| Netz d        | /25           | 192.168.0.128 | 192.168.0.129 | 192.168.0.254 | 192.168.0.255 |



## Übung 2

Teile das Netz 193.170.20.0 /24 in 8 gleich große Netze!

**Antwort**
| Subnetmask    | NetzID        | erste Adresse | letzte Adresse| Broadcast     |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| /27           | 192.168.0.0   | 192.168.0.1   | 192.168.0.30  | 192.168.0.31  |
| /27           | 192.168.0.32  | 192.168.0.33  | 192.168.0.62  | 192.168.0.63  |
| /27           | 192.168.0.64  | 192.168.0.65  | 192.168.0.94  | 192.168.0.95  |
| /27           | 192.168.0.96  | 192.168.0.97  | 192.168.0.126 | 192.168.0.127 |
| /27           | 192.168.0.128 | 192.168.0.129 | 192.168.0.150 | 192.168.0.159 |
| /27           | 192.168.0.160 | 192.168.0.161 | 192.168.0.190 | 192.168.0.191 |
| /27           | 192.168.0.192 | 192.168.0.193 | 192.168.0.222 | 192.168.0.223 |
| /27           | 192.168.0.224 | 192.168.0.225 | 192.168.0.254 | 192.168.0.255 |



## Übung 3

172.28.40.0 /26 Teile wie folgt auf: 2 Netze!

**Antwort**
| Subnetmask    | NetzID        | erste Adresse | letzte Adresse| Broadcast     |
| ------------- | ------------- | ------------- | ------------- | ------------- |
| /27           | 172.28.40.0   | 172.28.40.1   | 172.28.40.30  | 172.28.40.31  |
| /27           | 172.28.40.32  | 172.28.40.33  | 172.28.40.62  | 172.28.40.63  |


## Übung 4

Wie lautet die Subnetzmaske bei der Netzadresse: 17.0.0.0 mit 10 verwendbaren Subnetzen, sowie mit mindestens 12 Hosts je Subnetz?

**Antwort**



## Übung 5

Bestimmen Sie die Subnetmaske mit folgenden Angaben:

Netzadresse: 210.52.190.0
Subnetze: Anzahl 5
Mindestanzahl von Hosts je Subnetz: 10

**Antwort**

## Übung 6

Teile  ein /30 Netz auf!    Wozu werden diese /30 Netze am häufigsten verwendet?
Antwort:

**Antwort**

## Übung 7

Nennen Sie den jeweiligen Netz- und Hostanteil der Klassen A, B und C

**Antwort**
| Klasse      | Netzanteil    | Hostanteil    |
| ------------| ------------- | ------------- |
| A           | 8 Bit  | 24 Bit   |
| B           | 16 Bit  | 16 Bit  |
| C           | 24 Bit  | 8 Bit  |