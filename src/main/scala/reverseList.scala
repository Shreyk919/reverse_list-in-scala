import scala.annotation.tailrec

object reverseList {


  @tailrec
  //method to reverse list using tail recursion
  def reverseList(arr:List[Int], revList:List[Int]):List[Int] = arr match {   //here, execution of pattern matching block on the input variale arr
    
    
    case head :: tail => reverseList(tail,  head :: revList)        /*Here, tail recursion is used to reverse the input list
                                                                      The last call of the method is recursive	
                                                                    */
    
    case Nil => revList         //if the input List is empty, new list is returned
  }

  def main(args: Array[String]): Unit={
    val nums: List[Int] = List(1, 2, 3, 4, 5)
    
    //function call to reverseList and input is send
    println("Reversed List is: " + reverseList(nums,Nil))       //Nil is used to send an empty list in case input list is empty
  }


}
