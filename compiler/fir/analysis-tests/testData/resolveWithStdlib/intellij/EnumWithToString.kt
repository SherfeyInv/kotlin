// RUN_PIPELINE_TILL: BACKEND
enum class Some {
    ENTRY {
        override fun toString(): String = "Entry"
    };

    override fun toString(): String = "Some"
}
