abstract class Media(val titre: String, val dateDeParution: String) {

    /**
     * Affiche les informations du media.
     * Cette méthode doit être implémentée par les sous-classes de Media pour fournir un affichage détaillé.
     */
    abstract fun afficher()


}
