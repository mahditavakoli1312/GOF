package com.example.gof.builder_object

class OmletFood(
    private var omletName: String = "",
    private var slatAmount: Double = 0.0,
    private var seasoningAmount: Double = 0.0,
    private var pizzaCheeseAmount: Double = 0.0,
    private var meetSteakAmount: Double = 0.0,
) {
    class OmletBuilder {

        private var omletName: String = ""
        private var slatAmount: Double = 0.0
        private var seasoningAmount: Double = 0.0
        private var pizzaCheeseAmount: Double = 0.0
        private var meetSteakAmount: Double = 0.0


        fun setOmletName(value: String): OmletBuilder {
            omletName = value
            return this
        }

        fun setSlatAmount(value: Double): OmletBuilder {
            slatAmount = value
            return this
        }

        fun setSeasoningAmount(value: Double): OmletBuilder {
            seasoningAmount = value
            return this
        }

        fun setPizzaCheeseAmount(value: Double): OmletBuilder {
            pizzaCheeseAmount = value
            return this
        }

        fun setMeetSteakAmount(value: Double): OmletBuilder {
            meetSteakAmount = value
            return this
        }

        fun create(): OmletFood = OmletFood(
            omletName,
            slatAmount,
            seasoningAmount,
            pizzaCheeseAmount,
            meetSteakAmount,
        )
    }

}