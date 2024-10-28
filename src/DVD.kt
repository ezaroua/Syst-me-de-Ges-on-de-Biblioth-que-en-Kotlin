class DVD(titre: String, val duree: Int, val genre: String, dateDeParution: String) : Media(titre, dateDeParution), Empruntable {
    private var estEmprunte = false

    override fun afficher() {
        println("DVD: Titre = '$titre', Durée = '$duree' minutes, Genre = '$genre', Date de parution = '$dateDeParution'")
    }

    override fun emprunter(): Boolean {
        return if (!estEmprunte) {
            estEmprunte = true
            println("Le DVD '$titre' a été emprunté.")
            true
        } else {
            println("Le DVD '$titre' est déjà emprunté.")
            false
        }
    }

    override fun retourner(): Boolean {
        return if (estEmprunte) {
            estEmprunte = false
            println("Le DVD '$titre' a été retourné.")
            true
        } else {
            println("Le DVD '$titre' n'est pas emprunté.")
            false
        }
    }
}