/**
 *  문자열을 민다 왼쪽 - >오른쪽 1회
 *  A->B 최소 횟수를 return
 *  만약 되지않으면, -1 return
 */

class Solution {
    fun pushString(str: String): String {
        val lastIndex = str.lastIndex
        val answer = str[lastIndex] + str.substring(0..lastIndex - 1)
        return answer
    }

    fun solution(A: String, B: String): Int {
        var answer: Int = 0
        var count = 0
        val maxCount = B.length

        var aA = A
        while (B != aA) {
            if (count >= maxCount) return -1
            aA = pushString(aA)
            count++
        }
        answer = count
        return answer
    }
}

fun main() {
    val a = Solution()
    a.solution("hello", "ohell")//1
    a.solution("apple", "elppa")//-1
    a.solution("atat", "tata")//1
    a.solution("abc", "abc")//0

}