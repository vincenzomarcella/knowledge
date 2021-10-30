Tags: #Analisi  #Successioni 
# Unicità del [[Limiti di successioni|limite]]
## Teorema
Supponiamo che la [[Successioni|successione]] $(a_n)_{n\in\mathbb{N}}$ tenda ad $a$ e $a'$ per $n \rightarrow +\infty$. Allora $a=a'$ 
## Dimostrazione
$$a,a'\in\mathbb{R}$$
Supponiamo che $a\not=a'$. Allora, scelto $\epsilon_0 = \frac{|a-a'|}{2}>0$, si può dedurre che
$$\exists\nu_1>0:\forall n\in\mathbb{N}, n\geq\nu_1 \Rightarrow |a_n-a|<\epsilon_0$$
e
$$\exists\nu_2>0:\forall n\in\mathbb{N}, n\geq\nu_2 \Rightarrow |a_n-a'|<\epsilon_0$$
Dato un $\nu=max\{\nu_1,\nu_2\}$, combinando le sue supposizioni sopra si ottiene che $\forall n\in\mathbb{N}, n<\nu$
$$|a-a'|=|(a-a_n)+(a_n-a')|\leq|a_n-a|+|a_n-a'|<\epsilon_0+|epsilon_0=2\epsilon_0=|a-a'|$$
cioè una contraddizione.