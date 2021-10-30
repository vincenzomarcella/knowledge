Tags: #Daily 
# Analisi
**ES: **
$$\lim\limits_{x\to1}\frac{1-x}{x^2-4x+3}=\frac00\quad f.i.$$
$$f(x)=\frac{P(x)}{Q(x)}=\frac{P(x_0)}{Q(x_0)}\quad x_0=1\quad (x-x_0)$$
$$\frac{P_n(x)}{Q_n(x)}=\frac{(x-x_0)P_{n-1}(x)}{(x-x_0)Q_{n-1}(x)}\not=\frac00$$
Il metodo mostrato sopra va adattato per ottenere il risultato sotto
$$\lim\limits_{x\to1}\frac{-(x-1)}{(x+4)(x-1)}=\lim\limits_{x\to1}\frac{-1}{x-3}=\frac{-1}{-2}=\frac12$$
**ES: **
$$\lim\limits_{x\to-2^+}\frac{x^2-4}{x^2+4x+4}=\frac00\quad f.i.$$
$$\lim\limits_{x\to-2^+}\frac{(x+2)(x-2)}{(x+2)^2}=\lim\limits_{x\to-2^+}\frac{x-2}{x+2}=\frac{-4}0=-\infty$$
**ES: **
$$\lim\limits_{x\to0}\frac{\sqrt{x+9}-3}{4x}=\frac00\quad f.i.$$
Si moltiplica il numeratore per se stesso con il segno più
$$\lim\limits_{x\to0}\frac{(x+9)-9}{4x(\sqrt{x+9}+3)}=\lim\limits_{x\to0}\frac x{4x(\sqrt{x+9}+3)}=\frac1{4(3+3)}=\frac1{24}$$
**ES: **
$$\lim\limits_{x\to0}\frac{tan\ 2x}{1-cos\ x}=\frac00\quad f.i.$$
$$\lim\limits_{x\to0}\frac{\frac{tan\ 2x}{2x}\cdot2x}{\frac{1-cos\ x}{x^2}\cdot x^2}=\lim\limits_{x\to0}\frac2{\frac12\cdot x}=\lim\limits_{x\to0}\frac4x=+\infty$$
I limiti notevoli delle successioni possono anche essere applicati alle funzioni.
**ES: **
$$\lim\limits_{x\to0}(1+x^3)^{\frac{log(1+\frac{x^4}{3})}{sin^6}}=1^\frac10=1^\infty$$
$$\lim\limits_{x\to0}(1+x)^\frac1x=e$$
$$\lim\limits_{x\to+\infty}(1+\frac1x)^x=e$$
$$\lim\limits_{x\to0}\frac{log(1+x)}x=1$$
$$\lim\limits_{x\to0}\left\{\left[(1+x^3)^{\frac1{x^3}}\right]^{x^3}\cdot\frac{log\ (1+\frac{x^4}3)\cdot\frac{x^4}3}{\frac{x^4}3\cdot\frac{sin\ x}{x^6}}\right\}$$
$$\lim\limits_{x\to0}=e^{\frac x3}=e^\frac03=e^0=1$$
**ES: **
$$f(x)=\frac{x^4}{x^2-4}\quad c.e\quad \mathbb{R}-\{-2, +2\}$$
$$f(x)=f(-x)\quad \forall x\in\ c.e.$$
$$x>0\ quando\ \frac{x^4}{x^2-4}\geq 0$$
$$\lim\limits_{x\to+\infty}f(x)=\lim\limits_{x\to-\infty}f(x)=+\infty$$
$$\lim\limits_{x\to+\infty}\frac{x^4}{x^2-4}=\lim\limits_{x\to+\infty}\frac{x^4}{x^2(1-\frac{4}{x^2})}=+\infty$$
$$\lim\limits_{x\to-2^+}f(x)=\lim\limits_{x\to2^-}=\lim\limits_{x\to2^-}\frac{x^4}{x^2-4}=\frac{16}{4-4}=\frac{16}{0^-}=-\infty$$
$$\lim\limits_{x\to2^+}\frac{x^4}{x^2-4}=\frac{16}{0^+}=+\infty$$
Ovviamente questo limite è tale anche per -2 da sinistra. Dati questi limiti emerge che la funzione ha due asintoti verticali in 2 e -2.
**ES: **
$$f(x)=\sqrt{\frac{x-1}{x+1}}\quad c.e\quad x\not=-1\quad \frac{x-1}{x+1}\geq0$$
$$D=(-\infty, -1)\cup[+1,+\infty)=\mathbb{R}-[-1, +1)$$
La funzione non è pari, per vedere basta sostituire la x con -x e sviluppare per vedere se il risultato è lo stesso.
$$\begin{cases}y=0\\y=f(x)\end{cases}\Rightarrow(1,0)$$
$$\lim\limits_{x\to-\infty}\sqrt{\frac{x-1}{x+1}}=\sqrt{\lim\limits_{x\to-\infty}\frac{x-1}{x+1}}=\sqrt1=1$$
Questo spostamento della radice è possibile grazie al fatto che a meno infinito sappiamo che la funzione è positiva.
$$\lim\limits_{x\to+\infty}\sqrt{\frac{x-1}{x+1}}=+1$$
Sapendo in questo caso la funzione arriva a + infinito da sotto tocca vedere come arriva -infinito per vedere se ha asintoto.
$$\lim\limits_{x\to-1^-}\sqrt{\frac{x-1}{x+1}}=\sqrt{\frac{-2}{0^-}}=\sqrt{+\infty}=+\infty$$
Sapendo che la funzione ha un limite superiore e uno inferiore che tende a 1 sappiamo che in quella y esiste un asintoto orizzontale.
**ES:**
$$f(x)=arctg\ x^2$$
Sappiamo che questa funzione è definita in tutto $\mathbb{R}$ e che ha come limiti $\frac\pi2$ e $-\frac\pi2$. Inoltre, visto che abbiamo un $x^2$ la funzione sarà sempre positiva, perciò e pari, per provarlo basta fare $f(x)=f(-x)$. Inoltre dato sempre l'esponente della $x$, in realtà il codominio $D=[0, \frac\pi2)$. Dato ciò il suo limite è:
$$\lim\limits_{x\to+\infty}f(x)=\lim\limits_{x\to-\infty}f(x)=arctg\infty=\frac\pi2$$
Detto ciò sappiamo anche che $\frac\pi2$ è un asintoto orizzontale.
**ES: **
$$f:\mathbb{R}\rightarrow\mathbb{R}$$
$$f(x)=\frac{x^3+2}{e^x+x^2}\quad c.e. \mathbb{R}$$
Da notare che il denominatore è sempre positivo, perciò la funzione esisterà per tutto $\mathbb{R}$ e inoltre il suo segno sarà determinato dal numeratore.
$$x^3+2=\left(x+\sqrt[3]2\right)\cdot\left(x^2-\sqrt[3]{2}+\sqrt[3]{4}\right)\quad x\geq-\sqrt[3]{2}$$
Cio vuol dire che da $-\sqrt[3]{2}$ in poi la funzione è negativa e viceversa.
$$\lim\limits_{x\to+\infty}\frac{x^3+2}{e^x+x^2}=\lim\limits_{x\to+\infty}\frac{x^3}{e^x}=0$$
Prevale il numeratore poiché è di grado superiore.
$$\lim\limits_{x\to-\infty}\frac{x^3+2}{e^x+x^2}=\lim\limits_{x\to+\infty}\frac{x^3}{e^x+x^2}=\frac{-\infty}{x^2}=-\infty$$
Questo poiché l'esponente di $e^x$ farebbe tendere lo stesso ad un valore che tende a zero.
**ES: **
$$\lim\limits_{x\to2}\frac{x-2}{|x-2|}$$
$$c.e.=\mathbb{R}-\{2\}$$
$$f(x)=\begin{cases}
	\frac{x-2}{|x-2|}\quad x>2 \\
	\frac{-(x-2)}{|x-2|}=-1\quad x<2
