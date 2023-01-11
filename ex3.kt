/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */

fun ASC(s:String)
{
    val StringArray:MutableList<String> = mutableListOf()
    val match:MutableMap<String, Int> = mutableMapOf()
    println(s)
    var i=0
   while(i<s.length)
    {

       if(s[i].isLetterOrDigit())
        {
            var j = i + 1
           while(!s[j].equals(0))
           
           if(s[j].isLetterOrDigit() or (s[j].equals('\'') && s[j+1].isLetterOrDigit()))
           		j++
            else
            break
          var phase = s.slice(i..(j-1)).lowercase()
          if (match?.contains(phase)?:false)
            {
                var num  = match?.get(phase) ?:0
                num++
                match?.set(phase, num)
            }
            else
            match?.set(phase, 1)
			i +=(j-i)
        }
        else
        i++
    }
    println(match)
    
}
fun main() {
    ASC("That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled.")
}
