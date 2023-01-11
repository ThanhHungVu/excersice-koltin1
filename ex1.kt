/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun secrethandshake(num:Int)
{
    val StringArray:MutableList<String> = mutableListOf()
    
    // 1
    if (num and 1 !=0 )
    	StringArray.add("wink")
    // 10
    if (num and 2 !=0 )
    	StringArray.add("double blink")
        
    // 100
    if (num and 4 !=0 )
    	StringArray.add("close your eyes")
    // 100(0
    if (num and 8 !=0 )
    	StringArray.add("jump")
        
    // 1000
    if (num and 16 !=0 )
    	println(StringArray.reversed())
        else
    println(StringArray)
    
}
fun main() {
    secrethandshake(8)
    secrethandshake(19)
}