\end{cases}$$
Questa funzione non ha limite in $2$ ma solo in $2^+$ e in $2^-$.
$$\lim\limits_{x\to2^-}f(x)=-1$$
$$\lim\limits_{x\to2^+}f(x)=+1$$
**ES: **
Sono date nello stesso dominio le seguenti funzioni:
$$f(x)=x^2-4$$
$$g(x)=x+2$$
Calcolare i seguenti limiti:
$$\lim\limits_{x\to1}(f+g)(x)=\lim\limits_{x\to1}(x^2+x-2)=0$$
$$\lim\limits_{x\to6}(f*g)(x)=\lim\limits_{x\to6}(x^3+2x^2-4x-8)=36\cdot6+72-24\cdot8=216+40=256$$
$$\lim\limits_{x\to2}(g\circ f)(x)=\lim\limits_{x\to2}(x^2-4)+2=\lim\limits_{x\to2}x^2-2=2$$
$$\lim\limits_{x\to2}(f\circ g)(x)=\lim\limits_{x\to2}x^2+4x=12$$
**ES: **
Determinare se esiste il seguente limite:
$$\lim\limits_{x\to0}\frac{\sqrt{1+x}-1}x=\frac00\quad f.i.$$
$$\lim\limits_{x\to0}\frac{1+x-1}{x(\sqrt{1+x}+1)}=\lim\limits_{x\to0}\frac1{\sqrt{1+x}+1}=\frac12$$
**ES: **
$$\lim\limits_{x\to1}\frac{1-x}{1-\sqrt[3]{x}}=\frac00\quad f.i.$$
$$1-x=1-\sqrt[3]{x^3}=(1-\sqrt[3]{x})(1+\sqrt[3]{x}+\sqrt[3]{x^2})$$
$$\frac{1-x}{1-\sqrt[3]x}=1+\sqrt[3]x+\sqrt[3]{x^2}$$
$$\lim\limits_{x\to1}(1+\sqrt[3]x+\sqrt[3]{x^2})=3$$
**ES: **
$$\lim\limits_{x\to0^+}\frac{ln\ x}{x\ sin\ x}=\frac{-\infty}{0\cdot0}=-\infty$$
**ES: **
$$\lim\limits_{x\to+\infty}\frac{2^{-x}}{sin\ x+2}=\frac0{2\pm1}=0$$
**ES: **
$$\lim\limits_{x\to0}\frac{\sqrt{1+3x}-\sqrt{1-3x}}{x^2+x}=\frac00\quad f.i.$$
$$\lim\limits_{x\to0}\frac{1+3x-1+3x}{(x^2+3x)(\sqrt{1+3x}-\sqrt{1-3x})}=\lim\limits_{x\to0}\frac{6x}{x^2+x}\cdot\frac1{\sqrt{1+3x}+\sqrt{1-3x}}=\lim\limits_{x\to0}\frac61\cdot\frac12=3$$
**ES: **
$$\lim\limits_{x\to+\infty}\left(\sqrt{x^2+x+1}-x\right)=\infty-\infty\quad f.i.$$
$$\lim\limits_{x\to+\infty}\frac{x^2+x+1-x^2}{\sqrt{x^2+x+1}+x}=\lim\limits_{x\to+\infty}\frac{x+1}{x+\sqrt{x^2+x+1}}=\frac{x\left(1+\frac1x\right)}{\left[x+\sqrt{x^2\left(1+\frac1x+\frac1{x^2}\right)}\right]}$$
$$\lim\limits_{x\to+\infty}\frac{x\left(1+\frac1x\right)}{\left[x+|x|\sqrt{1+\frac1x+\frac1{x^2}}\right]}=\lim\limits_{x\to+\infty}\frac{x\left(1+\frac12\right)}{x\left[1+\sqrt{1+\frac1x+\frac1{x^2}}\right]}=\frac1{1+1}=\frac12$$
**ES: **
$$\lim\limits_{x\to-\infty}\left(\sqrt{4x^2+1}-\sqrt{4x^2+5x+3}\right)=\infty-\infty\quad f.i.$$
$$\lim\limits_{x\to-\infty}\frac{4x^2+1-4x^3-5x-3}{\sqrt{4x^2+1}+\sqrt{4x^2+5x+3}}=\lim\limits_{x\to-\infty}\frac{-5x-2}{|x|\left[\sqrt{4+\frac1{x^2}}+\sqrt{4+\frac5x+\frac3{x^2}}\right]}$$
$$-\lim\limits_{x\to-\infty}\frac{5x+2}{-x\left[\sqrt{4+\frac1{x^2}}+\sqrt{4+\frac5x+\frac3{x^2}}\right]}=\frac5{\sqrt4+\sqrt4}=\frac54$$
**ES: **
$$\lim\limits_{x\to0}\frac{1-cos^3x}{4x\ sin\ x}=\frac00\quad f.i.$$
$$\lim\limits_{x\to0}\frac{(1-cos\ x)}{x^2}\frac{(1+cos1 x+cos^2x)}{4x^2\ sin\ x}$$
La prima frazione tende a $\frac12$ e $\frac1{sin\ x}\cdot x$ tende a 1.
$$\lim\limits_{x\to0}x^2\frac3{2\cdot4x^2}=\frac3{2\cdot4}=\frac38$$
**ES: **
$$b\in\mathbb{R}\quad\lim\limits_{x\to-\infty}\left(\sqrt{x^2+bx}+x-2\right)$$
$$\sqrt{x^2+bx}\quad x(x+b)\geq0\quad b>0\quad l=\infty-\infty\quad f.i.$$
$$b<0\quad l=\infty-\infty\quad f.i.$$
Da queste constatazioni risulta evidente che, dato un b positivo o negativo il limite è sempre con la forma indeterminata $\infty-\infty$.
$$b=0\quad\lim\limits_{x\to-\infty}(|x|+x-2)=-2$$
Inoltre in $b=0$ risulta subito evidente che tende a $-2$, rimangono tuttavia in casi in cui $b\not=0$.
$$\lim\limits_{x\to-\infty}\frac{x^2+bx-x^2+4x-4}{\sqrt{x^2+bx}-(x-2)}=\lim\limits_{x\to-\infty}\frac{(b+4)x-4}{-x\sqrt{1+\frac b{x}}+\left(1-\frac2x\right)}=\lim\limits_{x\to-\infty}\frac{b+4}{1+1}=\frac{b+4}2$$
$$\lim\limits_{x\to-\infty}f(x,b)=\begin{cases}
	-2\quad b=0\\
	-\frac{b+4}2\quad b\not=0
