package rep_enquanto

fun main() {
    var contador = 30

    while (contador >= 1) {
        if (contador % 4 == 0) print("[$contador] ")
        else print("$contador ")
        contador--
    }
    print("Acabou!")
}