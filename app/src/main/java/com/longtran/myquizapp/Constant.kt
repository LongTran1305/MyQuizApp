package com.longtran.myquizapp

object Constant{
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()
    //  TODO:Question 1
        val ques1 = Question(
            1,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,"Argentina",
            "Iceland",
            "Brazil",
            "Morocco",1)

    //  TODO:Question 2
        val ques2 = Question(
            2,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_australia,"Korea",
            "US",
            "France",
            "Australia",4)

    //  TODO:Question 3
        val ques3 = Question(
            3,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_belgium,"China",
            "Belgium",
            "Spain",
            "Thailand",2)

    //  TODO:Question 4
        val ques4 = Question(
            4,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_brazil,"Finland",
            "Hungary",
            "Brazil",
            "Russia",3)

    //  TODO:Question 5
        val ques5 = Question(
            5,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_denmark,"Poland",
            "Turkey",
            "Myanmar",
            "Denmark",4)

    //  TODO:Question 6
        val ques6 = Question(
            6,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_fiji,"Fiji",
            "Iceland",
            "Indonesia",
            "Japan",1)

    //  TODO:Question 7
        val ques7 = Question(
            7,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_india,"Pakistan",
            "Israel",
            "India",
            "Egypt",3)

    //  TODO:Question 8
        val ques8 = Question(
            8,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_kuwait,"Paraguay",
            "Kuwait",
            "Brazil",
            "Mongol",2)

    //  TODO:Question 9
        val ques9 = Question(
            9,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_new_zealand,"Zimbabwe",
            "Iceland",
            "Bulgaria",
            "New Zealand",4)

    //  TODO:Question 10
        val ques10 = Question(
            10,
            "What country does this flag belong to",
            R.drawable.ic_flag_of_germany,"Cuba",
            "United Kingdom",
            "Germany",
            "Italy",3)

        questionList.add(ques1)
        questionList.add(ques2)
        questionList.add(ques3)
        questionList.add(ques4)
        questionList.add(ques5)
        questionList.add(ques6)
        questionList.add(ques7)
        questionList.add(ques8)
        questionList.add(ques9)
        questionList.add(ques10)
        return questionList
    }
}