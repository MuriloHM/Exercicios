package com.example.luxometro;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    private Sensor sensor;
    private SensorEventListener sensorEventListener;
    private float atualValue=0;
    private float maxValue = 0;
    private float minValue = 4000;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);

        if (sensor == null){
            Toast.makeText(this,"O dispositivo não possui sensor de luz", Toast.LENGTH_SHORT).show();
            finish();
        }

        sensorEventListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float value = sensorEvent.values[0];
                atualValue = value;


                TextView txtResultadoProg = (TextView) findViewById(R.id.txtResultado);
                TextView txtResultadoMaxProg = (TextView) findViewById(R.id.txtResultadoMax);
                TextView txtResultadoMinProg = (TextView) findViewById(R.id.txtResultadoMin);

                txtResultadoProg.setText("Luminosidade: " + atualValue + " lx");

                txtResultadoMaxProg.setText("Maior Luminosidade: " + maxValue + " lx");

                txtResultadoMinProg.setText("Menor Luminosidade: " + minValue + " lx");

                if (atualValue > maxValue){
                    maxValue = atualValue;
                }
                if(atualValue < minValue){
                    minValue = atualValue;
                }




            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {


            }
        };
    }
    @Override
    protected void onResume() {
        super.onResume();
        sensorManager.registerListener(sensorEventListener, sensor, SensorManager.SENSOR_DELAY_FASTEST);
    }
    @Override
    protected void onPause() {
        super.onPause();
        sensorManager.unregisterListener(sensorEventListener);
    }

}