package mostafa.com.americanfootball;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

        /**
         * > findView By ID
         * > calling onClick() method For Team A
         * */
        ImageButton add1PointForA = findViewById(R.id.add1PointForA);
        add1PointForA.setOnClickListener(this);

        ImageButton add2PointForA = findViewById(R.id.add2PointForA);
        add2PointForA.setOnClickListener(this);

        ImageButton add3PointForA = findViewById(R.id.add3PointForA);
        add3PointForA.setOnClickListener(this);

        /**
         * findView By ID
         * calling onClick() method For Team B
         * */

        ImageButton add1PointForB = findViewById(R.id.add1PointForB);
        add1PointForB.setOnClickListener(this);

        ImageButton add2PointForB = findViewById(R.id.add2PointForB);
        add2PointForB.setOnClickListener(this);

        ImageButton add3PointForB = findViewById(R.id.add3PointForB);
        add3PointForB.setOnClickListener(this);

        /**
         * findView By ID
         * calling onClick() method For Reset Button
         * */
        Button resetBtn = findViewById(R.id.resetButton);
        resetBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            /**
             * increase points of team A
             */
            case R.id.add1PointForA:
                scoreTeamA++;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.add2PointForA:
                scoreTeamA += 2;
                displayForTeamA(scoreTeamA);
                break;

            case R.id.add3PointForA:
                scoreTeamA += 3;
                displayForTeamA(scoreTeamA);
                break;

            /**
             * increase points of team B
             */
            case R.id.add1PointForB:
                scoreTeamB++;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.add2PointForB:
                scoreTeamB += 2;
                displayForTeamB(scoreTeamB);
                break;

            case R.id.add3PointForB:
                scoreTeamB += 3;
                displayForTeamB(scoreTeamB);
                break;

            /**
             * Reset Button
             */
            case R.id.resetButton:
                scoreTeamA = scoreTeamB = 0;
                displayForTeamB(0);
                displayForTeamA(0);
                break;

            default:
                break;
        }
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}