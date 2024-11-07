
package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.data

import net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.R
import net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.data.entities.Frase


/**
 * [Datasource] generates a list of [Frase]
 */
class Datasource() {
    val frases= listOf(R.string.affirmation1,
        R.string.affirmation2,
        R.string.affirmation3,
        R.string.affirmation4,
        R.string.affirmation5,
        R.string.affirmation6,
        R.string.affirmation7,
        R.string.affirmation8,
        R.string.affirmation9,
        R.string.affirmation10
        )
    val imagenes= listOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10
    )
    //crea una lista de frases
    fun loadFrases(): List<Frase> {
        val lista=mutableListOf<Frase>()
        (0..2500).forEach{
            lista.add(Frase(frases.random(),imagenes.random()))
        }
        return lista
    }
}
