class Triangle (val x: Number, val y: Number, val z: Number) {
    init {
        val a = x.toDouble()
        val b = y.toDouble()
        val c = z.toDouble()
        require(a + b + c != 0.0)
        require(a + b > c && b + c > a && a + c > b)
    }
    
    fun Type(){
    if (x == y && x == z){
        println("This is a equilateral triangle!!!")
    }
    else if (x == y || x == z || y == z){
        println("This is a isosceles triangle!!!")
    }
    else{
         println("This is a scalene triangle !!!")
    }
  
    }

   
}
 fun main(){
       val firstTriangle = Triangle(3,1,3)
   		firstTriangle.Type()
        
       val secondTriangle = Triangle(5,5,5)
   		secondTriangle.Type()
        
        
        val thirdTriangle = Triangle(4,5,6)
   		thirdTriangle.Type()
        
       
    }