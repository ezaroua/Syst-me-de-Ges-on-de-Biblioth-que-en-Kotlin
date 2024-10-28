class EnregistrementAudio(titre: String, val duree: Int, val genre: String, dateDeParution: String) : Media(titre, dateDeParution), Empruntable {

    private var estEmprunte = false

    override fun afficher() {
        println("Enregistrement Audio: Titre = '$titre', Durée = '$duree' minutes, Genre = '$genre', Date de parution = '$dateDeParution'")
    }

    override fun emprunter(): Boolean {
        return if (!estEmprunte) {
            estEmprunte = true
            println("L'enregistrement audio '$titre' a été emprunté.")
            true
        } else {
            println("L'enregistrement audio '$titre' est déjà emprunté.")
            false
        }
    }

    override fun retourner(): Boolean {
        return if (estEmprunte) {
            estEmprunte = false
            println("L'enregistrement audio '$titre' a été retourné.")
            true
        } else {
            println("L'enregistrement audio '$titre' n'est pas emprunté.")
            false
        }
    }
}

