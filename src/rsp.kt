import java.util.Random
import java.util.*

fun main(args: Array<String>) {

    while (true) {
        println("\n플레이어0으로 접속했습니다")
        println("0.가위 1.바위 2.보")
        val scan = Scanner(System.`in`).nextInt()

        RSPai(scan)
    }

}

fun RSPai(scan: Int) {

    val random: Random = Random()
    val result = arrayOf(0, 0, 0, 0, 0)
    result[0] = scan
    for (i in 1..4) {
        var random: Int = random.nextInt(3)
        result[i] = random
    }
    simpan(result[0], result[1], result[2], result[3], result[4])
}

fun simpan(me: Int, player1: Int, player2: Int, player3: Int, player4: Int) {
    var players: Int = 5
    val result = arrayOf(me, player1, player2, player3, player4)
    val result_compat: String = result[0].toString() + result[1].toString() + result[2].toString() + result[3].toString() + result[4].toString()



    if (result_compat.contains("0") && result_compat.contains("1") && result_compat.contains("2")) {
        println("비겼습니다")
        return
    }
    if (result_compat.contains("0") && result_compat.contains("1")) {
        println("바위를 낸")
        for (i in 0..4) {
            if (result[i] == 1) {
                println("플레이어" + i.toString() + "이 이겼습니다.")


            }


        }
        if (result_compat.contains("1") && result_compat.contains("2")) {
            println("보를 낸")
            for (i in 0..4) {
                if (result[i] == 2) {
                    println("플레이어" + i.toString() + "이 이겼습니다.")


                }
                if (result_compat.contains("0") && result_compat.contains("2")) {
                    println("가위를 낸")
                    for (i in 0..4) {
                        if (result[i] == 0) {
                            println("플레이어" + i.toString() + "이 이겼습니다.")

                        }


                    }
                }
            }


        }
    }
}

