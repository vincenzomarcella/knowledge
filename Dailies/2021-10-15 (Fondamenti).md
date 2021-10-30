Tags: #Esercitazione #Fondamenti #Esercizi 
# Esercitazione di fondamenti
$$A=\{a,b\}\quad\quad B=\{1,3,5,7,9\}\quad\quad C=\{\emptyset\}\quad\quad D=\{1,\{b\},\{1,0\}\}$$
## Esercizio 1 
$$A\bigtimes C$$
$$A\bigtimes C = \{\langle A,\emptyset\rangle ,\langle B,\emptyset\rangle\}$$
$$A\bigtimes \mathcal{P}(C)$$
$$A\bigtimes \mathcal{P}(C)=A\bigtimes \{\emptyset, \{\emptyset\}\}$$
## Esercizio 2
- Il prodotto cartesiano di $D\bigtimes B = card(D)\cdot card(B)=15$
## Esercizio 3
$$A=\{1,2,3,4,5,6\}\quad\quad R_1\subseteq A\bigtimes A\quad e \quad R_2\subseteq A\bigtimes A$$
$$R_1=\{\langle x,y\rangle | y=x+2\}$$
$$R_2=\{\langle x,y\rangle | x+y>6\}$$
$$A\bigtimes A=\{\langle1,1\rangle,\langle1,2\rangle,\langle1,3\rangle,\ ...\}$$
$$R_1=\{\langle1,3\rangle\,\langle2,4\rangle,\langle3,5\rangle,\langle4,6\rangle\}$$
$$R_2=\{\langle1,6\rangle\,\langle2,5\rangle,\langle2,6\rangle,\langle3,4\rangle,\langle3,5\rangle,\langle3,6\rangle,\langle4,3\rangle,\langle4,4\rangle,\langle4,5\rangle,\langle4,6\rangle,...\}$$
## Esercizio 4
Siano 
$$q_{\mathbb{N}}:\mathbb{N}\rightarrow\mathbb{N},\  q_{\mathbb{Z}}:\mathbb{Z}\rightarrow\mathbb{Z},\  q_{mix}:\mathbb{Z}\rightarrow\mathbb{N},$$ $$f:\mathbb{N}\bigtimes\mathbb{N}\rightarrow\mathbb{N},\ g:\mathbb{Z}\rightarrow\mathbb{R},\ h:\mathbb{N}\rightarrow\mathbb{N}$$
$$q_{\mathbb{N}}(x)=x^2$$
$$q_{\mathbb{Z}}(x)=x^2$$
$$q_{mix}(x)=x^2$$
$$f(x, y)=tr\left(\frac{x}{y}\right)$$
$$g(x)=2^x$$
$$h(x)=x+5$$
- $q_{\mathbb{N}}$ è una funzione totale, iniettiva, invertibile
- $q_{\mathbb{Z}}$ è una funzione totale
- $q_{mix}$ è una funzione totale, suriettiva
$f$ è una funzione parziale, suriettiva
$g$ è una funzione totale, iniettiva, invertibile
$h$ è una funzione totale, iniettiva, invertibile

**NOTE: ** La totalità di una funzione dipende dal dominio iniziale e non da quello di arrivo
## Esercizio 5
$$f(x,y)=tr\left(\frac{x}{y}\right),\ g(x)=2^x,\ h(x)=x+5$$ 
- $f\circ h=f(h(x), y)=impossibile$
- $h\circ f=h(f(x,y))=\left(tr\left(\frac{x}{y}\right)\right)+5$
- $g\circ h=g(h(x))=2^{x+5}$
- $h\circ g = impossibile$
- $g\circ f=2^{tr\left(\frac{x}y\right)}$
- $f\circ g=impossibile$
**NOTE: ** Per essere possibile, una composizione deve avere il codominio della prima, come sottoinsieme del dominio della seconda
## Esercizio 6
- V perché la cardinalità dei due insiemi è $\aleph_0$
- V
- V
- F
- V