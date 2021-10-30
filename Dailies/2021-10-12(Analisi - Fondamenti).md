# Analisi
## Limiti notevoli
### Primo esempio
$$a_n\rightarrow 0$$
$$n\rightarrow +\infty$$
$$\lim\limits_{x \to +\infty} sin \ a_n = $$
**N.B.** Se si considera $f(x)=x$ e la funzione $g(x)=sin \ x$ la prima sarà sempre maggiore della seconda, inoltre il seno di x sarà sempre minore di x se x è maggiore di zero.

--- 
Teorema del confronto:
$$c_n\leq a_n\leq b_n$$
$$a_n,b_n\rightarrow l \Rightarrow a_n\rightarrow l$$
---
$$0\leq sin \ a_n \leq a_n$$
Quindi date queste condizioni visto che $a_n$ tende a zero e zero tende a zero si avrà che anche il limite di $sin \ a_n$ tenderà a zero.
### Secondo esempio
$$\lim\limits_{x \to +\infty} \frac{sin \ a_n}{a_n} \quad\quad a_n\rightarrow 0$$
$$0\leq x \leq \frac{\pi}{2}$$
$$0\leq sin \ x \leq x \leq tg\ x\quad\quad tg\ x=\frac{sin\ x}{cos\ x}$$
$$0\leq\frac{cos\ x}{sin\ x}\leq \frac{1}{x} \leq \frac{1}{sin\ x}$$
$$0\leq\frac{cos\ a_n}{sin\ a_n}\leq \frac{1}{a_n}\leq \frac{1}{sin\ a_n}$$
$$0\leq cos\ a_n\leq \frac{sin\ a_n}{a_n}\leq 1$$
Se $a_n$ tende a 0, $cos\ a_n$ tende a 1. Di conseguenza si ha che 1 tende a 1, $cos\ a_n$ tende a 1, allora la funzione tende a 1. Abbiamo anche provato che:
$$\lim\limits_{x \to +\infty} cos\ a_n = 1$$
### Confronto di infiniti o infinitesimi
$$a_n \ si \ dice \ infinita\ se\ \lim\limits_{x \to +\infty}=\pm\infty$$
$$a_n \ si \ dice \ infinitesima\ se\ \lim\limits_{x \to +\infty}=0$$
- Se $a_n,b_n\rightarrow +\infty$ si dice che la prima è un infinito di ordine superiore della seconda se$\lim\limits_{x\to +\infty}\frac{a_n}{b_n}=\pm\infty$.
- Se $a_n,b_n\rightarrow 0$ si dice che la prime è un infinitesimo di ordine superiore della seconda se$\lim\limits_{x\to +\infty}\frac{a_n}{b_n}=0$.
**EX: **
$$\lim\limits_{x\to +\infty} \frac{x^2}{\sqrt n}= n^\frac{3}{2}=+\infty$$
**EX:**
$$\lim\limits_{x\to +\infty} \frac{x^2}{\sqrt n}= n^\frac{3}{2}=+\infty$$
**DEF: **
$$a_n, b_n\rightarrow +\infty, \quad \lim\limits_{n \to +\infty} \frac{a_n}{b_n}=l\not=0$$
Si dice che $a_n$ e $b_n$ sono infiniti dello stesso ordine.
$$a_n, b_n\rightarrow +\infty, \quad \lim\limits_{n \to +\infty} \frac{a_n}{b_n}=l\not=0$$
Si dice che $a_n$ e $b_n$ sono infinitesimi dello stesso ordine.
**OSS: **
$$log\ n<n^a<a^n \quad a>1$$

