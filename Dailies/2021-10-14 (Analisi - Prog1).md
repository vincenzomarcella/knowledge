Tags: #Analisi #Programmazione1 #Esercitazione #Esercizi 
# Analisi
## Limiti di successioni
$$a_n\rightarrow l\quad n\rightarrow+\infty$$
$$f(a_n)\rightarrow f(l)\quad n\rightarrow+\infty$$
**ES: **
$$\lim\limits_{n\to+\infty}\sqrt[n]{n^3+3n+2}=\lim\limits_{x\to+\infty}(2+3n+n^3)^\frac{1}{n}$$
$$\lim\limits_{n\to+\infty}(n^3)^{\frac{1}{n}}\simeq\lim\limits_{n\to+\infty}n^{\frac{3}{n}}=\lim\limits_{n\to+\infty}e^{\frac{3}n\ ln\ n}= e^0= 1$$
Qui il limite tende a zero semplicemente perché la n nel logaritmo ha un andamento verso l'infinito più lento rispetto a la n che sta al denominatore della frazione, di conseguenza l'esponente di e tende ad anzaro verso zero più velocemente rispetto a quanto possa mai andare verso l'infinito
**ES: **
$$\lim\limits_{n\to+\infty}\frac{1-cos(\frac{1}{n^2})}{arctg(n^3)}$$
- $\lim\limits_{n\to+\infty}\frac{1-cos(a_n)}{a_n^2}=\frac{1}{2}$
- $1-cos\ a_n\approx2a_n^2$
$$= \lim\limits_{n\to+\infty}\frac{2(\frac{1}{n^2})2}{arctg(n^3)}=\frac{0}{\frac{\pi}{2}}=0$$
- $sin(b_2)\approx b_n$
**ES:  	DA COMPLETARE**
$$\lim\limits_{n\to+\infty}\frac{(1+\frac{1}{n^5})^3-1}{e^{\frac{1}{n^2}}-1}\cdot sin(\frac{1}{n^3})=\frac{(1+0)^3-1}{1-1}\cdot 0 = \frac{0}{0} \ f.i.$$
$$a_n\rightarrow 0 \Rightarrow \lim\limits_{n\to+\infty}\frac{(1+a_n)^\alpha-1}
{a_n}=\alpha$$
$$\lim\limits_{n\to+\infty}\frac{(1+\frac{1}{n^5})^3-1}{\frac{1}{n^5}}$$
**ES: **
$$\lim\limits_{n\to+\infty}\frac{(1+\frac{1}{n^5})^3-1}{e^{\frac{1}{n^2}}-1}\cdot n^\alpha=0$$
$$\alpha=?\quad\quad\lim\limits_{n\to+\infty}\frac{3\frac{1}{n^5}}{\frac{1}{n^2}}\cdot n^\alpha=\lim\limits_{n\to+\infty}\frac{3}{n^5}\cdot n^2\cdot n^\alpha= 3\lim\limits_{n\to+\infty}n^{\alpha-3}=3$$
$$n^\alpha\approx\frac{e^{\frac{1}{2}}-1}{3(1+\frac{1}{n^5})}$$
## Principio di induzione
Il principio di induzione è utile anche per le successioni definiter per ricorrenza.
$$se\ P(1)\ vera \Rightarrow P(n)\ vera \Rightarrow P(n+1)\ vera$$
**ES: **
$$\sum_1^n k = \frac{n(n+1)}{2}$$
$$1+2+3+4+5+6+...+n+n+1$$
$$P(n-1)=\sum_1^{n-1}k=\frac{(n-1)n}{2}$$
$$P(n)=\sum_1^{n-1}k+n=\frac{(n-1)n}{2}+n=\frac{n^2-n+2n}{2}=\frac{n^2+n}{2}=\frac{n(n+1)}{2}$$
**ES: **
$$\sum_1^n(2k-1)=n^2$$
- Dimostrazione alternativa:
$$2\sum_1^nk-\sum_1^n1=2\frac{n(n+1)}{2}-n=n^2$$
- Dimostrazione per induzione:
$$k=1\quad\quad 1=1^2$$
$$k=n-1\quad\quad\sum_1^{n-1}(2k-1)=(n-1)^2$$
$$k=n\quad\quad\sum_1^k(2k-1)=\sum_1^{n-1}(2k-1)+(2n-1)$$
$$=(n-1)^2+(2n-1)=n^2-2n+1+2n-1=n^2$$
**ES: ** 
$$\sum_1^n\frac{k}{2^k}=2-\frac{n+2}{2^n}$$
$$P(1)\quad\quad k=1\quad\quad \frac{1}{2}=2-\frac{3}{2}=\frac{1}{2}$$
$$P(n-1)\quad\quad\sum_1^{n-1}\frac{k}{2^k}=2-\frac{n+1}{2^{n-1}}$$
$$P(n)\quad\quad\sum_1^n\frac{k}{2^k}=\sum_1^{n-1}\frac{k}{2^k}+\frac{n}{2^n}=\sum_1^n\frac{k}{2^k}=2-\frac{n+1}{2^{n-1}}+\frac{n}{2^n}$$
- $2^{n-1}=\frac{2^n}{2}$
$$2-2\frac{n+1}{2^n}+\frac{n}{2^n}=2-\frac{n-2n+2}{2^n}=2-\frac{n+2}{2^n}$$
**ES: **
$$x>1\quad\quad (1+x)^n\geq1+nx$$
$$P(1)\quad\quad 1+x\geq1+x$$
$$P(n-1)\quad\quad(1+x)^{n-1}\geq1+(n-1)x$$
$$P(n)\quad\quad(1+x)(1+x)^{n-1}\geq[1+(n-1)x](1+x)$$
$$(1+x)^n\geq1+x(n-1)x+(n-1)x^2$$
$$(1+x)^n\geq(1+nx)+(n-1)x^2\leq(1+nx)$$
In questo ultimo passaggio visto che il fattore che va a influire nella disuguaglianza è $1+nx$ il resto dell'espressio finché è maggiore di zero può essere ignorato visto che è comunque di grado inferiore rispetto al primo membro.
**ES: **
$$n!\geq2^{n-1}$$
$$P(1)\quad\quad1!\geq2^0\quad\quad 1\geq1$$
$$P(n-1)\quad\quad(n-1)!\geq2^{n-2}$$
$$P(n)\quad\quad n(n-1)!\geq2^{n-2}\quad\quad n(n-1)!\geq n2^{n-2}\geq2\cdot2^n-2=2^{n-1}$$
L'uguaglianza alla fine è tale per il solo membro precedente all'uguale e non è parte di tutta l'espressione che viene prima. Sta di fatto che essa prova la validità della proprosizione.
## Successioni definite per ricorrenza
Una serie per ricorrenza è una serie il cui valore del termine successivo è costruito dal valore del termine precedente.
$$\begin{cases}
a_0=\alpha \\ a_{n+1}=f(a_n)
\end{cases}$$
$$f:I\subseteq\mathbb{R}\rightarrow\mathbb{R}$$
$$\begin{cases}
a_0=0 \\ a_{n+1}=a_n+1
\end{cases}$$
$$\exists l : a_n\rightarrow l$$
- controllare se $a_n$ ben definito $\forall n\ a_n>0$,
- controllare la monotonia,
- controllare se $a_n$ è limitata,
- determinare il limite.

