/**
 * Représente un média qui peut être consulté.
 *
 * Les objets implémentant cette interface sont destinés à être consultés sur place.
 * La méthode `consulter` doit être redéfinie pour décrire le comportement de la consultation.
 */
interface Consultable {

    fun consulter()
}