/**
 * Représente un objet empruntable dans une bibliothèque.
 *
 * Cette interface définit les opérations de base pour l'emprunt et le retour d'un objet.
 */
interface Empruntable {

    fun emprunter(): Boolean
    fun retourner(): Boolean

}