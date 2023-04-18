package lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    /**
     *  throws 구문이 없음
     *  Kotlin 에서는 Checked Exception 과 Unchecked Exception 을 구분하지 않고, 모두 Unchecked Exception 으로 간주
     */
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    /**
     * Kotlin 에서는 try with resources 구문이 없음
     * 대신 use 라는 inline 함수 사용
     */
    fun readFile2(path: String) {
        BufferedReader(FileReader(path)).use {reader ->
            println(reader.readLine())
        }
    }
}