### Successioni asintotiche
**DEF: **
Due successioni $a_n$e $b_n$ si dicono asintotiche (o asintoticamente equivalenti) se il limite del quoziente è uguale ad uno.
$$\lim\limits_{x \to +\infty}\frac{a_n}{b_n}=1,\ si\ scrive\ a_n\sim b_n$$
**OSS: **
$$\lim\limits_{n \to +\infty}\frac{a_n}{b_n}=l\not=0$$
$$b'_n=l\ b_n\quad\quad \lim\limits_{n\to +\infty}\frac{a_n}{b'_n}=\frac{1}{l}=1$$
**EX: **
$$\lim\limits_{n\to +\infty}\frac{1}{2n^2+n}=0$$
$$\frac{2n^2+n}{2n^2}\rightarrow 1$$
**OSS: **
$$se\ a_n\sim b_n\quad\quad b_n\rightarrow l\Rightarrow a_n\rightarrow l$$
**EX: **
$$\lim\limits_{n\to +\infty}\frac{1}{n-log\ n}$$
Qui si ha una indeterminazione poiché $n$ e $log\ n$ tendono a $\infty$.
$$n-log\ n=n(1-\frac{log\ n}{n})$$
$n$ in questo caso è un infinito di ordine maggiore rispetto a $log\ n$, di conseguenza $\frac{log\ n}{n}$ tende a 0.
$$n(1-\frac{log\ n}{n})\Rightarrow\frac{n-log\ n}{n}=1-\frac{log\ n}{n}\rightarrow 1\Rightarrow n-log\ n \sim n$$
Date queste osservazioni si può concludere che questo limite allora si può calcolare che esso sia calcolabile semplicemente facendo:
$$\lim\limits_{n\to +\infty}\frac{1}{n}=0$$
**OSS: **
- $$a_n\sim b_n\Rightarrow b_n\sim a_n$$
- $$a_n\sim b_n, b_n\sim c_n \Rightarrow b_n\sim c_n$$
### O piccolo
**DEF: **
$$a_n,b_n\ si\ dice\ che\ a_n\ è\ \sigma\ piccolo\ di\ b_n se \lim\limits_{n\to +infty}\frac{a_n}{b_n}=0$$
**EX: **
$$n-log\ n\quad\quad \lim\limits_{n\to +\infty}\frac{log\ n}{n}=0$$
In questo caso $log\ n$ è un $\sigma$ piccolo di $n$.
**OSS:**
$$a=\sigma(b_n)\not\Rightarrow b_n=\sigma(a_n)$$
$$a=\sigma(b_n)\ e\ c_n=\sigma(a_n)t\Rightarrow b
c_n=\sigma(b_n)$$
**LETT: **
$$a_n\sim b_n \Leftrightarrow a_n=b_n+\sigma(b_n)$$
**EX: **
$$n-log\ n\sim n\Leftrightarrow n-log\ n= n-\sigma(n)\quad\quad \frac{log\ n}{n}\rightarrow 0$$
In poche parole l'$\sigma$ piccolo di una certà quantità, è un'altra quantita che divisa per la quantità stessa da quoziente tendente a zero. Questo concetto è utile per identificare quali elementi non hanno influenza sul limite stesso.
### Tabella dei limiti notevoli
$$a_n\rightarrow \quad\quad (a_n\not=0\quad definitamente)$$

|Limite|Descrizione|
|---|---|
|$\lim\limits_{n\to +\infty}(1+a_n)^\frac{1}{a_n}=e$| 
|$\lim\limits_{n\to +\infty}\frac{sen\ a_n}{a_n}=1$| 
|$\lim\limits_{n\to +\infty}\frac{tg\ a_n}{a_n}=1$|
|$\lim\limits_{n\to +\infty}\frac{arctg\ a_n}{a_n}=1$|
|$\lim\limits_{n\to +\infty}\frac{cos\ a_n}{a_n^2}=\frac{1}{2}$|
|$\lim\limits_{n\to +\infty}\frac{log\ (1+a_n)}{a_n}=1$|
|$\lim\limits_{n\to +\infty}\frac{e^{a_n}-1}{a_n}=1$|
|$\lim\limits_{n\to +\infty}\frac{(1+a_n)^\alpha -1}{a_n}=\alpha$|$\alpha \not= 0$
**EX: **
- $$\lim\limits_{n\to +\infty}\frac{tg\ a_n}{a_n}=\lim\limits_{n\to +\infty}\frac{sen\ a_n}{a_n}\frac{1}{cos\ a_n}=1$$
- $$\lim\limits_{n\to +\infty}n\ log\ (1+\frac{1}{n^2})=\frac{1}{n^2}=0$$
$$log\ (1+a_n)= a_n+\sigma(a_n)\quad\quad log\ (1+a_n)\sim a_n$$
- $$\lim\ n\ log\ (1+\frac{1}{n^2})=\lim \not n\cdot\frac{1}{\not n}= 0 \quad\quad log(1+\frac{1}{n^2})$$
- $$\lim\ n\ log(1+\frac{1}{n^2})= \lim\ n\ (\frac{1}{n^2}+\sigma(\frac{1}{n^2}))= \lim\ \frac{1}{n}+ \frac{n^2}{n}\ \sigma(\frac{1}{n^{2}})=0$$ 
**N.B.** qui da $n$ si è passati a $\frac{n^2}{n}$