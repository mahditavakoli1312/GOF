package com.example.gof.builder_object

class OmletFood2(
    private val omletName: String,
    private val slatAmount: Double,
    private val seasoningAmount: Double,
    private val pizzaCheeseAmount: Double,
    private val meetSteakAmount: Double,
) {

    class OmletBuilder {
        private var omletName: String = ""
        private var slatAmount: Double = 0.0
        private var seasoningAmount: Double = 0.0
        private var pizzaCheeseAmount: Double = 0.0
        private var meetSteakAmount: Double = 0.0


        fun setOmletName(value: String) = apply {
            omletName = value
            return this
        }

        fun setSlatAmount(value: Double) = apply {
            slatAmount = value
            return this
        }

        fun setSeasoningAmount(value: Double) = apply {
            seasoningAmount = value
            return this
        }

        fun setPizzaCheeseAmount(value: Double) = apply {
            pizzaCheeseAmount = value
            return this
        }

        fun setMeetSteakAmount(value: Double) = apply {
            meetSteakAmount = value
            return this
        }

        fun create(): OmletFood2 = OmletFood2(
            omletName,
            slatAmount,
            seasoningAmount,
            pizzaCheeseAmount,
            meetSteakAmount
        )
    }

}