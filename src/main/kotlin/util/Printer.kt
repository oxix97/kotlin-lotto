package util

class Printer {
    fun printPurchaseMessage() = println("구입금액을 입력해 주세요.")

    fun printCountLotto(count: Int) = println("${count}개를 구매했습니다.")

    fun printInputLottoMessage() = println("당첨 번호를 입력해 주세요.")

    fun printInputBonusMessage() = println("보너스 번호를 입력해 주세요.")

    fun printLottoResult() = println("당첨 통계")

    fun printReturnRate(rate: Float) = println("총 수익률은" + "%.2f".format(rate) + "입니다.")
}