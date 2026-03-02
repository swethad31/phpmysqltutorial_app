package com.example.phpandmysqltutorial.quiz;


import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.phpandmysqltutorial.quiz.QuizContract.*;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class QuizDBHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "MyAwesomeQuiz.db";
    private static final int DATABASE_VERSION = 1;

    private SQLiteDatabase db;

    public QuizDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + "(" +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT ," +
                QuestionsTable.COLUMN_OPTION2 + " TEXT ," +
                QuestionsTable.COLUMN_OPTION3 + " TEXT ," +
                QuestionsTable.COLUMN_ANSWER_NR + " INTEGER, " +
                QuestionsTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        fillQuestionsTable();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    public void fillQuestionsTable() {
        Question q1 = new Question("Easy: What does PHP stand for?",
                "a) persol hypertext processor","b) php : hypertext pre-processor","c) private home page", 2,Question.DIFFICULTY_EASY);
        addQuestion(q1);
        Question q2 = new Question("Easy: PHP server scripts are surrounded by delimiters, which?",
                "a) <script>……….</script>","b) <?php>……</?> ","c) <?php…..?>", 3,Question.DIFFICULTY_EASY);
        addQuestion(q2);
        Question q3 = new Question("Easy: How do you write 'Hello World' in PHP   ",
                "a) 'Hello world' ;","b) echo 'Hello world'; ","c) Document.Write('Hello world');", 3,Question.DIFFICULTY_EASY);
        addQuestion(q3);
        Question q4 = new Question("Easy: All variables in PHP start with which symbol?",
                "a) $","b) ! ", "c) & ", 1,Question.DIFFICULTY_EASY);
        addQuestion(q4);
        Question q5 = new Question("Easy: What is the correct way to end a PHP statement?",
                "a) New Line","b) </php> ","c) .", 2,Question.DIFFICULTY_EASY);
        addQuestion(q5);
        Question q6 = new Question("Easy: What is MySQL?",
                "a) A relational database management system","b) Cross platform,open source and free ","c) Developed,Distributed and supported by Oracle Corporation", 1,Question.DIFFICULTY_EASY);
        addQuestion(q6);
        Question q7 = new Question("Easy: Which MySQL statement is used to select data from a database?",
                "a) GET","b) POST","c) SELECT", 3,Question.DIFFICULTY_EASY);
        addQuestion(q7);
        Question q8 = new Question("Easy: Which MySQL statement is used to update data in a database?",
                "a) SELECT","b) DELETE ","c) UPDATE", 3,Question.DIFFICULTY_EASY);
        addQuestion(q8);
        Question q9 = new Question("Easy: Which MySQL statement is used to delete data from a database?",
                "a) DELETE","b) COLLAPSE ","c) MODIFY", 1,Question.DIFFICULTY_EASY);
        addQuestion(q9);

        Question q10 = new Question("Easy: Which MYSQL statement is used to insert new data in a database?",
                "a) ADD NEW","b) INSERT INTO","c) INSERT NEW", 2,Question.DIFFICULTY_EASY);
        addQuestion(q10);
        Question q11 = new Question("Medium: The PHP syntax is most similar to:  ",
                "a) VB Script","b) Perl and C","c)JavaScript", 2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q11);
        Question q12 = new Question("Medium: How do you get information from a form that is submitted using the 'get' method?",
                "a)$_GET[];","b) Request.Form; ","c) Request.Query;", 1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q12);
        Question q13 = new Question("Medium: What is the correct way to include the file 'time.inc' ?   ",
                "a)<?php include 'time.inc' ; ?>  ","b)<?php include file='time.inc'; ?> ","c)<!-- include file='time.inc' -->", 1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q13);
        Question q14 = new Question("Medium: What is the correct way to create a function in PHP?",
                "a) new_function myFunction()","b) create myFunction() ", "c) function myFunction()  ", 3,Question.DIFFICULTY_MEDIUM);
        addQuestion(q14);
        Question q15 = new Question("Medium: What is the correct way to open the file 'time.txt' as readable?",
                "a) open('time.txt','read');","b) fopen('time.txt','r+'); ","c) fopen('time.txt','r');", 3,Question.DIFFICULTY_MEDIUM);
        addQuestion(q15);
        Question q16 = new Question("Medium: With MySQL, how do you select a column named 'FirstName' from a table named 'Persons'?",
                "a) EXTRACT FirstName FROM Persons","b) SELECT FirstName FROM Persons   ","c) SELECT Persons.FirstName", 2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q16);
        Question q17 = new Question("Medium: With MySQL, how do you select all the columns from a table named 'Persons'?",
                "a) SELECT * FROM Persons ","b) SELECT [all] FROM Persons","c) SELECT *.Persons", 1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q17);
        Question q18 = new Question("Medium: Which MySQL statement is used to return only different values?",
                "a) SELECT DISTINCT ","b) SELECT UNIQUE ","c) SELECT DIFFERENT", 1,Question.DIFFICULTY_MEDIUM);
        addQuestion(q18);
        Question q19 = new Question("Medium: Which MySQL keyword is used to sort the result-set?",
                "a) SORT BY","b) ORDER BY","c) ORDER", 2,Question.DIFFICULTY_MEDIUM);
        addQuestion(q19);

        Question q20 = new Question("Medium: How can you return the number of records in the 'Persons' table?",
                "a) SELECT COLUMNS(*) FROM Persons","b) SELECT NO(*) FROM Persons","c) SELECT COUNT(*) FROM Persons ", 3,Question.DIFFICULTY_MEDIUM);
        addQuestion(q20);
        Question q21 = new Question("Hard: What is the correct way to add 1 to the $count variable?",
                "a) $count =+1","b) $count++;","c) count++;", 2,Question.DIFFICULTY_HARD);
        addQuestion(q21);
        Question q22 = new Question("Hard: What is a correct way to add a comment in PHP?",
                "a) <comment>...</comment>","b) <!--...-->","c) /*...*/ ", 3,Question.DIFFICULTY_HARD);
        addQuestion(q22);
        Question q23 = new Question("Hard: Which one of these variables has an illegal name?",
                "a) $my-Var","b) $my_Var","c) $myVar", 1,Question.DIFFICULTY_HARD);
        addQuestion(q23);
        Question q24 = new Question("Hard: How do you create a cookie in PHP?",
                "a) setcookie()","b) makecookie()", "c) createcookie", 1,Question.DIFFICULTY_HARD);
        addQuestion(q24);
        Question q25 = new Question("Hard: How do you create an array in PHP?",
                "a) $cars = 'Volvo', 'BMW', 'Toyota';","b) $cars = array('Volvo', 'BMW', 'Toyota');   ","c) $cars = array['Volvo', 'BMW', 'Toyota'];", 2,Question.DIFFICULTY_HARD);
        addQuestion(q25);
        Question q26 = new Question("Hard: Which operator is used to select values within a given range?",
                "a) UNION","b) BETWEEN","c) UNION", 2,Question.DIFFICULTY_HARD);
        addQuestion(q26);
        Question q27 = new Question("Hard: Which operator is used to search for a specified pattern in a column?",
                "a) FROM","b) GET","c) LIKE", 3,Question.DIFFICULTY_HARD);
        addQuestion(q27);
        Question q28 = new Question("Hard: Which MySQL statement is used to create a database table called 'Customers'?",
                "a) CREATE DB Customers","b) CREATE DATABASE TABLE Customers","c) CREATE TABLE Customers", 3,Question.DIFFICULTY_HARD);
        addQuestion(q28);
        Question q29 = new Question("Hard: How can you delete the records where the 'FirstName' is 'Peter' in the Persons Table?",
                "a) DELETE FROM Persons WHERE FirstName = 'Peter'","b) DELETE ROW FirstName='Peter' FROM Persons","c) DELETE FirstName='Peter' FROM Persons", 1,Question.DIFFICULTY_HARD);
        addQuestion(q29);

        Question q30 = new Question("Hard: With MySQL, how can you insert 'Olsen' as the 'LastName' in the 'Persons' table?",
                "a) INSERT INTO Persons ('Olsen') INTO LastName","b) INSERT INTO Persons (LastName) VALUES ('Olsen')","c) INSERT ('Olsen') INTO Persons (LastName)", 2,Question.DIFFICULTY_HARD);
        addQuestion(q30);

    }

    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        cv.put(QuestionsTable.COLUMN_DIFFICULTY, question.getDifficulty());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    @SuppressLint("Range")
    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    @SuppressLint("Range")
    public ArrayList<Question> getQuestions(String difficulty) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_DIFFICULTY + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_DIFFICULTY)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}