\end{cases}$$
**ES: **
$$\lim\limits_{x\to0}\frac{1-cos\ 2x+ sin\ 3x}{4\ tg\ x+ 5\ sin^2x}=\lim\limits_{x\to0}\frac{4x^2\cdot\frac{1-cos\ 2x}{4x^2}+\frac{sin\ 3x}{3x}\cdot3x}{4x\cdot\frac{tg\ x}x+5x^2\left(\frac{sin\ x}x\right)^2}=\lim\limits_{x\to0}\frac{4x^2\cdot\frac12+1\cdot3x}{4x\cdot1+5x^2\cdot1}=$$
$$\lim\limits_{x\to0}\frac{2x^2+3x}{5x^4x}=\lim\limits_{x\to0}\frac{x(2x+3)}{x(5x+4)}=\frac34$$
**ES: **
$$\lim\limits_{x\to0}\frac{e^{sin\ 5x}-cos\ 2x}{arcsin(2x)}=\frac00\quad f.i.$$
$$\lim\limits_{x\to0}\frac{e^x-1}{x}=1$$
Questo limite notevole mostrato sopra vale anche sostituendo $x$ con $f(x)$.
$$5x\cdot\frac{sin\ 5x}{5x}\lim\limits_{x\to0}\frac{\frac{e^{sin\ 5x}-1}{sin\ 5x}+\frac{1-cos\ 2x}{4x^2}\cdot4x^2}{2x\cdot\frac{arcsin(2x)}{2x}}=\lim\limits_{x\to0}\frac{5x\cdot1\cdot1+\frac124x^2}{2x\cdot1}=\lim\limits_{x\to0}\frac{2^x+5x}{2x}$$
$$\lim\limits{x\to0}\frac{x(2x+5)}{x\cdot2}=\frac52$$
**ES: **
$$\lim\limits_{x\to1}\frac{3x\ ln\ x}{x^X-1}=\frac00\quad f.i.$$
$$\lim\limits_{x\to1}\frac{3x\ ln\ x}{\frac{e^{x\ ln\ x}-1}{x\ ln\ x}\cdot x\ ln\ x}=3$$
$$x\ ln\ x\to 1\cdot0$$
# Programmazione
