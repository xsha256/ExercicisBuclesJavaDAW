# Exercicis Estructures repetició 01

# Tema 02: Programació Estructurada

```
1) Escriu un programa en Java que llegisca des del teclat dos valors enters n1 i n2, comprove que n1 < n2 (i mostre un error si no és així), i finalment escriga tots els nombres enters dins l’interval [n1, n2] en ordre creixent. Fes que l’usuari proporcione sempre enters, i continue demanant-los fins que els introduïsca i també que continue demanant n2 mentre no siga major que n1. Per exemple, si n1 = 5, n2=12, l’eixida ha de ser (incloses les claus i les comes):
            [5, 6, 7, 8, 9, 10, 11, 12]
          +----------------------------------------------------+
          |                                                    |
          |    => Introdueix el primer número enter n1: hola   |
          |    => No has introduit un valor enter              |
          |    => Introdueix el primer número enter n1: 15     |  
          |    => El primer valor enter: 15                    |
          |    => Introdueix el segon número enter n2, ha de   |
          |       ser > 15: hola                               |      
          |    => No has introduit un valor enter              |
          |    => Introdueix el segon número enter n2, ha de   |
          |       ser > 15: 10                                 |         
          |    => El valor enter ha de ser major que 15        |
          |    => Introdueix el segon número enter n2, ha de   |
          |       ser > 15: 34                                 |
          |    => Els nombres enters entre 15 i 34:            |
          |    [15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,    |
          |     26, 27, 28, 29, 30, 31, 32, 33, 34]            |
          |                                                    |
          +----------------------------------------------------+
```

```
2)Escriu un programa en Java que llegisca des del teclat un nombre enter positiu major que 1 i n’escriga el divisor positiu més gran diferent d’ell mateix i d’1. En cas de no trobar-ne cap, cal anunciar aquest fet amb un text. Per fer-ho, usa una variable de control de tipus semàfor. Obliga l’usuari a introduir un enter.

Exemples:

                      +------------+--------------------------------+
                      |   Entrada  |            Eixida              |
                      +------------+--------------------------------+ 
                      |20          | Major divisor de 20: 10        |
                      +------------+--------------------------------+
                      |25          | Major divisor de 25: 5         |
                      +------------+--------------------------------+
                      |17          | El número 8 no és múltiple de 5|
                      +------------+--------------------------------+
                      |3000        | El major divisor de 3000: 1500 |
                      +------------+--------------------------------+
```
```
3) Escriu un programa en Java que llegisca des del teclat un nombre enter i escriga el nombre de xifres que té. Tin en compte que es considera que el valor 0 té una xifra. Obliga l’usuari a introduir un enter. Et pot servir, si l’usuari introdueix un enter negatiu Math.abs(numero): torna el valor absolut d’un número.

Exemples:

                      +------------+--------------------------------+
                      |   Entrada  |            Eixida              |
                      +------------+--------------------------------+ 
                      |20          | 20 té 2 xifres                 |
                      +------------+--------------------------------+
                      |3           | 3 té 1 xifra                   |
                      +------------+--------------------------------+
                      |90000000    | 90000000 té 8 xifres           |
                      +------------+--------------------------------+
                      |-456        | -456 té 3 xifres               |
                      +------------+--------------------------------+
                      |0           | 0 te 1 xifra                   |
                      +------------+--------------------------------+

```
```
4) Escriu un programa en Java que llegisca des del teclat un valor enter i tot seguit mostre fins a quin punt de la seqüència ordenada de nombres positius (1, 2, 3, etc.) cal sumar per arribar al nombre més proper per davall d’aquest valor. Finalment, s’ha de mostrar quina és la suma d’aquests nombres. 

Exemples:

                +------------+---------------------------------------+
                |   Entrada  |            Eixida                     |
                +------------+---------------------------------------+ 
                |12          | Número 12: cal sumar 0 1 2 3 4        |
                |            | per obtenir el número 10.             |
                +------------+---------------------------------------+
                |21          | Número 21: cal sumar 0 1 2 3 4 5 6    |
                |            | per obtenir el número 21.             |
                +------------+---------------------------------------+
                |60          | Número 60: cal sumar 0 1 2 3 4 5 6 7 8|
                |            | 9 10 per obtenir el número 55         |
                +------------+---------------------------------------+
                |0           | Número 0: cal sumar 0 per obtenir el  |
                |            | número 0.                             |
                +------------+---------------------------------------+

```
```
5) Escriu un programa en Java que llegisca des del teclat un valor de tipus enter. Tot seguit, ha de dibuixar una piràmide feta d’asteriscs (‘*’) d’una alçada igual al valor llegit. 

Per exemple, si el valor és 5, ha d’eixir per pantalla:

                                        *
                                       ***
                                      *****
                                     *******
                                    *********
                                   ***********

```




