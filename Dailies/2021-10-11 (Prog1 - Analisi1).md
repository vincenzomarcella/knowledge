# Lezione di Programmazione 1
## La classe String
La classe String rappresenta le sequenze di caratteri che vengono trattate come un unico elemento, in Java questo si fa attraverso questa classe. La classe String rappresenta un tipo non primitivo. Le string si dichiarano nel seguente modo:
```Java
String ciao = "Hello";
```
Tuttavia essendo String una classe, le stringhe si possono iniziallizzare anche nel seguente modo:
```Java
String ciao = new String("Hello");
```
### La differenza tra char e String
- Char può contenere un solo carattere, quando viene inizializzato o modificato il suo valore esso deve essere inserito in mezzo ad una coppia di singoli apici. 				
	```Java 
	char a = 'a';
	```
- String può contenere più caratteri, il suo valore può essere contenuto dentro i doppi apici.
	```Java
	String a = "a";
	```

Le stringhe possono essere concatenate con l'operatore 	```+```, quando vengono ad esempio concatenate delle stringhe e degli interi, l'intero sarà stringhizzato.
Ovviamente la classe String oltre a contenere dei dati, contiene anche die metodi che permettono di operare sulle strighe o di visualizzare i deti o le proprietà della stringa stessa. Uno degli esempi è il metodo ```length()```.
Essendo la stringa una sequenza di caratteri, ogni carattere all'interno di essa è indicizzato con un indice che parte da 0 a lunghezza-1.
Alcuni metodi della classe String sono:

|Nome|Descrizione|
---|---|
charAt(s)|ritorna il carattere alla posizione s|
compareTo(s)|compara lessicograficamente, ordine alfabetico, la stringa alla stringa s|
concat(s)|concatena la stringa alla stringa s|
equals(s)|ritorna true se la stringa s è uguale alla stringa altrimenti false|
equalsIgnoreCase(s)|stesssa cosa di equals ma non case sensitive|
indexOf(s)|ritorna l'indice dei caratteri nella sottostringa inserita|
lastIndexOf(s)|l'ultima occorrenza di una determinata sottostringa|
length()|la lunghezza di una stringa |
toLowerCase()|ritorna la stringa con tutti i caratteri minuscoli|
toUpperCase()|ritorna la stringa con tutti i caratteri maiuscoli|
replace(c1, c2)|rimpiazza tutte le occorenze di c1 con c2|
substring(s)|ritorna una sottostringa basata sulla stringa originaria partendo dall'indice s|
substring(s, e)|ritorna una sottostringa che parte da s incluso a e escluso|
trim()|leva gli spazi da una stringa|
### Elaborazione delle stringhe
Gli oggetti di tipo String sono immutabili, tuttavia si possono sempre scrivere un paio di righe di codice per cambiare il valore di una variabile di tipo String. Per variare il suo valore basta usare l'```=```.

# Lezione di Analisi 1
## Successione monotona
Le successioni monotone sono sempre regolari e quindi si avvicinano sempre ad un infinito o finito.
**DEF:** Una successione $\{a_{n}\}_{n=1}^\infty$ si dice crescente (strettamente crescente) se $a_{n+1} \geq a_{n} \ (a_{n+1} > a_{n})$. Enunciazione analoga per la crescente e per la descrescente.
**DEF:** Una succesione si dice monotona (strettamente monotona) sè crescente o decrescente (strettamente crescente o strettamente descrescente).
**TH:** Ogni successione monotona è regolare.
- Se la successione è limitata allora essa è convergente.
- Se la successione è illimitata si creano le seguenti casistiche:
	- Se è crescente il limite esiste ed è $\lim\limits_{n \to +\infty}a_{n} = Sup \ a_{n}$
	- Se è descrescente il limite esiste ed è $\lim\limits_{n \to +\infty}a_{n} = Inf \ a_{n}$

