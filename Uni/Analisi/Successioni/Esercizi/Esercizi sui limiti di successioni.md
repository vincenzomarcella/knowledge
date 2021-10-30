Tags: #Successioni #Analisi #Limiti  #Esercizi
# Esercizi sui [[Limiti di successioni|limiti di successioni]]
**ES: **
$$\lim\limits_{n\to+\infty}\sqrt[n]{n^3+3n+2}=\lim\limits_{x\to+\infty}(2+3n+n^3)^\frac{1}{n}$$
$$\lim\limits_{n\to+\infty}(n^3)^{\frac{1}{n}}\simeq\lim\limits_{n\to+\infty}n^{\frac{3}{n}}=\lim\limits_{n\to+\infty}e^{\frac{3}n\ ln\ n}= e^0= 1$$
Qui il limite tende a zero semplicemente perché la n nel logaritmo ha un andamento verso l'infinito più lento rispetto a la n che sta al denominatore della frazione, di conseguenza l'esponente di e tende ad anzaro verso zero più velocemente rispetto a quanto possa mai andare verso l'infinito.
**ES: **
$$\lim\limits_{n\to+\infty}\frac{1-cos(\frac{1}{n^2})}{arctg(n^3)}$$
- $\lim\limits_{n\to+\infty}\frac{1-cos(a_n)}{a_n^2}=\frac{1}{2}$
- $1-cos\ a_n\approx2a_n^2$
$$= \lim\limits_{n\to+\infty}\frac{2(\frac{1}{n^2})^2}{arctg(n^3)}=\frac{0}{\frac{\pi}{2}}=0$$
- $sin(b_2)\approx b_n$
In questo caso è importante notare che l'$arctg$ per un valore che tende sempre all'infinito, se tenuta in uno stato inalterato, ossia non viene moltiplicata per una qualsiaisi variabile o cstante tenderà sempre a $\frac{\pi}2$. Inoltre c'è anche da notare che visto che la frazione al numeratore tende a zero, a quel punto tutto il numeratore tenderà a zero, dando quindi come limite zero.
**ES: **
$$\lim\limits_{n\to+\infty}\frac{(1+\frac{1}{n^5})^3-1}{e^{\frac{1}{n^2}}-1}\cdot n^\alpha=0$$
$$\alpha=?\quad\quad\lim\limits_{n\to+\infty}\frac{3\frac{1}{n^5}}{\frac{1}{n^2}}\cdot n^\alpha=\lim\limits_{n\to+\infty}\frac{3}{n^5}\cdot n^2\cdot n^\alpha= 3\lim\limits_{n\to+\infty}n^{\alpha-3}=3$$
$$n^\alpha\approx\frac{e^{\frac{1}{2}}-1}{3(1+\frac{1}{n^5})}$$

