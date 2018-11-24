# Vivify Ideas OOP Zadatak

## Uputstvo

Zadatak može biti pisan u nekom od sledecih programskih jezika: ​PHP​, ​Javascript​, ​Python​,
Java​, ​Ruby​, ​C# i očekuje se da bude urađen uz poštovanje osnovnih principa objektno
orijentisanog programiranja.
Cilj zadatka je pre svega da se pokaže dobro poznavanje OOP principa, a poželjno je korišćenje
arhitekturalnih i dizajn paterna. ​ **Nije esencijalno da program radi.** Ponavljamo da je
maksimalno vreme izrade ​ **3h​**. Kandidat moze da preda zadatak i nakon 1h ako smatra da je
prikazao dovoljno znanja. Nakon ​ **3h** rada poslati zadatak i ako nije dovršen. Zadatak treba
realizovati bez dodatnih pitanja.

## Napomene

```
● Ne treba pisati bazu podataka
● Ne treba pisati HTML/CSS kȏd
● Akcenat je na OOP programiranju
● Ukoliko je u odabranom jeziku moguće, potrebno je na odgovarajućim mestima
implementirati:
○ Nasleđivanje
○ Singleton pattern
○ Polimorfizam
○ Exception handling
```

## Zadatak

1. Pre avionskog leta formira se spisak putnika i njihovih prtljaga.
2. Let ima svoj naziv, spisak putnika i kapacitet koji se ne sme premašiti.
3. Vodi se evidencija o putnicima (ime, prezime, kilaža), kao i o tome da li su na ​ **No Fly​** listi, i
    u tom slučaju ne mogu leteti avionom.
4. Takođe se vodi evidencija o kilaži pilota i njegovoj licenci za rad ( da li je poseduje ili ne )
5. Svaki prtljag ima svoju kilažu, i može biti ručni ( putnik ga nosi sa sobom ) ili predati ( ide
    u prtljažnik ).
6. Nekada se desi da se nakon leta zaključi da je nečiji prtljag izgubljen.
7. Napisati program koji vrši proveru putnika za avionski let i vodi evidenciju o njihovom
    izgubljenom prtljagu.
       a. Napraviti 10 putnika i 2 pilota, pri čemu će šansa da putnik bude na ​ **No Fly​** listi
          biti 30%, a šansa da pilot nema licencu za rad 5%.
       b. Svaki putnik ima kilažu u intervalu od 20 do 100kg, a njihov prtljag u intervalu od
          1 do 5kg. Ukoliko je težina prtljaga manja od 2kg, prtljag se smatra ručnim.
       c. Informacije o svakom putniku koji je ušao u avion, kao i njegovom prtljagu, treba
          ispisati na ekran ili u ​.txt​ fajl.
       d. Šansa da se predati prtljag izgubi je 30%.
       e. Šansa da se ručni prtljag izgubi je 10%.
       f. Nakon leta logovati ukupnu kilažu izgubljenog prtljaga, kao i imena putnika čiji
          predati prtljag je izgubljen, pošto aviokompanija odgovara samo za prtljag koji je
          izgubljen u prtljažniku, ne i za ručni.
