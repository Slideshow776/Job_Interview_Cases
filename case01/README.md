Oppgaven skal løses i Java. Koden du lager bør være testet, enten med et testrammeverk som f.eks. JUnit eller ved at du skriver et lite program som tester koden din. Det er mye bedre å ha løst mesteparten av oppgaven med tester, enn å ha løst absolutt alt men uten tester.

# Oppgaven:
Du skal lage kjernen i et system for en kakebutikk. Koden du skriver skal brukes av andre utviklere, som skal lage andre deler av systemet (f.eks. brukergrensesnittet).

Butikken lager tre typer kaker: Kransekaker, Sjokoladekaker og Bløtkaker. De lager kun kakene på bestilling. De er ute etter et system for å holde styr på kundene sine, og hvilke kaker som er bestilt og levert.

* For hver kunde skal det registreres en id, et navn, en mengde kaker som er bestilt men ikke levert, og en mengde kaker som er bestilt og levert. 
* For hver bestilte kake skal systemet lagre kunde, type kake og tidspunktet kaken ble bestilt. 
* For hver leverte kake skal systemet lagre kunde, type kake, og både tidspunktet kaken ble bestilt, og tidspunktet kaken ble levert.

### Funksjonalitetskrav 1: Registrering
* Lag en metode for å registrere en ny kunde. Ta navnet som parameter. Kundens ID bør genereres av systemet.
* Lag en metode for å registrere at en kake er bestilt. Ta kundens id, hvilken type kake, og tidspunktet for bestilling som parametere.
* Lag en metode for å registrere at en kake er levert: Ta kundens id, hvilken type kake, og tidspunktet for leveranse som parametere. Hvis kunden har bestilt mer enn en kake av denne typen (som ikke enda er levert), gjelder denne leveransen den ikke-leverte kaken som det er lengst siden ble bestilt.

### Funksjonalitetskrav 2: Uthenting
* Lag en metode som henter ut en kunde (med informasjon om både navn og bestilte/leverte kaker) basert på kundens id.
* Lag en metode som henter ut alle kundene sortert alfabetisk på navn.
* Lag en metode som henter ut den lengste tiden fra en kake ble bestilt til den ble levert (uavhengig av hvem som bestilte den).
### Funksjonalitetskrav 3: Feilhåndtering
* Når det oppstår problemer i systemet, f.eks. hvis det forsøkes å registrere et bestilling for en kunde som som ikke finnes eller det oppgis ugyldig input til en metode, så skal dette behandles fornuftig.


Lykke til!