**DEF:** Una successione $a_{n}$ si dice di Cauchy se $\forall \epsilon>0 \quad \exists n_{\epsilon}\geq0 \ | \ \forall n_{i}k>n_{\epsilon} \quad |a_{n}-a_{k}|<\epsilon$
**TH:** Una successione $a_{n}$ è di Cauchy $\Leftrightarrow$ converge $\lim\limits_{n \to +\infty}a_{n} = a$
## Principio di induzione
Il principio di induzione è un metodo logico per dimostrare gli enunciati.
**DEF:** $A_{n} \ (\ \mathcal{P}(n) \ )$  affermazione, enunciato, proposizione che dipende da $n \in \mathbb{N}$.
Se valgono le seguenti proprietà:
- $\exists \ n_{0}\in \mathbb{n}| A_{n} \ è \ vera$ 
- $se \ A_{n} \ è \ vera \ allora \ A_{n+1} \ è \ vera  \ (n\geq n_{0})$ passo induttivo

Allora $\mathcal{P}(n) \ è \ vera \ \forall n\in\mathbb{N}$.
**EX:** $\mathcal{P}(n): 2^n\geq n^3$
- $2^7=128 \quad 7^3=349 \quad falso$
- Ad esempio per $n=1$ è vera ma per numeri superiori non è vera, specificamente è falsa per 7, 8, 9 ma vera per 10. 
- In questo caso il passo induttivo è :
$$2^n\geq n^3 \Rightarrow 2^{n+1}\geq (n+1)^3$$
$$2\cdot2^n\geq n^3+3n^2+3n+1$$
$$2\cdot2^n\geq 2\cdot n^3=n^3+n^3$$
$$=n^3 + n\cdot n^2$$
$$\geq n^3+3n^2+3n^2+n^2$$
$$\geq n^3+3n^2+3n+1$$
$$vero \ \forall n\geq 7$$
Detto ciò è stato dimostrato che $\forall n\geq10$ entrambe i passi sono veri, da notare come non per tutti gli n il passo induttivo è falso, infatti in certi casi se il primo passo è falso si può avere un passo induttivo vero.
$$2^n\geq n^3 \quad \forall n \geq10 \quad n_0=10$$
$$0) \exists n_0\in\mathbb{N} | \mathcal{P}(n_0) \quad vera$$
$$1) (\mathcal{P}(n) \ vera) \Rightarrow (\mathcal{P}(n+1) \ vera) \quad (n\geq n_0) \quad n=7$$
**EX:** 
$$\sum_{k=0}^n k = \frac{n(n+1)}{2}$$
$$0) \quad n_0=0 \quad vera \quad \mathcal{P}(0) \ vera$$
$$1) \quad \mathcal{P}(n)\rightarrow \mathcal{P}(n+1) \quad  \sum_{k=0}^{n+1} k=\sum_{k=0}^n k +n+1 = \frac{n(n+1)}{2}+n+1$$
$$=\frac{n(n+1)+2(n+1)}{2}+n+1=\frac{(n+1)(n+2)}{2}$$
**EX:** $$\sum_{k=0}^{n+1} x^k = \frac{1-x^{n-1}}{1-x} \quad x=1$$
$$0) n_0=0 \quad 1=1$$
$$1) \sum_{k=0}^{n+1} x^k = \sum_{k=0}^{n} x^k+x^{n+1}= \frac{1-x^n}{1-x}+x^{n+1}$$
$$= \frac{1-x^{n+1}-x^{n+1}-x{n+2}}{1-x}=\frac{1-x^{n+2}}{1-x}$$
### Coefficiente binomiale
Esso si chiama così perché appare nello sviluppo delle potenze di un binomio.
$$\binom{n}{h}=\frac{n!}{h!(n-h)!} \quad 0\leq h\leq n$$
### Formula di Newton
Questa è una formula per generalizzare le potenze di un binomio
$$(a+b)^n= \sum_{k=0}^n\binom{n}{k}a^kb^{n-k}$$
**DIM:** $$0)\ n_0=0 \quad vera$$
$$1)\ (a+b)^{n+1}=(a+b)\cdot (a+b)^n=(a+b)\cdot\sum_{k=0}^n\binom{n}{k}a^kb^{n-k}$$
$$=\sum_{k=0}^n\binom{n}{k}a^{n+1-k}b^k+\sum_{k=0}^n\binom{n}{k}a^{n-k}b^{k+1}$$
$$=a^{n+1}+\sum_{k=1}^n\binom{n}{k}a^{n+1-k}b^{k}+\sum_{k=0}^{n-1}\binom{n}{k}a^{n-k}b^{k+1}+b^{n+1}$$
$$=a^{n+1}+\sum_{k=1}^n\binom{n}{k}a^{n+1-k}b^{k}+\sum_{k=1}^{n-1}\binom{n}{k-1}a^{n-k}b^{k+1}+b^{n+1}$$
 - *TH :* $\binom{n}{h}=\binom{n+1}{h-1}+\binom{n}{h}$
