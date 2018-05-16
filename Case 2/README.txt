Følgende API-kall lister noen av de mest populære JavaScript-repositoryene på GitHub: [https://api.github.com/search/repositories?q=language:javascript&sort=stars&order=desc&per_page=100]  (N.B. Vi ønsker ikke at du endrer på per_page parameteren. La den stå på per_page=100.)

Lag en nettside som presenterer repositoryene i en stylet tabell med minst 4 kolonner med informasjon om repositoryene. Tabellen skal kun vise 20 repositories omgangen, men det skal være mulig å bla gjennom alle repositoryene API-kallet returnerer ved hjelp av paginering.

Noen krav:

*Selve logikken til paginering ønsker vi at du skriver uten bruk av et paginerings bibliotek/plugin.

*Vi forventer at tabellen og resten av innholdet på siden skal være stylet.

*Løsningen trenger kun å støtte moderne nettlesere (Chrome, Edge, Firefox, etc).

*Kjente feil/mangler/tolkninger bør redegjøres ved levering.


Noen tips:

*Det er lov å bruke biblioteker til utvikling av siden (f.eks. React, Vue, Angular, etc).

*Bruk ES2015 så lenge du er komfortabel med det (N.B. dette er ikke et krav).

*Bruk heller tid på å gjøre koden lesbar og modulær framfor å bruke tid på "fancy" funksjonalitet/styling

*Siden løsningen kun skal støtte moderne nettlesere, burde det ikke være behov for biblioteker som jQuery.




@author Sandra Moen

For å kjøre hjemmesiden:

1.  Last ned Nodejs, om du ikke har den fra før.
    (Link her: https://nodejs.org/en/download/)

2.  Kjør kommando i konsoll:
    $ cd [til rotfil i prosjektet]
    $ npm run dev
	
-------------------------------------------------------------------------------------

Fokus på enkel styling. Ofret funksjonalitet for logikk, struktur og modularitet.
Usikker på hvilke githubrepository data som var mest interessante: Virker som om watchers og stars er like,
language virker unødvendig da alt er i Javascript uansett, kanskje man kunne bare trykke på hele elementet som link til siden deres(?).
Liker ikke at appen 'hopper' når man blar i sidene.
Usikker på rød hover effekt.
Jeg har ikke testet siden opp mot difi.no sine nettkrav.
Fungerer fint i Chrome og Opera.

Figur: hjemmesiden.png viser et bilde av hvordan det skal se ut.

Filer skrevet av meg.
App.js:						Component for appen.
repository_list.js:				Component for listen.
repository_list_item.js:			Enkelt component for hvert element som finnes i listen.
page_list.js					Component som holder all sidenavigeringen.
index.js					Basic oppsett til React.
index.html					Basic oppsett til React.
style.css					All styling finnes her.

Components oppsett:

|-----------App.js------------------------------|
|												|
|	|-------repository_list.js--------------|	|
|	|										|	|
|	|	|---repository_list_item.js------|	|	|
|	|	|								 |	|	|
|	|	|--------------------------------|	|	|
|	|	|---repository_list_item.js------|	|	|
|	|	|								 |	|	|
|	|	|--------------------------------|	|	|
|	|	|---repository_list_item.js------|	|	|
|	|	|								 |	|	|
|	|	|--------------------------------|	|	|
|	|										|	|
|	|---------------------------------------|	|
|												|
|												|
|	|-------page_list.js--------------------|	|
|	|										|	|
|	|---------------------------------------|	|
|												|
|-----------------------------------------------|
