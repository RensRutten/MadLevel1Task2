package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding
    class MainActivity : AppCompatActivity() {
        private lateinit var binding: ActivityMainBinding

        /**
         * Set starting number of good asnwer to 0
         */
        var startNumber = 0

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            /**
             * when the submit button is pushed, set startnumber back to 0 otherwise u get higher numbers then 0
                check all the answer if they are right and give back answer
             */
            binding.SubmitBtn.setOnClickListener {
                startNumber = 0
                checkAnswer1()
                checkAnswer2()
                checkAnswer3()
                checkAnswer4()
                giveanswer()

            }

        }

        /**
         * Bind Answer1 block and adding up the startnumber with 1, when the answer is T
         * add up zero if the answer is Wrong
         */
        private fun checkAnswer1() {
            val answer = binding.Answer1.text.toString()

            if (answer == "T") {
                startNumber += 1
            } else {
                startNumber + 0
            }
        }
        /**
         * Bind Answer2 block and adding up the startnumber with 1, when the answer is F
         * add up zero if the answer is Wrong
         */
        private fun checkAnswer2() {
            val answer = binding.Answer2.text.toString()

            if (answer == "F") {
                startNumber += 1
            } else {
                startNumber + 0
            }
        }
        /**
         * Bind Answer3 block and adding up the startnumber with 1, when the answer is F
         * add up zero if the answer is Wrong
         */
        private fun checkAnswer3() {
            val answer = binding.Answer3.text.toString()

            if (answer == "F") {
                startNumber += 1
            } else {
                startNumber + 0
            }
        }
        /**
         * Bind Answer4 block and adding up the startnumber with 1, when the answer is F
         * add up zero if the answer is Wrong
         */
        private fun checkAnswer4() {
            val answer = binding.Answer4.text.toString()

            if (answer == "F") {
                startNumber += 1
            } else {
                startNumber + 0
            }
        }

        /**
         * Give back the how many answers are good in a toast message
         */
        private fun giveanswer (){
            Toast.makeText(this, getString(R.string.Check_answer, startNumber), Toast.LENGTH_LONG).show()
        }
    }
