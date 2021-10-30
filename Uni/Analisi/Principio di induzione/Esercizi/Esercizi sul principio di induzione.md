Tags: #Analisi #Esercizi #PrincipioDiInduzione
# Esercizi sul [[Principio di induzione|principio di induzione]]
**ES: **
La qui si sta tentando di dimostrare che la sommatoria dei primi $k$ [[Numeri naturali|numeri naturali]].
$$\sum_1^n k = \frac{n(n+1)}{2}$$
$$1+2+3+4+5+6+...+n+(n+1)$$
- Si inizia sempre con il dimostrare se l'affermazione è valida per $n=1$
$$P(1)=\frac{1(1+1)}{2}=\frac{2}2=1$$
- A quel punto si da per buona la dimostrazione per $n-1$
$$P(n-1)=\sum_1^{n-1}k=\frac{(n-1)n}{2}$$
- Si usa a quel punto la dimostrazione per $n-1$ per poter a quel punto proale la proposizione per un dato valore $n$
$$P(n)=\sum_1^{n-1}k+n=\frac{(n-1)n}{2}+n=\frac{n^2-n+2n}{2}=\frac{n^2+n}{2}=\frac{n(n+1)}{2}$$