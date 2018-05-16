Oppgaven skal løses i Java. Koden du lager bør være testet, enten med et testrammeverk som f.eks. JUnit eller ved at du skriver små programsnutter som tester koden din. Skriv gjerne tester underveis, ikke vent til slutt. Testene skal også leveres.

OBS: Det er ikke meningen at du skal lage noe brukergrensesnitt i denne oppgaven. Trenger du data i testene dine, så hardkod disse dataene i testene. Det er heller ikke meningen at du skal persistere data til disk eller database - hold dataene i standard Java-datastrukturer.

Oppgaven:
Lag en datastruktur som kan representere personregistre, personer og foredre/barn-relasjoner mellom personer.
Et personregister inneholder 0 eller flere personer.
Hver person har et navn, en formue uttrykt i kroner, en fødselsdato og en unik ID. Når personen opprettes gis navn, formue og fødselsdato som parametere, mens den unike ID'en skal genereres av personregisteret. En person som opprettes er alltid levende.
To personer kan være i et barn/forelder-forhold, der den ene er barn og den andre forelder.
En person kan ha 0, 1 eller 2 registrerte foreldre. Du behøver ikke skille på mor og far, men foreldrene må være eldre enn barna.
En person kan være levende eller død.

Funksjonalitetskrav 1: Opprettelse og uthenting
Lag en metode for å opprette og lagre en ny person i et personregister. Metoden bør returnere personens ID.
Lag en metode for å hente ut en person fra et personregister basert på personens ID.
Lag en metode for å registrere barn/forelder-forhold mellom allerede registrerte personer i et personregister. Hvis dette medfører at en person får mer enn to foreldre, må registreringen ikke gjennomføres og feilen håndteres slik at koden som evt kalte registreringsmetoden får beskjed om hva som gikk galt. Det skal være umulig å registrere et barn/forelder-forhold der barnet er eldre enn forelderen.

Funksjonalitetskrav 2: Sortering
Lag en metode som henter ut alle medlemmene av et personregister sortert alfabetisk på navn.
Funksjonalitetskrav 3: Arv
Når en person dør, skal registeret kunne oppdateres med informasjon om dette. I slike tilfeller skal systemet også håndtere reglene for arv. Personens formue fordeles likt mellom personens registrerte barn. Deres formue øker, og personen som døde får formue lik 0. Men hvis et barn ville mottatt mer enn 100 000kr i en transaksjon på denne måten, må de betale skatt av arven: De mottar da bare 75% av det de egentlig ville mottatt (vi antar med andre ord flat 25% skatt på beløp fra 100 000 og oppover).

Lykke til!
