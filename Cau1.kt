
    fun calculateHandshake(n: Int):List<String> {
        val code = mutableListOf<String>()
        Integer.toBinaryString(n).toList().asReversed().forEachIndexed{ index, char ->
            if (char.equals('1')) when (index) {
                    0 -> code.add("\"wink\"")	
                    1 -> code.add("\"double blink\"")
                    2 -> code.add("\"close your eyes\"")
                    3 -> code.add("\"jump\"")
                    4 -> code.reverse()
                }
            }
        return code
        
    }
    
    
    fun main(){
        print(calculateHandshake(3))
        print(calculateHandshake(19))
    }
