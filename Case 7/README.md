Her er oppgaven vi ønsker at du utfører. Send gjerne kjapp tilbakemelding på at oppgaven er mottatt. Lever ved å sende oss kildekodefilene på epost (svar gjerne på denne meldingen), senest om 1,5 timer.

Det er fullt mulig å få godkjent oppgaven selv om du ikke rekker alt, så ikke stress! ;-) Hvis du går tom for tid, lever det du har. Ikke gå over fristen.

Oppgaven skal løses i Java. Koden du lager bør være testet, enten med et testrammeverk som f.eks. JUnit eller ved at du skriver et lite program som tester koden din. Du har antagelig ikke tid til å teste alt, men vi krever at i hvertfall noe av funksjonaliteten er testet. Testene skal også leveres.

**OBS**: Det er *ikke* meningen at du skal lage noe brukergrensesnitt i denne oppgaven. Trenger du data i testene dine, så hardkod disse dataene i testene. Det er heller ikke meningen at du skal persistere data til disk eller database - hold dataene i standard Java-datastrukturer.

# Oppgaven:
Programmet skal holde styr på beholdningen til en tegneseriebutikk, hvilke utgivelser det er og hvilken gradering (tilstand) de ulike eksemplarene har og informasjon om salget av dem.

* For hver tegneserieutgivelse skal det registreres Pris, Sjanger og Utgivelsesdato. En utgivelse er metainformasjon om en publisert tegneserie, det vil finnes mange fysiske eksemplarer av en gitt utgivelse. Butikken får inn eksemplarer av en utgivelse til videresalg.

* Hvert fysiske eksemplar butikken får inn skal klassifiseres med graderingen av selve bladet, prisen det selges for og dato det ble mottatt. Butikken opererer med følgende graderinger: "Til vurdering", "Slitt", "Pent brukt" eller "Som ny". Ved salg av et eksemplar skal det registreres tidspunkt for salget og faktisk utsalgspris.

## Funksjonalitetskrav 1: Registrering

* Lag en metode som registrerer en utgivelse av en tegneserie. Bruk Sjanger, Opprinnelig utsalgspris og Utgivelsesdato som parametere til metoden. Systemet skal generere en id for hver utgivelse, en utgivelses-id.

* Lag en metode som registrerer et eksemplar av en tegneserie butikken har fått inn. Bruk utgivelses-id, pris, gradering og dato den ble mottatt som parametere til metoden. Hvis gradering er “Til vurdering” settes pris til 0 av systemet. Systemet skal generere en id for hvert eksemplar.

* Lag en metode som oppdaterer et eksisterende eksemplar med gradering og pris. Bruk id, pris og gradering som parametere til metoden.

* Lag en metode som registrerer at et eksemplar har blitt solgt. Bruk id, faktisk salgspris og dato for salget som parametere til metoden. Eksemplarer som har gradering “Til vurdering” eller pris lik 0 kan ikke selges.


## Funksjonalitetskrav 2: Uthenting

* Lag en metode som lister ut alle tegneserier med gradering "Til vurdering".

* Lag en metode som lister ut alle tegneserier som er til salgs, sortert stigende på pris.

* Lag en metode som lister ut forskjellen i pris på opprinnelig utsalgspris og faktisk solgt pris på de eksemplarer som har blitt solgt.

* Lag en metode som oppdaterer alle eksemplarer av en gitt kombinasjon av utgivelse og gradering med ny pris.

## Funksjonalitetskrav 3: Feilhåndtering
Når det oppstår problemer i systemet, f.eks. hvis det forsøkes å legge ut en tegneserie for salg som det ikke finnes et fysisk eksemplar av i butikken eller det oppgis ugyldig input til en metode, så skal dette behandles fornuftig.



*Lykke til!*