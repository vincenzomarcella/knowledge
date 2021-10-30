Tags: #Daily 
# Programmazione
## Le istruzioni condizionali
Il flusso di controllo è l'ordine in cui il programma esegue le istruzini, nel momento in cui veongono introdotte delle istruzioni di selezione come l' `if`, si iniziano a diramare il flusso di controllo, ampliando le possibilità per la codifica di algoritmi. Queste istruzioni di selezione vengono anche dellete branching statements.
```Java
if(<condizione>) {
	istruzione
} else {
	istruzione
}
```
Nella condizione si può avere una condizione booleana, che se vera, comporterà l'esecuzione del codice nelle graffe seguenti all'`if`, altrimenti verrano eseguite le istruizoni conenute nell'`else`.
## Le espressioni booleane
Le espressioni booleane sono delle istruzioni che ritornano un valore di tipo `boolean`, questo valore ovviamente può essere true o false.  Queste espressioni usano i seguenti operatori di confronto:

|Nome|Operatore|
|---|---|
|Uguale|`==`|
|Non uguale|`!=`|
|Maggiore|`>`|
|Minore|`<`|
|Maggiore uguale|`>=`|
|Minore ugugale|`<=`|

### Istruzioni booleane complesse
Le istruzioni booleane possono, inoltre, essere composte utilizzando i vari operatori logici. Questi permettono di comporre delle istruzioni usando multiple istruzioni elementari fatte con gli operatori nella tabella precedente. 
Solitamente per comporre delle espressioni booleane si usano gli operatori logici della logica booleana (es. AND, OR XOR).
Gli operatori sono i seguenti:

|Nome|Operatore|
|---|---|
|AND|`&&`|
|OR|\|\||
|NOT|`!`|
### Equivalente tra operazioni negate
|Operazione negata|Equivalente non negato|
|--|--|
|`<`|`>=`|
|`<=`|`>`|
|`>`|`<=`|
|`>=`|`<`|
|`==`|`!=`|
|`!=`|`==`|
### Tabella di verità con gli operatori booleani
|Valore di A|Valore di B|A&&B|A\|\|B|!A|
|---|---|---|---|---|
|true|true|true|true|false|
|true|false|false|true|false|
|false|true|false|true|true|
|false|false|false|false|true|
### Istruzioni di selezione annidate
Ovviamente, essendo che dentro una qualsiasi if si può mettere una qualsiasi istruzione, si possono anche annidare più if per diramare ulteriormente il flusso di controllo.
### Le istruzioni composte
Le istruzioni composte sono tutte quelle istruzioni che vengono raggruppate in una coppia di graffe. Ciò implica che nella presenza di un paio di graffe, tutte le istruzioni al loro interno verrano eseguite come un blocco. C'è da precisare che è importante anche considerare lo scope di una istruzione composta, infatti delle varibili dichiarate al loro interno potrebbero non essere utilizzate al loro esterno.
### Le istruzioni if-else multiramo
Si possono anche comporre delle istruzioni di selezione con più rami, queste instruzione usano anche l'istruzione `else if`. Si possono comporre istruzioni di selezione multiramo come specificato nel seguente esempio:
```Java
if(condizione){
	istruzioni
} else if(seconda_condizione){
	istruzioni
} else {
	istruzioni
}
```
### Note
- Nelle espressioni di uguaglianza è indicato, nel caso di un confronto tra numeri a virgola mobile di usare l'espressione `Math.abs(a-b) < epsilon`. Dove epsilon è un numero molto piccolo, questo è dovuto al modo in cui i numeri a virgola mobile sono rappresentati in codifica binaria.
- L'operatore di uguaglianza non è indicato neanche per il confronto tra oggetti. Ad esempio nel caso delle stringhe si può usare il metodo `equals()`.
### L'operatore ternario
Il ternario è la versione compatta di un operatore di selezione a due rami, esso è particolarmente indicato per l'assegnazione di valori ad una variabile con delle istruzioni semplici. Esso viene scritto nel seguente modo:
```Java
max = (n1 > n2) ? n1 : n2;
```
### Lazy evaluation (Short-circuit evaluation)
Nel caso delle espressioni booleane, a volte si può sapere l'esito dell'espressione valutando anche solo la prima parte. Questi sono due casi di esempio:
- Se il primo operando di un OR è true allora l'espressione sarà `true`.
- Se il primo operando di una AND è false allora l'espressione sarà `false`.

Gli operatori lazy sono i seguenti:

