
package net.iessochoa.joseantoniolopez.t09ejercicioclaselistas.data.entities

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [Frase] is the data class to represent the Affirmation text and imageResourceId
 */
data class Frase(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
