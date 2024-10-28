

/**
 * Représente un livre dans la bibliothèque.
 *
 * @param titre Le titre du livre.
 * @param dateDeParution La date de parution du livre.
 * @param auteur L'auteur du livre.
 * @param editeur L'éditeur du livre.
 */
class Livre(titre: String, dateDeParution: String, val auteur: String, val editeur: String) : Media(titre, dateDeParution), Empruntable {
    private var estEmprunte = false

    override fun afficher() {
        println("Livre: Titre = '$titre', Auteur = '$auteur', Éditeur = '$editeur', Date de parution = '$dateDeParution'")
    }

    override fun emprunter(): Boolean {
        return if (!estEmprunte) {
            estEmprunte = true
            println("Le livre '$titre' de '$auteur' a été emprunté.")
            true
        } else {
            println("Le livre '$titre' est déjà emprunté.")
            false
        }
    }

    override fun retourner(): Boolean {
        return if (estEmprunte) {
            estEmprunte = false
            println("Le livre '$titre' de '$auteur' a été retourné.")
            true
        } else {
            println("Le livre '$titre' n'est pas emprunté.")
            false
        }
    }


}