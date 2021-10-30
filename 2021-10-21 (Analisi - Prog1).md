# Analisi
## 	Primo esercizio
$$\lim\limits_{n\to\infty}\frac{n\ \log\ \left(1+\frac{1}n\right)}{n+1}$$
$$1+\frac{1}n\rightarrow0$$
$$log\ \left(1+\frac{1}n\right)\rightarrow 0$$
$$\lim\limits_{n\to\infty}\frac{\left(1+\frac{1}n\right)}{\frac{1/n}{n+1}}=\frac{1}\infty=0$$
## Secondo esecrizio
$$\lim\limits_{n\to\infty}n\ sin\ \frac{3}n=\lim\frac{sin3/n}{3/n}\frac{3}n=3$$
$$\lim\limits_{n\to\infty}\frac{tg\left(\frac{2}n\right)}{sin\left(4/n\right)}=\lim\frac{tg\left(\frac{2}n\right)}{2/n}\frac{2}n=\frac{4/n}{sin(4/n)}\frac{1}{4/n}=\lim\frac{2}n\cdot\frac{n}4=\frac{1}2$$
## Terzo esercizio
$$\lim\limits_{n\to\infty}\frac{tg^2(1/n)}{1-cos(1/n)}=lim\left(\frac{tg(1/n)}{1/n}\right)^2\cdot\frac{1}{n^2}\cdot\frac{1/n^2}{1-cos(1/n)}\cdot n^2=2$$
$$\lim\limits_{n\to\infty}\frac{ln(1+tg(1/n))}{4sin(2/n)}=\lim\frac{ln(1+tg(1/n))}{tg(1/n)}\cdot \frac{tg(1/n)}{1/n}\cdot \frac{2/n}{sin(2/n)}\cdot\frac{n}2\cdot\frac{1}n=\frac{1}4\cdot\frac{1}2=\frac{1}8$$
$$\lim\limits_{n\to\infty}cos(1/n)\cdot\frac{1}{tg(1/n^2)}=\lim e^{ln\ cos(1/n)\cdot\frac{1}{tg(1^n2)}}=\lim e^{ln\ cos(1/n)\cdot\frac{1/n^2}{tg(1/n^2)}\cdot n^2}$$
$$=e^{\frac{1}2ln\frac{(1-sin^2(1/n))}{-sin^2(1/n)}\cdot\frac{-sin^2(1/n)}{1/n^2}}=e^{-\frac{1}2}$$
NOTA:
$$\frac{tg(a_n}{a_n}\rightarrow 1$$ se $a_n\rightarrow 0$
$$\lim\frac{1}{tg\frac{1}n}$$

$$\lim \frac{\frac{n\ sin(2/n)\ ln\left(1+\frac3{n^2}\right)}{\left(1+3/n^2\right)\cdot\left(1-cos(1/n\right)}=\lim n\cdot\frac{sin(2/n)}{2/n}\cdot 2/n\cdot\frac{ln\left(1+\frac{3}{n^2}\right)}{3/n^2}\cdot\frac{3}{n^2}}{\left[\left(1+\frac{3}{n^2}\right)\cdot\frac{n\cdot n}3\right]\cdot\frac{1-cos(1/n)}{1/n^2}}\cdot n^2=\lim\frac{12}{e^{\frac3n}}=12$$
NOTA:
$$\left(1+\frac1n\right)^n\rightarrow e$$
$$\left(1+a_n\right)^{\frac1{a_n}}\rightarrow e$$ se $a_n\rightarrow 0$

$$\begin{cases}
a_1=1\\
a_{n+1}=5-a_n
\end{cases}$$
$$a_1=1$$
$$a_2=4$$
$$a_3=1$$
$$a_4=4$$
$$\sum_{n=1}^\infty\frac{1}{k(k+1)}=\frac1{1\cdot2}+\frac{1}{2\cdot3}+...+\frac1{n(n+1)}$$
$$a_n=\frac1{n(n+1)}=\frac1n-\frac{1}{n+1}$$
$$S_1=1-\frac12$$
$$S_2=1-\frac13$$
$$S_n=1-\frac1{n+1}$$
$$sum_1^\infty a_n=\lim\limits_{n\to\infty}\sum_1^n\frac{1}{k(k+1)}=\lim\left(1-\frac1{n+1}\right)=1$$
$$S_n=1-\frac{1}{n+1}$$

$$\sum_1^\infty\frac1n=+\infty$$
$$\sum_1^\infty a_n=a$$
$$\sum_1^\infty l_n=n$$
$$\sum_1^\infty\frac3{n+5}=$$
$$n+5<3n\quad\quad\frac3{n+5}<\frac3{3n}=\frac1n$$
$$\sum_1^\infty\frac3{n+5}>\sum_1^\infty\frac1n$$
Sapendo che la serie armonica è minore rispetto alla serie di partenza, e la serie armonica è divergente, allora la serie di partenza è divergente.
$$a_n=\frac3{n+5}\quad\quad b_n=\frac1n$$
$$\frac{a_n}{b_n}\rightarrow \frac3{n+5}\cdot n\rightarrow 3$$

$$\lim\limits_{n\to\infty}\frac{a_n}{b_n}=l\not=0\Rightarrow\sum a_n\quad \sum b_n\ conv.\ se\ le\ serie\ div.$$
---
$$\sum_1^\infty\frac1{3n+2^n}$$
$$3n+2^n>2^n$$
$$\frac1{3n+2^n}<\frac1{2^n}=\left(\frac12\right)^n$$
$$\sum\frac1{3n+2^n}<\sum\left(\frac12\right)^n$$
$$\sum_1^\infty\frac1{3n+2^n}\rightarrow 0$$
**es**
$$\sum_1^\infty \frac{2^n}{n!}$$
$$n!\simeq \sqrt{2\pi n}\ n^n\ e^{-n}$$
$$\sum\frac1{\sqrt{2\pi n}\ n^n\ e^{-n}}$$
$$\lim\limits_{n\to\infty}\sqrt[n]{\frac{2^n}{\sqrt{2\pi n}\ n^n\ e^{-n}}}=\lim\frac{2e}{n\sqrt[2n]{2\pi n}}=\lim\frac{2e}{n}\cdot\frac1{(2\pi)^{\frac1{2n}}}$$
$$\lim\frac{2e}n\cdot e^{-\frac{ln(2\pi n)}{2^n}}\sim\frac{2e}n=0<1\quad conv.$$
criterio del rapporto es. precedente
$$\lim\frac{2^{n-1}}{(n+1)n!}\cdot\frac{n!}{2^n}=\lim\frac2{n+1}=0$$
---
$$\sum_1^\infty\frac{2^n}{[log(n+1)]^n}=\sum_1^\infty\left(\frac2{log(1+n)}\right)^2=0^\infty=0$$
$$\lim\sqrt[n]{\frac{2^n}{log(1+n)^n}}=\lim\frac2{log(1+n)}=0<1\quad conv.$$
---
$$\sum_1^n k\cdot k!=(n+1)!-1$$
$$n=1\quad P(1)\quad 1=1$$
$$n-1\quad P(1)\quad \sum_1^n k\cdot k|=\sum_1^{n-1} k\cdot k!+n\cdot n!$$
$$n\quad P(n)=n!-1+n\cdot n!=(n+1)n!-1=(n+1)!-1$$
---
$$\begin{cases}
a_1=\frac12\\
a_{n+1}=\frac{2a_n}{1+a_n}
\end{cases}\quad\quad n\geq1$$
$$a_1=\frac12$$
$$a_2=\frac1{\frac32}=\frac23$$
$$a_3=\frac{\frac43}{\frac53}=\frac45$$
$$\frac{2a_n}{a_n+1}=a_{n+1}>0$$
$$a_1<a_2<a_3$$
$$a_n<a_n+1$$
$$a_{n+1}=\frac{2a_n}{1+a_n}>a_n$$
$$\frac{2x}{x+1}>x$$
$$\frac{2x-x^2-x}{-x+1}>0$$
$$\frac{a_n-a_n^2}{a_n+1}>0$$
$$\frac{a_n(1+a_n)}{a_n+1}>0\quad\quad a_n<1$$
$$\frac12<a_n<a_{n+1}$$
limitata inferiormente
$$a_1<1$$
$$a_n<1\Rightarrow a_{n+1}<1$$
$$\frac{2a_n}{1+a_n}<1$$
$$\frac{2a_n-1-a_n}{1+a_n}<0$$
$$\frac{a_n-1}{1+a_n}<0\quad\quad a_n<1$$
Dato questo ultimo passo si può notare come il numeratore sia il termine negativo dato che è stato giò dimostrato che $a_n$ è sempre negativo. Di conseguenza abbiamo dimostrato per induzione che anche $a_{n+1}$ + negativo.
$$f(a_n)=a_{n+1}$$
$$f(l)=l$$
$$l=\frac{2l}{1+l}$$
$$l+l^2=2l$$
$$l^2-l=0$$
$$(l-1)^2=0$$
$$l=1$$
---
$$0,\overline9$$
$$0+\frac9{10}+\frac9{1000}+\frac9{1000}+\frac9{10^n}+...$$
$$\frac9{10}\left[1+\frac1{10}+\frac1{100}+...+\frac1{10^{n-1}}+\frac1{10^n}\right]$$
$$\frac9{10}\sum_0^\infty(\frac1{10})^n=\frac9{10}\cdot\frac1{1-\frac1{10}}=\frac9{10}\cdot\frac1{\frac9{10}}=1$$
Da notare che il $\frac1{1-\frac1{10}}$ è il risultato di un limite, insieme a il resto dell'espressione.
---
Calcola il limite di questa espressione:
$$\sum_1^\infty\frac12n=\sum_1^\infty\left(\frac12\right)^2=\sum_0^\infty\left(\frac12\right)^n-S_0=\frac1{\frac12}-1=2-1=1$$
---
Limite:
$$\sum_1^\infty\frac{2^{n+1}}{3^n}=\sum_1^\infty\left(\frac23\right)^2\cdot 2=2\sum_1^\infty\left(\frac23\right)^2=2\left[\sum_0^\infty\left(\frac23\right)^n-1\right]=2\left[\frac1{1-\frac23}-1\right]$$
$$=2\left[3-1\right]=4$$
---
$$\sum_1^\infty\frac{4n+4}{n^2-(n+2)^2}$$
$$\sum_1^\infty\frac1{n^2}-\sum_1^\infty\frac1{(n+2)^2}$$
$$S_1=1-\frac14=\frac34$$
$$S_2=S_1+a_2=\frac89+\frac14-\frac1{16}=$$
$$S_3=S_2+\frac19-\frac1{25}=1+\frac14-\frac19-\frac1{16}+\frac19-\frac1{15}$$
$$=1+\frac1{2^2}-\frac1{(2\cdot 2)^2}-\frac1{(3+2)^2}$$
$$S_4=S_3+\frac1{16}-\frac1{36}$$
$$S_n=1+\frac14+\frac1{(2n)^2}-\frac1{(n+2)^2}$$
$$\lim\limits_{n\to\infty}=\frac54$$
---
$$\sum_1^\infty\frac3{n^2+3n}=\sum_1^\infty\frac3{n(n+3)}=$$
$$\frac1n-\frac1{n+3}=\frac{n+3-n}{n(n+3)}=\frac3{n(n+3)}$$
$$S_1=1-\frac14$$
$$S_2=S_1+\frac12-\frac15$$
$$S_3=S_2+\frac13-\frac16$$
$$S_4=S_3+\frac14-\frac17$$
$$S_5=S_4+\frac15-\frac18$$
$$S_n=1+\frac12+\frac13=\frac{6+3+2}{6}=\frac{11}6$$
---
DA FINIRE
$$\sum_1^\infty\ log\left(\frac{(n+1)^2}{n(n+2)}\right)=\sum_1^\infty\left[\right]=log2$$