$$=a^{n+1}+\sum_{k=1}^n\binom{n}{k}a^{n+1-k}b^{k}=\sum_{k=0}^{n+1}\binom{n+1}{k}a^{n+1-k}b^k \quad vero$$
## Limiti notevoli
Se $a_n=a^n$:
- $\lim\limits_{n \to +\infty}a^n = \begin{cases}+\infty \quad a>1\\ 1 \quad a=1 \\ 0 \quad |a|<1 \\ \not\exists \quad a\leq-1\end{cases}$
- $\lim\limits_{n \to +\infty} a^{\frac{1}{n}}= \begin{cases}1 \quad a>0 \\ \end{cases}$ <-- NON NECESSARIO
- $\lim\limits_{n \to +\infty}(1+\frac{1}{n})^n=\lim\limits_{n \to +\infty} e^{n \log(1+\frac{1}{n})}$ e va a più infinito 1 più 1 su n a seconda verso 0 o 1.
**VERIFICO:**$$a_n=(1+\frac{1}{n})^n$$
- Strettamente crescente: $$(1+\frac{1}{n})^n>(1+\frac{1}{n-1})^{n-1}$$
$$(\frac{n+1}{n})^n>(\frac{n}{n-1})^{n-1}=(\frac{n}{n-1})^n\frac{n-1}n$$
$$(\frac{n+1}n)^n>(\frac{n}{n-1})^n\frac{n-1}n=(\frac{n^2-1}{n^2})^n>1-\frac{1}n$$
$$(1-1n^2)^n>1-\frac{1}n \quad x=-\frac{1}{n^2}$$
- È limitata: $$(1+\frac{1}{n})^n=\sum_{h=0}^n\binom{n}{h}\frac{1}{n^h}=\sum_{h=0}^n\frac{1}{h!}\frac{n(n-1)...(n-h+1)}{n^h}\leq1$$
$$<\sum\frac{1}{h!}=1+\frac{1-\frac{1}{2}n}{1-\frac{1}{2}}<1+2=3$$
$$0<(1+\frac{1}{n})^n<\sum \quad è \ regolare \quad \exists\lim\limits_{n \to +\infty}(1+\frac{1}{n})^n = e$$
**CONSEGUENZE: ** $$a_n \rightarrow +\infty \quad \lim\limits_{n \to +\infty}(1+\frac{1}{a_n})^{a_n}=e$$
Tra questo e il precedente cambiasolo l'indicizzazione da n a un indice derivata da a dato un n.
$$a_n \rightarrow 0 \quad \lim\limits_{n \to +\infty}(1+\frac{1}{a_n})^{a_n}=e$$

**EX: ** $$\lim\limits_{n \to +\infty}(1+\frac{x}{n})^n \quad x>0$$
$$a_n = \frac{x}{n}$$
$$\lim\limits_{x \to +\infty}(1+a_n)^{\frac{x}{a_n}}$$
$$\lim\limits_{x \to +\infty}a_n = 0$$
$$\lim\limits_{x \to +\infty}((1+a_n)^{\frac{1}{a_n}})^x=e^x$$