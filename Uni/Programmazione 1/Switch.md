Tags: #Programmazione1 #Selezione
#  L'istruzione `switch`
Lo `switch` è una [[Istruzioni condizionali|istruzione condizionale]] multiramo basata sulla valutazione delle varie condizioni su un valore o una [[Variabile|variabile]]. La sintassi è la seguente:
```Java
switch(numero) {
	case numero % 2 == 0:
		System.out.printf("Il numero %d è pari\n", numero);
		break;
	case numero % 2 == 1:
		System.out.printf("Il numero %d è dispari\n", numero);
		break;
	default:
		System.out.printf("Il tuo numero non è né pari né dispari\n");
		break;
}
```
Qui si può osservare la definizione dei vari casi, c'è da notare l'istruzione `default` che definisce il ramo nel quale si entra se nessuna delle condizioni dei casi viene soddisfatta. Inoltre è anche da notare l'istruzione `break` che delimita l'area di codice assegnata ad un determinato caso. L'omissione della parola `break` in un caso permette di fare delle condizioni composte come in questo esempio:
```Java
switch(numero) {
	case numero > 10:
	case numero < -10:
	 	System.out.printf("Il valore assoluto dei %d è maggiore di 10", numero);
		break;
	default:
		System.out.printf("Il valore assoluto dei %d è inferiore di 10", numero);
		break;
}
```