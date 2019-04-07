package app.lat_akbif9_10116416_riyanbaharcom.lat_akbif9_10116416_riyanbahar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class layoutsayang extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutsayang);
    }
    public void masuk3 (View view){
        Intent intent = new Intent(layoutsayang.this, layoutsayang2.class);
        startActivity(intent);
    }
}
