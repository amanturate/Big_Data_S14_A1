
class Calculator(a:Int, b:Int) {

  def numer = a
  def denom = b

  def this(a:Int) = this(a,1)

  def add(that : Calculator) = new Calculator(
    numer * that.denom + that.numer * denom,
    denom * that.denom
  )

  def sub(that : Calculator) = new Calculator(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  def mult(that : Calculator) = new Calculator(
    numer * that.numer,
    denom * that.denom
  )

  def divide(that : Calculator) = new Calculator(
    numer * that.denom,
    denom * that.numer
  )

  def gcd(a:Int, b:Int): Int = {
    if(b == 0) a else gcd(b,a%b)
  }

  override def toString = numer + "/" + denom
}

object RationalMai {

  def Options() = {

    var input1 =0
    var input2 = 0
    var input3 = 0
    var input4 = 0
    var input5 = 0
  do {
    println("1. Add rational numbers")
    println("2. Subtract rational numbers")
    println("3. Multiply rational numbers")
    println("4. Divide rational numbers")
    println("5. Add numbers")
    println("6. Subtract numbers")
    println("7. Multiply numbers")
    println("8. Divide numbers")
    println("9. GCD of numbers")
    println("10. Exit")
    println("Enter any the option")
    input1 = scala.io.StdIn.readInt()
  }while(input1 < 1 && input1 > 9)


    if(input1 == 10){
      println("Bye")
      System.exit(404)
    }

  if(input1 >=1 && input1 <=4) {
    println("Enter the numerator of first rational")
    input2 = scala.io.StdIn.readInt()

    println("Enter the denominator of first rational")
    input3 = scala.io.StdIn.readInt()

    println("Enter the numerator of second rational")
    input4 = scala.io.StdIn.readInt()

    println("Enter the denominator of second rational")
    input5 = scala.io.StdIn.readInt()

    compute(input1, input2, input3, input4, input5)
  }

    if(input1 >=5 && input1 <=9) {
      println("Enter first number")
      input2 = scala.io.StdIn.readInt()
      println("Enter second number")
      input3 = scala.io.StdIn.readInt()
      compute(input1, input2, input3)
    }

  }


  def compute(input1:Int,input2:Int,input3:Int,input4:Int,input5:Int):Unit = {
    require(input3 !=0)
    require(input5 !=0)
    var x = new Calculator(input2, input3)
    var y = new Calculator(input4, input5)
  input1 match {
      case 1 => println("sum of " + x + " and " + y + " is " + x.add(y))
      case 2 => println("difference of " + x + " and " + y + " is " + x.sub(y))
      case 3 => println("Multiplication of " + x + " and " + y + " is " + x.mult(y))
      case 4 => println("Division of " + x + " and " + y + " is " + x.divide(y))
  }

  }

  def compute(input1:Int,input2:Int,input3:Int):Unit = {
    var x = new Calculator(input2)
    var y = new Calculator(input3)
    var cal = new Calculator(input2,input3)
    input1 match {
      case 5 => println("sum of " + x + " and " + y + " is " + x.add(y))
      case 6 => println("difference of " + x + " and " + y + " is " + x.sub(y))
      case 7 => println("Multiplication of " + x + " and " + y + " is " + x.mult(y))
      case 8 => println("Division of " + x + " and " + y + " is " + x.divide(y))
      case 9 => println("GCD of " + x + " and " + y + " is " + cal.gcd(input2,input3))
    }
  }

  def main(args: Array[String]): Unit = {
    var i=0
   while (i==0){
     Options()
   }
  }

}
