package tv.bangumi.regex

import java.util.regex.Pattern

/**
 * @author 朱峰 2019/8/8
 */
class Test {
    companion object {
//---------------------第一组----------------------------------------
//        val pattern = Pattern.compile("Ben")
//        val str = "My name is Ben, BenBen Bengi"

//        val pattern = Pattern.compile("c.t")
//        val str = "cat cot sdasdfasfas c   t   ct  c.t"

        //        val pattern = Pattern.compile(".a.")
//        val pattern = Pattern.compile(".a.\\\\.xls")
//        val pattern = Pattern.compile("[ns]a.\\.xls")
//        val pattern = Pattern.compile("[ns]a[0-9]\\.xls")
//        val pattern = Pattern.compile("[ns]a\\d\\.xls")
//        val pattern = Pattern.compile("[ns]a\\D\\.xls")
//        val pattern = Pattern.compile("[ns]a.\\.xls")
//        val pattern = Pattern.compile("[ns]a[^02]\\.xls")
//
//        val str = "scale1.xls order3.xls scales2.xls apac1.xls europe2.xls na1.xls na2.xls sa1\\.xls cal.xls sam.xls"

//---------------------第二组----------------------------------------
//                val pattern = Pattern.compile("#[A-Z0-9a-z][A-Z0-9a-z][A-Z0-9a-z][A-Z0-9a-z][A-Z0-9a-z][A-Z0-9a-z]");
//        val pattern = Pattern.compile("#[A-Z0-9a-z]{6}")
//        val str = "    <color name=\"alpha_10_black\">#1A000000</color>\n" +
//                "    <color name=\"alpha_15_black\">#26000000</color>\n" +
//                "    <color name=\"alpha_20_black\">#33000000</color>\n" +
//                "    <color name=\"alpha_25_black\">#40000000</color>\n" +
//                "    <color name=\"alpha_30_black\">#4D000000</color>\n" +
//                "    <color name=\"alpha_35_black\">#59000000</color>\n" +
//                "    <color name=\"alpha_40_black\">#66000000</color>\n" +
//                "    <color name=\"alpha_45_black\">#73000000</color>\n" +
//                "    <color name=\"alpha_50_black\">#80000000</color>\n" +
//                "    <color name=\"alpha_55_black\">#8C000000</color>\n" +
//                "    <color name=\"alpha_60_black\">#99000000</color>";


        //---------------------第三组----------------------------------------
//        val pattern  = Pattern.compile("myArray[0]");
//        val pattern  = Pattern.compile("myArray\\[0\\]");
//        val pattern  = Pattern.compile("myArray\\[[0-9]\\]");
//        val str = "asdasdasdasdas myArray[0] myArray[2] myArray[1]"

        //---------------------第四组----------------------------------------
//        val pattern  = Pattern.compile("\\\\");
//        val str = "a\\b\\c\\d"
        //---------------------第四组----------------------------------------
//        val pattern = Pattern.compile("\t");
//        val pattern = Pattern.compile("\\s");
//        val str = "a,b,c \r\n\r\n   asdas"
        //---------------------第五组----------------------------------------
//        val pattern = Pattern.compile("\\w\\d\\w\\d\\w\\d");
//        val pattern = Pattern.compile("[a-zA-Z0-9_]\\d\\w\\d\\w\\d");
//        val pattern = Pattern.compile("[[:almum:]]\\d\\w\\d\\w\\d");
//        val str = "a1b2c3 sdfas  fasssa"
        //---------------------第六组----------------------------------------
//        val pattern = Pattern.compile("\\w+@\\w+\\.\\w+")
//        val pattern = Pattern.compile("[\\w.]+@[\\w.]+\\.\\w+")
//        val pattern = Pattern.compile("[\\w.]+@[\\w.]+\\.\\w+")
//        val pattern = Pattern.compile("\\w+[\\w]*@[\\w.]+\\.\\w+")
//        val str = "abc.a1b2c3@qq.com sdfas  fasssa@gmail.com asdasdasdasd  .fasssa@gmail.com"
        //---------------------第七组----------------------------------------
//        val pattern = Pattern.compile("http[s]?://[\\w./]+")
//        val str = "http://asdasd/asdasa  https://asdadas/dasdasd/daaa"
//        //---------------------第八组----------------------------------------
//        val pattern = Pattern.compile("\\d{1,2}[-\\/]\\d{1,2}[-\\/]\\d{2,4}")
//        val str = "11-11-2014 11-11-11 11/11/2014 11\\11\\11 2-2-2  2/2/2 "
        //---------------------第九组----------------------------------------
//        val pattern = Pattern.compile("\\d{4}\\:\\$\\d{3,}\\.?\\d{0,2}")
//        val str = "1001:\$455.23 1001:\$55.23 1001:\$455 1001:\$45.23 1001:\$45500000.23"
        //---------------------第十组----------------------------------------
//        val pattern = Pattern.compile("<[Bb]>.*?<\\/[Bb]>")
//        val str = "<B>hr</B> <B>hhhahahaha</B>"
        //---------------------单词边界----------------------------------------
//        val pattern = Pattern.compile("cat")
//        val pattern = Pattern.compile("\\bcat")
//        val pattern = Pattern.compile("cat\\b")
//        val pattern = Pattern.compile("\\bcat\\b")
//        val pattern = Pattern.compile("\\B-\\B")
//        val str = "cat  cation sdacatksafas"
//        val str = "cat  cat-ion - sdacatksafas-"
        //---------------------字符串边界----------------------------------------
//        val pattern = Pattern.compile("<\\?xml.*?\\?>")
//        val pattern = Pattern.compile("^\\s*<\\?xml.*?\\?>")
//        val pattern = Pattern.compile("<\\/[Hh][Tt][Mm][Ll]>\\s*$")
//        val str = "adasdadada <?xml type=a ?>"
//        val str = "     <?xml type=a ?>   dasdasasgfd  <?xml type=a ?>"
//        val str = "     <?xml type=a </html>      asdasdasda  <?xml type=a </html>    "
        //---------------------子表达式----------------------------------------
//        val pattern = Pattern.compile("(&nbsp;){2,}")
//        val pattern = Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}")
//        val pattern = Pattern.compile("(19|20)\\d{2}")
//        val pattern =
//            Pattern.compile("(((\\d{1,2})|(1\\d{2})|(2[0,4]\\d)|(25[0,5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0,4]\\d)|(25[0,5]))")
        //        val str = "windows&nbsp;&nbsp;2003"
//        val str = "128.163.22.2 adasdsadasdas"
//        val str = "1980-2-16   2080-5-30 1111-11-11"
//        val str = "128.163.22.2 265.255.25.2 adasdsadasdas"
        //---------------------回溯引用---------------------------------------
//        val pattern = Pattern.compile("[ ]+(\\w+)[ ]+\\1")
//        val str = "jsada  of of ada  te te aaasddlf  ogd"
//        val pattern = Pattern.compile("<[hH]([1-6])>.*?</[hH]\\1>")
//        val str = "<H1>dasdasdas</H1> adasdasdas<H2>sfasfasasas</h2>  dasdasdsdas<H2>dasdasasdas</h3>"
        //---------------------回溯引用替换---------------------------------------
        val regex = Regex("#[\\d\\w]{8}")
        val str = "#59000000  of of #59000000  te te #59000000  ogd"


        @JvmStatic
        fun main(args: Array<String>) {
//            val matcher = pattern.matcher(str)
//            while (matcher.find()) {
//                println("${matcher.group()},start=${matcher.start()},end=${matcher.end()}")
//            }
            println(str.replace(regex,{
                 "<h>${it.value}<\\h>"
            }))
        }
    }
}