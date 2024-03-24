Compte Rendu TP3
CREATED BY KHALIL IBRAHIM

    Q1) Remarques sur les fonctions par interpolation
J'ai remarqué qu'on a pas besoin d'implémenter nous même le code de la fonction, on a qu'à définir la signature dans le repository et faire appel à la fonction dans le component, et c'est JPA qui se charge de l'implémentation.
Pour la question "Récupérez toutes les playlists, sans doublons qui ont une chanson particulière" j'ai remarqué qu'on peut pas passer un seul song en paramètre à la fonction, dû peut être à la relation entre les 2 entités Playlist et Song ?

    Au passage, une question ?
Quelle est la différence entre les 2 méthodes suivantes pour Récupérez le nombre d'artistes en fonction de leur genre musical :
`int countArtistEntitiesByGenreMusical(GenreMusical genreMusical) ;
int countAllByGenreMusical(GenreMusical genreMusical) ;`

    Q2)

    Q3) Les components renvoient directement les entités
Ce n'est pas une bonne idée de renvoyer directement les entités, la bonne méthode c'est de passer via des entités DTO.

    Q4) Si je supprime un artiste, que se passe-t-il ?
La suppression d'un artiste peut poser des problèmes s'il existe déjà une entité Album ou Song liée à cet artiste.

    Q5)

