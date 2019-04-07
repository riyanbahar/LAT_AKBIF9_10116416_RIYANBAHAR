package app.lat_akbif9_10116416_riyanbaharcom.lat_akbif9_10116416_riyanbahar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class layoutsayang2 extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "layout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutsayang2);
    }
    public void masuk(View view){
        Intent intent = new Intent(this,layoutsayang3.class);
        EditText editnama = (EditText)findViewById(R.id.txtnama);
        EditText editumur = (EditText)findViewById(R.id.txtumur);
        String message = editnama.getText().toString();


        intent.putExtra(EXTRA_MESSAGE,message);


        startActivity(intent);

    }
}
