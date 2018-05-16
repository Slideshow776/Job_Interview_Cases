*Case for Data Data engineer*
**The Google Analytics Ecommerce Simulator**

***Casebeskrivelse***
Bedriften “ Fabulous Furniture ” er en fiktiv møbelforhandler som selger eksklusive møbler. I sin
daglige drift har selger de møbler på nettsiden sin, men har også et lagerutsalg der kunder kan
kjøpe produkter. Kunden har god oversikt over produktene de selger i nettbutikken sin, men
produkter som blir solgt fra lageret har de ikke like god oversikt over. Kunden ønsker å laste opp
sine salgsdata fra lagerutsalget til Google Analytics som de bruker på nettstedet sitt. For å være
sikker på at de får data inn i Google Analytics på riktig måte ønsker de å simulere ecommerce
hendelser.
I denne oppgaven skal du bruke Google Measurement Protocol for å laste opp data til Google
Analytics.
Forberedelser
1. Lag en konto i Google Analytics og opprett en ny ‘Property’ der.

***Oppgavene***
1. Lag et lite script som kan kjøres fra kommandolinjen for å sende transaksjoner til Google
Analytics. I denne oppgaven ønsker vi at du bruker Python eller Node JS, velg det du
føler deg mest komfortabel med. Scriptet skal kunne:
a. Bruke vedlagt fil fabfurniture.json som datagrunnlag
b. For hvert element i listen, sende en transaksjon til Google Analytics
2. Lag en presentasjon der du:
a. Kort presenterer løsningen din
b. Viser hvordan dataene ser ut i Google Analytics
De to oppgavene over er likestilte. Dvs at vi forventer omtrent like stor tidsbruk på begge deler.

Lykke til!!


Viktige ressurser på internett
https://nodejs.org/en/
https://developers.google.com/analytics/devguides/collection/protocol/v1/
https://ga-dev-tools.appspot.com/hit-builder/
https://developers.google.com/analytics/devguides/collection/protocol/v1/validating-hits

Om datasettet
Datasettet et en liste med transaksjoner i JSON format. Hver transaksjon har en unik
transaksjons-id, og informasjon produktet som ble kjøpt. Hver transaksjon inneholder kun ett
produkt.
Et utdrag fra datasettet :
{
"sku": "57A1CD",
"category": "Table",
"name": "Supreme Table",
"series": "Supreme",
"price": 3234,
"currency": "NOK",
"transaction_id": 16504819
}
Beskrivelse av datafeltene:
SKU = Kort for “Stock keeping unit”, dette er en unik ID per produkt.
Category = Hvilken kategori produktet tilhører
Name = Produktets navn
Series = Produktserie
Currency = Valuta, denne vil alltid være “NOK”
Transaction_id = En unik ID per transaksjon.

Hint :
- Du kan bruke “Hit builder” for å se hvordan et gylding hit kan se ut
https://ga-dev-tools.appspot.com/hit-builder/
