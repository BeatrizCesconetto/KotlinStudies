package inheritance

/*
*EXERCÍCIO
*---------
*
* Crie duas classes Point2D e Point3D. Point2D possui como propriedades as coordenadas x e y, enquanto Point3D,
*além delas, também possui a coordenada z. Utilize a relação de herança para representar estas classes.
*
* A respeito dos construtores, Point2D deve ter apenas um construtor, que receba os valores de x e y como parâmetros
*(tipo double). Já o Point3D também deve ter apenas um construtor, que deve receber x, y e z como parâmetros (também
*tipo double)
*/

fun main() {

    var p1 = Point2D(1.0,3.0)
    var p2 = Point3D(5.0, 7.0, 9.0)

    println("x = ${p1.x} e y = ${p1.y}")
}



open class Point2D(
   val x: Double, val y: Double
){

}

class Point3D(x: Double, y: Double, val z: Double) : Point2D(x,y){

}