Esempio di punto fisso:
$$a_{n+1}=f(a_n)\quad\quad a_n\rightarrow l\quad a_n\rightarrow l\quad l=f(l)\Rightarrow l$$

**ES: **
$$\begin{cases}
a_0=2 \\
a_{n+1}=\frac{1}2(a_n+\frac{1}a_n)
\end{cases}$$
$$a_0 = 2, a_1=\frac{5}{4}\quad\quad 2\geq a_0\geq a_1$$
Questa ultima osservazione ci fa capire che $a_n$ non è crescente e probabilmente superiormente limitata da 2.
$$P(n)\quad\quad a_n-a_{n+1}\geq0\quad\quad a_n\geq a_{n+1}$$
$$P(n+1)\quad a_n-\frac{1}2(a_n+\frac{1}a_n)=a_n-\frac{1}2a_n-1\frac{1}{2a_n}=\frac{1}2a_n-\frac{1}{2a_n}= \frac{a_n^2-1}{2a_n}\geq 0$$
$$\frac{1}4(a_n+\frac{1}{a_n})^2-1=\frac{1}4a_n^2+\frac{1}4\cdot2+\frac{1}{4a_n^2}-1$$
$$\frac{1}4a_n^2-\frac{1}2-\frac{1}{4a_n^2}=\frac{1}4(a_n^2-2+\frac{1}{a_n^2})=\frac{1}4(a_n-\frac{1}{a_n})^2\geq0$$
Calcolo del limite
$$l=\frac{1}2(l+\frac{1}l)$$
$$2l^2=l^2+1$$
$$l^2=1\quad\quad l=1$$
**ES: **
$$\begin{cases}
a_n=\frac{1}2\\
a_{n+1}=1-a_n+a_n^2
\end{cases}$$
$$a_0 = \frac{1}2\quad\quad a_1=1-\frac{1}2-\frac{1}4=\frac{3}4\quad\quad a_2=\frac{13}{16}\quad\quad a_0<a_1<a_2$$
$$P(1)\ vero\quad\quad P(n)\quad a_n>0$$
Essendo $a_{n+1}$ un polinomio di secondo grado, essp è sempre positivo, verficiando le due condizioni e indicando che la successione è ben definita.
$$a_{n+1}>a_n\quad\quad a_{n+1}-a_n>0$$
$$1-a_n+a_n^2+a_n\quad\quad a_n^2-2a_n+1=(a_n-1)^2\geq0$$
$$l=f(l)\quad\quad l=1-l+l^2\quad\quad l^2-2l+1=0$$
$$(l-1)^2=0\quad\quad l=1$$
$$P(n)\quad\quad a_n<1$$
$$P(n+1)\quad\quad 1-a_n+a_n^2<1$$
$$a_n(a_n-1)<0$$
**ES: DA FARE**
$$\begin{cases}
a_1=2\\
a_{n+1}=1+log\ a_n
\end{cases}$$
$$l=1+log\ l=+\infty$$