|Operatore|Nome|
|---|---|
|`&`|Lazy AND|
|\||Lazy OR|
## Lo switch
## Il metodo exit
A volte, durante l'esecuzione del codice si potrebbero creare delle condizioni per le quali sarebbe inutile continuare con l'esecuzione del programma, in quei casi si può usare l'istruzione `System.exit()`. Questa istruzione è molto utile per uscire dal programma senza causare dei crash.
___
# Analisi
## Successioni definite per ricorrenza
Sono una famiglia di successioni per le quali non si ha una rappresentazione esplicita di $a_n$, per le quali tuttavia però si sa una parte dei valori appartenenti ad essa.
$$a_n=f(a_{n-1}, a_{n-k})\quad\quad n\geq k\geq 0$$
Questa formula appena mostrata si chiama formula di ricorrenza.
In questo caso non si ha una funzione da $\mathbb{Q}$ a  $\mathbb{R}$, infatti si ha una successione per la quale si va da $\mathbb{R}$ a $\mathbb{Q}$. Questo è dovuto al fatto che non si ha il modo di sapere per un dato $n$ quale sarà il valore della successione. Ciò implica uno studio della successione con degli strumenti differenti.
**EX:**
$$a_n=\frac{1}n\quad\quad a_{n+1}=n^2+\frac{1}{2n}$$
$$a_{n+1}=2a_n+a_{n-1}\quad\quad\forall n\geq1$$
$$a_n=a_{n-1}\quad\quad\forall n\geq1$$
Per fare ciò c'è bisogno di avere degli esempi per alcuni valori, ad esempio se questa successione avrebbe tutti valori uguali ci sarebbe il seguente caso:
$$a_0=1\rightarrow a_1=a_0=1\rightarrow a_2=a_1=0$$
**OSS: **Si può usare il criterio seguente: 
- Se $a_n$ è monotona, allora è regolare.
- Se $a_n$ è monotona e limitata, allora è convergente ($\exists \lim\limits_{x\to\infty} a_n$).
**EX: **
Trova $a_n$
$$\begin{cases}
	a_{n+1}=1+\frac{a_n}2\\
	a_0=0
\end{cases}$$
$$a_0=0$$
$$a_1=1$$
$$a_2=\frac{3}2$$
$$a_3=\frac{7}4$$
$$a_4=\frac{15}8$$
- Ipotesi:
$$a_n=1+\frac{n-1}{n}\quad\quad n\geq1$$
La dimostrazione di questa proposizione si può fare per induzione.
$$a_{n+1}=1+\frac{a_n}2=\frac{2+a_n}{2}<2\Leftarrow a_n<2$$
$$a_1<n\quad per\ induzione\quad a_n<2\quad\quad \forall n\geq1$$
$$a_{n+1}>a_n$$
$$a_{n+1}=\frac{2+a_n}2>\frac{a_n+a_n}2=a_n$$
Questa ultima proposizione dimostra che $a_n$ è monotona, indicando che per $a_n\quad\exists\lim\limits_{n\to\infty}a_n$. Da notare che a da $2+a_n$ a $a_n+a_n$ ci si può passare perché $a_n<2$
$$a_{n+1}=f(a_n)$$
In questo caso non siamo in possesso di $n$.
$$a_{n+1}=1+\frac{a_n}2=f(a_n)$$
$$f:\mathbb{R}\rightarrow\mathbb{R}$$
$$f:x\rightarrow1+\frac{x}2$$
**OSS:**
Se $f$ è continua allora:
$$a_n\rightarrow l\Rightarrow f(a_n)\rightarrow f(l)$$
$$f(a_{n+1})\rightarrow f(l)$$
$$f(l)=l\quad dove\quad l=\lim\limits_{n\to\infty}a_n$$
Se $f$ è continua allora $f(l)=l$  e $\exists\lim\limits_{n\to\infty}a_n=l$.
$$a_{n+1}=f(a_n)=1+\frac{a_n}2$$
$$l=1+\frac{l}2=2l-2=l$$
$$l=2$$
Le funzioni elementari sono tutte continue.
## Le serie (reali di numeri reali)
**DEF: ** una serie (detta anche serie numerica) è una particolare successione (reale di numeri reali). Tale successione è definita nel seguente modo:
- Sia $a_n$ una successione numerica.
- Consideriamo le successioni $\sum_{n=0}^N=S_N(a_n)=a_0+a_1+...+a_N$ così che la somma dei primi $N+1$ termini di $a_n$ che chiamiamo successione delle somme parziali di $a_n$.
$$S_0(a_n)=a_0$$
$$S_1(a_n)=a_0+a_1$$
$$...$$
Quindi la serie è la successione delle somme parziali dei primi $N$ termini di una determinata successione $a_n$.

**EX: **
$$a_n=1$$
$$S(a_n)=\sum_{n=0}^Na_n=1+1+1+1+...+1=N+1$$
$$S_0(a_n)=1$$
$$S_1(a_n)=a_0+a_1=1+1=2$$
$$...$$
**DEF: ** Il carattere della serie $\sum_{n=0}^\infty a_n$  è il
carattere di $\left\{S(a_n)\right\}_{n=0}^\infty$ se: 
- la serie $\sum_{n=0}^\infty a_n$ converge a $S$ se $S_N(a_n)\rightarrow S$
- la serie  $\sum_{n=0}^\infty a_n$ diverge $a\pm\infty$ se $S_N(a_n)\rightarrow +\infty$

