package tec.tareaextraclase4.xorlinkedlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Método para el botón siguiente

    public void Siguiente(View view) {
        Intent siguiente = new Intent(this, SecondActivity.class);
        startActivity(siguiente);

    }
}