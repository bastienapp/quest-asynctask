package fr.wcs.liftsimulator;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private boolean isLiftMoving = false;
    private int currentFloor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button floor0 = (Button) findViewById(R.id.floor0);
        Button floor1 = (Button) findViewById(R.id.floor1);
        Button floor2 = (Button) findViewById(R.id.floor2);
        Button floor3 = (Button) findViewById(R.id.floor3);
        Button floor4 = (Button) findViewById(R.id.floor4);
        Button floor5 = (Button) findViewById(R.id.floor5);
        Button floor6 = (Button) findViewById(R.id.floor6);
        Button floor7 = (Button) findViewById(R.id.floor7);
        Button floor8 = (Button) findViewById(R.id.floor8);
        Button floor9 = (Button) findViewById(R.id.floor9);

        floor0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(0);
            }
        });
        floor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(1);
            }
        });
        floor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(2);
            }
        });
        floor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(3);
            }
        });
        floor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(4);
            }
        });
        floor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(5);
            }
        });
        floor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(6);
            }
        });
        floor7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(7);
            }
        });
        floor8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(8);
            }
        });
        floor9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFloor(9);
            }
        });
    }

    private void goToFloor(int floor) {
        if (!isLiftMoving && floor != currentFloor) {
            moveNextFloor(floor);
            isLiftMoving = false;
        }
    }

    private void moveNextFloor(int floor) {
        if (floor != currentFloor) {
            isLiftMoving = true;
            waitForIt();
            currentFloor = (floor > currentFloor) ? currentFloor + 1 : currentFloor - 1;
            TextView floorCount = (TextView) findViewById(R.id.floor_count);
            floorCount.setText(String.valueOf(currentFloor));
            moveNextFloor(floor);
        }
    }

    private void waitForIt() {
        SystemClock.sleep(3000);
    }
}
