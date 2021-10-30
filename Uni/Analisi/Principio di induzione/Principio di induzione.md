Tags: #Funzioni #Successioni #PrincipioDiInduzione 
# Principio di induzione
Sia data $\forall n\in\mathbb{N}, n\geq n_0$ una proposizione $P(n)$, se sono date le seguenti condizioni:
- $P(n_0)$ è vera (base induttiva),
- $\forall n>n_0,\quad(P(n-1)\Rightarrow P(n))$ (passo induttivo). Per ogni $n > n_0$ se $P(n-1)$ è vera ciò implica che anche $P(n)$ sia anche vera,

Allora $P(n)$ risulta vera $\forall n\geq n_0$
**EX: ** La somma dei primi $n\in\mathbb{n}$ è $\frac{n(n+1)}{2}$
- Base induttiva, se $n=1$ allora $\frac{1(1+1)}{2}=1$, vero.
- Passo induttivo, $\forall n>n_0 \quad(P(n-1)\Rightarrow P(n))$
$$P(n-1)=1+2+3+4+...+n-1=\frac{n(n-1)}{2}$$
$$P(n)=1+2+3+4+...+n-1+n=\frac{n(n-1)}{2}+n$$
$$P(n)=\frac{n(n-1)+2n}{2}=\frac{n^2-n+2n}{2}=\frac{n^2+n}{2}=\frac{n(n-1)}{2}$$
Data questa dimostrazione si può considerare anche il passo induttivo vero e di conseguenza la proposizione vera.

**EX: ** La somma dei primi $n\in\mathbb{N}$ dispari è $n^2$
Da notare che l'n-esimo numero dispari è $2n-1$
- Base induttiva, $n_0 = 1 \Rightarrow P(n_0)=P(1)$
- Passo induttivo, $\forall n>n_0\quad(P(n-1)\Rightarrow P(n))$
$$P(n-1)=\sum_0^{n-1}2n-1=(n-1)^2$$
$$P(n)=(n-1)^2+2n-1=n^2+1-2n+2n-1=n^2$$
Data questa dimostrazione si può considerare anche il passo induttivo vero e di conseguenza la proposizione vera.
## Seconda forma
Sia data $\forall n\in\mathbb{N}, n\geq n_0$ una proposizione $P(n)$, se sono date le seguenti condizioni:
- $P(n_0)$ è vera (base induttiva),
- $\forall n>0\quad(\forall h(n_0\leq h<n\ \wedge\ P(h))\Rightarrow P(n))$ (passo induttivo). 

**EX: **$P(n): 2^n\geq n^3$ (NON COMPLETO)
- Base induttiva $n_0=10\quad 2^{10}\geq10^3\quad 1024\geq1000$ vero.
- Passo induttivo $2^n\geq n^3\Rightarrow 2^{n+1}\geq (n+1)^3$
$$2\cdot 2^n\geq n^3+3n^2+3n+1$$
$$2\cdot 2^n\geq 2\cdot n^3 = n^3+n^3 = n^3 + n\cdot n^2$$
