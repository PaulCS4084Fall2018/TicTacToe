package com.example.delaney.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TicTacToeGame mGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGame = new TicTacToeGame(this);

    }

    public void pressedSquare (View view){
        String tagAsString = view.getTag().toString();
        int tagAsInt = Integer.parseInt(tagAsString);

    }

    public void pressedNewGame (View view){
       // Toast.makeText(this, "New Game", Toast.LENGTH_SHORT).show();




    }
}
