package procedimentos

fun main() {
    gerador02("Aprendendo Portugol")
}

fun gerador02(msg: String) {
    println("""
+      =============     +
${msg}
+      =============     +
    """.trimIndent())
}