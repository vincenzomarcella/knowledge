Tags: #Programmazione1 #Selezione 
# Espressioni booleane
Le espressioni booleane sono un tipo di espressione che ritorna un risultato di tipo [[Booleano|booleano]] e sono solitamente composte da operatori binari, con alcune eccezioni, gli operatori sono i seguenti:

|Nome|Operatore|
|---|---|
|Uguale|`==`|
|Disuguale|`!=`|
|Maggiore|`>`|
|Minore|`<`|
|Maggiore uguale|`>=`|
|Minore uguale|`<=`|

Oltre a queste operazioni, si possono anche avere operazioni che si possono comporre con quelle posibile con gli operatori specificati in precedenza per ottenere delle *istruzioni booleane complesse*. Per comporre queste istruzioni si usano i seguenti operatori:

|Nome|Operatore|
|---|---|
|Short-circuit AND|`&&`|
|Short-circuit OR|\|\||
|Bit-wise AND|`&`|
|Bit-wise OR|\||
|NOT|`!`|
Tra queste operazioni c'è da notare che il NOT è l'unica operazione unaria, mentre tutte le altre sono binarie. Inoltre bisogna anche specificare la nozione di short-circuit evaluation. La short-circuit evaluation permette di risparmiare risorse durante la valutazione di una espressione booleana composta grazie al fatto che in alcuni casi si può sapere il risultato di una espressione guardando solo la valutazione del primo membro. Infatti nel caso dell'AND, se il primo membro è `false`, sappiamo già che il risultato sarà  `false`.  Sappiamo anche che nel caso dell'OR, nel caso in cui il primo membro è `true`, il risultato sarà `true`.
## Casi particolari
- Bisogna notare che nel caso in cui si faccia un confronto da due variabili a virgola mobile bisogna tenere in considerazione il loro errore di rappresentazione, ciò è dovuto semplicemente al modo in cui sono strutturati a livello binario. Ciò vuol dire che se si vuole tenere in considerazione l'errore di rappresentazione bisogna fare i confronti nel seguente modo:

	|Tipo di confronto|Codice|
	|---|---|
	|A=B|`Math.abs(a-b) < epsilon`|
	|A>B|`Math.abs(a-b) > epsilon && a > b`|
	|A>B|`Math.abs(a-b) > epsilon && a < b`|
- Un altro caso particolare è il confronto tra stringhe, infatti nel caso di Java, visto che le stringhe sono degli oggetti immutabili e hanno bisogno di essere confrontate con il metodo `equals()`.