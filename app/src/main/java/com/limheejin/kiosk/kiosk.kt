package com.limheejin.kiosk

fun main() {

    // 대분류 메뉴판 반복

        println(
            """아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
        |[ SHAKESHACK MENU ]
        |1. Burgers         | 앵거스 비프 통살을 다져만든 버거
        |2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
        |3. Drinks          | 매장에서 직접 만드는 음료
        |4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
        |0. 종료            | 프로그램 종료
    """.trimMargin()
        )


        var menuSelect = readLine()!!.toInt()

        when (menuSelect) {
            1 -> Burgers2()
            2 -> FrozenCustard2()
            3 -> Drinks2()
            4 -> Beer2()
            0 -> println("프로그램을 종료합니다.")
            else -> {
                println("잘못된 입력입니다. 다시 시도하세요.")
                main()
            }

        }


}



// 버거 메뉴판 출력
fun Burgers2() {
    println("""
[ Burgers MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
4. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
5. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기      | 뒤로가기
    """.trimMargin())

    var burgerSelect = readLine()!!.toInt()
    when(burgerSelect){
        0 -> main()
    }

}



// 아이스크림 메뉴판 출력

fun FrozenCustard2() {
    println("""
[ Frozen Custard MENU ]
1. Caramel Cashew          | W 4.5 | 카라멜 맛의 캐슈넛이 일품인 아이스크림
2. Pistachio               | W 4.5 | 피스타치오 향과 식감이 나는 아이스크림
3. Banana Pecan            | W 4.5 | 바나나 피칸맛이 나는 아이스크림
4. Oreo Almond             | W 5.5 | 오레오와 초코 아몬드 맛이 합쳐진 아이스크림
5. Mint Chocolate          | W 4.5 | 민트 초코 맛이 나는 아이스크림
0. 뒤로가기                 | 뒤로가기
    """.trimMargin())

    var frozenSelect = readLine()!!.toInt()
    when(frozenSelect){
        0 -> main()
    }
}



// 음료 메뉴판 출력
fun Drinks2() {
    println("""
[ Drinks MENU ]
1. Milk Shake          | W 7.2 | 아이스크림을 갈아 마실 수 있는 음료
2. Coconut Water       | W 7.9 | 코코넛 안에 든 투명한 액체 음료
3. Mocktail            | W 9.4 | 가볍게 마시기 좋은 무알콜 칵테일
4. Tonic Water         | W 4.0 | 탄산수에 퀴닌을 녹여 만든 음료
5. Juice               | W 5.0 | 상쾌한 과일을 갈아넣은 생과일주스
0. 뒤로가기             | 뒤로가기
    """.trimMargin())

    var drinkSelect = readLine()!!.toInt()
    when(drinkSelect){
        0 -> main()
    }
}



// 맥주 메뉴판 출력
fun Beer2() {
    println("""
[ Beer MENU ]
1. Pilsner Urquell       | W 9.9 | 체코산 사츠 홉의 씁쓸한 맛이 특징
2. Budweiser             | W 9.5 | 북미 스타일의 라거 맥주
3. Stella Artois         | W 9.4 | 체코의 필스너 맥주
4. Heineken              | W 8.0 | 네덜란드산의 달달한 곡물 향과 옅은 쓴맛
5. Cass                  | W 7.0 | 당신이 한국인이라면 이 맥주를 좋아할 수 있음
0. 뒤로가기               | 뒤로가기
    """.trimMargin())

    var beerSelect = readLine()!!.toInt()
    when(beerSelect){
        0 -> main()
    }
}


