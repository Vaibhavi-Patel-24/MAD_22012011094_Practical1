class Matrix(val data:Array<IntArray>,val rows:Int,val cols:Int){

    // Operator overloading for Matrix addition
    operator fun plus(other: Matrix): Matrix {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for addition")
        }

        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] + other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }

    // Operator overloading for Matrix subtraction
    operator fun minus(other: Matrix): Matrix {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw IllegalArgumentException("Matrices must have the same dimensions for subtraction")
        }

        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                result[i][j] = this.data[i][j] - other.data[i][j]
            }
        }
        return Matrix(result, rows, cols)
    }

    // Operator overloading for Matrix multiplication
    operator fun times(other: Matrix): Matrix {
        if (this.cols != other.rows) {
            throw IllegalArgumentException("Number of columns in the first matrix must equal the number of rows in the second matrix for multiplication")
        }

        val result = Array(this.rows) { IntArray(other.cols) }
        for (i in 0 until this.rows) {
            for (j in 0 until other.cols) {
                for (k in 0 until this.cols) {
                    result[i][j] += this.data[i][k] * other.data[k][j]
                }
            }
        }
        return Matrix(result, this.rows, other.cols)
    }

    override fun toString(): String {
        val matrixStr = data.joinToString("\n") { row -> row.joinToString(" ") }
        return "($rows x $cols Matrix):\n$matrixStr"
    }
}


fun main(){

    val firstMatrix = Matrix(arrayOf(intArrayOf(3,2,-5), intArrayOf(3,0,4)),2,3)
    val secondMatrix = Matrix(arrayOf(intArrayOf(2,3), intArrayOf(-9,0), intArrayOf(0,4)),3,2)
    val secondMatrix1 = Matrix(arrayOf(intArrayOf(6,3), intArrayOf(9,0), intArrayOf(5,4)),3,2)

    println("**************Addition*****************")
    println("Matrix1:")
    println("$secondMatrix1")
    println("Matrix2:")
    println("$secondMatrix")
    val AddMatrix = secondMatrix1 + secondMatrix
    println("Addition = $AddMatrix")

    println("**************Subtraction*****************")
    println("Matrix1:")
    println("$secondMatrix1")
    println("Matrix2:")
    println("$secondMatrix")
    val SubtractMatrix = secondMatrix1 - secondMatrix
    println("Subtraction = $SubtractMatrix")

    println("**************Multiplication*****************")
    println("Matrix1:")
    println("$firstMatrix")
    println("Matrix2:")
    println("$secondMatrix")
    val MulMatrix = firstMatrix * secondMatrix
    println("Multiplication = $MulMatrix")

}