

/**
 * Représente un magazine dans la bibliothèque.
 *
 * @param titre Le titre du magazine.
 * @param dateDeParution La date de parution du magazine.
 * @param numero Le numéro du magazine.
 */
class Magazine(titre: String, dateDeParution: String, val numero: String) : Media(titre, dateDeParution), Consultable {
    override fun afficher() {
        println("Magazine: Titre = '$titre', Numéro = '$numero', Date de parution = '$dateDeParution'")
    }

    override fun consulter() {
        println("Le magazine '$titre', numéro '$numero' ($dateDeParution) est consulté sur place.")
    }
}