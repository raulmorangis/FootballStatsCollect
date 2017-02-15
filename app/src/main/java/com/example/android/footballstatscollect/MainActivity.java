package com.example.android.footballstatscollect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static com.example.android.footballstatscollect.R.id.goalsTeamA;
import static com.example.android.footballstatscollect.R.id.yellowCardTeamA;

public class MainActivity extends AppCompatActivity {


    int goalsTeamA = 0;
    int yellowCardsTeamA = 0;
    int redCardsTeamA = 0;
    int foulsTeamA = 0;
    int shotsTeamA = 0;
    int shotsOnTargetTeamA = 0;
    int passesTeamA = 0;
    int cornersTeamA = 0;
    int injuriesTeamA = 0;

    int goalsTeamB = 0;
    int yellowCardsTeamB = 0;
    int redCardsTeamB = 0;
    int foulsTeamB = 0;
    int shotsTeamB = 0;
    int shotsOnTargetTeamB = 0;
    int passesTeamB = 0;
    int cornersTeamB = 0;
    int injuriesTeamB = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onSaveInstanceState(Bundle savedIsntanceState) {

        savedIsntanceState.putInt("GoalsTeamA", goalsTeamA);
        savedIsntanceState.putInt("YellowCardsTeamA", yellowCardsTeamA);
        savedIsntanceState.putInt("redCardsTeamA", redCardsTeamA);
        savedIsntanceState.putInt("foulsTeamA", foulsTeamA);
        savedIsntanceState.putInt("shotsTeamA", shotsTeamA);
        savedIsntanceState.putInt("shotsOnTargetTeamA", shotsOnTargetTeamA);
        savedIsntanceState.putInt("passesTeamA", passesTeamA);
        savedIsntanceState.putInt("cornersTeamA", cornersTeamA);
        savedIsntanceState.putInt("injuriesTeamA", injuriesTeamA);

        savedIsntanceState.putInt("GoalsTeamB", goalsTeamB);
        savedIsntanceState.putInt("YellowCardsTeamB", yellowCardsTeamB);
        savedIsntanceState.putInt("redCardsTeamB", redCardsTeamB);
        savedIsntanceState.putInt("foulsTeamB", foulsTeamB);
        savedIsntanceState.putInt("shotsTeamB", shotsTeamB);
        savedIsntanceState.putInt("shotsOnTargetTeamB", shotsOnTargetTeamB);
        savedIsntanceState.putInt("passesTeamB", passesTeamB);
        savedIsntanceState.putInt("cornersTeamB", cornersTeamB);
        savedIsntanceState.putInt("injuriesTeamB", injuriesTeamB);

        super.onSaveInstanceState(savedIsntanceState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedIsntanceState) {
        super.onRestoreInstanceState(savedIsntanceState);
        goalsTeamA = savedIsntanceState.getInt("GoalsTeamA");
        displayGoalsTeamA(goalsTeamA);
        yellowCardsTeamA = savedIsntanceState.getInt("YellowCardsTeamA");
        displayYellowCardsTeamA(yellowCardsTeamA);
        redCardsTeamA = savedIsntanceState.getInt("redCardsTeamA");
        displayredCardsTeamA(redCardsTeamA);
        foulsTeamA = savedIsntanceState.getInt("foulsCardsTeamA");
        displayfoulsTeamA(foulsTeamA);
        shotsTeamA = savedIsntanceState.getInt("shotsTeamA");
        displayShotsTeamA(shotsTeamA);
        shotsOnTargetTeamA = savedIsntanceState.getInt("shotsOnTargetTeamA");
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
        passesTeamA = savedIsntanceState.getInt("passesTeamA");
        displayPassesTeamA(passesTeamA);
        cornersTeamA = savedIsntanceState.getInt("cornersTeamA");
        displayCornersTeamA(cornersTeamA);
        injuriesTeamA = savedIsntanceState.getInt("injuriesTeamA");
        displayInjuriesTeamA(injuriesTeamA);


        goalsTeamB = savedIsntanceState.getInt("GoalsTeamB");
        displayGoalsTeamB(goalsTeamB);
        yellowCardsTeamB = savedIsntanceState.getInt("YellowCardsTeamB");
        displayYellowCardsTeamB(yellowCardsTeamB);
        redCardsTeamB = savedIsntanceState.getInt("redCardsTeamB");
        displayredCardsTeamB(redCardsTeamB);
        foulsTeamB = savedIsntanceState.getInt("foulsCardsTeamB");
        displayfoulsTeamB(foulsTeamB);
        shotsTeamB = savedIsntanceState.getInt("shotsTeamB");
        displayShotsTeamB(shotsTeamB);
        shotsOnTargetTeamB = savedIsntanceState.getInt("shotsOnTargetTeamB");
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
        passesTeamB = savedIsntanceState.getInt("passesTeamB");
        displayPassesTeamB(passesTeamB);
        cornersTeamB = savedIsntanceState.getInt("cornersTeamB");
        displayCornersTeamB(cornersTeamB);
        injuriesTeamB = savedIsntanceState.getInt("injuriesTeamB");
        displayInjuriesTeamB(injuriesTeamB);



    }






    /** GOALS TEAM A




    /**
     * This method is called when the + button (GoalsTeamA) is clicked.
     */
    public void addUnitGoalsTeamA(View view) {

        goalsTeamA = goalsTeamA + 1;
        displayGoalsTeamA(goalsTeamA);
    }

    /**
     * This method is called when the - button (GoalsTeamA) is clicked.
     */
    public void restUnitGoalsTeamA(View view) {

        if (goalsTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 goals", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        goalsTeamA = goalsTeamA - 1;
        displayGoalsTeamA(goalsTeamA);
    }


    /**
     * This method displays the goals of Team A.
     */
    private void displayGoalsTeamA(int resultTeamA) {
        TextView goalsTeamATextView = (TextView) findViewById(R.id.goalsTeamA);
        goalsTeamATextView.setText("" + resultTeamA);
    }


    /** YELLOWCARDS TEAM A




    /**
     * This method is called when the + button (yellowCardsTeamA) is clicked.
     */
    public void addUnitYellowCardsTeamA(View view) {

        yellowCardsTeamA = yellowCardsTeamA + 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }

    /**
     * This method is called when the - button (yellowCardsTeamA) is clicked.
     */
    public void restUnitYellowCardsTeamA(View view) {

        if (yellowCardsTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 yellow cards", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        yellowCardsTeamA = yellowCardsTeamA - 1;
        displayYellowCardsTeamA(yellowCardsTeamA);
    }


    /**
     * This method is called when the - + button (yellowCardsTeamA) is clicked.
     */
    private void displayYellowCardsTeamA(int yellowCardTeamA) {
        TextView yellowCardsTeamATextView = (TextView) findViewById(R.id.yellowCardTeamA);
        yellowCardsTeamATextView.setText("" + yellowCardTeamA);
    }






    /** REDCARDS TEAM A




     /**
     * This method is called when the + button (redCardsTeamA) is clicked.
     */
    public void addUnitRedCardsTeamA(View view) {

        redCardsTeamA = redCardsTeamA + 1;
        displayredCardsTeamA(redCardsTeamA);
    }

    /**
     * This method is called when the - button (redCardsTeamA) is clicked.
     */
    public void restUnitRedCardsTeamA(View view) {

        if (redCardsTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 red cards", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        redCardsTeamA = redCardsTeamA - 1;
        displayredCardsTeamA(redCardsTeamA);
    }


    /**
     * This method is called when the - + button (redCardsTeamA) is clicked.
     */
    private void displayredCardsTeamA(int redCardTeamA) {
        TextView redCardsTeamATextView = (TextView) findViewById(R.id.redCardsTeamA);
        redCardsTeamATextView.setText("" + redCardTeamA);
    }



    /** FOULS TEAM A




     /**
     * This method is called when the + button (foulsTeamA) is clicked.
     */
    public void addUnitFoulsTeamA(View view) {

        foulsTeamA = foulsTeamA + 1;
        displayfoulsTeamA(foulsTeamA);
    }

    /**
     * This method is called when the - button (foulsTeamA) is clicked.
     */
    public void restUnitFoulsTeamA(View view) {

        if (foulsTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 fouls", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        foulsTeamA = foulsTeamA - 1;
        displayfoulsTeamA(foulsTeamA);
    }


    /**
     * This method is called when the - + button (foulsTeamA) is clicked.
     */
    private void displayfoulsTeamA(int foulTeamA) {
        TextView foulsTeamATextView = (TextView) findViewById(R.id.foulsTeamA);
        foulsTeamATextView.setText("" + foulTeamA);
    }





    /** SHOTS TEAM A




     /**
     * This method is called when the + button (shotsTeamA) is clicked.
     */
    public void addUnitShotsTeamA(View view) {

        shotsTeamA = shotsTeamA + 1;
        displayShotsTeamA(shotsTeamA);
    }

    /**
     * This method is called when the - button (shotsTeamA) is clicked.
     */
    public void restUnitShotsTeamA(View view) {

        if (shotsTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 shots", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        shotsTeamA = shotsTeamA - 1;
        displayShotsTeamA(shotsTeamA);
    }


    /**
     * This method is called when the - + button (shotsTeamA) is clicked.
     */
    private void displayShotsTeamA(int shotTeamA) {
        TextView shotsTeamATextView = (TextView) findViewById(R.id.shotsTeamA);
        shotsTeamATextView.setText("" + shotTeamA);
    }





    /** SHOTS ON TARGET TEAM A




     /**
     * This method is called when the + button (shotsOnTargetTeamA) is clicked.
     */
    public void addUnitShotsOnTargetTeamA(View view) {

        shotsOnTargetTeamA = shotsOnTargetTeamA + 1;
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
    }

    /**
     * This method is called when the - button (shotsOnTargetTeamA) is clicked.
     */
    public void restUnitShotsOnTargetTeamA(View view) {

        if (shotsOnTargetTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 shots on target", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        shotsOnTargetTeamA = shotsOnTargetTeamA - 1;
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
    }


    /**
     * This method is called when the - + button (shotsOnTargetTeamA) is clicked.
     */
    private void displayShotsOnTargetTeamA(int shotOnTargetTeamA) {
        TextView shotsOnTargetTeamATextView = (TextView) findViewById(R.id.shotsOnTargetTeamA);
        shotsOnTargetTeamATextView.setText("" + shotOnTargetTeamA);
    }





    /** PASSES TEAM A




     /**
     * This method is called when the + button (passesTeamA) is clicked.
     */
    public void addUnitPassesTeamA(View view) {

        passesTeamA = passesTeamA + 1;
        displayPassesTeamA(passesTeamA);
    }

    /**
     * This method is called when the - button (passesTeamA) is clicked.
     */
    public void restUnitPassesTeamA(View view) {

        if (passesTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 passes", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        passesTeamA = passesTeamA - 1;
        displayPassesTeamA(passesTeamA);
    }


    /**
     * This method is called when the - + button (passesTeamA) is clicked.
     */
    private void displayPassesTeamA(int passTeamA) {
        TextView passesTeamATextView = (TextView) findViewById(R.id.passesTeamA);
        passesTeamATextView.setText("" + passTeamA);
    }




    /** CORNERS TEAM A




     /**
     * This method is called when the + button (cornersTeamA) is clicked.
     */
    public void addUnitCornersTeamA(View view) {

        cornersTeamA = cornersTeamA + 1;
        displayCornersTeamA(cornersTeamA);
    }

    /**
     * This method is called when the - button (cornersTeamA) is clicked.
     */
    public void restUnitCornersTeamA(View view) {

        if (cornersTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 corners", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        cornersTeamA = cornersTeamA - 1;
        displayCornersTeamA(cornersTeamA);
    }


    /**
     * This method is called when the - + button (cornersTeamA) is clicked.
     */
    private void displayCornersTeamA(int cornerTeamA) {
        TextView cornersTeamATextView = (TextView) findViewById(R.id.cornersTeamA);
        cornersTeamATextView.setText("" + cornerTeamA);
    }




    /** INJURIES TEAM A




     /**
     * This method is called when the + button (injuriesTeamA) is clicked.
     */
    public void addUnitInjuriesTeamA(View view) {

        injuriesTeamA = injuriesTeamA + 1;
        displayInjuriesTeamA(injuriesTeamA);
    }

    /**
     * This method is called when the - button (injuriesTeamA) is clicked.
     */
    public void restUnitInjuriesTeamA(View view) {

        if (injuriesTeamA == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 injuries", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        injuriesTeamA = injuriesTeamA - 1;
        displayInjuriesTeamA(injuriesTeamA);
    }


    /**
     * This method is called when the - + button (injuriesTeamA) is clicked.
     */
    private void displayInjuriesTeamA(int injurieTeamA) {
        TextView injuriesTeamATextView = (TextView) findViewById(R.id.injuriesTeamA);
        injuriesTeamATextView.setText("" + injurieTeamA);
    }


















    /** GOALS TEAM B




     /**
     * This method is called when the + button (GoalsTeamB) is clicked.
     */
    public void addUnitGoalsTeamB(View view) {

        goalsTeamB = goalsTeamB + 1;
        displayGoalsTeamB(goalsTeamB);
    }

    /**
     * This method is called when the - button (GoalsTeamB) is clicked.
     */
    public void restUnitGoalsTeamB(View view) {

        if (goalsTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 goals", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        goalsTeamB = goalsTeamB - 1;
        displayGoalsTeamB(goalsTeamB);
    }


    /**
     * This method displays the goals of Team B.
     */
    private void displayGoalsTeamB(int resultTeamB) {
        TextView goalsTeamBTextView = (TextView) findViewById(R.id.goalsTeamB);
        goalsTeamBTextView.setText("" + resultTeamB);
    }


    /** YELLOWCARDS TEAM B




     /**
     * This method is called when the + button (yellowCardsTeamB) is clicked.
     */
    public void addUnitYellowCardsTeamB(View view) {

        yellowCardsTeamB = yellowCardsTeamB + 1;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }

    /**
     * This method is called when the - button (yellowCardsTeamB) is clicked.
     */
    public void restUnitYellowCardsTeamB(View view) {

        if (yellowCardsTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 yellow cards", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        yellowCardsTeamB = yellowCardsTeamB - 1;
        displayYellowCardsTeamB(yellowCardsTeamB);
    }


    /**
     * This method is called when the - + button (yellowCardsTeamB) is clicked.
     */
    private void displayYellowCardsTeamB(int yellowCardTeamB) {
        TextView yellowCardsTeamBTextView = (TextView) findViewById(R.id.yellowCardTeamB);
        yellowCardsTeamBTextView.setText("" + yellowCardTeamB);
    }






    /** REDCARDS TEAM B




     /**
     * This method is called when the + button (redCardsTeamB) is clicked.
     */
    public void addUnitRedCardsTeamB(View view) {

        redCardsTeamB = redCardsTeamB + 1;
        displayredCardsTeamB(redCardsTeamB);
    }

    /**
     * This method is called when the - button (redCardsTeamB) is clicked.
     */
    public void restUnitRedCardsTeamB(View view) {

        if (redCardsTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 red cards", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        redCardsTeamB = redCardsTeamB - 1;
        displayredCardsTeamB(redCardsTeamB);
    }


    /**
     * This method is called when the - + button (redCardsTeamB) is clicked.
     */
    private void displayredCardsTeamB(int redCardTeamB) {
        TextView redCardsTeamBTextView = (TextView) findViewById(R.id.redCardsTeamB);
        redCardsTeamBTextView.setText("" + redCardTeamB);
    }



    /** FOULS TEAM B




     /**
     * This method is called when the + button (foulsTeamB) is clicked.
     */
    public void addUnitFoulsTeamB(View view) {

        foulsTeamB = foulsTeamB + 1;
        displayfoulsTeamB(foulsTeamB);
    }

    /**
     * This method is called when the - button (foulsTeamA) is clicked.
     */
    public void restUnitFoulsTeamB(View view) {

        if (foulsTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 fouls", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        foulsTeamB = foulsTeamB - 1;
        displayfoulsTeamB(foulsTeamB);
    }


    /**
     * This method is called when the - + button (foulsTeamB) is clicked.
     */
    private void displayfoulsTeamB(int foulTeamB) {
        TextView foulsTeamBTextView = (TextView) findViewById(R.id.foulsTeamB);
        foulsTeamBTextView.setText("" + foulTeamB);
    }





    /** SHOTS TEAM B




     /**
     * This method is called when the + button (shotsTeamB) is clicked.
     */
    public void addUnitShotsTeamB(View view) {

        shotsTeamB = shotsTeamB + 1;
        displayShotsTeamB(shotsTeamB);
    }

    /**
     * This method is called when the - button (shotsTeamB) is clicked.
     */
    public void restUnitShotsTeamB(View view) {

        if (shotsTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 shots", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        shotsTeamB = shotsTeamB - 1;
        displayShotsTeamB(shotsTeamB);
    }


    /**
     * This method is called when the - + button (shotsTeamB) is clicked.
     */
    private void displayShotsTeamB(int shotTeamB) {
        TextView shotsTeamBTextView = (TextView) findViewById(R.id.shotsTeamB);
        shotsTeamBTextView.setText("" + shotTeamB);
    }





    /** SHOTS ON TARGET TEAM B




     /**
     * This method is called when the + button (shotsOnTargetTeamB) is clicked.
     */
    public void addUnitShotsOnTargetTeamB(View view) {

        shotsOnTargetTeamB = shotsOnTargetTeamB + 1;
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
    }

    /**
     * This method is called when the - button (shotsOnTargetTeamB) is clicked.
     */
    public void restUnitShotsOnTargetTeamB(View view) {

        if (shotsOnTargetTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 shots on target", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        shotsOnTargetTeamB = shotsOnTargetTeamB - 1;
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
    }


    /**
     * This method is called when the - + button (shotsOnTargetTeamB) is clicked.
     */
    private void displayShotsOnTargetTeamB(int shotOnTargetTeamB) {
        TextView shotsOnTargetTeamBTextView = (TextView) findViewById(R.id.shotsOnTargetTeamB);
        shotsOnTargetTeamBTextView.setText("" + shotOnTargetTeamB);
    }





    /** PASSES TEAM B




     /**
     * This method is called when the + button (passesTeamB) is clicked.
     */
    public void addUnitPassesTeamB(View view) {

        passesTeamB = passesTeamB + 1;
        displayPassesTeamB(passesTeamB);
    }

    /**
     * This method is called when the - button (passesTeamB) is clicked.
     */
    public void restUnitPassesTeamB(View view) {

        if (passesTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 passes", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        passesTeamB = passesTeamB - 1;
        displayPassesTeamB(passesTeamB);
    }


    /**
     * This method is called when the - + button (passesTeamB) is clicked.
     */
    private void displayPassesTeamB(int passTeamB) {
        TextView passesTeamBTextView = (TextView) findViewById(R.id.passesTeamB);
        passesTeamBTextView.setText("" + passTeamB);
    }




    /** CORNERS TEAM B




     /**
     * This method is called when the + button (cornersTeamB) is clicked.
     */
    public void addUnitCornersTeamB(View view) {

        cornersTeamB = cornersTeamB + 1;
        displayCornersTeamB(cornersTeamB);
    }

    /**
     * This method is called when the - button (cornersTeamB) is clicked.
     */
    public void restUnitCornersTeamB(View view) {

        if (cornersTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 corners", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        cornersTeamB = cornersTeamB - 1;
        displayCornersTeamB(cornersTeamB);
    }


    /**
     * This method is called when the - + button (cornersTeamB) is clicked.
     */
    private void displayCornersTeamB(int cornerTeamB) {
        TextView cornersTeamBTextView = (TextView) findViewById(R.id.cornersTeamB);
        cornersTeamBTextView.setText("" + cornerTeamB);
    }




    /** INJURIES TEAM B




     /**
     * This method is called when the + button (injuriesTeamB) is clicked.
     */
    public void addUnitInjuriesTeamB(View view) {

        injuriesTeamB = injuriesTeamB + 1;
        displayInjuriesTeamB(injuriesTeamB);
    }

    /**
     * This method is called when the - button (injuriesTeamB) is clicked.
     */
    public void restUnitInjuriesTeamB(View view) {

        if (injuriesTeamB == 0) {
            //show an error message as a toast
            Toast.makeText(this, "You cannot have less than 0 injuries", Toast.LENGTH_SHORT).show();
            //Exit this method early because there´ nothing left to do
            return;
        }

        injuriesTeamB = injuriesTeamB - 1;
        displayInjuriesTeamB(injuriesTeamB);
    }


    /**
     * This method is called when the - + button (injuriesTeamA) is clicked.
     */
    private void displayInjuriesTeamB(int injurieTeamB) {
        TextView injuriesTeamBTextView = (TextView) findViewById(R.id.injuriesTeamB);
        injuriesTeamBTextView.setText("" + injurieTeamB);
    }



    /**
     * This method is called when the reset button is clicked.
     */
    public void resetMatch(View v) {

        goalsTeamA = 0;
        yellowCardsTeamA = 0;
        redCardsTeamA = 0;
        foulsTeamA = 0;
        shotsTeamA = 0;
        shotsOnTargetTeamA = 0;
        passesTeamA = 0;
        cornersTeamA = 0;
        injuriesTeamA = 0;

        goalsTeamB = 0;
        yellowCardsTeamB = 0;
        redCardsTeamB = 0;
        foulsTeamB = 0;
        shotsTeamB = 0;
        shotsOnTargetTeamB = 0;
        passesTeamB = 0;
        cornersTeamB = 0;
        injuriesTeamB = 0;

        displayGoalsTeamA(goalsTeamA);
        displayYellowCardsTeamA(yellowCardsTeamA);
        displayredCardsTeamA(redCardsTeamA);
        displayfoulsTeamA(foulsTeamA);
        displayShotsTeamA(shotsTeamA);
        displayShotsOnTargetTeamA(shotsOnTargetTeamA);
        displayPassesTeamA(passesTeamA);
        displayCornersTeamA(cornersTeamA);
        displayInjuriesTeamA(injuriesTeamA);


        displayGoalsTeamB(goalsTeamB);
        displayYellowCardsTeamB(yellowCardsTeamB);
        displayredCardsTeamB(redCardsTeamB);
        displayfoulsTeamB(foulsTeamB);
        displayShotsTeamB(shotsTeamB);
        displayShotsOnTargetTeamB(shotsOnTargetTeamB);
        displayPassesTeamB(passesTeamB);
        displayCornersTeamB(cornersTeamB);
        displayInjuriesTeamB(injuriesTeamB);


    }



}
