open class Person(
    val firstName: String,
    val lastName: String
) {
    var age: Int = 0
    constructor(firstName: String, lastName: String, age: Int) : this(firstName, lastName) {
        this.age = age
    }
    open fun displayInfo() {
        println("First Name: $firstName")
        println("Last Name: $lastName")
        println("Age: $age")
    }
}
class Student(
    firstName: String,
    lastName: String,
    age: Int,
    val enrollmentNo: String
) : Person(firstName, lastName, age) {

    var branch: String = ""
    var studentClass: String = ""
    var labBatch: String = ""


    constructor(
        firstName: String, lastName: String, age: Int,
        enrollmentNo: String, branch: String, studentClass: String, labBatch: String
    ) : this(firstName, lastName, age, enrollmentNo) {
        this.branch = branch
        this.studentClass = studentClass
        this.labBatch = labBatch
    }


    override fun displayInfo() {
        super.displayInfo()
        println("Enrollment No: $enrollmentNo")
        println("Branch: $branch")
        println("Class: $studentClass")
        println("Lab Batch: $labBatch")
    }
}

fun main() {

    val students = arrayListOf<Student>(
        Student("John", "Doe", 20, "EN123", "Computer Science", "2nd Year", "A"),
        Student("Jane", "Smith", 22, "EN456", "Mechanical", "3rd Year", "B"),
        Student("Michael", "Johnson", 21, "EN789", "Electrical", "2nd Year", "C"),
        Student("Emily", "Davis", 19, "EN012", "Civil", "1st Year", "D"),
        Student("David", "Wilson", 23, "EN345", "Computer Science", "4th Year", "E")
    )


    for (student in students) {
        println("\nStudent Information:")
        student.displayInfo()
    }
}

