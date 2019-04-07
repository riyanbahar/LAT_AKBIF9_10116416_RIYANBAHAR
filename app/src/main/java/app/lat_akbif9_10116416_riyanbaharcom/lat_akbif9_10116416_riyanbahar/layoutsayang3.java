package app.lat_akbif9_10116416_riyanbaharcom.lat_akbif9_10116416_riyanbahar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class layoutsayang3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layoutsayang3);

    Intent intent = getIntent();

    String message = intent.getStringExtra(layoutsayang2.EXTRA_MESSAGE);

    TextView textView = (TextView)findViewById(R.id.txt2);

        textView.setText(message);

}
    public void oke(View view){
        finish();
        moveTaskToBack(true);
    }
}
