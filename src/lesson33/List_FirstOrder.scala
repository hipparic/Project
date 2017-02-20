package lesson33

/**
  * Created by hipparchus on 2017/2/20.
  * List FirstOrder
  */
object List_FirstOrder {
  def main(args: Array[String]) {
    println(List(1,2,3,4):::List(4,5,6,7,8):::List(10,11))
    println(List(1,2,3,4) ::: (List(4,5,6,7,8) ::: List(10,11)))
    println(List(1,2,3,4).length)

    val bigData = List("Hadoop", "Spark","Kaffka")
    //获取列表的最后一个元素
    println(bigData.last)
    //获取除最后一个元素之外的元素组成的新列表
    println(bigData.init)
    //由原列表反置后获得的新列表
    println(bigData.reverse)
    //列表的操作会生成新的列表而不是在原来的列表上进行修改
    println(bigData)

    //获取列表的前n个元素组成的新列表
    println(bigData take 2)
    //删除前n个元素后组成的新列表
    println(bigData drop 2)
    //列表进行分组，然后将分组结果组成新的列表，分组依据前n个元素为一组，剩余为一组
    println(bigData splitAt 2)
    //访问列表下表为n个元素
    println(bigData apply 2)
    //实际调用的是bigDate apply 2
    println(bigData(2))


    val data = List('a', 'b', 'c', 'd', 'e', 'f')
    //获取列表的索引，返回为Range类型
    println(data.indices)
    //将两个列表进行拉链操作
    println(data.indices zip data)
    //将列表的索引和数据进行组合，生成新的列表
    println(data.zipWithIndex)
    println(data.toString)
    //列表拼接成字符串，第一个参数为字符串的开头，第二个参数为链接符，第三个参数为结束符。只传入一个是默认参数为分隔符
    println(data.mkString("{",",","}"))
    //使用缓存数组StringBuilder对列表进行操作
    val buffer = new StringBuilder
    //addString arg1：缓存数组，arg2：拼接起始字符，arg3：链接字符，arg4：拼接结束符
    data addString (buffer,"{","**","}")
    println(buffer)
    println(data)
    //数组和列表转换
    val array = data.toArray
    println(array.toList)

    //列表与数组转换
    val new_Array = new Array[Char](10)
    //copyToArray arg1:要生成的新数组，arg2：从数组下标n开始拷贝
    data.copyToArray(new_Array,3)
    new_Array.foreach(print)
    println()

    //列表转换为Iterator
    val iterator = data.toIterator
    println(iterator.next)
    println(iterator.next)
  }
}
