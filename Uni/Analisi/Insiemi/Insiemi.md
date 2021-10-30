Tags: #Insiemi
# Insiemi
Gli insiemi sono un raggruppamento di oggetti a partire dalle loro proprietà ben definite. L'appartenenza o meno degli elementi ad un insieme non deve essere ambigua.

Sia $A\subseteq \mathbb{R}, A\not\subset \varnothing$ (sia A un sottoinsieme dei numeri reali che non sia vuoto)
- A è superiormente limitato se $\exists k \in \mathbb{R} \ : \ a\leq k, \forall \ a \in A$.
- A è inferiormente limitato se $\exists k \in \mathbb{R} \ : \ k\leq a, \forall a \in A$.
- A è limitato se è sia superiormente che inferiormente limitato.
- Se A è superiormente limitato, ogni $k \in \mathbb{R} \ : \ a\leq k$ si chiama maggiornate di a.
- Se A è inferiormente limitato, ogni $k \in \mathbb{R} \ : \ k\leq a$ si chiama minorante di a.
Esempio:
$$A=\{1,2,5\}$$ 
$$MA(maggiorante \ di \ A)=\{ k \in \mathbb{r}, k\geq 5\}$$ $$M'A(minorante \ di \ A)=\{ k \in \mathbb{r}, k\leq 1\}$$

## Operatori
L'operatore = nel caso degli insiemi ha tre proprietà:
- Riflessività: A=A A è uguale a se stesso
- Simmetria: A=B se B=A
- Transitività: A=C B=C allora A=B

$$A=B \Leftrightarrow x\in A \ e \ x\in B$$

## Rappresentazioni
### Estensionale
$$A=\{ x,y,z \}$$
### Intensionale
$$A=\{ x|x \in \mathbb{Z}, x>0 \}$$
## Insieme potenza
Dato un insieme $S$, $\wp S$ è l'insieme di tutti i suoi sottoinsiemi. Se $S$ ha $n$ elementi $\wp S$ ne avrà $2^{n}$.
$$\wp S=(x|x\subseteq S)$$