Queste serie vengono dette regolari, alcuni esempi di serie non regolari sono:
- la serie $\sum_{n=0}^\infty a_n$ non è regolare (indeterminata) se $S_N(a_n)$ non è regolare. Ad esempio $\sum_{n=0}^\infty (-1)^n$ non è regolare poiché si alterna tra $-1$ e $+1$.
1. $\sum_{n=0}^{\infty}a_n=S=\lim\limits_{N\to\infty}S_N(a_n)$
3. $\sum_{n=0}^{\infty}a_n=\pm\infty=\lim\limits_{N\to\infty}S_N(a_n)$
4.  $\sum_{n=0}^{\infty}a_n\quad\quad\not\exists$
**EX: **
$$a_n=\frac{1}n$$
$$\sum_{n=1}^\infty a_n$$
$$S\left(\frac{1}n\right)=\sum_{n=1}^N\frac{1}n$$
In questo caso la serie monotona e crescente e quindi sarebbe regolare, per cui converge ad un limite o diverge a $\infty$.
**OSS: ** Il carattere di una successione non cambia alterandone un numero finito di termini. Infatti il cambiamento di un numero finito di termini cambia il carattere solo per una parte finita della funzione, quindi non alterandone il complesso. Ciò implica che il cambiamento avviene definitamente per una funzione.
Si dice che il carattere è dato definitamente. Infatti solitamente esso ci interessa da un certo valore $k_0$ in poi.
**OSS: ** 
$$\sum_{n=0}^\infty a_n \Rightarrow\sum_{n=0}^\infty ca_n=c\sum_{n=0}^\infty a_n$$

$$\sum_{n=0}^\infty a_n,\quad\sum_{n=0}^\infty b_n\Rightarrow \sum_{n=0}^\infty(a_n+b_n)$$
## Serie geometrica
$$a_n=x^n\quad\quad x\in\mathbb{R}$$
$$\lim\limits_{n\to+\infty}x^n=\begin{cases}
	x\geq1\quad\quad+\infty\\
	1<x<1\quad\quad0\\
	x\leq-1\quad\quad\not\exists
\end{cases}$$
$$S_N(a_n)=S_N(x^n)=\sum_{n=0}^N x^n=1+x+...+x^N=\frac{1-x^{N+1}}{1-x}\quad\quad x\not=1$$
$$\lim\limits\sum_{n=0}^\infty x^n=\begin{cases}
	x\geq1\quad\quad +\infty\\
	|x|<1\quad\quad\frac{1}{1-x}\\
	\not\exists\quad\quad x<-1
\end{cases}$$
$$\sum_{n=0}^\infty x^n=\begin{cases}
	x\geq1\quad\quad +\infty\\
	|x|<1\quad\quad\frac{1}{1-x}\\
	indf\quad\quad x<-1
\end{cases}$$
**DEF: **si dice che la serie $\sum_{n=0}^\infty a_n$ converge assolutamente se converge la serie dei valori assoluti.
**TH: **  Se $\sum|a_n|\ converge\Rightarrow\sum a_n\ converge$
**DIM: ** 
$$\sum|a_n|=S\Rightarrow S_N(|a_n|)\rightarrow_{n\to+\infty} S$$
$$a_1+...+a_n\leq|a_1+...+a_n|\leq|a_1|+...+|a_n|$$
$$S_N(a_n)\leq...\leq S_N(|a_n|)\Rightarrow S_N(a_n)\ converge$$
Ovviamente per il teorema del confronto se le due agli estremi convergono anche quella nel mezzo converge e che se quella all'estremo destro convergem anche quella all'estremo sinistro converge.
## Serie a termini positivi
**DEF: ** Una serie si dice a termini positivi se $\forall n\quad a_n>0$.
**TH: ** Una serie a termini positivi è serie regolare.
**DIM: ** 
$$\sum a_n\quad a_n>0\Rightarrow S_N(a_n)=a_1+...+a_N=$$
$$S_{N=1}(a_n)+a_n>S_{N-1}(a_n)>0$$
$$\lim S_N(a_n)=sup\{S_N(A_N)\}=+\infty\quad o\quad l$$
$$\sum_n=0^\infty a_n=\lim\limits_{x\to+\infty}S_N(a_n)$$
## Serie armonica generalizzata
1. $\sum_{n=1}^\infty\frac{1}n\quad\quad \frac{1}n>0\Rightarrow è\ regolare$
$S_N(\frac{1}n)$ non è limitata. $\lim\sum_{n=1}^\infty=+\infty$
2. $\sum n^{-S}=\sum\frac{1}{n^S}\quad\quad S>0$
$$\sum\frac{1}{n^S}=\begin{cases}
	S\leq1\quad\quad+\infty\\
	S>1\quad\quad converge
\end{cases}$$
**TH FONDAMENTALE DEI LIMITI DELLE SERIE:** Se una serie $a_n$ converge allora la successione $a_n$ converge. Tuttavia se la successione converge la serie non per forza converge. Questa è anche detta la condizione necessaria per la convergenza di una serie.
$$\sum a_n\ converge \Leftrightarrow S_N(a_n)\rightarrow l\Rightarrow S_{N+1}(a_n)\rightarrow l$$
$$a_N+1=a_N+1+...+a_1$$
$$S_N+1(a_n)-S_N(a_n)\rightarrow l-l=0$$
$$S\leq0\quad\quad n^{-S}\rightarrow+\infty\Rightarrow\sum n^{-S}=+\infty$$