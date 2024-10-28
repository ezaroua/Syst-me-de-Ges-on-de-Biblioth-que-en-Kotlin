/**
 * Point d'entrée de l'application de gestion de bibliothèque.
 *
 * Cette fonction instancie une bibliothèque, ainsi que différents types de média tels que des magazines,
 * journaux, enregistrements audio, DVD et livres. Les médias sont ajoutés à la bibliothèque, empruntés,
 * consultés et retournés. L'état des emprunts est affiché après chaque opération d'emprunt ou de retour.
 */
fun main() {
    val bibliotheque = Bibliotheque()
    val magazine = Magazine("National Geographic", "2024-10-28", "10")
    val journal = Journal("Le Monde", "2024-10-28")
    val enregistrementAudio = EnregistrementAudio("Beethoven - Symphonie No.9", 960, "Classical", "1967-01-01")
     val dvd = DVD("Inception", 8880, "Action", "2010-01-01")
    val livre = Livre("1984", "1972-01-01", "George Orwell", "Gallimard")

    bibliotheque.ajouterMedia(magazine)
    bibliotheque.ajouterMedia(journal)
    bibliotheque.ajouterMedia(enregistrementAudio)
    bibliotheque.ajouterMedia(dvd)
    bibliotheque.ajouterMedia(livre)

    bibliotheque.emprunter(dvd)
    bibliotheque.emprunter(livre)
    bibliotheque.consulter(magazine)
    bibliotheque.consulter(journal)
    bibliotheque.emprunter(enregistrementAudio)

    bibliotheque.afficherEmprunts()

    bibliotheque.retourner(dvd)
    bibliotheque.retourner(livre)

    bibliotheque.afficherEmprunts()
}
