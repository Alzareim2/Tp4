
# Description du code Java : Encoder

\`\`\`java
public class Encoder {
\`\`\`
Définit une classe publique nommée `Encoder`.

\`\`\`java
    public static void main(String[] args) {
\`\`\`
Définit la méthode `main`, qui est le point d'entrée de l'application Java.

\`\`\`java
        encodeAndPrint(254);  // Expected: 01111111
        encodeAndPrint(136);  // Expected: 00010001
\`\`\`
Appelle la méthode `encodeAndPrint` avec deux entiers pour tester la fonction.

\`\`\`java
    }
\`\`\`
Ferme la méthode `main`.

\`\`\`java
    public static void encodeAndPrint(int n) {
\`\`\`
Définit une méthode publique statique `encodeAndPrint` qui prend un entier `n` en paramètre.

\`\`\`java
        if (n < 0 || n >= 256) {
\`\`\`
Vérifie si l'entier `n` est négatif ou supérieur ou égal à 256.

\`\`\`java
            System.out.println();
\`\`\`
Si la condition précédente est vraie, affiche une nouvelle ligne.

\`\`\`java
            return;
\`\`\`
Termine la méthode prématurément si la condition précédente est vraie.

\`\`\`java
        }
\`\`\`
Ferme le bloc `if`.

\`\`\`java
        String binaryEncoding = "";
\`\`\`
Initialise une chaîne vide `binaryEncoding` pour stocker la représentation binaire de `n`.

\`\`\`java
        for (int i = 0; i < 8; i++) {
\`\`\`
Commence une boucle qui s'exécutera 8 fois (pour chaque bit de la représentation binaire).

\`\`\`java
            if (n % 2 == 0) {
\`\`\`
Vérifie si `n` est divisible par 2 (c'est-à-dire si le bit le plus à droite est 0).

\`\`\`java
                binaryEncoding = "0" + binaryEncoding;
\`\`\`
Si le bit le plus à droite est 0, ajoute "0" au début de `binaryEncoding`.

\`\`\`java
            } else {
\`\`\`
Sinon (si le bit le plus à droite est 1)...

\`\`\`java
                binaryEncoding = "1" + binaryEncoding;
\`\`\`
Ajoute "1" au début de `binaryEncoding`.

\`\`\`java
            }
\`\`\`
Ferme le bloc `if-else`.

\`\`\`java
            n = n / 2;
\`\`\`
Divise `n` par 2 pour passer au bit suivant.

\`\`\`java
        }
\`\`\`
Ferme la boucle `for`.

\`\`\`java
        System.out.println(binaryEncoding);
\`\`\`
Affiche la représentation binaire de `n`.

\`\`\`java
    }
\`\`\`
Ferme la méthode `encodeAndPrint`.

\`\`\`java
}
\`\`\`
Ferme la classe `Encoder`.
