## Wobbly Blues (Hans, Sindre, Torstein, Tines)
### Fredag 14.Feb, kl 12 - 14
Møtende medlemmer: Alle
Gruppen møttes og diskuterte om TiledMap klassen fra gdx skulle brukes, eller om det skulle lages en egen map. Hovedproblemet var å teste TiledMap, ettersom det ikke var mulig å initialisere en tiledmap klasse uten å gjøre det i en kjørende gdx application, som ville føre til crash i JUnit. Vi hadde lest om mockito, men ettersom ingen hadde erfaring i det, og ingen visste hvor mulig det var å gjøre, så bestemte gruppen seg om at å lage en egen Map klasse ville være hensiktsmessig. En Map klasse ble laget, og en xml parser klasse for å fortsatt gjøre det mulig å bruke applikasjonen Tiled.
Gruppen satt seg også ned og spilte en runde med roborally som brettspill, og fikk en følelse for hvordan logikken skal fungere. Hans vant.
Til slutt ble vi enige om et Minecraft tema som textures

### Fredag 21.Feb, kl 12-14
Møtende medlemmer: Hans, Torstein, Tines (Sindre var borte men hadde sagt ifra) 

Etter ny informasjon om at mockito var en fullt mulig idé valgte vi å droppe vår egen Map og gå tilbake til TiledMap,
 vi fant en klasse for å kjøre JUnit med TiledMap i følgene link: https://github.com/TomGrill/gdx-testing  som bruker mockito og lager en headless application.
Hele gruppemøtet gikk med på diskusjon rundt dette temaet, og alle gruppemedlemmer er fornøyd med fremskrittet.

### Torsdag 27.Feb kl 17-19
Møtende medlemmer: Hans, Torstein, Tines (brått avtalt)

Vi diskuterte videre arbeid, Torstein kom på en smart måte å representere kort ved bruk av enums. Vi fant også ut at å finne rotasjonen til en brikke kan være vanskelig å oppnå ettersom brikkene er så simple.
 Vi vurderer å matche id til hver brikke 

### Fredag 28.Feb
Møtende medlemmer: Alle

Vi fullførte og svarte på oppgavene