## Composizione di funzioni
## Altri
**EX: **
Quante sono le diagonali di un poligono di n lati? Esse sono:
$$lati\ inclusi\quad\quad\binom{n}{2}=\frac{n!}{2!(n-2)!}=\frac{n(n-1)(n-2)!}{2!(n-2)!}=\frac{n(n-1)}{2}$$
$$lati\ esclusi\quad\quad N_D=\frac{n(n-1)}{2}-n=\frac{n^2-n-2n}{2}=\frac{n(n-3)}{2}$$
**EX: **
$$\binom{n}{n-3}+\binom{n}{n-2}-\binom{n+1}{n-1}=0\quad\quad n>3$$
$$\frac{n!}{(n-3)!(\not n-\not n+3)!}+\frac{n!}{(n-2)!(\not n-\not n+2)!}-\frac{(n+1)!}{(n-1)!(\not n+1-\not n+1)!}=0$$
$$\frac{n(n-1)(n-2)\not(n-3)!}{(n-3)!(\not n-\not n+3)!}+\frac{n(n-1)(n-2)!}{(n-2)!(\not n-\not n+2)!}-\frac{(n+1)n(n-1)!}{(n-1)!(\not n+1-\not n+1)!}=0$$
$$\frac{n(n-1)(n-2)}{3}+n(n-1)-n(n+1)=0$$
$$n(n-1)(n-2)+3n[(\not n-1)-(\not n+1)]=0$$
$$n(n-1)(n-2)-6n=0$$
$$(n-1)(n-2)-6=0$$
$$n^2-3n+2-6=0$$
$$n^2-3n-4=0$$
Si cercano due numeri la cui somma fa $-3$ e il cui prodotto fa $-4$ per poter raccogliere in un prodotto tra due binomi.
$$(n-4)(n+1)$$
$$n=4$$
# Programmazione
## Note
- Le stringhe non sono trattate come array.
- Se si vuole sostituire una parte di una stringa, bisogna per forza di cose modificarla nella sua interezza. Ciò è dovuto al fatto che in Java le stringhe sono oggetti immutabili non scomponibili. Infatti il rimpiazzamento del valore comporta una reinstanziazione. Se si guarda anche al metodo `replace` si può notare che esso non rimpiazza semplicemente in carattere in una stringa ma ritorna una nuova istanza di stringa.
- La tokenizzazione di una stringa implica la generazione di sottostringhe basata su una separazione in vari `token` divisi da caratteri separatori (generalmente gli escape).
## Best practices
- Agganciare sempre all'identificatore di una stringa la stringa intera.