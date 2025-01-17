package mx.madg.easyfit.Models

import java.io.Serializable

data class DietaOption (
    var day: String = "",
    var opcion: String = "",
    var descripcion: String = ""
) : Serializable

object MyOption {

    private val opciones = arrayListOf(
        "OPCION 1",
        "OPCION 2",
        "OPCION 3"
    )

    var optionList: ArrayList<DietaOption>? = null
        get() {
            if (field != null)
                return field

            field = ArrayList()
            for (i in opciones.indices) {
                val optionName = opciones[i]
                val opcion = DietaOption("",optionName, "Write description ...")
                field!!.add(opcion)
            }

            return field
        }

    var opcionesCompleted: MutableList<DietaOption> = mutableListOf()

}