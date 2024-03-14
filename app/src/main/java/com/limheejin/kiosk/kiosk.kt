package com.limheejin.kiosk

fun main() {

    println("""아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.
        |[ SHAKESHACK MENU ]
        |1. Burgers         | 앵거스 비프 통살을 다져만든 버거
        |2. Forzen Custard  | 매장에서 신선하게 만드는 아이스크림
        |3. Drinks          | 매장에서 직접 만드는 음료
        |4. Beer            | 뉴욕 브루클린 브루어리에서 양조한 맥주
        |0. 종료            | 프로그램 종료
    """.trimMargin())

    var menuSelect = readLine()!!.toInt()
    when(menuSelect){
        1 -> Burgers()
    }
}


fun Burgers() {
    println("""
[ Burgers MENU ]
1. ShackBurger   | W 6.9 | 토마토, 양상추, 쉑소스가 토핑된 치즈버거
2. SmokeShack    | W 8.9 | 베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거
3. Shroom Burger | W 9.4 | 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거
3. Cheeseburger  | W 6.9 | 포테이토 번과 비프패티, 치즈가 토핑된 치즈버거
4. Hamburger     | W 5.4 | 비프패티를 기반으로 야채가 들어간 기본버거
0. 뒤로가기      | 뒤로가기
    """.trimMargin())

    var burgerSelect = readLine()!!.toInt()
    when(burgerSelect){
        0 -> back()
    }

}

fun back() {

}
//0 <-
//
//"0"
//"2"
//
//[ Forzen Custard MENU ]
//1. ...
//2. ...
//3. ...
//4. ...
//0. 뒤로가기      | 뒤로가기
//
//"0"
//"0"
//
//프로그램을 종료합니다.