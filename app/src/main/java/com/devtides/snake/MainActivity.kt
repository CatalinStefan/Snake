package com.devtides.snake

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onUp(v: View) {
        gameManager.move(Direction.UP)
    }

    fun onDown(v: View) {
        gameManager.move(Direction.DOWN)
    }

    fun onLeft(v: View) {
        gameManager.move(Direction.LEFT)
    }

    fun onRight(v: View) {
        gameManager.move(Direction.RIGHT)
    }

    fun onGameStart(v: View) {
        score.text = "0"
        gameOver.visibility = View.GONE
        gameManager.initGame()
    }

    fun gameOver() {
        runOnUiThread {
            gameOver.visibility = View.VISIBLE
        }
    }

    fun updateScore(newScore: Int) {
        score.text = newScore.toString()
    }
}
