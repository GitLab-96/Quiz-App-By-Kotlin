package com.example.quizapp

object Constants {

    const val USER_NAME:String = "user_name"
    const val TOTAL_QUESTION:String = "total_question"
    const val CORRECT_ANSWERS:String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
         val questionList = ArrayList<Question>()

        val que1 = Question(1,"What country does this flag belong to ?",
            R.drawable.argentina_flag,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
             1)

        questionList.add(que1)

        val que2 = Question(2,"What country does this flag belong to ?",
            R.drawable.bangladeshflag,
            "Argentina",
            "Australia",
            "Bangladesh",
            "Austria",
            3)

        questionList.add(que2)
        val que3 = Question(3,"What country does this flag belong to ?",
            R.drawable.brazilflag,
            "Belarus",
            "Belize",
            "Brunei",
            "Brazil",
            4)

        questionList.add(que3)
        val que4 = Question(4,"What country does this flag belong to ?",
            R.drawable.belgioumflag,
            "Bahamas",
            "Belgioum",
            "Barbados",
            "Belize",
            2)

        questionList.add(que4)
        val que5 = Question(5,"What country does this flag belong to ?",
            R.drawable.fiji,
            "Gabon",
            "France",
            "Fiji",
            "Finland",
            3)

        questionList.add(que5)
        val que6 = Question(6,"What country does this flag belong to ?",
            R.drawable.garmanyflag,
            "Germany",
            "Georgia",
            "Greece",
            "none of these",
            1)

        questionList.add(que6)
        val que7 = Question(7,"What country does this flag belong to ?",
            R.drawable.denmark,
            "Domenica",
            "Egypt",
            "Denmark",
            "Ethiopia",
            3)

        questionList.add(que7)
        val que8 = Question(8,"What country does this flag belong to ?",
            R.drawable.indialfag,
            "Ireland",
            "Iran",
            "Hungary",
            "India",
            4)

        questionList.add(que8)
        val que9 = Question(9,"What country does this flag belong to ?",
            R.drawable.newzilanflag,
            "Argentina",
            "New Zealand",
            "Tuvalu",
            "United States of America",
            2)

        questionList.add(que9)
        val que10 = Question(10, "What country does this flag belong to ?",
            R.drawable.kwetflag,
            "Kuwait",
            "Jordan",
            "Sudan",
            "Palestine",
            1)

        questionList.add(que10)



        return questionList
    }
}