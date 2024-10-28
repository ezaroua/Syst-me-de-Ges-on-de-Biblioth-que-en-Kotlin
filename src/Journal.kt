

/**
 * Représente un journal dans la bibliothèque.
 *
 * @param titre Le titre du journal.
 * @param dateDeParution La date de parution du journal.
 *
 * Cette classe hérite de `Media` et implémente l'interface `Consultable`, permettant ainsi
 * de gérer l'affichage et la consultation des journaux en bibliothèque.
 */
class Journal(titre: String, dateDeParution: String) : Media(titre, dateDeParution), Consultable {


    override fun afficher() {
        println("Journal: Titre = '$titre', Date de parution = '$dateDeParution'")
    }

    override fun consulter() {
        println("Le journal '$titre' du '$dateDeParution' est consulté sur place.")
    }

}