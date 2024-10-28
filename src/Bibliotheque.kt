/**
 * Représente une bibliothèque contenant une collection de médias.
 *
 * La classe fournit des méthodes pour ajouter des médias, emprunter et retourner des médias empruntables,
 * consulter des médias consultables et afficher l'état des emprunts en cours.
 */
class Bibliotheque {
    private val medias = mutableListOf<Media>()
    private val emprunts = mutableListOf<Media>()

    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    fun emprunter(media: Media) {
        if (media is Empruntable && media.emprunter()) {
            emprunts.add(media)
        }
    }

    fun retourner(media: Media) {
        if (media is Empruntable && media.retourner()) {
            emprunts.remove(media)
        }
    }

    fun consulter(media: Media) {
        if (media is Consultable) {
            media.consulter()
        }
    }

    fun afficherEmprunts() {
        println("***********************************************************")
        if (emprunts.isEmpty()) {
            println("Aucun emprunt en cours.")
        } else {
            println("Emprunts en cours:")
            for (media in emprunts) {
                media.afficher()
            }
        }
        println("***********************************************************")
    }
}
