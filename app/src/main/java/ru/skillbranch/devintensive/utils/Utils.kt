package ru.skillbranch.devintensive.utils

object Utils { //task 1 done
    fun parseFullName(fullName:String?):Pair<String?,String?>{
        val parts:List<String>?
        if ((fullName=="")||(fullName==" "))
            parts = null
        else
            parts = fullName?.split(" ")

        val firstName =parts?.getOrNull(0)
        val lastName =parts?.getOrNull(1)
        return firstName to lastName //Pair(firstName,lastName)
    }

    fun toInintials(firstName: String?, lastName: String?): String? {
        return "${firstName?.get(0)}${lastName?.get(0)}"
    }

    fun transliteration(payload: String, devider:String = " "): String {

       // var latinSimbol = ""
        var stroka = ""

        for (i in payload){
            var latinSimbol =
           when(i.toLowerCase()){
               'а'-> "a"
               'б'-> "b"
               'в'-> "v"
               'г'-> "g"
               'д'-> "d"
               'е'-> "e"
               'ё'-> "e"
               'ж'-> "zh"
               'з'-> "z"
               'и'-> "i"
               'й'-> "i"
               'к'-> "k"
               'л'-> "l"
               'м'-> "m"
               'н'-> "n"
               'о'-> "o"
               'п'-> "p"
               'р'-> "r"
               'с'-> "s"
               'т'-> "t"
               'у'-> "u"
               'ф'-> "f"
               'х'-> "h"
               'ц'-> "c"
               'ч'-> "ch"
               'ш'-> "sh"
               'щ'-> "sh'"
               'ъ'-> ""
               'ы'-> "i"
               'ь'-> ""
               'э'-> "e"
               'ю'-> "yu"
               'я'-> "ya"
               ' '->devider
               else -> i.toString()
           }
            if (Character.isUpperCase(i))
                stroka += latinSimbol.toUpperCase()
            else
                stroka +=latinSimbol
        }
        return stroka




    }
}