object Main
{
def main(args : Array[String]) : Unit=
    {
        var number = 371
        var originalNumber: Int
        var remainder: Int
        var result = 0
        originalNumber = number
        while (originalNumber != 0)
        {
            remainder = originalNumber % 10
            result += Math.pow(remainder,3)
            originalNumber /= 10
        }
        if (result == number)
        {
            println(number + " is an Armstrong number.")
        }
        else
        {
            println(number + " is not an Armstrong number.")
        }
    }
}