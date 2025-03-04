package exercises

fun main() {
    println("Digite uma distância em metros:")
    val metros = readln().toDouble()

    println("""
        A distância de ${"%.2f".format(metros)}m        
        corresponde a:
        ${metros / 1000}Km
        ${metros / 100}Hm
        ${metros / 10}Dam

        ${metros * 10}dm
        ${metros * 100}cm
        ${metros * 1000}mm
    """.trimIndent())
}